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
public class Central {
    
    private Estancia garaje;
    private Estancia salon;
    private Estancia dormitorio;
    private static Usuario usuario = new Usuario ("andres", "diegoCallate");
    private LocalDate fechaInstalacion;
    private String identificador;
    
   public static boolean comprobacionUsuario(){
       
       return usuario.equals(Vista.login());
    
   } 

    public Central(Estancia garaje, Estancia salon, Estancia dormitorio, LocalDate fechaInstalacion, String identificador) {
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
        this.fechaInstalacion = fechaInstalacion;
        this.identificador = identificador;
    }
   
   
         
}
