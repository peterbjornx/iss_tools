package sh.pbx.intel;

import sh.pbx.intel.bus.*;
import sh.pbx.intel.model.Component;

import java.io.File;
import java.io.IOException;

public class BusEnumerator {

    public static void main(String[] args) throws IOException {
        Component c = Component.loadComponent(new File("sigmap/BXT_6.xml"));
        new OCPMatcher().scan(c);
        new SPXBMatcher().scan(c);
        new IOSBMatcher().scan(c);
        c.save(new File("sigmap/BXT_6_buses.xml"));

    }
}
