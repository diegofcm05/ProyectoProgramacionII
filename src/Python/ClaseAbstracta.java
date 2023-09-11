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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class ClaseAbstracta extends FiguraGeneral{
    
     private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
     
    protected JPanel jp_nomclase = new JPanel();
    protected JLabel jl_nomclase = new JLabel("NombreClase");
    
    
    
    protected JPanel jp_atributos = new JPanel();
    protected JLabel jl_atributos = new JLabel("Atributos");
    
    protected JTextPane tp_atributos = new JTextPane();
    protected JScrollPane sp_tpatributos = new JScrollPane(tp_atributos);
    
    
    
    
    protected JPanel jp_metodos = new JPanel();
    protected JLabel jl_metodos = new JLabel("Metodos");
    
    protected JTextPane tp_metodos = new JTextPane();
    protected JScrollPane sp_tpmetodos = new JScrollPane(tp_metodos);
    
    
    
    private Font f = null;
    
    public ClaseAbstracta(){
        super();
    }
    
    public ClaseAbstracta(Font f){
        setBackground(Color.blue);
        setSize (200,210);
        //setLocation(0,0);
        
        jp_nomclase.setBackground(getBackground());
        jp_nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        
        
        jl_nomclase.setPreferredSize(new Dimension(getWidth()-10,25));
        jl_nomclase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nomclase.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        jl_nomclase.setBackground(new Color(0,0,0));
        jl_nomclase.setForeground(Color.white);
        jl_nomclase.setFont(boldFont);
        jp_nomclase.add(jl_nomclase);
        
        
        
        jp_atributos.setBackground(getBackground());
        jp_atributos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        jl_atributos.setPreferredSize(new Dimension(getWidth()-10,25));
        jl_atributos.setBackground(new Color(0,0,0));
        jl_atributos.setForeground(Color.white);
        jl_atributos.setFont(boldFont);
        jp_atributos.add(jl_atributos);
        
        sp_tpatributos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_atributos.setBackground(new Color(175,175,175));
        sp_tpatributos.setForeground(new Color(175,175,175));
        
        
        
        jp_metodos.setBackground(getBackground());
        jp_metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        
        jl_metodos.setPreferredSize(new Dimension(getWidth()-10,25));
        jl_metodos.setBackground(new Color(0,0,0));
        jl_metodos.setForeground(Color.white);
        jl_metodos.setFont(boldFont);
        jp_metodos.add(jl_metodos);
        
        sp_tpmetodos.setPreferredSize(new Dimension (getWidth()-20, 40));
        tp_metodos.setBackground(new Color(175,175,175));
        sp_tpmetodos.setForeground(new Color(175,175,175));
        
        
        
        add(jp_nomclase);
        add(jp_atributos);
        add(sp_tpatributos);
        add(jp_metodos);
        add(sp_tpmetodos);
    }

    public JPanel getJp_nomclase() {
        return jp_nomclase;
    }

    public void setJp_nomclase(JPanel jp_nomclase) {
        this.jp_nomclase = jp_nomclase;
    }

    public JLabel getJl_nomclase() {
        return jl_nomclase;
    }

    public void setJl_nomclase(JLabel jl_nomclase) {
        this.jl_nomclase = jl_nomclase;
    }

    

    public JPanel getJp_atributos() {
        return jp_atributos;
    }

    public void setJp_atributos(JPanel jp_atributos) {
        this.jp_atributos = jp_atributos;
    }
    

    public JLabel getJl_atributos() {
        return jl_atributos;
    }

    public void setJl_atributos(JLabel jl_atributos) {
        this.jl_atributos = jl_atributos;
    }

    

    public JPanel getJp_metodos() {
        return jp_metodos;
    }

    public void setJp_metodos(JPanel jp_metodos) {
        this.jp_metodos = jp_metodos;
    }

    

    public JLabel getJl_metodos() {
        return jl_metodos;
    }

    public void setJl_metodos(JLabel jl_metodos) {
        this.jl_metodos = jl_metodos;
    }

    

    public Font getF() {
        return f;
    }

    public void setF(Font f) {
        this.f = f;
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
        return jl_nomclase.getText();
    }
    
    
    
    
    
}
