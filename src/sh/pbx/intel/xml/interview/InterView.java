
package sh.pbx.intel.xml.interview;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CpuProduct" type="{}CpuProduct"/>
 *         &lt;element name="SignalFile" type="{}SignalFile" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EventFolder" type="{}EventFolder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Event" type="{}Event" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterView", propOrder = {
    "cpuProduct",
    "signalFile",
    "eventFolder",
    "event"
})
public class InterView {

    @XmlElement(name = "CpuProduct", required = true)
    protected CpuProduct cpuProduct;
    @XmlElement(name = "SignalFile")
    protected List<SignalFile> signalFile;
    @XmlElement(name = "EventFolder")
    protected List<EventFolder> eventFolder;
    @XmlElement(name = "Event")
    protected List<Event> event;

    /**
     * Gets the value of the cpuProduct property.
     * 
     * @return
     *     possible object is
     *     {@link CpuProduct }
     *     
     */
    public CpuProduct getCpuProduct() {
        return cpuProduct;
    }

    /**
     * Sets the value of the cpuProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpuProduct }
     *     
     */
    public void setCpuProduct(CpuProduct value) {
        this.cpuProduct = value;
    }

    /**
     * Gets the value of the signalFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signalFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignalFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignalFile }
     * 
     * 
     */
    public List<SignalFile> getSignalFile() {
        if (signalFile == null) {
            signalFile = new ArrayList<SignalFile>();
        }
        return this.signalFile;
    }

    /**
     * Gets the value of the eventFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventFolder }
     * 
     * 
     */
    public List<EventFolder> getEventFolder() {
        if (eventFolder == null) {
            eventFolder = new ArrayList<EventFolder>();
        }
        return this.eventFolder;
    }

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Event }
     * 
     * 
     */
    public List<Event> getEvent() {
        if (event == null) {
            event = new ArrayList<Event>();
        }
        return this.event;
    }

}
