package sh.pbx.intel.bus;

import sh.pbx.intel.model.Component;
import sh.pbx.intel.model.Signal;

import java.util.*;

public class OCPMatcher extends BruteForceBusMatcher {

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
            new SignalMatcher("MAddr", true),
            new SignalMatcher("MCmd", 3),
            new SignalMatcher("MDataValid"),
            new SignalMatcher("MRespAccept"),
            new SignalMatcher("MData",true),
            new SignalMatcher("SCmdAccept"),
            new SignalMatcher("SDataAccept"),
            new SignalMatcher("SData",true),
            new SignalMatcher("SResp",2),
    };

    private static final int COUNT_THRESHOLD = knownSignals.length - 2;

    private static final Ext[] extensions = {
            new Ext("Simple", 2, new SignalMatcher[] {
                    /* Simple Extensions */
                    new SignalMatcher("MAddrSpace", true),
                    new SignalMatcher("MByteEn", true),
                    new SignalMatcher("MDataByteEn", true),
                    new SignalMatcher("MDataInfo", true),
                    new SignalMatcher("MReqInfo", true),
                    new SignalMatcher("SDataInfo", true),
                    new SignalMatcher("SRespInfo", true)
            }),
            new Ext("Burst", 3, new SignalMatcher[] {
                    /* Burst Extensions */
                    new SignalMatcher("MAtomicLength", true),
                    new SignalMatcher("MBlockHeight", true),
                    new SignalMatcher("MBlockStride", true),
                    new SignalMatcher("MBurstLength", true),
                    new SignalMatcher("MBurstPrecise"),
                    new SignalMatcher("MBurstSeq", 3),
                    new SignalMatcher("MBurstSingleReq"),
                    new SignalMatcher("MDataLast"),
                    new SignalMatcher("MDataRowLast"),
                    new SignalMatcher("MReqLast"),
                    new SignalMatcher("MReqRowLast"),
                    new SignalMatcher("SRespLast"),
                    new SignalMatcher("SRespRowLast"),
            }),
            new Ext("Tag", 2, new SignalMatcher[] {
                    /* Tag Extensions */
                    new SignalMatcher("MDataTagID", true),
                    new SignalMatcher("MTagID", true),
                    new SignalMatcher("MTagInOrder"),
                    new SignalMatcher("STagID", true),
                    new SignalMatcher("STagInOrder"),
            }),
            new Ext("Thread", 2, new SignalMatcher[] {
                    new SignalMatcher("MConnID", true),
                    new SignalMatcher("MDataThreadID", true),
                    new SignalMatcher("MThreadBusy", true),
                    new SignalMatcher("MThreadID", true),
                    new SignalMatcher("SDataThreadBusy", true),
                    new SignalMatcher("SThreadBusy", true),
                    new SignalMatcher("SThreadID", true),

            })
    };

    protected void matchSignals(Component c, List<Signal> matches, List<String> missing, String prefix, String suffix, SignalMatcher[] sm) {
        super.matchSignals( c, matches, missing, prefix, suffix, sm );
        if ( suffix.equals( "_o" ) )
            super.matchSignals( c, matches, missing, prefix, "_i", sm );
        else if ( suffix.equals( "_i" ) )
            super.matchSignals( c, matches, missing, prefix, "_o", sm );
    }


    protected void postProcessMatch( BusMatch m ) {
        if ( m.suffix.equals("_i") || m.suffix.equals("_o") )
            m.suffix = "";
    }

    @Override
    protected String getBusName() {
        return "OCP";
    }
}
