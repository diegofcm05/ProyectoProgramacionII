/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author dfcm9
 */
public class DatosCA implements Serializable{
    
    
    private String nombre;
    private int width, height;
    private String metos;
    private Font fontt;
    private Color bgc;
    private ArrayList <FiguraGeneral> hijos = new ArrayList();

    
    public DatosCA(String nombre, int width, int height, String metos, Font fontt, Color bgc) {
        this.nombre = nombre;
        this.width = width;
        this.height = height;
        this.metos = metos;
        this.fontt = fontt;
        this.bgc = bgc;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMetos() {
        return metos;
    }

    public void setMetos(String metos) {
        this.metos = metos;
    }

    public Font getFontt() {
        return fontt;
    }

    public void setFontt(Font fontt) {
        this.fontt = fontt;
    }

    public Color getBgc() {
        return bgc;
    }

    public void setBgc(Color bgc) {
        this.bgc = bgc;
    }

    public ArrayList<FiguraGeneral> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<FiguraGeneral> hijos) {
        this.hijos = hijos;
    }
    
    
    
    
    
    
}
