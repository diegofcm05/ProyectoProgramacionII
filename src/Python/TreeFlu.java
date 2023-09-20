/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;

import java.io.Serializable;
import javax.swing.JTree;

/**
 *
 * @author dfcm9
 */
public class TreeFlu implements Serializable{
    
    private JTree diag;

    public TreeFlu(JTree diag) {
        this.diag = diag;
    }

    public JTree getDiag() {
        return diag;
    }

    public void setDiag(JTree diag) {
        this.diag = diag;
    }

    @Override
    public String toString() {
        return "TreeFlu{" + "diag=" + diag + '}';
    }
    
    
    
}
