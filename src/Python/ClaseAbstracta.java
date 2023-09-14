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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

/**
 *
 * @author dfcm9
 */
public class ClaseAbstracta extends FiguraGeneral{
    
     private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
     
    protected JPanel jp_nomclase = new JPanel();
    protected JLabel jl_nomclase = new JLabel("NombreClase");
    
    private ArrayList <FiguraGeneral> hijos = new ArrayList();
    
    protected JPanel jp_metodos = new JPanel();
    protected JLabel jl_metodos = new JLabel("Metodos");
    
    protected JTextArea tp_metodos = new JTextArea();
    protected JScrollPane sp_tpmetodos = new JScrollPane(tp_metodos);
    
    private StyledDocument doctpmet;
    private Style estilotpmet;
    
    
    
    private Font f = null;
    
    public ClaseAbstracta(){
        super();
    }
    
    public ClaseAbstracta(Font f){
        setBackground(Color.blue);
        setSize (200,130);
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

    public ArrayList<FiguraGeneral> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<FiguraGeneral> hijos) {
        this.hijos = hijos;
    }

    
    

    public StyledDocument getDoctpmet() {
        return doctpmet;
    }

    public void setDoctpmet(StyledDocument doctpmet) {
        this.doctpmet = doctpmet;
    }

    public Style getEstilotpmet() {
        return estilotpmet;
    }

    public void setEstilotpmet(Style estilotpmet) {
        this.estilotpmet = estilotpmet;
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

    public JTextArea getTp_metodos() {
        return tp_metodos;
    }

    public void setTp_metodos(JTextArea tp_metodos) {
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
