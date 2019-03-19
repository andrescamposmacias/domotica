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
    
    private boolean terraza;

    public Salon(boolean terraza, Luz luz, Persiana persiana, Camara camara, int m2) {
        super(luz, persiana, camara, m2);
        this.terraza = terraza;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    @Override
    public String toString() {
        return "Salon{" + "terraza=" + terraza + '}';
    }
    
}
