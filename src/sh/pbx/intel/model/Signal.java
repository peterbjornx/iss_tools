package sh.pbx.intel.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("signal")
public class Signal {
    @XStreamAsAttribute
    String name;
    @XStreamOmitField
    Component component;
    @XStreamAsAttribute
    private int minIdx = -1;
    @XStreamAsAttribute
    private int maxIdx = -1;

    Signal( String name, int minIdx, int maxIdx ) {
        this.name = name;
        this.minIdx = minIdx;
        this.maxIdx = maxIdx;
    }

    void grow(int idx) {
        if ( !isBus() )
            System.err.println("Tried to grow signal that is not a bus: " + getPath());
        if ( idx < this.minIdx )
            this.minIdx = idx;
        if ( idx > this.maxIdx )
            this.maxIdx = idx;
    }

    public String getPath() {
        return component.getPath() + "/" + name;
    }

    public boolean isBus() {
        return this.minIdx != -1 && this.maxIdx != -1;
    }

    public String toString() {
        if ( isBus() )
            return name + "( " + maxIdx +" downto " + minIdx + " )";
        else
            return name;
    }

    public int getMinIdx() {
        return minIdx;
    }

    public int getMaxIdx() {
        return maxIdx;
    }

    public String getName() {
        return name;
    }
}
