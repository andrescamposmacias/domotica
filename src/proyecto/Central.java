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
    
    private Garaje garaje;
    private Salon salon;
    private Dormitorio dormitorio;
    private Usuario usuario;
    private LocalDate fechaInstalacion;
    private String identificador;
    
   public boolean comprobacionUsuario(){
       
       return this.usuario.equals(Vista.login());
    
   } 

    public Central(Garaje garaje, Salon salon, Dormitorio dormitorio, Usuario usuario, LocalDate fechaInstalacion, String identificador) {
        this.garaje = garaje;
        this.salon = salon;
        this.dormitorio = dormitorio;
        this.usuario = usuario;
        this.fechaInstalacion = fechaInstalacion;
        this.identificador = identificador;
    }
    
    public Central(Usuario usu){
        this.usuario = usu;
    }
    
    public void ejecutarOrden(Comando instrucciones){
        switch(instrucciones){
            case APAGAR_SISTEMA:
                System.out.println("Apagar sistema");
                break;
            case CONSULTAR_HORA:
                Reloj.verFecha();
                Reloj.verHora();
                break;        
            case SUBIR_PUERTA_GARAJE:
                subirGaraje();
                break;
            case BAJAR_PUERTA_GARAJE:
                bajarGaraje();
        }
    }

    private void subirGaraje(){
        garaje.getPuertaGaraje().setEstado(true);
    }
     
    private void bajarGaraje(){
        garaje.getPuertaGaraje().setEstado(false);
    }
}