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
    
    private EstadoPersiana estado;
    private int largo;//cm
    private int ancho;//cm

    public Persiana(EstadoPersiana estado, int largo, int ancho) {
        this.estado = estado;
        this.largo = largo;
        this.ancho = ancho;
    }

    public EstadoPersiana getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersiana estado) {
        this.estado = estado;
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
