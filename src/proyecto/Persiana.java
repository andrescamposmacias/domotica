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
public class Persiana {
    
    private int estado;
    private int largo;//cm
    private int ancho;//cm

    public Persiana(int estado, int largo, int ancho) {
        if(estado >= 0 || estado <= 2){
            this.estado = estado;
        }else{
            this.estado = 0;
        }
        
        this.largo = largo;
        this.ancho = ancho;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        if(estado >= 0 || estado <= 2){
            this.estado = estado;
        }else{
            this.estado = 0;
        }
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Persiana{" + "estado=" + estado + ", largo=" + largo + ", ancho=" + ancho + '}';
    }
    
    
    
}
