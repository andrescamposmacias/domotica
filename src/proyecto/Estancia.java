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
    
    private int m2;
    
    public Estancia(){
        m2 = 0;
    }
    
    public Estancia(int m2){
        this.m2 = m2;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Estancia{" + "m2=" + m2 + '}';
    }
    
    
    
}
