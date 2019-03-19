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
                break;
            case CONSULTAR_PUERTA_GARAJE:
                consultarEstadoGaraje();
                break;
            case CONSULTAR_PERSIANA_SALON:
                consultarEstadoPersianaSalon();
                break;
            case SUBIR_PERSIANA_SALON:
                subirPersianaSalon();
                break;
            case BAJAR_PERSIANA_SALON:
                bajarPersianaSalon();
                break;
            case MEDIAALTURA_PERSIANA_SALON:
                mediaAlturaPersianaSalon();
                break;
            case ENCENDER_LUCES_SALON:
                encenderLucesSalon();
                break;
            case APAGAR_LUCES_MANUAL_SALON:
                apagarLucesManualSalon();
                break;
            case APAGAR_LUCES_GENERAL_SALON:
                apagarLucesGeneralSalon();
                break;
            case APAGAR_LUCES_ECO_SALON:
                apagarLucesEcoSalon();
                break;
            case CONSULTAR_LUCES_SALON:
                consultarLucesSalon();
                break;
            case ENCENDER_VIGILANCIA_SALON:
                encenderVigilanciaSalon();
                break;
            case APAGAR_VIGILANCIA_SALON:
                apagarVigilanciaSalon();
                break;
            case CONSULTAR_VIGILANCIA_SALON:
                consultarVigilanciaSalon();
                break;
            case CONSULTAR_PERSIANA_DORMITORIO:
                consultarPersianaDormitorio();
                break;
            case SUBIR_PERSIANA_DORMITORIO:
                subirPersianaDormitorio();
                break;
            case BAJAR_PERSIANA_DORMITORIO:
                bajarPersianaDormitorio();
                break;
            case MEDIAALTURA_PERSIANA_DORMITORIO:
                mediaAlturaPersianaDormitorio();
                break;
            case ENCENDER_LUCES_DORMITORIO:
                encenderLucesDormitorio();
                break;
            case APAGAR_LUCES_MANUAL_DORMITORIO:
                apagarLucesManualDormitorio();
                break;
            case APAGAR_LUCES_GENERAL_DORMITORIO:
                apagarLucesGeneralDormitorio();
                break;
            case APAGAR_LUCES_ECO_DORMITORIO:
                apagarLucesEcoDormitorio();
                break;
            case CONSULTAR_LUCES_DORMITORIO:
                consultarLucesDormitorio();
                break;
            case ENCENDER_VIGILANCIA_DORMITORIO:
                encenderVigilanciaDormitorio();
                break;
            case APAGAR_VIGILANCIA_DORMITORIO:
                apagarVigilanciaDormitorio();
                break;
            case CONSULTAR_VIGILANCIA_DORMITORIO:
                consultarVigilanciaDormitorio();
                break;
            case CONSULTAR_ESTADO_GENERAL:
                consultarEstadoGeneral();
                break;
        }
    }

    private void subirGaraje(){
        garaje.getPuertaGaraje().setEstado(true);
    }
     
    private void bajarGaraje(){
        garaje.getPuertaGaraje().setEstado(false);
    }
    
    private boolean consultarEstadoGaraje(){
        return garaje.getPuertaGaraje().isEstado();
    }
    
    private boolean consultarEstadoPersianaSalon(){
        
    }
    
    private void subirPersianaSalon(){
        
    }
    
    private void bajarPersianaSalon(){
        
    }
    
    private void mediaAlturaPersianaSalon(){
        
    }
    
    private void encenderLucesSalon(){
        
    }
    
    private void apagarLucesManualSalon(){
        
    }
    
    
    private void apagarLucesGeneralSalon(){
        
    }
    
    private void apagarLucesEcoSalon(){
        
    }
    
    private boolean consultarLucesSalon(){
        
    }
    
    private void encenderVigilanciaSalon(){
        
    }
    
    private void apagarVigilanciaSalon(){
        
    }
    
    private boolean consultarVigilanciaSalon(){
        
    }
    
    private boolean consultarPersianaDormitorio(){
        
    }
    
    
    private void subirPersianaDormitorio(){
        
    }
    
    private void bajarPersianaDormitorio(){
        
    }
    
    private void mediaAlturaPersianaDormitorio(){
        
    }
    
    private void encenderLucesDormitorio(){
        
    }
    
    private void apagarLucesManualDormitorio(){
        
    }
    
    private void apagarLucesGeneralDormitorio(){
        
    }
    
    private void apagarLucesEcoDormitorio(){
        
    }
    
    private boolean consultarLucesDormitorio(){
        
    }
    
    private void encenderVigilanciaDormitorio(){
        
    }
    
    private void apagarVigilanciaDormitorio(){
        
    }
    
    private boolean consultarVigilanciaDormitorio(){
        
    }
    
    private boolean consultarEstadoGeneral(){
        
    }
}