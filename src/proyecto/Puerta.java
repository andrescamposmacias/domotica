/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author andres
 */
public class Puerta {
    
    private boolean estado;
    private int retardo;// segundos
    
    //java crea un constructor por defecto
    //si no implementamos ninguno

    public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }
    
    public Puerta() {
        this.estado = true;
        this.retardo = 5;
    }
    

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getRetardo() {
        return retardo;
    }

    public void setRetardo(int retardo) {
        this.retardo = retardo;
    }

    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }
    
    
    
}
