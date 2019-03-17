/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.time.LocalDate;

/**
 *
 * @author andres
 */
public class Main {
    
    public static void main(String[] args) {
        
//        Garaje g1 = new Garaje();
//        System.out.println(g1);
        LocalDate diaHoy = LocalDate.now();

//        
//        Garaje pruebaGaraje = new Garaje(2, new Puerta(false, 3), 50);
//        System.out.println(g2);


        
        Vista.menu();
        
        Central prueba = new Central(new Garaje(2, new Puerta(false, 3), 50), new Salon (false), new Dormitorio(Orientacion.NORTE), diaHoy, "primera central creada" );
                
    }
    
}
