
package sh.pbx.intel.xml.interview;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CpuProduct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CpuProduct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shortName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="step" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="siliconStep" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chapDllName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chapClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dfxConfigurationFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dfxDllName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dfxClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dalVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="godlatDllName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="godlatClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="godlatMetadataFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctsDllName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctsClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ctsMetadataFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oaDllName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oaClassName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="oaConfigurationFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numOfOaCECs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="numOfOaCounters" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lkmConfigurationFile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="supportedFamilies" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuProduct", propOrder = {
    "comments"
})
public class CpuProduct {

    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "creator")
    protected String creator;
    @XmlAttribute(name = "updateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "shortName")
    protected String shortName;
    @XmlAttribute(name = "step")
    protected String step;
    @XmlAttribute(name = "siliconStep")
    protected String siliconStep;
    @XmlAttribute(name = "chapDllName")
    protected String chapDllName;
    @XmlAttribute(name = "chapClassName")
    protected String chapClassName;
    @XmlAttribute(name = "dfxConfigurationFile")
    protected String dfxConfigurationFile;
    @XmlAttribute(name = "dfxDllName")
    protected String dfxDllName;
    @XmlAttribute(name = "dfxClassName")
    protected String dfxClassName;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "dalVersion")
    protected String dalVersion;
    @XmlAttribute(name = "godlatDllName")
    protected String godlatDllName;
    @XmlAttribute(name = "godlatClassName")
    protected String godlatClassName;
    @XmlAttribute(name = "godlatMetadataFile")
    protected String godlatMetadataFile;
    @XmlAttribute(name = "ctsDllName")
    protected String ctsDllName;
    @XmlAttribute(name = "ctsClassName")
    protected String ctsClassName;
    @XmlAttribute(name = "ctsMetadataFile")
    protected String ctsMetadataFile;
    @XmlAttribute(name = "oaDllName")
    protected String oaDllName;
    @XmlAttribute(name = "oaClassName")
    protected String oaClassName;
    @XmlAttribute(name = "oaConfigurationFile")
    protected String oaConfigurationFile;
    @XmlAttribute(name = "numOfOaCECs")
    protected String numOfOaCECs;
    @XmlAttribute(name = "numOfOaCounters")
    protected String numOfOaCounters;
    @XmlAttribute(name = "lkmConfigurationFile")
    protected String lkmConfigurationFile;
    @XmlAttribute(name = "lastUpdateDate")
    protected String lastUpdateDate;
    @XmlAttribute(name = "supportedFamilies")
    protected String supportedFamilies;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the step property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep() {
        return step;
    }

    /**
     * Sets the value of the step property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep(String value) {
        this.step = value;
    }

    /**
     * Gets the value of the siliconStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiliconStep() {
        return siliconStep;
    }

    /**
     * Sets the value of the siliconStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiliconStep(String value) {
        this.siliconStep = value;
    }

    /**
     * Gets the value of the chapDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapDllName() {
        return chapDllName;
    }

    /**
     * Sets the value of the chapDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapDllName(String value) {
        this.chapDllName = value;
    }

    /**
     * Gets the value of the chapClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChapClassName() {
        return chapClassName;
    }

    /**
     * Sets the value of the chapClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChapClassName(String value) {
        this.chapClassName = value;
    }

    /**
     * Gets the value of the dfxConfigurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfxConfigurationFile() {
        return dfxConfigurationFile;
    }

    /**
     * Sets the value of the dfxConfigurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfxConfigurationFile(String value) {
        this.dfxConfigurationFile = value;
    }

    /**
     * Gets the value of the dfxDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfxDllName() {
        return dfxDllName;
    }

    /**
     * Sets the value of the dfxDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfxDllName(String value) {
        this.dfxDllName = value;
    }

    /**
     * Gets the value of the dfxClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDfxClassName() {
        return dfxClassName;
    }

    /**
     * Sets the value of the dfxClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDfxClassName(String value) {
        this.dfxClassName = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the dalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDalVersion() {
        return dalVersion;
    }

    /**
     * Sets the value of the dalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDalVersion(String value) {
        this.dalVersion = value;
    }

    /**
     * Gets the value of the godlatDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodlatDllName() {
        return godlatDllName;
    }

    /**
     * Sets the value of the godlatDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodlatDllName(String value) {
        this.godlatDllName = value;
    }

    /**
     * Gets the value of the godlatClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodlatClassName() {
        return godlatClassName;
    }

    /**
     * Sets the value of the godlatClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodlatClassName(String value) {
        this.godlatClassName = value;
    }

    /**
     * Gets the value of the godlatMetadataFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodlatMetadataFile() {
        return godlatMetadataFile;
    }

    /**
     * Sets the value of the godlatMetadataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodlatMetadataFile(String value) {
        this.godlatMetadataFile = value;
    }

    /**
     * Gets the value of the ctsDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtsDllName() {
        return ctsDllName;
    }

    /**
     * Sets the value of the ctsDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtsDllName(String value) {
        this.ctsDllName = value;
    }

    /**
     * Gets the value of the ctsClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtsClassName() {
        return ctsClassName;
    }

    /**
     * Sets the value of the ctsClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtsClassName(String value) {
        this.ctsClassName = value;
    }

    /**
     * Gets the value of the ctsMetadataFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtsMetadataFile() {
        return ctsMetadataFile;
    }

    /**
     * Sets the value of the ctsMetadataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtsMetadataFile(String value) {
        this.ctsMetadataFile = value;
    }

    /**
     * Gets the value of the oaDllName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOaDllName() {
        return oaDllName;
    }

    /**
     * Sets the value of the oaDllName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOaDllName(String value) {
        this.oaDllName = value;
    }

    /**
     * Gets the value of the oaClassName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOaClassName() {
        return oaClassName;
    }

    /**
     * Sets the value of the oaClassName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOaClassName(String value) {
        this.oaClassName = value;
    }

    /**
     * Gets the value of the oaConfigurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOaConfigurationFile() {
        return oaConfigurationFile;
    }

    /**
     * Sets the value of the oaConfigurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOaConfigurationFile(String value) {
        this.oaConfigurationFile = value;
    }

    /**
     * Gets the value of the numOfOaCECs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfOaCECs() {
        return numOfOaCECs;
    }

    /**
     * Sets the value of the numOfOaCECs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfOaCECs(String value) {
        this.numOfOaCECs = value;
    }

    /**
     * Gets the value of the numOfOaCounters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOfOaCounters() {
        return numOfOaCounters;
    }

    /**
     * Sets the value of the numOfOaCounters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOfOaCounters(String value) {
        this.numOfOaCounters = value;
    }

    /**
     * Gets the value of the lkmConfigurationFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkmConfigurationFile() {
        return lkmConfigurationFile;
    }

    /**
     * Sets the value of the lkmConfigurationFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLkmConfigurationFile(String value) {
        this.lkmConfigurationFile = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdateDate(String value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the supportedFamilies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedFamilies() {
        return supportedFamilies;
    }

    /**
     * Sets the value of the supportedFamilies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedFamilies(String value) {
        this.supportedFamilies = value;
    }

}
