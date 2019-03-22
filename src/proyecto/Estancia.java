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
public class Estancia {
    //creo el atributo
    private int m2;
    //el constructor por defecto
    public Estancia(){
        m2 = 0;
    }
    //constructor parametrizado
    public Estancia(int m2){
        this.m2 = m2;
    }
    //getters y setters
    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }
    //el toString
    @Override
    public String toString() {
        return "Estancia{" + "m2=" + m2 + '}';
    }
    
    
    
}
