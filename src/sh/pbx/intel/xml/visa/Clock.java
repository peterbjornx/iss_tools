
package sh.pbx.intel.xml.visa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Clock complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Clock">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="clk" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sel" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="ss" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clock", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Clock {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "clk")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String clk;
    @XmlAttribute(name = "sel")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte sel;
    @XmlAttribute(name = "ss")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte ss;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the clk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getClk() {
        return clk;
    }

    /**
     * Sets the value of the clk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setClk(String value) {
        this.clk = value;
    }

    /**
     * Gets the value of the sel property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getSel() {
        return sel;
    }

    /**
     * Sets the value of the sel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSel(Byte value) {
        this.sel = value;
    }

    /**
     * Gets the value of the ss property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getSs() {
        return ss;
    }

    /**
     * Sets the value of the ss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSs(Byte value) {
        this.ss = value;
    }

}
