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
public class FiguraGeneral extends JPanel implements MouseListener, MouseMotionListener{
    
    private Component componenteClickeado;
    private Point Start;
    private static FiguraGeneral ultimoclickeado;
    private boolean seleccionado = false;
    private boolean borrado = false;
    protected JPopupMenu menuop = new JPopupMenu();
    protected JMenuItem nomclass = new JMenuItem();
    protected JMenuItem eliminar = new JMenuItem();
    protected JMenuItem addinterface = new JMenuItem();
    
    private ArrayList <FiguraGeneral> hijos = new ArrayList();
    private ArrayList <Interfaz> interdisp = new ArrayList();
    private ArrayList <Interfaz> implementadas = new ArrayList();

    public FiguraGeneral() {
        setLocation(10, 10);
        
        nomclass.setText("Cambiar Nombre");
        eliminar.setText("Eliminar");
        addinterface.setText("Implementar Interfaz");
        menuop.add(nomclass);
        menuop.add(eliminar);
        menuop.add(addinterface);
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
        nomclass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (componenteClickeado instanceof ClaseGnrl){
                    String ax = JOptionPane.showInputDialog(null, "Ingrese nuevo nombre: ");
                    ((ClaseGnrl) ultimoclickeado).getTitulo().setText("Clase "+ax);
                }
            }
        });
        
        
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

    public static FiguraGeneral getUltimoclickeado() {
        return ultimoclickeado;
    }

    public static void setUltimoclickeado(FiguraGeneral ultimoclickeado) {
        FiguraGeneral.ultimoclickeado = ultimoclickeado;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public ArrayList<FiguraGeneral> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<FiguraGeneral> hijos) {
        this.hijos = hijos;
    }
    
    public void setHijo(FiguraGeneral hijo){
        hijos.add(hijo);
    }

    public ArrayList<Interfaz> getInterdisp() {
        return interdisp;
    }

    public void setInterdisp(ArrayList<Interfaz> interdisp) {
        this.interdisp = interdisp;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent evt) {
        ultimoclickeado = FiguraGeneral.this;
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
    
    
    
}
