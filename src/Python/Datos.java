/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Path2D;
import javax.swing.JTextArea;


/**
 *
 * @author dfcm9
 */
public class Datos extends FiguraGeneral{
    
    private Color Colordata = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public Datos (){
        
        // Constructor: Configurar el panel y agregar componentes
        setLayout(null);
        setSize(260,60);
        setBackground(new Color(204,204,204));

        // Crear un JTextPane y agregarlo al centro del panel
        textA = new JTextArea();
        textA.setText("Aqui va el texto de instruccion");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        textA.setBounds(40, (getHeight()/2)-10, 180, 20);

        
        add(textA);
        
        
    }
    
    public void setDataColor(Color color) {
        this.Colordata = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Crear un paralelogramo
        Path2D.Double parallelogram = new Path2D.Double();
        int slant = 50; // Ajusta el ángulo de inclinación del paralelogramo

        parallelogram.moveTo(0, 0);
        parallelogram.lineTo(width - slant, 0);
        parallelogram.lineTo(width, height);
        parallelogram.lineTo(slant, height);
        parallelogram.closePath();

        // Rellenar el paralelogramo con un color
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Colordata); // Cambia el color como desees
        g2d.fill(parallelogram);
    }
    
    
    
    
    
    
}
