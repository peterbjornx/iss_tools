
package sh.pbx.intel.xml.interview;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EArchSpecSet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EArchSpecDomain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EArchSpecCoverageSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EArchSpecConstraint" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="creator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eventType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalFolderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="originalProject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="originalStep" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentFolderId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="orderInParent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="quickcovSourceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MacroEventSourceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="expression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nonTraceable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="placeholder" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="readOnly" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="verifiedInEmulation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="production" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="error" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="godlatMaskMatchOverride" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentGodlatPacketId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="headerArm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maskMatchIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="makeClassified" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="counterMode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="insightCondition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="clockCounter" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="module" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="group" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonArea" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonSelectedSubEvents" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eventOrigin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="applicability" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="priority" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateDomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateCluster" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateSlice" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateClock" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateLocation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateEnable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="templateReset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="scenarioName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eventGroup" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="internal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonMaskBit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compoundFunction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="geppetoPmonIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isPerSliced" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonFunctionExpression" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MatrixMsrValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pmonCluster" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="isComputedPmonFunction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="normalization_method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="preSiInSync" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="securityColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "description",
    "comments",
    "eArchSpecSet",
    "eArchSpecDomain",
    "eArchSpecCoverageSource",
    "eArchSpecConstraint"
})
public class Event {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "EArchSpecSet", required = true)
    protected String eArchSpecSet;
    @XmlElement(name = "EArchSpecDomain", required = true)
    protected String eArchSpecDomain;
    @XmlElement(name = "EArchSpecCoverageSource", required = true)
    protected String eArchSpecCoverageSource;
    @XmlElement(name = "EArchSpecConstraint", required = true)
    protected String eArchSpecConstraint;
    @XmlAttribute(name = "id")
    protected Integer id;
    @XmlAttribute(name = "creator")
    protected String creator;
    @XmlAttribute(name = "updateDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "eventType")
    protected String eventType;
    @XmlAttribute(name = "originalFolderId")
    protected Integer originalFolderId;
    @XmlAttribute(name = "originalProject")
    protected String originalProject;
    @XmlAttribute(name = "originalStep")
    protected String originalStep;
    @XmlAttribute(name = "parentFolderId")
    protected Integer parentFolderId;
    @XmlAttribute(name = "orderInParent")
    protected String orderInParent;
    @XmlAttribute(name = "quickcovSourceId")
    protected String quickcovSourceId;
    @XmlAttribute(name = "MacroEventSourceId")
    protected String macroEventSourceId;
    @XmlAttribute(name = "expression")
    protected String expression;
    @XmlAttribute(name = "nonTraceable")
    protected String nonTraceable;
    @XmlAttribute(name = "valid")
    protected String valid;
    @XmlAttribute(name = "placeholder")
    protected String placeholder;
    @XmlAttribute(name = "enabled")
    protected String enabled;
    @XmlAttribute(name = "readOnly")
    protected String readOnly;
    @XmlAttribute(name = "verifiedInEmulation")
    protected String verifiedInEmulation;
    @XmlAttribute(name = "production")
    protected String production;
    @XmlAttribute(name = "error")
    protected String error;
    @XmlAttribute(name = "godlatMaskMatchOverride")
    protected String godlatMaskMatchOverride;
    @XmlAttribute(name = "parentGodlatPacketId")
    protected String parentGodlatPacketId;
    @XmlAttribute(name = "headerArm")
    protected String headerArm;
    @XmlAttribute(name = "maskMatchIndex")
    protected String maskMatchIndex;
    @XmlAttribute(name = "makeClassified")
    protected String makeClassified;
    @XmlAttribute(name = "counterMode")
    protected String counterMode;
    @XmlAttribute(name = "insightCondition")
    protected String insightCondition;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "clockCounter")
    protected String clockCounter;
    @XmlAttribute(name = "module")
    protected String module;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute(name = "group")
    protected String group;
    @XmlAttribute(name = "tag")
    protected String tag;
    @XmlAttribute(name = "pmonArea")
    protected String pmonArea;
    @XmlAttribute(name = "pmonCode")
    protected String pmonCode;
    @XmlAttribute(name = "pmonSelectedSubEvents")
    protected String pmonSelectedSubEvents;
    @XmlAttribute(name = "eventOrigin")
    protected String eventOrigin;
    @XmlAttribute(name = "destination")
    protected String destination;
    @XmlAttribute(name = "applicability")
    protected String applicability;
    @XmlAttribute(name = "priority")
    protected String priority;
    @XmlAttribute(name = "templateId")
    protected String templateId;
    @XmlAttribute(name = "templateDomain")
    protected String templateDomain;
    @XmlAttribute(name = "templateType")
    protected String templateType;
    @XmlAttribute(name = "templateCluster")
    protected String templateCluster;
    @XmlAttribute(name = "templateSlice")
    protected String templateSlice;
    @XmlAttribute(name = "templateClock")
    protected String templateClock;
    @XmlAttribute(name = "templateName")
    protected String templateName;
    @XmlAttribute(name = "templateLocation")
    protected String templateLocation;
    @XmlAttribute(name = "templateEnable")
    protected String templateEnable;
    @XmlAttribute(name = "templateReset")
    protected String templateReset;
    @XmlAttribute(name = "scenarioName")
    protected String scenarioName;
    @XmlAttribute(name = "eventGroup")
    protected String eventGroup;
    @XmlAttribute(name = "internal")
    protected String internal;
    @XmlAttribute(name = "pmonMaskBit")
    protected String pmonMaskBit;
    @XmlAttribute(name = "compoundFunction")
    protected String compoundFunction;
    @XmlAttribute(name = "geppetoPmonIndex")
    protected String geppetoPmonIndex;
    @XmlAttribute(name = "isPerSliced")
    protected String isPerSliced;
    @XmlAttribute(name = "pmonFunctionExpression")
    protected String pmonFunctionExpression;
    @XmlAttribute(name = "MatrixMsrValue")
    protected String matrixMsrValue;
    @XmlAttribute(name = "pmonCluster")
    protected String pmonCluster;
    @XmlAttribute(name = "isComputedPmonFunction")
    protected String isComputedPmonFunction;
    @XmlAttribute(name = "normalization_method")
    protected String normalizationMethod;
    @XmlAttribute(name = "unit")
    protected String unit;
    @XmlAttribute(name = "family")
    protected String family;
    @XmlAttribute(name = "preSiInSync")
    protected String preSiInSync;
    @XmlAttribute(name = "securityColor")
    protected String securityColor;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

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
     * Gets the value of the eArchSpecSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchSpecSet() {
        return eArchSpecSet;
    }

    /**
     * Sets the value of the eArchSpecSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchSpecSet(String value) {
        this.eArchSpecSet = value;
    }

    /**
     * Gets the value of the eArchSpecDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchSpecDomain() {
        return eArchSpecDomain;
    }

    /**
     * Sets the value of the eArchSpecDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchSpecDomain(String value) {
        this.eArchSpecDomain = value;
    }

    /**
     * Gets the value of the eArchSpecCoverageSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchSpecCoverageSource() {
        return eArchSpecCoverageSource;
    }

    /**
     * Sets the value of the eArchSpecCoverageSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchSpecCoverageSource(String value) {
        this.eArchSpecCoverageSource = value;
    }

    /**
     * Gets the value of the eArchSpecConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchSpecConstraint() {
        return eArchSpecConstraint;
    }

    /**
     * Sets the value of the eArchSpecConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchSpecConstraint(String value) {
        this.eArchSpecConstraint = value;
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
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventType(String value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the originalFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginalFolderId() {
        return originalFolderId;
    }

    /**
     * Sets the value of the originalFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginalFolderId(Integer value) {
        this.originalFolderId = value;
    }

    /**
     * Gets the value of the originalProject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalProject() {
        return originalProject;
    }

    /**
     * Sets the value of the originalProject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalProject(String value) {
        this.originalProject = value;
    }

    /**
     * Gets the value of the originalStep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalStep() {
        return originalStep;
    }

    /**
     * Sets the value of the originalStep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalStep(String value) {
        this.originalStep = value;
    }

    /**
     * Gets the value of the parentFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Sets the value of the parentFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentFolderId(Integer value) {
        this.parentFolderId = value;
    }

    /**
     * Gets the value of the orderInParent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInParent() {
        return orderInParent;
    }

    /**
     * Sets the value of the orderInParent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInParent(String value) {
        this.orderInParent = value;
    }

    /**
     * Gets the value of the quickcovSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuickcovSourceId() {
        return quickcovSourceId;
    }

    /**
     * Sets the value of the quickcovSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuickcovSourceId(String value) {
        this.quickcovSourceId = value;
    }

    /**
     * Gets the value of the macroEventSourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacroEventSourceId() {
        return macroEventSourceId;
    }

    /**
     * Sets the value of the macroEventSourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacroEventSourceId(String value) {
        this.macroEventSourceId = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the nonTraceable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonTraceable() {
        return nonTraceable;
    }

    /**
     * Sets the value of the nonTraceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonTraceable(String value) {
        this.nonTraceable = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValid(String value) {
        this.valid = value;
    }

    /**
     * Gets the value of the placeholder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * Sets the value of the placeholder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceholder(String value) {
        this.placeholder = value;
    }

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadOnly(String value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the verifiedInEmulation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerifiedInEmulation() {
        return verifiedInEmulation;
    }

    /**
     * Sets the value of the verifiedInEmulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerifiedInEmulation(String value) {
        this.verifiedInEmulation = value;
    }

    /**
     * Gets the value of the production property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProduction() {
        return production;
    }

    /**
     * Sets the value of the production property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProduction(String value) {
        this.production = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the godlatMaskMatchOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodlatMaskMatchOverride() {
        return godlatMaskMatchOverride;
    }

    /**
     * Sets the value of the godlatMaskMatchOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodlatMaskMatchOverride(String value) {
        this.godlatMaskMatchOverride = value;
    }

    /**
     * Gets the value of the parentGodlatPacketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentGodlatPacketId() {
        return parentGodlatPacketId;
    }

    /**
     * Sets the value of the parentGodlatPacketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentGodlatPacketId(String value) {
        this.parentGodlatPacketId = value;
    }

    /**
     * Gets the value of the headerArm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderArm() {
        return headerArm;
    }

    /**
     * Sets the value of the headerArm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderArm(String value) {
        this.headerArm = value;
    }

    /**
     * Gets the value of the maskMatchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskMatchIndex() {
        return maskMatchIndex;
    }

    /**
     * Sets the value of the maskMatchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskMatchIndex(String value) {
        this.maskMatchIndex = value;
    }

    /**
     * Gets the value of the makeClassified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeClassified() {
        return makeClassified;
    }

    /**
     * Sets the value of the makeClassified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeClassified(String value) {
        this.makeClassified = value;
    }

    /**
     * Gets the value of the counterMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterMode() {
        return counterMode;
    }

    /**
     * Sets the value of the counterMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterMode(String value) {
        this.counterMode = value;
    }

    /**
     * Gets the value of the insightCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsightCondition() {
        return insightCondition;
    }

    /**
     * Sets the value of the insightCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsightCondition(String value) {
        this.insightCondition = value;
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
     * Gets the value of the clockCounter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClockCounter() {
        return clockCounter;
    }

    /**
     * Sets the value of the clockCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClockCounter(String value) {
        this.clockCounter = value;
    }

    /**
     * Gets the value of the module property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModule() {
        return module;
    }

    /**
     * Sets the value of the module property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModule(String value) {
        this.module = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Gets the value of the pmonArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonArea() {
        return pmonArea;
    }

    /**
     * Sets the value of the pmonArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonArea(String value) {
        this.pmonArea = value;
    }

    /**
     * Gets the value of the pmonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonCode() {
        return pmonCode;
    }

    /**
     * Sets the value of the pmonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonCode(String value) {
        this.pmonCode = value;
    }

    /**
     * Gets the value of the pmonSelectedSubEvents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonSelectedSubEvents() {
        return pmonSelectedSubEvents;
    }

    /**
     * Sets the value of the pmonSelectedSubEvents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonSelectedSubEvents(String value) {
        this.pmonSelectedSubEvents = value;
    }

    /**
     * Gets the value of the eventOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventOrigin() {
        return eventOrigin;
    }

    /**
     * Sets the value of the eventOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventOrigin(String value) {
        this.eventOrigin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the applicability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicability() {
        return applicability;
    }

    /**
     * Sets the value of the applicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicability(String value) {
        this.applicability = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateId(String value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the templateDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateDomain() {
        return templateDomain;
    }

    /**
     * Sets the value of the templateDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateDomain(String value) {
        this.templateDomain = value;
    }

    /**
     * Gets the value of the templateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * Sets the value of the templateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateType(String value) {
        this.templateType = value;
    }

    /**
     * Gets the value of the templateCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateCluster() {
        return templateCluster;
    }

    /**
     * Sets the value of the templateCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateCluster(String value) {
        this.templateCluster = value;
    }

    /**
     * Gets the value of the templateSlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateSlice() {
        return templateSlice;
    }

    /**
     * Sets the value of the templateSlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateSlice(String value) {
        this.templateSlice = value;
    }

    /**
     * Gets the value of the templateClock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateClock() {
        return templateClock;
    }

    /**
     * Sets the value of the templateClock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateClock(String value) {
        this.templateClock = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the templateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateLocation() {
        return templateLocation;
    }

    /**
     * Sets the value of the templateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateLocation(String value) {
        this.templateLocation = value;
    }

    /**
     * Gets the value of the templateEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateEnable() {
        return templateEnable;
    }

    /**
     * Sets the value of the templateEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateEnable(String value) {
        this.templateEnable = value;
    }

    /**
     * Gets the value of the templateReset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateReset() {
        return templateReset;
    }

    /**
     * Sets the value of the templateReset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateReset(String value) {
        this.templateReset = value;
    }

    /**
     * Gets the value of the scenarioName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScenarioName() {
        return scenarioName;
    }

    /**
     * Sets the value of the scenarioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScenarioName(String value) {
        this.scenarioName = value;
    }

    /**
     * Gets the value of the eventGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventGroup() {
        return eventGroup;
    }

    /**
     * Sets the value of the eventGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventGroup(String value) {
        this.eventGroup = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternal(String value) {
        this.internal = value;
    }

    /**
     * Gets the value of the pmonMaskBit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonMaskBit() {
        return pmonMaskBit;
    }

    /**
     * Sets the value of the pmonMaskBit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonMaskBit(String value) {
        this.pmonMaskBit = value;
    }

    /**
     * Gets the value of the compoundFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompoundFunction() {
        return compoundFunction;
    }

    /**
     * Sets the value of the compoundFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompoundFunction(String value) {
        this.compoundFunction = value;
    }

    /**
     * Gets the value of the geppetoPmonIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeppetoPmonIndex() {
        return geppetoPmonIndex;
    }

    /**
     * Sets the value of the geppetoPmonIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeppetoPmonIndex(String value) {
        this.geppetoPmonIndex = value;
    }

    /**
     * Gets the value of the isPerSliced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPerSliced() {
        return isPerSliced;
    }

    /**
     * Sets the value of the isPerSliced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPerSliced(String value) {
        this.isPerSliced = value;
    }

    /**
     * Gets the value of the pmonFunctionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonFunctionExpression() {
        return pmonFunctionExpression;
    }

    /**
     * Sets the value of the pmonFunctionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonFunctionExpression(String value) {
        this.pmonFunctionExpression = value;
    }

    /**
     * Gets the value of the matrixMsrValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatrixMsrValue() {
        return matrixMsrValue;
    }

    /**
     * Sets the value of the matrixMsrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatrixMsrValue(String value) {
        this.matrixMsrValue = value;
    }

    /**
     * Gets the value of the pmonCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmonCluster() {
        return pmonCluster;
    }

    /**
     * Sets the value of the pmonCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmonCluster(String value) {
        this.pmonCluster = value;
    }

    /**
     * Gets the value of the isComputedPmonFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsComputedPmonFunction() {
        return isComputedPmonFunction;
    }

    /**
     * Sets the value of the isComputedPmonFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsComputedPmonFunction(String value) {
        this.isComputedPmonFunction = value;
    }

    /**
     * Gets the value of the normalizationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNormalizationMethod() {
        return normalizationMethod;
    }

    /**
     * Sets the value of the normalizationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNormalizationMethod(String value) {
        this.normalizationMethod = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the preSiInSync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreSiInSync() {
        return preSiInSync;
    }

    /**
     * Sets the value of the preSiInSync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreSiInSync(String value) {
        this.preSiInSync = value;
    }

    /**
     * Gets the value of the securityColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityColor() {
        return securityColor;
    }

    /**
     * Sets the value of the securityColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityColor(String value) {
        this.securityColor = value;
    }

}
