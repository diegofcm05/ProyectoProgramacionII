/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
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
public class ClaseHerencia extends FiguraGeneral{
    
    private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
    private Font boldFontext = new Font(getFont().getName(), Font.BOLD, 9);
    
    protected JPanel jp_extension = new JPanel();
    protected JLabel extension = new JLabel("extends");
    
    protected JPanel jp_nomclase = new JPanel();
    protected JLabel nomclase = new JLabel("NombreClase");
    
    protected JPanel jp_atributos = new JPanel();
    protected JLabel atributos = new JLabel("Atributos");
    
    protected JTextPane tp_atributos = new JTextPane();
    protected JScrollPane sp_tpatributos = new JScrollPane(tp_atributos);
    
    protected JPanel jp_metodos = new JPanel();
    protected JLabel metodos = new JLabel("Metodos");
    
    protected JTextPane tp_metodos = new JTextPane();
    protected JScrollPane sp_tpmetodos = new JScrollPane(tp_metodos);
    
    private FiguraGeneral padre;
    
    
    
    
    public ClaseHerencia(FiguraGeneral padre){
        
        this.padre = padre;
        
        setBackground(Color.blue);
        setSize (200,215);
        //setLocation(10,10);
        
        jp_extension.setBackground(getBackground());
        jp_extension.setPreferredSize(new Dimension(getWidth()-10,20));
        
        extension.setPreferredSize(new Dimension(getWidth()-10,20));
        extension.setBackground(new Color(0,0,0));
        extension.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        extension.setForeground(Color.white);
        extension.setFont(boldFontext);
        jp_extension.add(extension);
        
        
        
        jp_nomclase.setBackground(getBackground());
        jp_nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        
        nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        nomclase.setBackground(new Color(0,0,0));
        nomclase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomclase.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        nomclase.setForeground(Color.white);
        nomclase.setFont(boldFont);
        jp_nomclase.add(nomclase);
        
        
        
        jp_atributos.setBackground(getBackground());
        jp_atributos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        atributos.setPreferredSize(new Dimension(getWidth()-10,25));
        atributos.setBackground(new Color(0,0,0));
        atributos.setForeground(Color.white);
        atributos.setFont(boldFont);
        jp_atributos.add(atributos);
        
        sp_tpatributos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_atributos.setBackground(new Color(175,175,175));
        sp_tpatributos.setForeground(new Color(175,175,175));
        
        
        
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
        
        
        add(jp_extension);
        add(jp_nomclase);
        add(jp_atributos);
        add(sp_tpatributos);
        add(jp_metodos);
        add(sp_tpmetodos);
        
       
        
    }

    public Font getBoldFont() {
        return boldFont;
    }

    public void setBoldFont(Font boldFont) {
        this.boldFont = boldFont;
    }

    public JPanel getJp_extension() {
        return jp_extension;
    }

    public void setJp_extension(JPanel jp_extension) {
        this.jp_extension = jp_extension;
    }

    public JLabel getExtension() {
        return extension;
    }

    public void setExtension(JLabel extension) {
        this.extension = extension;
    }

    public JPanel getJp_nomclase() {
        return jp_nomclase;
    }

    public void setJp_nomclase(JPanel jp_nomclase) {
        this.jp_nomclase = jp_nomclase;
    }

    public JLabel getNomclase() {
        return nomclase;
    }

    public void setNomclase(JLabel nomclase) {
        this.nomclase = nomclase;
    }

    public JPanel getJp_atributos() {
        return jp_atributos;
    }

    public void setJp_atributos(JPanel jp_atributos) {
        this.jp_atributos = jp_atributos;
    }

    public JLabel getAtributos() {
        return atributos;
    }

    public void setAtributos(JLabel atributos) {
        this.atributos = atributos;
    }

    public JTextPane getTp_atributos() {
        return tp_atributos;
    }

    public void setTp_atributos(JTextPane tp_atributos) {
        this.tp_atributos = tp_atributos;
    }

    public JScrollPane getSp_tpatributos() {
        return sp_tpatributos;
    }

    public void setSp_tpatributos(JScrollPane sp_tpatributos) {
        this.sp_tpatributos = sp_tpatributos;
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
        return nomclase.getText();
    }

    
    
    
    
    

   
    
}
