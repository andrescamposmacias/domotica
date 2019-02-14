/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Vista {
    
    private static Scanner teclado = new Scanner(System.in);
    private static int respuesta;

    public static Comando menu() {
        System.out.println("Bienvenido al menú de la vivienda");
        System.out.println("-----------------------");
        System.out.println("1.- Reloj");
        System.out.println("2.- Garaje");
        System.out.println("3.- Habitaciones genéricas");
        System.out.println("4.- Estado general de la vivienda");
        System.out.println("5.- Apagar sistema");
        
        respuesta = teclado.nextInt();
        
        System.out.println("");
        
        switch(respuesta){
            case 1:
                System.out.println("Has entrado en las opciones del reloj");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Consultar hora");
                System.out.println("2.- Modificar la hora");
                System.out.println("3.- Volver atras");
                respuesta = teclado.nextInt();
                break;
            case 2:
                System.out.println("Has entrado en las opciones del garaje");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Consultar la puerta");
                System.out.println("2.- Subir la puerta del garaje");
                System.out.println("3.- Bajar la puerta del garaje");
                System.out.println("4.- Volver atras");
                respuesta = teclado.nextInt();
                break;
            case 3:
                System.out.println("Has entrado en las opciones de las habitaciones");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Salón");
                System.out.println("2.- Dormitorios");
                System.out.println("3.- Despacho");
                System.out.println("4.- Volver atras");
                respuesta = teclado.nextInt();
                break;
        }
        return 0;
    }
}