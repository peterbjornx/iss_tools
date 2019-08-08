package sh.pbx.intel.bus;

import sh.pbx.intel.model.BusPort;
import sh.pbx.intel.model.Component;
import sh.pbx.intel.model.Signal;

import java.util.LinkedList;
import java.util.List;

public abstract class BusScanner {

    protected void matchSignals(Component c, List<Signal> matches, List<String> missing, String prefix, String suffix, SignalMatcher[] sm) {
        for ( int i = 0; i < sm.length; i++ ) {
            Signal s = c.getSignal(sm[i].formName(prefix, suffix));
            if ( s != null ) {
                matches.add(s);

                missing.remove(sm[i].getName());
            } else
                missing.add(sm[i].getName());
        }
    }

    protected abstract BusMatch checkSignal(Component c, Signal s);

    public void scan(Component c) {
        List<BusMatch> matches = new LinkedList<>();
        List<Signal> sigs = new LinkedList<>( c.getSignals() );
        while ( !sigs.isEmpty() ) {
            BusMatch m = checkSignal( c, sigs.remove(0) );
            if ( m != null ) {
                sigs.removeAll( m.getSignals() );
                System.out.println(c.getPath() +" : " + m);
                matches.add(m);
            }
        }
        for ( BusMatch m : matches ) {
            BusPort port = new BusPort(m);
            c.addBusPort(port);
        }
        for ( Component sc : c.getSubcomponents() ) {
            if ( sc instanceof BusPort )
                continue;
            scan(sc);
        }
    }

}
