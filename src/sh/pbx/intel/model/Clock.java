package sh.pbx.intel.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

@XStreamAlias("clock")
public class Clock {
    @XStreamAsAttribute
    String name;
    @XStreamOmitField
    Component component;

    public Clock(){}

    Clock( String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }

    public Component getComponent() {
        return component;
    }
}
