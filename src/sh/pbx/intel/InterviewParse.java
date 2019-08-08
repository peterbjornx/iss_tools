package sh.pbx.intel;

import com.l2fprod.common.propertysheet.PropertySheetPanel;
import sh.pbx.intel.wrap.EventFolderWrap;
import sh.pbx.intel.wrap.EventWrap;
import sh.pbx.intel.wrap.InterviewWrap;
import sh.pbx.intel.xml.interview.InterView;

import javax.swing.*;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.xml.bind.JAXB;
import java.awt.*;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.io.*;

public class InterviewParse {

    public static void main(String[] argv) {
        InterView iv = JAXB.unmarshal(new File("intv/interview_int11"), InterView.class);
        InterviewWrap w = new InterviewWrap(iv);
        System.out.println(iv.getEventFolder().size());
        JFrame f = new JFrame();
        JTree t=  new JTree(new TreeModel() {
            @Override
            public Object getRoot() {
                return w.getRootFolder();
            }

            @Override
            public Object getChild(Object o, int i) {
                EventFolderWrap w = (EventFolderWrap) o;
                return w.getChildren().get(i);
            }

            @Override
            public int getChildCount(Object o) {
                EventFolderWrap w = (EventFolderWrap) o;
                return w.getChildren().size();
            }

            @Override
            public boolean isLeaf(Object o) {
                return o instanceof EventWrap;
            }

            @Override
            public void valueForPathChanged(TreePath treePath, Object o) {

            }

            @Override
            public int getIndexOfChild(Object o, Object o1) {
                EventFolderWrap w = (EventFolderWrap) o;
                return w.getChildren().indexOf(o1);
            }

            @Override
            public void addTreeModelListener(TreeModelListener treeModelListener) {
                //throw new RuntimeException("BOOH!");
            }

            @Override
            public void removeTreeModelListener(TreeModelListener treeModelListener) {

            }
        });
        JScrollPane sp = new JScrollPane(t);
        PropertySheetPanel p = new PropertySheetPanel();
        try {
            p.setBeanInfo(Introspector.getBeanInfo(EventFolderWrap.class));
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        p.readFromObject(w.getRootFolder());
        p.repaint();
        t.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent treeSelectionEvent) {
                Object o = treeSelectionEvent.getNewLeadSelectionPath().getLastPathComponent();
                try {
                    p.setBeanInfo(Introspector.getBeanInfo(o.getClass()));
                } catch (IntrospectionException e) {
                    e.printStackTrace();
                }
                p.readFromObject(o);
                p.repaint();
            }
        });
        f.setLayout( new FlowLayout());
        f.add(sp);
        f.add(p);
        f.pack();
        f.setVisible(true);
    }

}
