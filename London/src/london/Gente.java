/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package london;

/**
 *
 * @author alumno
 */
public class Gente {
    String Nombre;
    boolean dentro;
    boolean pagado;
    
    
    public Gente(String Nombre,boolean dentro) {
        this.Nombre = Nombre;
        this.dentro = dentro;
        
    }

    public boolean isDentro() {
        return dentro;
    }

    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }

    

    @Override
    public String toString() {
        return Nombre + '\n';
    }

    public String getNombre() {
        return Nombre;
    }

    
   
}
