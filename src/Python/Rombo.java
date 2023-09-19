/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;



import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.geom.Path2D;
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


public class Rombo extends FiguraFlujo{
    
    private Color romboColor = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public Rombo() {
        
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(200,100);
        setBackground(new Color(255,255,255));

        // Crear un JTextPane y agregarlo al centro del panel
        textA = new JTextArea();
        textA.setText("Aqui va el texto de instruccion");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        Font boldFont2 = new Font(textA.getFont().getName(), Font.BOLD, 10);

        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        textA.setBounds(30, (getHeight()/2)-10, 140, 20);
        
        

        
        add(textA);
    }
    
    public void setRomboColor(Color color) {
        this.romboColor = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  

        // Crear un rombo
        Path2D.Double rombo = new Path2D.Double();
        int width = getWidth();
        int height = getHeight();
        int midX = width / 2;
        int midY = height / 2;

        rombo.moveTo(midX, 0);          // Arriba
        rombo.lineTo(width, midY);      // Derecha
        rombo.lineTo(midX, height);      // Abajo
        rombo.lineTo(0, midY);          // Izquierda
        rombo.closePath();               // Conectar con el punto de inicio

        // Dibujar el rombo
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(romboColor);
        g2d.fill(rombo);
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
        return "Rombo "+super.getIndice();
    }
    
    
    
    

    
    
    
}
