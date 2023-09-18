/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 *
 * @author dfcm9
 */
public class Proceso extends FiguraGeneral{
    
    private Color colorpro = Color.red; // Color predeterminado
    private JTextArea textA;
    
    public Proceso(){
        
        setLayout(null);
        setSize(200,60);
        setBackground(colorpro);
        
        textA = new JTextArea();
        textA.setText("Aqui va el texto de instruccion");
        textA.setBackground(Color.GRAY); // Establecer el fondo del JTextPane al color del panel
        textA.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textA.setBorder(null); // Eliminar el borde del JTextPane
        
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textA.getFont().getName(), Font.BOLD, textA.getFont().getSize());
        textA.setFont(boldFont);
        
        textA.setBounds(20, (getHeight()/2)-10, 160, 20);

        
        add(textA);
    
    }
    
    public void setProcesoColor(Color color) {
        this.colorpro = color;
        repaint(); // Vuelve a dibujar el componente para reflejar el nuevo color
    }
    
    
}
