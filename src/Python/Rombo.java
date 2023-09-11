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
import javax.swing.JTextField;

/**
 *
 * @author dfcm9
 */


public class Rombo extends FiguraGeneral{
    
    private Color romboColor = Color.red; // Color predeterminado
    private JTextField textField;
    
    public Rombo() {
        // Constructor: Configurar el panel y agregar componentes
        setLayout(new GridBagLayout());
        setSize(200,100);
        setBackground(new Color(204,204,204));

        // Crear un JTextField y agregarlo al centro del panel
        textField = new JTextField("Texto en el rombo");
        textField.setBackground(Color.BLUE); // Establecer el fondo del JTextField al color del panel
        textField.setForeground(Color.WHITE); // Establecer el color del texto en blanco
        textField.setBorder(null); // Eliminar el borde del JTextField
        
        // Cambiar el estilo de fuente del texto a negrita
        Font boldFont = new Font(textField.getFont().getName(), Font.BOLD, textField.getFont().getSize());
        textField.setFont(boldFont);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField, gbc);
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
        g2d.setColor(Color.red);
        g2d.fill(rombo);
    }
    
    

    
    
    
}
