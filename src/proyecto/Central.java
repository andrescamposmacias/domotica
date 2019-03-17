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
    private Usuario usuario;
    private LocalDate fechaInstalacion;
    private String identificador;
    
   public static boolean comprobacionUsuario(){
       
       Usuario aux = new Usuario ("Andres", "Diego");
       
       return aux.equals(Vista.login());
    
   } 

    public Central(Estancia garaje, Estancia salon, Estancia dormitorio, Usuario usuario, LocalDate fechaInstalacion, String identificador) {
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
        this.usuario = usuario;
        this.fechaInstalacion = fechaInstalacion;
        this.identificador = identificador;
    }

    public Estancia getGaraje() {
        return garaje;
    }

    public Estancia getSalon() {
        return salon;
    }

    public Estancia getDormitorio() {
        return dormitorio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaInstalacion() {
        return fechaInstalacion;
    }

    public String getIdentificador() {
        return identificador;
    }

    
   
   
         
}
