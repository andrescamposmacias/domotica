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
    //los atributos
    private boolean estado;
    private int retardo;// segundos
    
    //java crea un constructor por defecto
    //si no implementamos ninguno

    //el constructor parametrizado
    public Puerta(boolean estado, int retardo) {
        this.estado = estado;
        this.retardo = retardo;
    }
    //el constructor por defecto
    public Puerta() {
        this.estado = true;
        this.retardo = 5;
    }
    
    //getters y setters
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
    //el toString
    @Override
    public String toString() {
        return "Puerta{" + "estado=" + estado + ", retardo=" + retardo + '}';
    }
    
    
    
}
