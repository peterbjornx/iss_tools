package sh.pbx.intel.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import sh.pbx.intel.bus.BusMatch;
import sh.pbx.intel.xml.visa.VisaSignalMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XStreamAlias("BusPort")
public class BusPort extends Component {
    @XStreamAsAttribute
    private String bus;
    @XStreamImplicit(itemFieldName = "option")
    private List<String> options;

    private BusPort(VisaSignalMap vsm) {
        super(vsm);
        throw new RuntimeException("This is not supported");
    }

    public BusPort(BusMatch match) {
        super(match.getName());
        this.bus = match.getBusType();
        this.addSignals(match.getSignals());
        options = new ArrayList<>(match.getOptions());
    }

    public String getBus() {
        return bus;
    }

    public List<String> getOptions() {
        return options;
    }

    public String toString() {
        if ( options == null || options.isEmpty() )
            return name;
        return name + " " + Arrays.toString(options.toArray());
    }
}
