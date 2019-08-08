package sh.pbx.intel.bus;

import sh.pbx.intel.model.Signal;

class SignalMatch {
    Signal signal;
    String prefix;
    String suffix;

    SignalMatch( Signal signal, String prefix, String suffix) {
        this.signal = signal;
        this.prefix = prefix;
        this.suffix = suffix;
    }

}
