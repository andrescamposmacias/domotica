/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Reloj {
    private static LocalTime hora = LocalTime.now();
    private static LocalDate fecha = LocalDate.now();

    public static void verHora() {
        System.out.println("La hora es: " + hora.getHour() + ":"+ hora.getMinute()+ ":" + hora.getSecond());
    }
    
    public static void verFecha(){
        System.out.println("La fecha es:  " + fecha);
    }
    
    public static void modificarHora(){
        Scanner teclado = new Scanner (System.in);
        int horas;
        int minutos;
        int segundos;
        
        System.out.println("Introduce la hora que quieras");
        horas = teclado.nextInt();
        
        System.out.println("Introduce los minutos que quieras");
        minutos = teclado.nextInt();
        
        System.out.println("Introduce los segundos que quieras");
        segundos = teclado.nextInt();
        
        hora = LocalTime.of(horas, minutos, segundos);
        
        System.out.println("La nueva hora es " + hora);
    }
    
    
}
