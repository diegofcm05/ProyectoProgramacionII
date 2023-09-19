/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.accessibility.AccessibleContext;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author dfcm9
 */
public class InicioFin extends FiguraFlujo{
    
    private Color ColorInifin = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public InicioFin(){
        
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(180,80);
        setBackground(new Color(255,255,255));

        // Crear un JTextPane y agregarlo al centro del panel
        textA = new JTextArea();
        textA.setText("Inicio/Fin");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        textA.setBounds(40, (getHeight()/2)-10, 100, 20);

        
        add(textA);
        
        
    }
    
    public void setInicioFinColor(Color color) {
        this.ColorInifin = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int width = getWidth();
        int height = getHeight();
        
        Graphics2D g2d = (Graphics2D) g;
        
        // Crear una forma de cápsula horizontal
        Shape capsuleShape = new RoundRectangle2D.Double(0, height / 4, width, height / 2, height / 2, height / 2);
        
        // Rellenar la forma con un color
        g2d.setColor(ColorInifin); // Cambia el color como desees
        g2d.fill(capsuleShape);
    }

    public Color getColorInifin() {
        return ColorInifin;
    }

    public void setColorInifin(Color ColorInifin) {
        this.ColorInifin = ColorInifin;
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
        return "InicioFin "+super.getIndice();
    }
    
    
    
    

}
