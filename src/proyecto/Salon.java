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
public class Salon extends Habitaciones {
    //el atributo
    private boolean terraza;
    //el constructor
    public Salon(boolean terraza, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.terraza = terraza;
    }
    //getters y setters
    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }
    //el toString
    @Override
    public String toString() {
        return "Salon{" + "terraza=" + terraza + '}';
    }
    
}
