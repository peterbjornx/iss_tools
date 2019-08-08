package sh.pbx.intel;

import com.sun.java.swing.plaf.gtk.GTKLookAndFeel;
import sh.pbx.intel.model.BusPort;
import sh.pbx.intel.model.Clock;
import sh.pbx.intel.model.Component;
import sh.pbx.intel.model.Signal;
import sh.pbx.intel.xml.visa.VisaSignalMap;

import javax.swing.*;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;
import javax.xml.bind.JAXB;
import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

public class SignalMapViewer {

    public static void main(String[] arg) throws MalformedURLException {
        try {
            UIManager.setLookAndFeel(
                    new GTKLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        ImageIcon is = new ImageIcon(new File("res/sig.png").toURL());
        ImageIcon ib = new ImageIcon(new File("res/bus.png").toURL());
        ImageIcon ic = new ImageIcon(new File("res/clk.png").toURL());
        ImageIcon icc = new ImageIcon(new File("res/cmp.png").toURL());
        ImageIcon ip = new ImageIcon(new File("res/port.png").toURL());
        Map<String, ImageIcon> buses = new HashMap<>();
        Component c = Component.loadComponent(new File("sigmap/BXT_6_buses.xml"));
        JFrame f = new JFrame();
        JTree t=  new JTree(new TreeModel() {
            @Override
            public Object getRoot() {
                return c;
            }

            @Override
            public Object getChild(Object o, int i) {
                Component w = (Component) o;
                return w.getChildren().get(i);
            }

            @Override
            public int getChildCount(Object o) {
                Component w = (Component) o;
                return w.getChildren().size();
            }

            @Override
            public boolean isLeaf(Object o) {
                return !(o instanceof Component);
            }

            @Override
            public void valueForPathChanged(TreePath treePath, Object o) {

            }

            @Override
            public int getIndexOfChild(Object o, Object o1) {
                Component w = (Component) o;
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
        t.setCellRenderer( new DefaultTreeCellRenderer() {
            @Override
            public java.awt.Component getTreeCellRendererComponent(JTree tree,
                                                                   Object value, boolean selected, boolean expanded,
                                                                   boolean leaf, int row, boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, selected,expanded, leaf, row, hasFocus);
                if ( value instanceof Signal) {
                    Signal val = (Signal) value;
                    if ( val.isBus() )
                        setIcon(ib);
                    else
                        setIcon(is);

                } else if ( value instanceof Clock) {
                    setIcon(ic);
                } else if ( value instanceof BusPort) {
                    BusPort val = (BusPort) value;
                    ImageIcon i = buses.get(val.getBus());
                    if (i == null) {
                        try {
                            i = new ImageIcon(new File("res/"+val.getBus().toLowerCase()+".png").toURL());
                        } catch (Exception e) {
                        }
                        if ( i == null )
                            i = ip;
                        buses.put(val.getBus(), i);
                    }
                    setIcon(i);
                } else if ( value instanceof Component )
                    setIcon(icc);
                /*
                if (tree.getModel().getRoot().equals(nodo)) {
                    setIcon(root);
                } else if (nodo.getChildCount() > 0) {
                    setIcon(parent);
                } else {
                    setIcon(leaf);
                }*/
                return this;
            }
        });
        JScrollPane sp = new JScrollPane(t);
        f.add(sp);
        f.pack();
        f.setVisible(true);

    }

}
