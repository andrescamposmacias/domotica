/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {
    private static LocalTime hora = LocalTime.now();
    private static LocalDate fecha = LocalDate.now();

    public static void verHora() {
        System.out.println("La hora es: " + hora.getHour() + ":"+ hora.getMinute()+ ":" + hora.getSecond());
    }
    
    public static void verFecha(){
        System.out.println("La fecha es:  " + fecha);
    }
    
}
