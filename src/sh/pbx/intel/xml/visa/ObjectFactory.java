
package sh.pbx.intel.xml.visa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sh.pbx.intel.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VisaSignalMap_QNAME = new QName("", "visa_signal_map");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sh.pbx.intel.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VisaSignalMap }
     * 
     */
    public VisaSignalMap createVisaSignalMap() {
        return new VisaSignalMap();
    }

    /**
     * Create an instance of {@link Mux }
     * 
     */
    public Mux createMux() {
        return new Mux();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link MuxPath }
     * 
     */
    public MuxPath createMuxPath() {
        return new MuxPath();
    }

    /**
     * Create an instance of {@link Signal }
     * 
     */
    public Signal createSignal() {
        return new Signal();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link Resource }
     * 
     */
    public Resource createResource() {
        return new Resource();
    }

    /**
     * Create an instance of {@link Clock }
     * 
     */
    public Clock createClock() {
        return new Clock();
    }

    /**
     * Create an instance of {@link OutputLane }
     * 
     */
    public OutputLane createOutputLane() {
        return new OutputLane();
    }

    /**
     * Create an instance of {@link RegisterSet }
     * 
     */
    public RegisterSet createRegisterSet() {
        return new RegisterSet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VisaSignalMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "visa_signal_map")
    public JAXBElement<VisaSignalMap> createVisaSignalMap(VisaSignalMap value) {
        return new JAXBElement<VisaSignalMap>(_VisaSignalMap_QNAME, VisaSignalMap.class, null, value);
    }

}
