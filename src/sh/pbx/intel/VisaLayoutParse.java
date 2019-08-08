package sh.pbx.intel;

import sh.pbx.intel.model.Component;
import sh.pbx.intel.xml.visa.VisaSignalMap;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.IOException;

public class VisaLayoutParse {

    public static void main(String[] argv) throws IOException {
        String n = "BXT_6";
        VisaSignalMap iv = JAXB.unmarshal(new File("visa/"+n+".xml"), VisaSignalMap.class);
        System.out.println(iv.getMuxTreeOrMuxOrGroup().size());
        Component c = new Component(iv);
        c.save(new File("sigmap/"+n+".xml"));
    }

}
