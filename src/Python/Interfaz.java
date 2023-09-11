/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.accessibility.AccessibleContext;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class Interfaz extends FiguraGeneral{
    
    private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    private Font boldFontext = new Font(getFont().getName(), Font.BOLD, 9);
    
    protected JPanel jp_nominter = new JPanel();
    protected JLabel nominter = new JLabel("NombreInterdaz");
    
    protected JPanel jp_metodos = new JPanel();
    protected JLabel metodos = new JLabel("Metodos");
    
    protected JTextPane tp_metodos = new JTextPane();
    protected JScrollPane sp_tpmetodos = new JScrollPane(tp_metodos);
    
    
    
    
    
    public Interfaz(){
        
        setBackground(Color.ORANGE);
        setSize (200,120);
        
        jp_nominter.setBackground(getBackground());
        jp_nominter.setPreferredSize(new Dimension(getWidth()-10,25));
        
        nominter.setPreferredSize(new Dimension(getWidth()-10,25));
        nominter.setBackground(new Color(0,0,0));
        nominter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nominter.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        nominter.setForeground(Color.white);
        nominter.setFont(boldFont);
        jp_nominter.add(nominter);
        
        
        jp_metodos.setBackground(getBackground());
        jp_metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        metodos.setBackground(new Color(0,0,0));
        metodos.setForeground(Color.white);
        metodos.setFont(boldFont);
        jp_metodos.add(metodos);
        
        sp_tpmetodos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_metodos.setBackground(new Color(175,175,175));
        sp_tpmetodos.setForeground(new Color(175,175,175));
        
        add(jp_nominter);
        add(jp_metodos);
        add(sp_tpmetodos);
    }

    public Font getBoldFont() {
        return boldFont;
    }

    public void setBoldFont(Font boldFont) {
        this.boldFont = boldFont;
    }

    public Font getBoldFontext() {
        return boldFontext;
    }

    public void setBoldFontext(Font boldFontext) {
        this.boldFontext = boldFontext;
    }

    public JPanel getJp_nominter() {
        return jp_nominter;
    }

    public void setJp_nominter(JPanel jp_nominter) {
        this.jp_nominter = jp_nominter;
    }

    public JLabel getNominter() {
        return nominter;
    }

    public void setNominter(JLabel nominter) {
        this.nominter = nominter;
    }

    public JPanel getJp_metodos() {
        return jp_metodos;
    }

    public void setJp_metodos(JPanel jp_metodos) {
        this.jp_metodos = jp_metodos;
    }

    public JLabel getMetodos() {
        return metodos;
    }

    public void setMetodos(JLabel metodos) {
        this.metodos = metodos;
    }

    public JTextPane getTp_metodos() {
        return tp_metodos;
    }

    public void setTp_metodos(JTextPane tp_metodos) {
        this.tp_metodos = tp_metodos;
    }

    public JScrollPane getSp_tpmetodos() {
        return sp_tpmetodos;
    }

    public void setSp_tpmetodos(JScrollPane sp_tpmetodos) {
        this.sp_tpmetodos = sp_tpmetodos;
    }

    public JPopupMenu getMenuop() {
        return menuop;
    }

    public void setMenuop(JPopupMenu menuop) {
        this.menuop = menuop;
    }

    public JMenuItem getNomclass() {
        return nomclass;
    }

    public void setNomclass(JMenuItem nomclass) {
        this.nomclass = nomclass;
    }

    public JMenuItem getEliminar() {
        return eliminar;
    }

    public void setEliminar(JMenuItem eliminar) {
        this.eliminar = eliminar;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }

    @Override
    public String toString() {
        return nominter.getText();
    }
    
    
    
   
    
}
