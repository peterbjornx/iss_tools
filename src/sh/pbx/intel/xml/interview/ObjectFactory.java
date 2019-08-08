
package sh.pbx.intel.xml.interview;

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

    private final static QName _InterView_QNAME = new QName("", "InterView");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sh.pbx.intel.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InterView }
     * 
     */
    public InterView createInterView() {
        return new InterView();
    }

    /**
     * Create an instance of {@link SignalFile }
     * 
     */
    public SignalFile createSignalFile() {
        return new SignalFile();
    }

    /**
     * Create an instance of {@link Event }
     * 
     */
    public Event createEvent() {
        return new Event();
    }

    /**
     * Create an instance of {@link EventFolder }
     * 
     */
    public EventFolder createEventFolder() {
        return new EventFolder();
    }

    /**
     * Create an instance of {@link CpuProduct }
     * 
     */
    public CpuProduct createCpuProduct() {
        return new CpuProduct();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InterView }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "InterView")
    public JAXBElement<InterView> createInterView(InterView value) {
        return new JAXBElement<InterView>(_InterView_QNAME, InterView.class, null, value);
    }

}
