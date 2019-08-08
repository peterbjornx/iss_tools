package sh.pbx.intel.wrap;

import sh.pbx.intel.xml.interview.Event;

import javax.xml.datatype.XMLGregorianCalendar;

public class EventWrap extends EventFolderChild {

    Event inner;

    EventWrap( Event inner ) {
        this.inner = inner;
    }

    public String toString() {
        return inner.getName();
    }

    public String getDescription() {
        return inner.getDescription();
    }

    public void setDescription(String value) {
        inner.setDescription(value);
    }

    public String getComments() {
        return inner.getComments();
    }

    public void setComments(String value) {
        inner.setComments(value);
    }

    public String getEArchSpecSet() {
        return inner.getEArchSpecSet();
    }

    public void setEArchSpecSet(String value) {
        inner.setEArchSpecSet(value);
    }

    public String getEArchSpecDomain() {
        return inner.getEArchSpecDomain();
    }

    public void setEArchSpecDomain(String value) {
        inner.setEArchSpecDomain(value);
    }

    public String getEArchSpecCoverageSource() {
        return inner.getEArchSpecCoverageSource();
    }

    public void setEArchSpecCoverageSource(String value) {
        inner.setEArchSpecCoverageSource(value);
    }

    public String getEArchSpecConstraint() {
        return inner.getEArchSpecConstraint();
    }

    public void setEArchSpecConstraint(String value) {
        inner.setEArchSpecConstraint(value);
    }

    public Integer getId() {
        return inner.getId();
    }

    public void setId(Integer value) {
        inner.setId(value);
    }

    public String getCreator() {
        return inner.getCreator();
    }

    public void setCreator(String value) {
        inner.setCreator(value);
    }

    public XMLGregorianCalendar getUpdateDate() {
        return inner.getUpdateDate();
    }

    public void setUpdateDate(XMLGregorianCalendar value) {
        inner.setUpdateDate(value);
    }

    public String getName() {
        return inner.getName();
    }

    public void setName(String value) {
        inner.setName(value);
    }

    public String getEventType() {
        return inner.getEventType();
    }

    public void setEventType(String value) {
        inner.setEventType(value);
    }

    public Integer getOriginalFolderId() {
        return inner.getOriginalFolderId();
    }

    public void setOriginalFolderId(Integer value) {
        inner.setOriginalFolderId(value);
    }

    public String getOriginalProject() {
        return inner.getOriginalProject();
    }

    public void setOriginalProject(String value) {
        inner.setOriginalProject(value);
    }

    public String getOriginalStep() {
        return inner.getOriginalStep();
    }

    public void setOriginalStep(String value) {
        inner.setOriginalStep(value);
    }

    public Integer getParentFolderId() {
        return inner.getParentFolderId();
    }

    public void setParentFolderId(Integer value) {
        inner.setParentFolderId(value);
    }

    public String getOrderInParent() {
        return inner.getOrderInParent();
    }

    public void setOrderInParent(String value) {
        inner.setOrderInParent(value);
    }

    public String getQuickcovSourceId() {
        return inner.getQuickcovSourceId();
    }

    public void setQuickcovSourceId(String value) {
        inner.setQuickcovSourceId(value);
    }

    public String getMacroEventSourceId() {
        return inner.getMacroEventSourceId();
    }

    public void setMacroEventSourceId(String value) {
        inner.setMacroEventSourceId(value);
    }

    public String getExpression() {
        return inner.getExpression();
    }

    public void setExpression(String value) {
        inner.setExpression(value);
    }

    public String getNonTraceable() {
        return inner.getNonTraceable();
    }

    public void setNonTraceable(String value) {
        inner.setNonTraceable(value);
    }

    public String getValid() {
        return inner.getValid();
    }

    public void setValid(String value) {
        inner.setValid(value);
    }

    public String getPlaceholder() {
        return inner.getPlaceholder();
    }

    public void setPlaceholder(String value) {
        inner.setPlaceholder(value);
    }

    public String getEnabled() {
        return inner.getEnabled();
    }

    public void setEnabled(String value) {
        inner.setEnabled(value);
    }

    public String getReadOnly() {
        return inner.getReadOnly();
    }

    public void setReadOnly(String value) {
        inner.setReadOnly(value);
    }

    public String getVerifiedInEmulation() {
        return inner.getVerifiedInEmulation();
    }

    public void setVerifiedInEmulation(String value) {
        inner.setVerifiedInEmulation(value);
    }

    public String getProduction() {
        return inner.getProduction();
    }

    public void setProduction(String value) {
        inner.setProduction(value);
    }

    public String getError() {
        return inner.getError();
    }

    public void setError(String value) {
        inner.setError(value);
    }

    public String getGodlatMaskMatchOverride() {
        return inner.getGodlatMaskMatchOverride();
    }

    public void setGodlatMaskMatchOverride(String value) {
        inner.setGodlatMaskMatchOverride(value);
    }

    public String getParentGodlatPacketId() {
        return inner.getParentGodlatPacketId();
    }

    public void setParentGodlatPacketId(String value) {
        inner.setParentGodlatPacketId(value);
    }

    public String getHeaderArm() {
        return inner.getHeaderArm();
    }

    public void setHeaderArm(String value) {
        inner.setHeaderArm(value);
    }

    public String getMaskMatchIndex() {
        return inner.getMaskMatchIndex();
    }

    public void setMaskMatchIndex(String value) {
        inner.setMaskMatchIndex(value);
    }

    public String getMakeClassified() {
        return inner.getMakeClassified();
    }

    public void setMakeClassified(String value) {
        inner.setMakeClassified(value);
    }

    public String getCounterMode() {
        return inner.getCounterMode();
    }

    public void setCounterMode(String value) {
        inner.setCounterMode(value);
    }

    public String getInsightCondition() {
        return inner.getInsightCondition();
    }

    public void setInsightCondition(String value) {
        inner.setInsightCondition(value);
    }

    public String getVersion() {
        return inner.getVersion();
    }

    public void setVersion(String value) {
        inner.setVersion(value);
    }

    public String getClockCounter() {
        return inner.getClockCounter();
    }

    public void setClockCounter(String value) {
        inner.setClockCounter(value);
    }

    public String getModule() {
        return inner.getModule();
    }

    public void setModule(String value) {
        inner.setModule(value);
    }

    public String getPath() {
        return inner.getPath();
    }

    public void setPath(String value) {
        inner.setPath(value);
    }

    public String getGroup() {
        return inner.getGroup();
    }

    public void setGroup(String value) {
        inner.setGroup(value);
    }

    public String getTag() {
        return inner.getTag();
    }

    public void setTag(String value) {
        inner.setTag(value);
    }

    public String getPmonArea() {
        return inner.getPmonArea();
    }

    public void setPmonArea(String value) {
        inner.setPmonArea(value);
    }

    public String getPmonCode() {
        return inner.getPmonCode();
    }

    public void setPmonCode(String value) {
        inner.setPmonCode(value);
    }

    public String getPmonSelectedSubEvents() {
        return inner.getPmonSelectedSubEvents();
    }

    public void setPmonSelectedSubEvents(String value) {
        inner.setPmonSelectedSubEvents(value);
    }

    public String getEventOrigin() {
        return inner.getEventOrigin();
    }

    public void setEventOrigin(String value) {
        inner.setEventOrigin(value);
    }

    public String getDestination() {
        return inner.getDestination();
    }

    public void setDestination(String value) {
        inner.setDestination(value);
    }

    public String getApplicability() {
        return inner.getApplicability();
    }

    public void setApplicability(String value) {
        inner.setApplicability(value);
    }

    public String getPriority() {
        return inner.getPriority();
    }

    public void setPriority(String value) {
        inner.setPriority(value);
    }

    public String getTemplateId() {
        return inner.getTemplateId();
    }

    public void setTemplateId(String value) {
        inner.setTemplateId(value);
    }

    public String getTemplateDomain() {
        return inner.getTemplateDomain();
    }

    public void setTemplateDomain(String value) {
        inner.setTemplateDomain(value);
    }

    public String getTemplateType() {
        return inner.getTemplateType();
    }

    public void setTemplateType(String value) {
        inner.setTemplateType(value);
    }

    public String getTemplateCluster() {
        return inner.getTemplateCluster();
    }

    public void setTemplateCluster(String value) {
        inner.setTemplateCluster(value);
    }

    public String getTemplateSlice() {
        return inner.getTemplateSlice();
    }

    public void setTemplateSlice(String value) {
        inner.setTemplateSlice(value);
    }

    public String getTemplateClock() {
        return inner.getTemplateClock();
    }

    public void setTemplateClock(String value) {
        inner.setTemplateClock(value);
    }

    public String getTemplateName() {
        return inner.getTemplateName();
    }

    public void setTemplateName(String value) {
        inner.setTemplateName(value);
    }

    public String getTemplateLocation() {
        return inner.getTemplateLocation();
    }

    public void setTemplateLocation(String value) {
        inner.setTemplateLocation(value);
    }

    public String getTemplateEnable() {
        return inner.getTemplateEnable();
    }

    public void setTemplateEnable(String value) {
        inner.setTemplateEnable(value);
    }

    public String getTemplateReset() {
        return inner.getTemplateReset();
    }

    public void setTemplateReset(String value) {
        inner.setTemplateReset(value);
    }

    public String getScenarioName() {
        return inner.getScenarioName();
    }

    public void setScenarioName(String value) {
        inner.setScenarioName(value);
    }

    public String getEventGroup() {
        return inner.getEventGroup();
    }

    public void setEventGroup(String value) {
        inner.setEventGroup(value);
    }

    public String getInternal() {
        return inner.getInternal();
    }

    public void setInternal(String value) {
        inner.setInternal(value);
    }

    public String getPmonMaskBit() {
        return inner.getPmonMaskBit();
    }

    public void setPmonMaskBit(String value) {
        inner.setPmonMaskBit(value);
    }

    public String getCompoundFunction() {
        return inner.getCompoundFunction();
    }

    public void setCompoundFunction(String value) {
        inner.setCompoundFunction(value);
    }

    public String getGeppetoPmonIndex() {
        return inner.getGeppetoPmonIndex();
    }

    public void setGeppetoPmonIndex(String value) {
        inner.setGeppetoPmonIndex(value);
    }

    public String getIsPerSliced() {
        return inner.getIsPerSliced();
    }

    public void setIsPerSliced(String value) {
        inner.setIsPerSliced(value);
    }

    public String getPmonFunctionExpression() {
        return inner.getPmonFunctionExpression();
    }

    public void setPmonFunctionExpression(String value) {
        inner.setPmonFunctionExpression(value);
    }

    public String getMatrixMsrValue() {
        return inner.getMatrixMsrValue();
    }

    public void setMatrixMsrValue(String value) {
        inner.setMatrixMsrValue(value);
    }

    public String getPmonCluster() {
        return inner.getPmonCluster();
    }

    public void setPmonCluster(String value) {
        inner.setPmonCluster(value);
    }

    public String getIsComputedPmonFunction() {
        return inner.getIsComputedPmonFunction();
    }

    public void setIsComputedPmonFunction(String value) {
        inner.setIsComputedPmonFunction(value);
    }

    public String getNormalizationMethod() {
        return inner.getNormalizationMethod();
    }

    public void setNormalizationMethod(String value) {
        inner.setNormalizationMethod(value);
    }

    public String getUnit() {
        return inner.getUnit();
    }

    public void setUnit(String value) {
        inner.setUnit(value);
    }

    public String getFamily() {
        return inner.getFamily();
    }

    public void setFamily(String value) {
        inner.setFamily(value);
    }

    public String getPreSiInSync() {
        return inner.getPreSiInSync();
    }

    public void setPreSiInSync(String value) {
        inner.setPreSiInSync(value);
    }

    public String getSecurityColor() {
        return inner.getSecurityColor();
    }

    public void setSecurityColor(String value) {
        inner.setSecurityColor(value);
    }
}
