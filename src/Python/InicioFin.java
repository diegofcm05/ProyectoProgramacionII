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
import javax.swing.JTextArea;

/**
 *
 * @author dfcm9
 */
public class InicioFin extends FiguraGeneral{
    
    private Color ColorInifin = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public InicioFin(){
        
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(180,80);
        setBackground(new Color(204,204,204));

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
    
    

}
