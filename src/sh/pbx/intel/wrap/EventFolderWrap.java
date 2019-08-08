package sh.pbx.intel.wrap;

import sh.pbx.intel.xml.interview.EventFolder;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.LinkedList;
import java.util.List;

public class EventFolderWrap extends EventFolderChild{
    EventFolder inner;
    List<EventFolderChild> children = new LinkedList<>();

    EventFolderWrap( EventFolder inner ) {
        this.inner = inner;
    }

    public List<EventFolderChild> getChildren() {
        return children;
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

    public Integer getParentFolderId() {
        return inner.getParentFolderId();
    }

    public void setParentFolderId(Integer value) {
        inner.setParentFolderId(value);
    }

    public Integer getOrderInParent() {
        return inner.getOrderInParent();
    }

    public void setOrderInParent(Integer value) {
        inner.setOrderInParent(value);
    }

    public String getPath() {
        return inner.getPath();
    }

    public void setPath(String value) {
        inner.setPath(value);
    }

    public String getReadOnly() {
        return inner.getReadOnly();
    }

    public void setReadOnly(String value) {
        inner.setReadOnly(value);
    }

    public String getFamily() {
        return inner.getFamily();
    }

    public void setFamily(String value) {
        inner.setFamily(value);
    }
}
