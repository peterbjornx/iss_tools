
package sh.pbx.intel.xml.visa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MuxPath complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MuxPath">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="clk_sel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lane_sel" type="{http://www.w3.org/2001/XMLSchema}short" />
 *       &lt;attribute name="mux_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MuxPath", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class MuxPath {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "clk_sel")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String clkSel;
    @XmlAttribute(name = "lane_sel")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Short laneSel;
    @XmlAttribute(name = "mux_name")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String muxName;

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
     * Gets the value of the clkSel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getClkSel() {
        return clkSel;
    }

    /**
     * Sets the value of the clkSel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setClkSel(String value) {
        this.clkSel = value;
    }

    /**
     * Gets the value of the laneSel property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Short getLaneSel() {
        return laneSel;
    }

    /**
     * Sets the value of the laneSel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLaneSel(Short value) {
        this.laneSel = value;
    }

    /**
     * Gets the value of the muxName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMuxName() {
        return muxName;
    }

    /**
     * Sets the value of the muxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMuxName(String value) {
        this.muxName = value;
    }

}
