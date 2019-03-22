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
 
        //creo un objeto LocalDate para poder crear un objeto central
        LocalDate diaHoy = LocalDate.now();
        
        //creo un objeto central
        Central prueba = new Central(new Garaje(2, new Puerta(false, 3), 50),
                new Salon (false, new Luz(true, 10.0), new Persiana(EstadoPersiana.BAJADA, 30,50), new Camara(false, "192.168.1.10"), 20), 
                new Dormitorio(Orientacion.NORTE, new Luz(true, 10.0), new Persiana(EstadoPersiana.SUBIDA, 20,30), new Camara(false, "192.168.1.11"), 30), 
                new Usuario("andres", "diego"), diaHoy, "primera central creada" );
               
        //creo un contador y un boolean para que se siga ejecutando el bucle
        int contador = 0;
        boolean cont = true;
        do {
            //primero compruebo si el usuario de la central es el mismo
            //que escribe el usuario
            if (prueba.comprobacionUsuario()) {
                //si es igual, cambio el boolean de true a false para
                //que no se vuelva a ejecutar el bucle
                cont = false;
                //creo otro bucle para que se repita el menú
                do {
                    prueba.ejecutarOrden(Vista.menu());
                  //se repetira hasta que el usuario le de a apagar sistema
                } while (Vista.continuar);
              //si el usuario no es true, entonces entrara al else y el contador
              //se auto incrementa
            } else {
                System.out.println("Usuario y/o contraseña incorrecta");
                contador++;
            }
          //si el cont es true o el contador no llega a 5, se seguira ejecutando
          //el bucle
        } while (cont && contador != 5);
        //si se sale del bucle y el contador es 5, entrara en el if donde 
        //le informo al usuario que se ha terminado la conexion por exceso de intento
        if(contador == 5){
            System.out.println("Has excedido el numero de intentos permitido, se"
                    + " procede a apagar el sistema");
        }
        
            
                   
    }
    
}
