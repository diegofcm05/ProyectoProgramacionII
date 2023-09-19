/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.accessibility.AccessibleContext;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class Ciclo extends FiguraFlujo{
    
    private Color ColorCirc = Color.red; // Color predeterminado
    private JTextArea textA;

    
    public Ciclo(){
        
        
        setLayout(null);
        setSize(180,100);
        setBackground(new Color(255,255,255));

        
 
        textA = new JTextArea();
        textA.setText("Ingrese la instruccion aqui");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        Font boldFont2 = new Font(textA.getFont().getName(), Font.BOLD, 10);

        
        textA.setBounds(20, (getHeight()/2)-10, 140, 20);

        

        add(textA);
        

        
        
    }
    
    public void setCircColor(Color color) {
        this.ColorCirc = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Crear una elipse
        Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, width, height);

        // Rellenar la elipse con un color
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(ColorCirc); // Cambia el color como desees
        g2d.fill(ellipse);
    }

    public Color getColorCirc() {
        return ColorCirc;
    }

    public void setColorCirc(Color ColorCirc) {
        this.ColorCirc = ColorCirc;
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
        return "Ciclo "+super.getIndice();
    }
    
    
   
    
}
