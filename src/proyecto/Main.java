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
 
        LocalDate diaHoy = LocalDate.now();
        
        Central prueba = new Central(new Garaje(2, new Puerta(false, 3), 50),
                new Salon (false, new Luz(true, 10.0), new Persiana(EstadoPersiana.BAJADA, 30,50), new Camara(false, "192.168.1.10"), 20), 
                new Dormitorio(Orientacion.NORTE, new Luz(true, 10.0), new Persiana(EstadoPersiana.SUBIDA, 20,30), new Camara(false, "192.168.1.11"), 30), 
                new Usuario("andres", "diego"), diaHoy, "primera central creada" );
        
                int contador = 0;
                boolean continuar = true;
                
                do{
                    if (prueba.comprobacionUsuario()) {
                        prueba.ejecutarOrden(Vista.menu());
                        continuar = false;
                    } else {
                        System.out.println("Usuario y/o contraseña incorrecta");
                        contador++;
                    }
                    
                }while(continuar && contador != 5);
                
           
        
        
            
                   
    }
    
}
