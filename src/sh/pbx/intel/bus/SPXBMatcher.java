package sh.pbx.intel.bus;

public class SPXBMatcher extends BruteForceBusMatcher {

    private Ext[] extensions = {
            new Ext("Busmaster",2,new SignalMatcher[]{
                    new SignalMatcher("gnt"),
                    new SignalMatcher("req")
            }),
            new Ext("Slave", true, 2,new SignalMatcher[]{
                    new SignalMatcher("devsel"),
                    new SignalMatcher("start"),
                    new SignalMatcher("stop"),
                    new SignalMatcher("lbe", 4),
                    new SignalMatcher("fbe", 4),
            })
    };

    @Override
    protected BruteForceBusMatcher.Ext[] getExtensions() {
        return extensions;
    }

    @Override
    protected int getBaseThreshold() {
        return COUNT_THRESHOLD;
    }

    @Override
    protected SignalMatcher[] getKnownSignals() {
        return knownSignals;
    }

    private static final SignalMatcher[] knownSignals = {
            /* Basic signals */
            new SignalMatcher("addr", true),
            new SignalMatcher("ctype", 7),
    };

    private static final int COUNT_THRESHOLD = knownSignals.length;

    @Override
    protected String getBusName() {
        return "SPXB";
    }
}
