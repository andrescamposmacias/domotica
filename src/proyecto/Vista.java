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
    private static String usuario;
    private static String passwd;
    public static boolean continuar = true;
    
    public static Usuario login(){
        
        System.out.println("Introduce el usuario");
        usuario = teclado.nextLine();
        
        System.out.println("Introduce la contraseña");
        passwd = teclado.nextLine();
        
        Usuario usu = new Usuario(usuario, passwd);
        
        return usu;
        
    }

    public static Comando menu() {

                boolean seguir = true;
                do {
                    try {
                        System.out.println("Bienvenido al menú de la vivienda");
                        System.out.println("-----------------------");
                        System.out.println("1.- Reloj");
                        System.out.println("2.- Estancias");
                        System.out.println("3.- Estado general de la vivienda");
                        System.out.println("4.- Apagar sistema");

                        respuesta = teclado.nextInt();

                        System.out.println("");

                        switch (respuesta) {
                            case 1:
                                System.out.println("Has entrado en las opciones del reloj");
                                System.out.println("Elige entre unas de las opciones:");
                                System.out.println("1.- Consultar hora");
                                respuesta = teclado.nextInt();

                                switch (respuesta) {
                                    case 1:
                                        return Comando.CONSULTAR_HORA;
                                    default:
                                        System.out.println("Ha elegido una opcion que no está en el menú");
                                        break;
                                }
                                break;
                            case 2:
                                System.out.println("Has entrado en las opciones de las estancias");
                                System.out.println("Elige entre unas de las opciones:");
                                System.out.println("1.- Garaje");
                                System.out.println("2.- Salón");
                                System.out.println("3.- Dormitorio");
                                respuesta = teclado.nextInt();
                                switch (respuesta) {
                                    case 1:
                                        System.out.println("Has entrado en las opciones del garaje");
                                        System.out.println("Elige entre unas de las opciones:");
                                        System.out.println("1.- Consultar la puerta");
                                        System.out.println("2.- Subir la puerta del garaje");
                                        System.out.println("3.- Bajar la puerta del garaje");
                                        respuesta = teclado.nextInt();

                                        switch (respuesta) {
                                            case 1:
                                                return Comando.CONSULTAR_PUERTA_GARAJE;
                                            case 2:
                                                return Comando.SUBIR_PUERTA_GARAJE;
                                            case 3:
                                                return Comando.BAJAR_PUERTA_GARAJE;
                                            default:
                                                System.out.println("Ha elegido una opcion que no está en el menú");
                                                break;
                                        }
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
                                        switch (respuesta) {
                                            case 1:
                                                return Comando.SUBIR_PERSIANA_SALON;
                                            case 2:
                                                return Comando.BAJAR_PERSIANA_SALON;
                                            case 3:
                                                return Comando.MEDIAALTURA_PERSIANA_SALON;
                                            case 4:
                                                return Comando.ENCENDER_LUCES_SALON;
                                            case 5:
                                                System.out.println("Has entrado en las opciones de apagado de luces");
                                                System.out.println("Elige entre unas de las opciones:");
                                                System.out.println("1.- Apagado de las luces del salón");
                                                System.out.println("2.- Apagado general de la casa");
                                                System.out.println("3.- Apagado eco (solo funciona entre las 8 de la mañana y las 6 de la tarde");
                                                respuesta = teclado.nextInt();

                                                switch (respuesta) {
                                                    case 1:
                                                        return Comando.APAGAR_LUCES_MANUAL_SALON;
                                                    case 2:
                                                        return Comando.APAGAR_LUCES_GENERAL;
                                                    case 3:
                                                        return Comando.APAGAR_LUCES_ECO;
                                                    default:
                                                        System.out.println("Ha elegido una opcion que no está en el menú");
                                                        break;
                                                }
                                                break;
                                            case 6:
                                                return Comando.CONSULTAR_LUCES_SALON;
                                            case 7:
                                                return Comando.ENCENDER_VIGILANCIA_SALON;
                                            case 8:
                                                return Comando.APAGAR_VIGILANCIA_SALON;
                                            case 9:
                                                return Comando.CONSULTAR_VIGILANCIA_SALON;
                                            default:
                                                System.out.println("Ha elegido una opcion que no está en el menú");
                                                break;
                                        }
                                        break;

                                    case 3:
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

                                        switch (respuesta) {
                                            case 1:
                                                return Comando.SUBIR_PERSIANA_DORMITORIO;
                                            case 2:
                                                return Comando.BAJAR_PERSIANA_DORMITORIO;
                                            case 3:
                                                return Comando.MEDIAALTURA_PERSIANA_DORMITORIO;
                                            case 4:
                                                return Comando.ENCENDER_LUCES_DORMITORIO;
                                            case 5:
                                                System.out.println("Has entrado en las opciones de apagado de luces");
                                                System.out.println("Elige entre unas de las opciones:");
                                                System.out.println("1.- Apagado de las luces del salón");
                                                System.out.println("2.- Apagado general de la casa");
                                                System.out.println("3.- Apagado eco (solo funciona entre las 8 de la mañana y las 6 de la tarde");
                                                respuesta = teclado.nextInt();

                                                switch (respuesta) {
                                                    case 1:
                                                        return Comando.APAGAR_LUCES_MANUAL_DORMITORIO;
                                                    case 2:
                                                        return Comando.APAGAR_LUCES_GENERAL;
                                                    case 3:
                                                        return Comando.APAGAR_LUCES_ECO;
                                                    default:
                                                        System.out.println("Ha elegido una opcion que no está en el menú");
                                                        break;
                                                }
                                                break;
                                            case 6:
                                                return Comando.CONSULTAR_LUCES_DORMITORIO;
                                            case 7:
                                                return Comando.ENCENDER_VIGILANCIA_DORMITORIO;
                                            case 8:
                                                return Comando.APAGAR_VIGILANCIA_DORMITORIO;
                                            case 9:
                                                return Comando.CONSULTAR_VIGILANCIA_DORMITORIO;
                                            default:
                                                System.out.println("Ha elegido una opcion que no está en el menú");
                                                break;
                                        }
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Estado general de la vivienda");
                                return Comando.CONSULTAR_ESTADO_GENERAL;

                            case 4:
                                System.out.println("Procediendo a apagar sistema");
                                continuar = false;
                                
                                return Comando.APAGAR_SISTEMA;
                        }
                        seguir = false;

                    } catch (InputMismatchException ime) {
                        System.out.println("Te has equivocado, vuelve a intentarlo");
                        teclado.nextLine();
                    }
                } while (seguir);

        return null;
    }
    
}
