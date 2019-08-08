package sh.pbx.intel.bus;

public class IOSBMatcher extends BruteForceBusMatcher {

    private Ext[] extensions = {
            new Ext("MsgPut",2,new SignalMatcher[]{
                    new SignalMatcher("msg_npput"),
                    new SignalMatcher("msg_pcput")
            })
    };

    @Override
    protected Ext[] getExtensions() {
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
            new SignalMatcher("npput"),
            new SignalMatcher("pcput"),
            new SignalMatcher("npcup"),
            new SignalMatcher("pccup"),
            new SignalMatcher("eom"),
    };

    private static final int COUNT_THRESHOLD = knownSignals.length-2;

    @Override
    protected String getBusName() {
        return "IOSB";
    }
}
