/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Andrés y Diego
 */
public class Luz {
    //los atributos
    private boolean estado;
    private double consumo;
    //el constructor
    public Luz(boolean estado, double consumo) {
        this.estado = estado;
        this.consumo = consumo;
    }
    //los getters y setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    //el toString
    @Override
    public String toString() {
        return "Luz{" + "estado=" + estado + ", consumo=" + consumo + '}';
    }
    
}
