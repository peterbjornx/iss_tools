package sh.pbx.intel.bus;

import sh.pbx.intel.model.Component;
import sh.pbx.intel.model.Signal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class BruteForceBusMatcher extends BusScanner {

    protected static class Ext {
        public boolean noBase = false;
        String name;
        int thresh;
        SignalMatcher[] signals;

        Ext(String name, int thresh, SignalMatcher[] signals) {
            this.name = name;
            this.thresh = thresh;
            this.signals = signals;
        }

        public Ext(String name, boolean noBase, int thresh, SignalMatcher[] signals) {
            this.name = name;
            this.thresh = thresh;
            this.signals = signals;
            this.noBase = noBase;

        }
    }

    protected BusMatch checkSignal(Component c, Signal s ) {
        List<Signal> matches = new LinkedList<>();
        List<String> missing = new LinkedList<>();
        List<Signal> smatches = new LinkedList<>();
        List<String> smissing = new LinkedList<>();
        List<String> exts = new LinkedList<>();
        SignalMatch mm = null;
        SignalMatcher knownSignals[] = getKnownSignals();
        /* Find a signal from the core set */
        for ( SignalMatcher m : knownSignals ) {
            mm = m.match(s);
            if ( mm != null )
                break;
        }

        if ( mm == null ) {
            for ( Ext ee : getExtensions() ) {
                if ( !ee.noBase)
                    continue;
                for ( SignalMatcher m : ee.signals ) {
                    mm = m.match(s);
                    if ( mm != null )
                        break;
                }
                if ( mm != null )
                    break;
            }
            if ( mm == null )
                return null;
        }

        matchSignals( c, matches, missing, mm.prefix, mm.suffix, knownSignals );
        for ( Ext ee : getExtensions() ) {
            List<Signal> ematches = new LinkedList<>();
            List<String> emissing = new LinkedList<>();
            matchSignals( c, ematches, emissing, mm.prefix, mm.suffix, ee.signals );
            if ( ematches.size() >= ee.thresh ) {
                exts.add(ee.name);
                matches.addAll(ematches);
            }
        }

        if ( matches.size() < getBaseThreshold() && exts.isEmpty() ) {
            if ( matches.size() > 1 )
                System.err.println("subtresh "+c.getPath() + " "+mm.prefix+"***"+mm.suffix + " " + Arrays.toString(matches.toArray()));
            return null;
        }

        if ( mm.prefix.length() > 0 && Character.isAlphabetic(mm.prefix.charAt(mm.prefix.length()- 1)))
            System.err.println("BOOH: Prefix ends with alphanumeric");
        else if ( mm.prefix.endsWith("_") )
            mm.prefix = mm.prefix.substring(0, mm.prefix.length() - 1);
        BusMatch m = new BusMatch(getBusName(), mm.prefix, mm.suffix, exts, matches, new ArrayList<>());
        postProcessMatch(m);
        return m;
    }

    protected abstract String getBusName();


    protected void postProcessMatch( BusMatch m ) {}

    protected abstract Ext[] getExtensions();

    protected abstract int getBaseThreshold();

    protected abstract SignalMatcher[] getKnownSignals();
}
