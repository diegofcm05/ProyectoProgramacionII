/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
/**
 *
 * @author dfcm9
 */
public class FiguraFlujo extends JPanel implements MouseListener, MouseMotionListener{
    
    private Component componenteClickeado;
    private Point Start;
    private static FiguraFlujo ultimoclickeado;
    private boolean seleccionado = false;
    private boolean borrado = false;
    protected JPopupMenu menuop = new JPopupMenu();
    protected JMenuItem eliminar = new JMenuItem();
    protected JMenuItem colortext = new JMenuItem();
    
    
    private FiguraFlujo padre;
    private String indice;
    private ArrayList <FiguraFlujo> hijos = new ArrayList();
    private Object contenido;
    
    
    
    public FiguraFlujo(String indice) {
        setLocation(10, 10);
        
        eliminar.setText("Eliminar");
        menuop.add(eliminar);
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrado = true;
                JPanel xf = (JPanel) ultimoclickeado.getParent();
                xf.remove(ultimoclickeado);
                xf.repaint();
            }
        });
        
        setIndice(indice);
    }

    public FiguraFlujo() {
        setLocation(10, 10);
        
        eliminar.setText("Eliminar");
        menuop.add(eliminar);
        this.addMouseListener((MouseListener) this);
        this.addMouseMotionListener((MouseMotionListener) this);
        
        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrado = true;
                JPanel xf = (JPanel) ultimoclickeado.getParent();
                xf.remove(ultimoclickeado);
                xf.repaint();
            }
        });
  
    }

    public String getIndice() {
        return indice;
    }

    public void setIndice(String indice) {
        this.indice = indice;
    }
    
    
    
    public FiguraFlujo getPadre() {
        return padre;
    }

    public void setPadre(FiguraFlujo padre) {
        this.padre = padre;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }

    public ArrayList<FiguraFlujo> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<FiguraFlujo> hijos) {
        this.hijos = hijos;
    }
    
    public FiguraFlujo getHijo(int pos) {
        return hijos.get(pos);
    }

    public void setHijo(FiguraFlujo hijo) {
        this.hijos.add(hijo);
    }
    
    
    
    @Override
    public String toString() {
        return "Figura "+indice;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
    

    public Point getStart() {
        return Start;
    }

    public void setStart(Point Start) {
        this.Start = Start;
    }

    public static FiguraFlujo getUltimoclickeado() {
        return ultimoclickeado;
    }

    public static void setUltimoclickeado(FiguraFlujo ultimoclickeado) {
        FiguraFlujo.ultimoclickeado = ultimoclickeado;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    

    
    
    @Override
    public void mouseClicked(MouseEvent evt) {
        ultimoclickeado = FiguraFlujo.this;
        seleccionado = !seleccionado;
        
        if (evt.isMetaDown()){
            componenteClickeado = evt.getComponent();
            menuop.show(evt.getComponent(), evt.getX(), evt.getY());
            
        }
        
        
        
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
    
    protected Color Colorclaro(Color x){
        int newred = x.getRed();
        int newgreen= x.getGreen();
        int newblue = x.getBlue();
        
        int restared = 255-newred;
        int restagreen = 255-newgreen;
        int restablue = 255-newblue;
        
        
        
        if (newred + 30 <= 255){
            newred+=30;
        }
        else{
            newred+=restared;
        }
        
        if (newgreen + 30 <= 255){
            newgreen +=30;
        }
        else{
            newgreen+=restagreen;
        }
        
        if (newblue + 30 <= 255){
            newblue+=30;
        }
        else{
            newred+=restablue;
        }
        
        Color newcol = new Color(newred, newgreen, newblue);
        
        return newcol;
        
        
    }
    
    
    
}
