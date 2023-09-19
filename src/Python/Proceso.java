/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import javax.accessibility.AccessibleContext;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class Proceso extends FiguraFlujo{

    private Color colorpro = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public Proceso(){
        
        setLayout(null);
        setSize(200,80);
        setBackground(colorpro);
        

        
        textA = new JTextArea();
        textA.setText("Aqui va el texto de instruccion");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        Font boldFont2 = new Font(textA.getFont().getName(), Font.BOLD, 10);

        
        textA.setBounds(20, (getHeight()/2)-20, 160, 20);

        
        add(textA);

    
    }
    
    public void setProcesoColor(Color color) {
        setBackground(color);
        repaint();
    }




    public Color getColorpro() {
        return colorpro;
    }

    public void setColorpro(Color colorpro) {
        this.colorpro = colorpro;
    }

    public JTextArea getTextA() {
        return textA;
    }

    public void setTextA(JTextArea textA) {
        this.textA = textA;
    }

    public JPopupMenu getMenuop() {
        return menuop;
    }

    public void setMenuop(JPopupMenu menuop) {
        this.menuop = menuop;
    }

    

    public JMenuItem getEliminar() {
        return eliminar;
    }

    public void setEliminar(JMenuItem eliminar) {
        this.eliminar = eliminar;
    }


    public JMenuItem getColortext() {
        return colortext;
    }

    public void setColortext(JMenuItem colortext) {
        this.colortext = colortext;
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
        return "Proceso "+super.getIndice();
    }
    
    
    
    
}
