package sh.pbx.intel.wrap;

import sh.pbx.intel.xml.interview.CpuProduct;
import sh.pbx.intel.xml.interview.Event;
import sh.pbx.intel.xml.interview.EventFolder;
import sh.pbx.intel.xml.interview.InterView;

import java.util.HashMap;
import java.util.Map;

public class InterviewWrap {

    private final Map<Integer, EventFolderWrap> eventFolders = new HashMap<>();
    private final HashMap<Integer, EventWrap> events = new HashMap<>();
    private InterView inner;
    private EventFolderWrap rootFolder = null;

    public InterviewWrap(InterView inner ) {
        this.inner = inner;
        for ( EventFolder f : inner.getEventFolder()){
            eventFolders.put(f.getId(),new EventFolderWrap(f));
        }
        for ( Event e : inner.getEvent()){
            events.put(e.getId(),new EventWrap(e));
        }
        for (EventFolderWrap f : eventFolders.values() ) {
            int pfid = f.inner.getParentFolderId();
            if ( pfid == -1 ) {
                if ( rootFolder != null )
                    throw new RuntimeException("Multiple roots!");
                rootFolder = f;
            } else {
                f.parent = eventFolders.get(f.inner.getParentFolderId());
                f.parent.children.add(f);
            }
        }
        for (EventWrap e : events.values() ) {
            int pfid = e.inner.getParentFolderId();
            if ( pfid == -1 ) {
                throw new RuntimeException("Orphaned event!");
            } else {
                e.parent = eventFolders.get(e.inner.getParentFolderId());
                if (null == e.parent)
                    System.err.println("NO PARENT for "+e.getPath());
                else
                    e.parent.children.add(e);
            }
        }
    }

    public EventFolderWrap getFolder(Integer id) {
        return eventFolders.get(id);
    }

    public CpuProduct getCpuProduct() {
        return inner.getCpuProduct();
    }

    public EventFolderWrap getRootFolder() {
        return rootFolder;
    }
}
