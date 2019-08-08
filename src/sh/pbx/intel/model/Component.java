package sh.pbx.intel.model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.*;
import sh.pbx.intel.xml.visa.Group;
import sh.pbx.intel.xml.visa.Mux;
import sh.pbx.intel.xml.visa.VisaSignalMap;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
@XStreamInclude(BusPort.class)
@XStreamAlias("component")
public class Component {
    @XStreamAsAttribute
    protected String name;
    @XStreamImplicit(itemFieldName = "clock", keyFieldName = "name")
    private Map<String, Clock> clocks = new HashMap<>();
    @XStreamImplicit(itemFieldName = "component", keyFieldName = "name")
    private Map<String, Component> subcomponents = new HashMap<>();
    @XStreamImplicit(itemFieldName = "signal", keyFieldName = "name")
    Map<String, Signal> signals = new HashMap<>();
    @XStreamOmitField
    Component parent;
    @XStreamOmitField
    private List children;

    public static Component loadComponent(File xml) {
        XStream x = new XStream();
        x.autodetectAnnotations(true);
        x.processAnnotations(Component.class);
        Component c = (Component) x.fromXML(xml);
        c.postDeserialize();
        c.genChildren();
        return c;
    }

    public void save(File xml) throws IOException {
        XStream x = new XStream();
        x.autodetectAnnotations(true);
        x.toXML(this, new FileWriter(xml));
    }

    private void postDeserialize() {
        if ( signals == null )
            signals = new HashMap<>();
        if ( clocks == null )
            clocks = new HashMap<>();
        if ( subcomponents == null )
            subcomponents = new HashMap<>();
        for ( Signal s : signals.values() )
            s.component = this;
        for ( Clock c : clocks.values() )
            c.component = this;
        for ( Component c : subcomponents.values() ) {
            c.parent = this;
            c.postDeserialize();
        }
    }

    public String getName() {
        return name;
    }

    public List getChildren() {
        return children;
    }

    void addSignalByPath(String path) {
        int sepIdx; String lead = null;
        do {
            sepIdx = path.indexOf('/');
            if ( sepIdx == -1 )
                break;
            lead = path.substring(0, sepIdx);
            path = path.substring(sepIdx + 1);
        } while( sepIdx == 0 );
        if ( sepIdx == -1 )
            addSignalByName(path);
        else {
            getOrCreateSC( lead ).addSignalByPath( path );
        }
    }

    void addClockByPath(String path) {
        int sepIdx; String lead = null;
        do {
            sepIdx = path.indexOf('/');
            if ( sepIdx == -1 )
                break;
            lead = path.substring(0, sepIdx);
            path = path.substring(sepIdx + 1);
        } while( sepIdx == 0 );
        if ( sepIdx == -1 )
            addClockByName(path);
        else {
            getOrCreateSC( lead ).addClockByPath( path );
        }
    }

    private Component getOrCreateSC( String name ) {
        if ( subcomponents.containsKey(name) )
            return subcomponents.get(name);
        if ( clocks.containsKey( name ) )
            System.err.println("Name collision between component and clock " + getPath() + "/" + name);
        if ( signals.containsKey( name ) )
            System.err.println("Name collision between component and signal " + getPath() + "/" + name);
        Component sub = new Component( name );
        addSubcomponent( sub );
        return sub;
    }

    private void addClockByName(String name) {
        if ( clocks.containsKey(name) )
            return;
        if ( subcomponents.containsKey( name ) )
            System.err.println("Name collision between clock and component " + getPath() + "/" + name);
        if ( signals.containsKey( name ) )
            System.err.println("Name collision between clock and signal " + getPath() + "/" + name);
        addClock(new Clock(name));
    }

    public String getPath() {
        if ( parent == null )
            return "/" + name;
        else
            return parent.getPath() + "/" + name;
    }

    private void addSignalByName(String name ) {
        Signal s;
        int idx = -1, brOIdx, brCIdx;
        String idxS;
        brOIdx = name.indexOf('[');
        brCIdx = name.indexOf(']');
        if ( brOIdx >= 0 && brCIdx > brOIdx ) {
            idxS = name.substring(brOIdx + 1, brCIdx );
            try {
                idx = Integer.parseInt(idxS);
            } catch (Exception e) {
                System.err.println("Malformed name has bad index: " + getPath() + "/" + name);
            }
            name = name.substring(0, brOIdx );
        } else if ( brCIdx >=0 || brOIdx >= 0 )
            System.err.println("Malformed name has brackets but not a pair: " + getPath() + "/" + name);
        if ( clocks.containsKey( name ) )
            System.err.println("Name collision between signal and clock " + getPath() + "/" + name);
        if ( subcomponents.containsKey( name ) )
            System.err.println("Name collision between signal and component " + getPath() + "/" + name);
        if ( !signals.containsKey( name ) ) {
            s = new Signal( name, idx, idx );
            addSignal( s );
        } else
            s = signals.get( name );
        if ( idx != -1 )
            s.grow( idx );

    }

    public Component(VisaSignalMap vsm) {
        name = "";
        for ( Object o : vsm.getMuxTreeOrMuxOrGroup() ) {
            if ( o instanceof Group ) {
                Group  g = (Group) o;
                for (sh.pbx.intel.xml.visa.Signal s : g.getSignal())
                    addSignalByPath(s.getName());
            } else if ( o instanceof Mux ) {
                Mux m = (Mux) o;
                for (sh.pbx.intel.xml.visa.Clock c : m.getClock())
                    addClockByPath(c.getClk());
            }
        }
        System.out.println("gen children");
        genChildren();
        if ( children.size() > 1 ) {
            System.err.println("Multiple roots");
        }
        Component m = subcomponents.values().iterator().next();
        name = m.name;
        children = m.children;
        clocks = m.clocks;
        addSignals(m.signals.values());
        subcomponents = m.subcomponents;
        for ( Clock c : clocks.values() )
            c.component = this;
        for ( Component c : subcomponents.values() )
            c.parent = this;
    }

    private void genChildren(){
        children = new ArrayList();
        List<Component> scs = new ArrayList<>( getSubcomponents() );
        scs.sort(Comparator.comparing(a -> a.name));
        children.addAll(scs);
        List<Clock> clocks = new ArrayList<>( getClocks() );
        clocks.sort(Comparator.comparing(a -> a.name));
        children.addAll(clocks);
        List<Signal> signals = new ArrayList<>( getSignals() );
        signals.sort(Comparator.comparing(a -> a.name));
        children.addAll(signals);
        for ( Component c : getSubcomponents())
            c.genChildren();
    }

    protected Component(String name) {
        this.name = name;
    }

    private void addSignal(Signal signal) {
        signals.put(signal.name, signal);
        signal.component = this;
    }

    private void addSubcomponent(Component component) {
        subcomponents.put(component.name, component);
        component.parent = this;
    }

    private void addClock(Clock clock) {
        clocks.put(clock.name,clock);
        clock.component = this;
    }

    public Collection<Clock> getClocks() {
        return clocks.values();
    }

    public Collection<Component> getSubcomponents() {
        return subcomponents.values();
    }

    public Collection<Signal> getSignals() {
        return signals.values();
    }

    public Component getParent() {
        return parent;
    }

    @Override
    public String toString() {
        return name;
    }

    public Signal getSignal(String name) {
        return signals.get(name);
    }

    protected void addSignals(Collection<Signal> signals) {
        for ( Signal s : signals )
            addSignal( s );

    }

    public void removeSignals(Collection<Signal> signals) {
        for (Signal s : signals) {
            children.remove(s);
            this.signals.remove(s.name);
        }

    }

    public void addBusPort(BusPort port) {
        for (Signal s : port.signals.values()) {
            children.remove(s);
            this.signals.remove(s.name);
        }
        subcomponents.put(port.getName(), port);
        port.parent = this;
        children.add(port);
    }
}
