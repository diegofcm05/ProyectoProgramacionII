/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;

/**
 
 * @author dfcm9
 */
public class DatosIF implements Serializable{
    
    private String nombre;
    private int width, height;
    private String metos;
    private Font fontf;
    private Color col;

    public DatosIF(String nombre, int width, int height, String metos, Font fontf, Color col) {
        this.nombre = nombre;
        this.width = width;
        this.height = height;
        this.metos = metos;
        this.fontf = fontf;
        this.col = col;
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

    public Font getFontf() {
        return fontf;
    }

    public void setFontf(Font fontf) {
        this.fontf = fontf;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }
    
    
    
    
}
