package sh.pbx.intel.bus;

import sh.pbx.intel.model.Signal;

public class SignalMatcher {

    private String name;
    private int startBit;
    private int stopBit;

    public SignalMatcher(String name ) {
        this.name = name;
        this.startBit = -1;
        this.stopBit = -1;
    }

    public SignalMatcher(String name, int size) {
        this.name = name;
        this.startBit = 0;
        this.stopBit = size - 1;
    }

    public SignalMatcher(String name, boolean variable) {
        this.name = name;
        this.startBit = variable ? -2 : -1;
        this.stopBit = -2;
    }

    public SignalMatcher(String name, int s, int e) {
        this.name = name;
        this.startBit = s;
        this.stopBit = e;
    }

    public SignalMatch match(Signal s) {
        if ( startBit != -2 && (s.getMinIdx() != startBit || s.getMaxIdx() != stopBit) )
            return null;
        String sname = s.getName();
        int bidx = sname.indexOf(name);
        if ( bidx == -1 )
            return null;
        return new SignalMatch(s, sname.substring(0, bidx ), sname.substring(bidx+name.length()));
    }

    public String formName(String prefix, String suffix) {
        return prefix + name + suffix;
    }

    public String getName() {
        return name;
    }
}
