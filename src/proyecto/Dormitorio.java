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
public class Dormitorio extends Habitaciones{
    //creo un atributo de orientacion que es un enum
    //para asegurarme que la orientacion solo pueda ser
    //norte, sur, este o oeste
    private Orientacion orientacion;

    //constructor
    public Dormitorio(Orientacion orientacion, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.orientacion = orientacion;
    }
    //getter y setters
    public Orientacion getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(Orientacion orientacion) {
        this.orientacion = orientacion;
    }
    
    //el toString
    @Override
    public String toString() {
        return "Dormitorio{" + "orientacion=" + orientacion + '}';
    }

}
