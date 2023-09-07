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
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class ClaseGnrl extends FiguraGeneral{
    
    
    private Font boldFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize());
     
    protected JPanel titleBG = new JPanel();
    protected JLabel titulo = new JLabel("NombreClase");
    protected JPanel titleBG2 = new JPanel();
    protected JLabel titulo2 = new JLabel("Atributos");
    protected JPanel titleBG3 = new JPanel();
    protected JLabel titulo3 = new JLabel("Metodos");
    
    private Font f = null;
    private JTextArea txtA = new JTextArea(3,18);
    private JTextArea txtA2 = new JTextArea(3,18);
    
    public ClaseGnrl(){
        super();
    }
    
    public ClaseGnrl(Font f){
        setBackground(Color.blue);
        setSize (200,210);
        setLocation(0,0);
        
        titleBG.setBackground(getBackground());
        titleBG.setPreferredSize(new Dimension(getWidth()-10,25));
        
        
        titulo.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setBackground(new Color(0,0,0));
        titulo.setForeground(Color.white);
        titulo.setFont(boldFont);
        titleBG.add(titulo);
        
        titleBG2.setBackground(getBackground());
        titleBG2.setPreferredSize(new Dimension(getWidth()-10,25));
        
        titulo2.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo2.setBackground(new Color(0,0,0));
        titulo2.setForeground(Color.white);
        titulo2.setFont(boldFont);
        titleBG2.add(titulo2);
        
        titleBG3.setBackground(getBackground());
        titleBG3.setPreferredSize(new Dimension(getWidth()-10,25));
        
        titulo3.setPreferredSize(new Dimension(getWidth()-10,25));
        titulo3.setBackground(new Color(0,0,0));
        titulo3.setForeground(Color.white);
        titulo3.setFont(boldFont);
        titleBG3.add(titulo3);
        
        
        txtA.setBackground(new Color(175,175,175));
        txtA2.setBackground(new Color(175,175,175));
        
        add(titleBG);
        add(titleBG2);
        add(txtA);
        add(titleBG3);
        add(txtA2);
    }

    public JPanel getTitleBG() {
        return titleBG;
    }

    public void setTitleBG(JPanel titleBG) {
        this.titleBG = titleBG;
    }

    public JLabel getTitulo() {
        return titulo;
    }

    public void setTitulo(JLabel titulo) {
        this.titulo = titulo;
    }

    public JPanel getTitleBG2() {
        return titleBG2;
    }

    public void setTitleBG2(JPanel titleBG2) {
        this.titleBG2 = titleBG2;
    }

    public JLabel getTitulo2() {
        return titulo2;
    }

    public void setTitulo2(JLabel titulo2) {
        this.titulo2 = titulo2;
    }

    public JPanel getTitleBG3() {
        return titleBG3;
    }

    public void setTitleBG3(JPanel titleBG3) {
        this.titleBG3 = titleBG3;
    }

    public JLabel getTitulo3() {
        return titulo3;
    }

    public void setTitulo3(JLabel titulo3) {
        this.titulo3 = titulo3;
    }

    public Font getF() {
        return f;
    }

    public void setF(Font f) {
        this.f = f;
    }

    public JTextArea getTxtA() {
        return txtA;
    }

    public void setTxtA(JTextArea txtA) {
        this.txtA = txtA;
    }

    public JTextArea getTxtA2() {
        return txtA2;
    }

    public void setTxtA2(JTextArea txtA2) {
        this.txtA2 = txtA2;
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
    
    
    
}
