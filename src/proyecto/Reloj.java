/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {

    public static void verHora() {
        LocalTime ahora = LocalTime.now();
        System.out.println("La hora es: " + ahora.getHour() + ":"+ ahora.getMinute()+ ":" + ahora.getSecond());
    }
    
    public static void verFecha(){
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha es:  " + hoy);
    }
    
    
}
