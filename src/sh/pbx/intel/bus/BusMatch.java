package sh.pbx.intel.bus;

import sh.pbx.intel.model.Signal;

import java.util.*;

public class BusMatch {
    private String busType;
    private String prefix;
    String suffix;
    private List<String> options;
    private List<Signal> signals;
    private List<String> missingSignals;

    BusMatch(String busType, String prefix, String suffix, Collection<String> options, Collection<Signal> signals, Collection<String> missingSignals) {
        this.busType = busType;
        this.prefix = prefix;
        this.suffix = suffix;
        this.options = new ArrayList<>(options);
        this.signals = new ArrayList<>(signals);
        this.missingSignals = new ArrayList<>(missingSignals);
    }


    public Collection<Signal> getSignals() {
        return signals;
    }

    public String toString() {
        return busType + "["+ Arrays.toString(options.toArray()) +"] Pf "+prefix +" Sf "+ suffix;
    }

    public String getName() {
        if ( this.suffix == null || this.suffix.isEmpty() )
            return this.prefix;
        return this.prefix + "<>" + this.suffix;
    }

    public String getBusType() {
        return busType;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public List<String> getOptions() {
        return options;
    }

    public List<String> getMissingSignals() {
        return missingSignals;
    }
}
