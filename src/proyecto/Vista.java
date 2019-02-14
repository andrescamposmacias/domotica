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
        System.out.println("2.- Estancias");
        System.out.println("3.- Estado general de la vivienda");
        System.out.println("4.- Apagar sistema");
        
        respuesta = teclado.nextInt();
        
        System.out.println("");
        
        switch(respuesta){
            case 1:
                System.out.println("Has entrado en las opciones del reloj");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Consultar hora");
                System.out.println("2.- Modificar la hora");
                respuesta = teclado.nextInt();
                break;
            case 2:
                System.out.println("Has entrado en las opciones de las estancias");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Garaje");
                System.out.println("2.- Salón");
                System.out.println("3.- Dormitorio");
                System.out.println("4.- Despacho");
                System.out.println("5.- Cocina");
                System.out.println("6.- Aseo");
                respuesta = teclado.nextInt();
                    switch (respuesta){
                        case 1:
                            System.out.println("Has entrado en las opciones del garaje");
                            System.out.println("Elige entre unas de las opciones:");
                            System.out.println("1.- Consultar la puerta");
                            System.out.println("2.- Subir la puerta del garaje");
                            System.out.println("3.- Bajar la puerta del garaje");
                            respuesta = teclado.nextInt();
                            break;
                        case 2:
                            System.out.println("Has entrado en las opciones del salón");
                            System.out.println("Elige entre unas de las opciones:");
                            System.out.println("1.- Subir la persiana");
                            System.out.println("2.- Bajar la persiana");
                            System.out.println("3.- Dejar la persiana a media altura");
                            System.out.println("4.- Encender las luces");
                            System.out.println("5.- Apagado de luces");
                            System.out.println("6.- Colsutar estado de las luces");
                            System.out.println("7.- Iniciar vigilancia");
                            System.out.println("8.- Detener vigilancia");
                            System.out.println("9.- Consultar estado de la vigilancia");
                            respuesta = teclado.nextInt();
                                switch (respuesta){
                                    case 5:
                                        System.out.println("Has entrado en las opciones de apagado de luces");
                                        System.out.println("Elige entre unas de las opciones:");
                                        System.out.println("1.- Apagado de las luces del salón");
                                        System.out.println("2.- Apagado general de la casa");
                                        System.out.println("3.- Apagado eco (solo funciona entre las 8 de la mañana y las 6 de la tarde");
                                        respuesta = teclado.nextInt();
                                        break;
                                }
                            break;
                    }
                break;
            case 3:
                System.out.println("Has entrado en las opciones de las habitaciones");
                System.out.println("Elige entre unas de las opciones:");
                System.out.println("1.- Salón");
                System.out.println("2.- Dormitorios");
                System.out.println("3.- Despacho");
                respuesta = teclado.nextInt();
                    switch (respuesta){
                        case 1:
                            System.out.println("Has entrado en las opciones del salón");
                            System.out.println("Elige entre unas de las opciones:");
                            System.out.println("1.- Subir la persiana");
                            System.out.println("2.- Bajar la persiana");
                            System.out.println("3.- Dejar la persiana a media altura");
                            System.out.println("4.- Encender las luces");
                            System.out.println("5.- Apagado de luces");
                            System.out.println("6.- Colsutar estado de las luces");
                            System.out.println("7.- Iniciar vigilancia");
                            System.out.println("8.- Detener vigilancia");
                            System.out.println("9.- Consultar estado de la vigilancia");
                            respuesta = teclado.nextInt();
                                switch (respuesta){
                                    case 5:
                                        System.out.println("Has entrado en las opciones de apagado de luces");
                                        System.out.println("Elige entre unas de las opciones:");
                                        System.out.println("1.- Apagado de las luces del salón");
                                        System.out.println("2.- Apagado general de la casa");
                                        System.out.println("3.- Apagado eco (solo funciona entre las 8 de la mañana y las 6 de la tarde");
                                        respuesta = teclado.nextInt();
                                        break;
                                }
                            break;
                        case 2:
                            System.out.println("Has entrado en las opciones del dormitorio");
                            System.out.println("Elige entre unas de las opciones:");
                            System.out.println("1.- Subir la persiana");
                            System.out.println("2.- Bajar la persiana");
                            System.out.println("3.- Dejar la persiana a media altura");
                            System.out.println("4.- Encender las luces");
                            System.out.println("5.- Apagado de luces");
                            System.out.println("6.- Colsutar estado de las luces");
                            System.out.println("7.- Iniciar vigilancia");
                            System.out.println("8.- Detener vigilancia");
                            System.out.println("9.- Consultar estado de la vigilancia");
                            respuesta = teclado.nextInt();
                                switch (respuesta){
                                    case 5:
                                        System.out.println("Has entrado en las opciones de apagado de luces");
                                        System.out.println("Elige entre unas de las opciones:");
                                        System.out.println("1.- Apagado de las luces del dormitorio");
                                        System.out.println("2.- Apagado general de la casa");
                                        System.out.println("3.- Apagado eco (solo funciona entre las 8 de la mañana y las 6 de la tarde");
                                        respuesta = teclado.nextInt();
                                        break;
                                }
                            break;
                    }
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ;
    }
}