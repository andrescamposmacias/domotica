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
        //compruebo que si es false, cambio el estado a true, sino informo al usuario
        //de que la puerta esta abierta
        if(!garaje.getPuertaGaraje().isEstado()){
            garaje.getPuertaGaraje().setEstado(true);
            System.out.println("Se ha abierto la puerta del garaje");
        }else{
            System.out.println("La puerta del garaje ya se encuentra abierta");
        }
        
    }
     
    private void bajarGaraje(){
        //compruebo que si es true, cambio el estado a false, sino informo al usuario
        //de que la puerta esta cerrada
        if(garaje.getPuertaGaraje().isEstado()){
            garaje.getPuertaGaraje().setEstado(false);
            System.out.println("Se ha cerrado la puerta del garaje");
        }else{
            System.out.println("La puerta del garaje ya se encuentra cerrada");
        }
        
    }
    
    private void consultarEstadoGaraje(){
        //compruebo el estado, si es true la puerta esta abierta, sino es false
        //y la puerta esta cerrada
         if(garaje.getPuertaGaraje().isEstado()){
             System.out.println("La puerta del garaje esta abierta");
         }else{
             System.out.println("La puerta del garaje esta cerrada");
         }
    }
    
    private void consultarEstadoPersianaSalon(){
        //creo un switch para consultar el estado, si es 0 esta bajada
        //si es 1, esta a media altura y si es 2 esta subida
        switch (salon.getPersiana().getEstado()) {
            case 0:
                System.out.println("La persiana del salon esta bajada");
                break;
            case 1:
                System.out.println("La persiana del salon esta a media altura");
                break;
            case 2:
                System.out.println("La persiana del salon esta subida");
                break;
            default:
                break;
        }
        
    }
    
    private void subirPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de 2, entonces
        //entra dentro del if y me cambia el estado a 2, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba subida
        if(salon.getPersiana().getEstado() != 2){
            salon.getPersiana().setEstado(2);
        }else{
            System.out.println("La persiana del salon ya estaba subida");
        }
    }
    
    private void bajarPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de 0, entonces
        //entra dentro del if y me cambia el estado a 0, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba bajada
        if(salon.getPersiana().getEstado() != 0){
            salon.getPersiana().setEstado(0);
        }else{
            System.out.println("La persiana del salon ya estaba bajada");
        }
        
    }
    
    private void mediaAlturaPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de 1, entonces
        //entra dentro del if y me cambia el estado a 1, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba a media altura
        if (salon.getPersiana().getEstado()!=1){
            salon.getPersiana().setEstado(1);
        }else{
            System.out.println("La persiana ya estaba a media altura");
        }
        
    }
    
    private void encenderLucesSalon(){
        //primero compruebo que esten encendida, si esta encendida informo al usuario
        //sino enciendo la luz e informo de que ha encendido las luces
        if(salon.getLuz().isEstado()){
            System.out.println("La luz del salon ya estaba encendida");
        }else{
            salon.getLuz().setEstado(true);
            System.out.println("Se ha encendido la luz del salon");
        }
        
    }
    
    private void apagarLucesManualSalon(){
        //primero compruebo que esten encendida, si esta encendida la apago e
        //informo al usuario, sino informo al usuario de que ya estaba apagada
        if(!salon.getLuz().isEstado()){
            salon.getLuz().setEstado(false);
            System.out.println("se ha apagado la luz del salon");
        }else{
            System.out.println("La luz del salon ya estaba apagada");
        }
        
    }
    
    
    private void apagarLucesGeneralSalon(){
        //si la luz del salon o del dormitorio es true, entra dentro del true, y cambia
        //ambos estado a false, sino entra en el else y le indica al usuario que ambas luces
        //ya estaban apagadas
        if(salon.getLuz().isEstado() || dormitorio.getLuz().isEstado()){
            salon.getLuz().setEstado(false);
            dormitorio.getLuz().setEstado(false);
        }else{
            System.out.println("Las luces del salon y del dormitorio ya estaban apagadas");
        }
    }
    
    private void apagarLucesEcoSalon(){
        
    }
    
    private void consultarLucesSalon(){
        //si el estado de la luz es true, esta encendida, sino esta apagada
        //e informo al usuario
        if(salon.getLuz().isEstado()){
            System.out.println("La luz del salon esta encendida");
        }else{
            System.out.println("La luz del salon esta apagada");
        }
    }
    
    private void encenderVigilanciaSalon(){
        //si el estado es true, entonces la camara ya estaba encendida
        //e informo al usuario, en caso contrario, pongo el estado a true
        if(salon.getCamara().isEstado()){
            System.out.println("La camara del salon esta encendida");
        }else{
            salon.getCamara().setEstado(true);
            System.out.println("Encendiendo la camara del salon");
        }
    }
    
    private void apagarVigilanciaSalon(){
        //si el estado es false, entonces la camara ya estaba apagada
        //e informo al usuario, en caso contrario, pongo el estado a false
        if(!salon.getCamara().isEstado()){
            System.out.println("La camara del salon esta apagada");
        }else{
            salon.getCamara().setEstado(false);
            System.out.println("Apagando la camara del salon");
        }
    }
    
    private void consultarVigilanciaSalon(){
        //compruebo el estado de la camara, si es true esta encendida y le mando un mensaje
        //al usuario, en otro caso es false y le mando un mensaje de que esta  apagada
        if(salon.getCamara().isEstado()){
            System.out.println("La camara del salon esta encendida");
        }else{
            System.out.println("La camara del salon esta apagada");
        }
    }
    
    private void consultarPersianaDormitorio(){
        //creo un switch para consultar el estado, si es 0 esta bajada
        //si es 1, esta a media altura y si es 2 esta subida
        switch (dormitorio.getPersiana().getEstado()) {
            case 0:
                System.out.println("La persiana del dormitorio esta bajada");
                break;
            case 1:
                System.out.println("La persiana del dormitorio esta a media altura");
                break;
            case 2:
                System.out.println("La persiana del dormitorio esta subida");
                break;
            default:
                break;
        }
    }
    
    
    private void subirPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de 2, entonces
        //entra dentro del if y me cambia el estado a 2, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba suibida
        if(dormitorio.getPersiana().getEstado() != 2){
            dormitorio.getPersiana().setEstado(2);
        }else{
            System.out.println("La persiana del dormitorio ya estaba subida");
        }
    }
    
    private void bajarPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de 0, entonces
        //entra dentro del if y me cambia el estado a 0, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba bajada
        if(dormitorio.getPersiana().getEstado() != 0){
            dormitorio.getPersiana().setEstado(0);
        }else{
            System.out.println("La persiana del dormitorio ya estaba bajada");
        }
    }
    
    private void mediaAlturaPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de 1, entonces
        //entra dentro del if y me cambia el estado a 1, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba a media altura
        if(dormitorio.getPersiana().getEstado() != 1){
            dormitorio.getPersiana().setEstado(1);
        }else{
            System.out.println("La persiana del dormitorio ya estaba a media altura");
        }
    }
    
    private void encenderLucesDormitorio(){
        //compruebo que las luces son true, si son true le muestro un mensaje
        //al usuario indicando que ya estaban encendida, sino las apago
        if(dormitorio.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta encendida");
        }else{
            dormitorio.getLuz().setEstado(true);
        }
    }
    
    private void apagarLucesManualDormitorio(){
        //compruebo que las luces son false, si son false le muestro un mensaje
        //al usuario indicando que ya estaban apagadas, sino las enciendo
        if(!dormitorio.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta encendida");
        }else{
            dormitorio.getLuz().setEstado(false);
        }
    }
    
    private void apagarLucesGeneralDormitorio(){
        //compruebo que las luces del salon y del dormitorio sean true
        //si son true, los cambio a false, en caso de que ambos sean true
        //le saltara un mensaje al usuario indicando que las luces ya estaban apagadas
        if(salon.getLuz().isEstado() || dormitorio.getLuz().isEstado()){
            salon.getLuz().setEstado(false);
            dormitorio.getLuz().setEstado(false);
        }else{
            System.out.println("Las luces del salon y del dormitorio ya estaban apagadas");
        }
    }
    
    private void apagarLucesEcoDormitorio(){
        
    }
    
    private void consultarLucesDormitorio(){
        //si es true, las luces estaban encendida, sino estan apagadas
        if(salon.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta encendida");
        }else{
            System.out.println("La luz del dormitorio esta apagada");
        }
    }
    
    private void encenderVigilanciaDormitorio(){
        //si es true, la camara ya estaba encendida e informara al usuario
        //en otro caso, cambiara al estado de true
        if(dormitorio.getCamara().isEstado()){
            System.out.println("La camara del dormitorio ya estaba encendida");
        }else{
            dormitorio.getCamara().setEstado(true);
            System.out.println("Encendiendo la camara del dormitorio");
        }
    }
    
    private void apagarVigilanciaDormitorio(){
        //si es false, la camara ya estaba apagada e informara al usuario
        //en otro caso, cambiara al estado de false
        if(!dormitorio.getCamara().isEstado()){
            System.out.println("La camara del dormitorio ya estaba encendida");
        }else{
            dormitorio.getCamara().setEstado(false);
            System.out.println("Encendiendo la camara del dormitorio");
        }
    }
    
    private void consultarVigilanciaDormitorio(){
        //si es true la camara esta encendida, en otro caso sera false
        //por lo que la camara esta apagada
        if(dormitorio.getCamara().isEstado()){
            System.out.println("La camara esta encendida");
        }else{
            System.out.println("La camara esta apagada");
        }
    }
    
    private void consultarEstadoGeneral(){
        //los metodos de fecha y hora
        Reloj.verFecha();
        Reloj.verHora();
        
        //los metodos de consulta del dormitorio
        consultarVigilanciaDormitorio();
        consultarLucesDormitorio();
        consultarPersianaDormitorio();
        
        //los metodos de consulta del salon
        consultarVigilanciaSalon();
        consultarLucesSalon();
        consultarEstadoPersianaSalon();
    }
}