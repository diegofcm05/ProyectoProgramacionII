/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

/**
 *
 * @author dfcm9
 */
public class FiguraGeneral extends JPanel implements MouseListener, MouseMotionListener{
    
    private Point Start;
    private static FiguraGeneral ultimoclickeado;
    private boolean seleccionado = false;

    public FiguraGeneral() {
        
       
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        
    }

    public Point getStart() {
        return Start;
    }

    public void setStart(Point Start) {
        this.Start = Start;
    }

    public static FiguraGeneral getUltimoclickeado() {
        return ultimoclickeado;
    }

    public static void setUltimoclickeado(FiguraGeneral ultimoclickeado) {
        FiguraGeneral.ultimoclickeado = ultimoclickeado;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        ultimoclickeado = FiguraGeneral.this;
        seleccionado = !seleccionado;
        
        repaint();
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Start = SwingUtilities.convertPoint(this, e.getPoint(), this.getParent());
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Start = null;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point ubi = SwingUtilities.convertPoint(this, e.getPoint(), this.getParent());
        if (true){
            Point newubi = this.getLocation();
            newubi.translate(ubi.x- Start.x, ubi.y - Start.y);
            newubi.x = Math.max(newubi.x, 0);
            newubi.y = Math.max(newubi.y, 0);
            newubi.x = Math.min(newubi.x, this.getParent().getWidth() - this.getWidth());
            newubi.y = Math.min(newubi.y, this.getParent().getHeight()-this.getHeight());
            this.setLocation(newubi);
            Start = ubi;
            
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Establece el borde negro si el panel está seleccionado
        if (seleccionado) {
            Border borde = BorderFactory.createLineBorder(Color.BLACK, 2);
            setBorder(borde);
        } else {
            setBorder(null); // Quita el borde si el panel no está seleccionado
        }
    }
    
    
    
}
