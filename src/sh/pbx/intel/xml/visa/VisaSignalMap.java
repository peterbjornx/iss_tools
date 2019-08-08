
package sh.pbx.intel.xml.visa;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VisaSignalMap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaSignalMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="mux_tree" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mux" type="{}Mux" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="group" type="{}Group"/>
 *         &lt;element name="register_set" type="{}RegisterSet"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaSignalMap", propOrder = {
    "muxTreeOrMuxOrGroup"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class VisaSignalMap {

    @XmlElements({
        @XmlElement(name = "mux_tree", type = String.class),
        @XmlElement(name = "mux", type = Mux.class),
        @XmlElement(name = "group", type = Group.class),
        @XmlElement(name = "register_set", type = RegisterSet.class)
    })
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<Object> muxTreeOrMuxOrGroup;

    /**
     * Gets the value of the muxTreeOrMuxOrGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the muxTreeOrMuxOrGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMuxTreeOrMuxOrGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Mux }
     * {@link Group }
     * {@link RegisterSet }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<Object> getMuxTreeOrMuxOrGroup() {
        if (muxTreeOrMuxOrGroup == null) {
            muxTreeOrMuxOrGroup = new ArrayList<Object>();
        }
        return this.muxTreeOrMuxOrGroup;
    }

}
