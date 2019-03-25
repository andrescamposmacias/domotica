/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Andrés y Diego
 */
import java.time.LocalDate;
import java.time.LocalTime;

public class Reloj {
    //2 atributos staticos LocalTime y LocalDate
    private static LocalTime hora = LocalTime.now();
    private static LocalDate fecha = LocalDate.now();

    //un metodo verHora para que se muestre la hora de hoy
    public static void verHora() {
        System.out.println("La hora es: " + hora.getHour() + ":"+ hora.getMinute()+ ":" + hora.getSecond());
    }
    
    //metedo para saber la fecha
    public static void verFecha(){
        System.out.println("La fecha es:  " + fecha);
    }
    
}
