
package sh.pbx.intel.xml.visa;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Register">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="mux" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="offset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="standard" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="reg_num" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Register", propOrder = {
    "value"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Register {

    @XmlValue
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String value;
    @XmlAttribute(name = "mux")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String mux;
    @XmlAttribute(name = "offset")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String offset;
    @XmlAttribute(name = "standard")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String standard;
    @XmlAttribute(name = "reg_num")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected Byte regNum;
    @XmlAttribute(name = "name")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String name;

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
     * Gets the value of the mux property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMux() {
        return mux;
    }

    /**
     * Sets the value of the mux property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMux(String value) {
        this.mux = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setOffset(String value) {
        this.offset = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setStandard(String value) {
        this.standard = value;
    }

    /**
     * Gets the value of the regNum property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public Byte getRegNum() {
        return regNum;
    }

    /**
     * Sets the value of the regNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setRegNum(Byte value) {
        this.regNum = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2019-08-04T10:18:58+02:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setName(String value) {
        this.name = value;
    }

}
