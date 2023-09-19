/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Python;


public class Arbol {
    private FiguraFlujo raiz;
    String temp = "";
    
    public Arbol() {
        raiz = new FiguraFlujo();
    }

    public Arbol(FiguraFlujo raiz) {
        this.raiz = raiz;
    }

    public FiguraFlujo getRaiz() {
        return raiz;
    }

    public void setRaiz(FiguraFlujo raiz) {
        this.raiz = raiz;
    }
    
    public void agregar (FiguraFlujo n, FiguraFlujo nh2){   
        if (n.getIndice().equals(nh2.getIndice().substring(0, nh2.getIndice().length()-2))) {
                n.setHijo(nh2);
                
        }
        for (FiguraFlujo hijo : n.getHijos()) {
            if (hijo.getHijos().isEmpty() ) { 
                if (n.getHijos().indexOf(hijo) == n.getHijos().size()-1 ) {
                    if ( hijo.getIndice().equals(nh2.getIndice().substring(0, nh2.getIndice().length()-2))) {
                        hijo.setHijo(nh2);
                    }
                } else {
                    if ( hijo.getIndice().equals(nh2.getIndice().substring(0, nh2.getIndice().length()-2))) {
                        hijo.setHijo(nh2);
                    }  
                }                    
            } else { 
                agregar(hijo, nh2);
            }
        }
    }
    
    public String recorrer (FiguraFlujo n){
        temp+=n+"[";
        for (FiguraFlujo hijo : n.getHijos()) {
            if (hijo.getHijos().isEmpty() ) { 
                if (n.getHijos().indexOf(hijo) == n.getHijos().size()-1 ) {
                    temp+=hijo+" "; 
                } else {
                    temp+=hijo+", "; 
                }
            } else { 
                recorrer(hijo);
            }
        }
       temp+="], ";
       return temp;
    }
    
    
    public String genif(Rombo r){
        String ifgen = "";
        ifgen+= "if "+r.getTextA().getText()+": \n";
        return ifgen;
    }
    
    public String genelse(Rombo r){
        String elsegen = "";
        
        return elsegen;
    }

    public String genprocess(Proceso p){
        String processgen = "";
        
        processgen+=p.getTextA().getText()+"\n";
        
        return processgen;
    }
    
    public String genciclo(Ciclo c){
        String ciclogen = "";
        
        ciclogen+="while "+c.getTextA().getText()+": \n";
        
        return ciclogen;
    }
    
    public String gendata (Datos d){
        String datagen = "";
        String [] tempa = d.getTextA().getText().split(";");
        
        for (int i = 0; i < tempa.length; i++) {
            datagen+=tempa[0]+"\n";
        }
        
        return datagen;
    }
    
}
