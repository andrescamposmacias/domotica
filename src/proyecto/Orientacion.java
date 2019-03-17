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
public enum Orientacion {
    
    NORTE(true, "La orientacion es en el norte"),
    SUR(true, "La orientacion es en el sur"),
    ESTE(true, "La orientacion es en el este"),
    OESTE(true, "La orientacion es en el oeste");
    
    private boolean posicion;
    private String descripcion;

    private Orientacion(boolean posicion, String descripcion) {
        this.posicion = posicion;
        this.descripcion = descripcion;
    }

    
    
    
    
}
