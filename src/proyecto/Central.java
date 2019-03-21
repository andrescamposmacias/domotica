/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
            case APAGAR_LUCES_GENERAL:
                apagarLucesGeneral();
                break;
            case APAGAR_LUCES_ECO:
                apagarLucesEco();
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
            System.out.println("Se ha abierto la puerta del garaje\n");
        }else{
            System.out.println("La puerta del garaje ya se encuentra abierta\n");
        }
        
    }
     
    private void bajarGaraje(){
        //compruebo que si es true, cambio el estado a false, sino informo al usuario
        //de que la puerta esta cerrada
        if(garaje.getPuertaGaraje().isEstado()){
            garaje.getPuertaGaraje().setEstado(false);
            System.out.println("Se ha cerrado la puerta del garaje\n");
        }else{
            System.out.println("La puerta del garaje ya se encuentra cerrada\n");
        }
        
    }
    
    private void consultarEstadoGaraje(){
        //compruebo el estado, si es true la puerta esta abierta, sino es false
        //y la puerta esta cerrada
         if(garaje.getPuertaGaraje().isEstado()){
             System.out.println("La puerta del garaje esta abierta\n");
         }else{
             System.out.println("La puerta del garaje esta cerrada\n");
         }
    }
    
    private void consultarEstadoPersianaSalon(){
        //creo un switch para consultar el estado
        switch (salon.getPersiana().getEstado()) {
            case BAJADA:
                System.out.println("La persiana del salon esta bajada\n");
                break;
            case MEDIA_ALTURA:
                System.out.println("La persiana del salon esta a media altura\n");
                break;
            case SUBIDA:
                System.out.println("La persiana del salon esta subida\n");
                break;
            default:
                break;
        }
        
    }
    
    private void subirPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de SUBIDA, entonces
        //entra dentro del if y me cambia el estado a SUBIDA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba subida
        if(salon.getPersiana().getEstado() != salon.getPersiana().getEstado().SUBIDA){
            salon.getPersiana().setEstado(EstadoPersiana.SUBIDA);
            System.out.println("Subiendo la persiana del salon\n");
        }else{
            System.out.println("La persiana del salon ya esta subida\n");
        }
    }
    
    private void bajarPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de BAJADA, entonces
        //entra dentro del if y me cambia el estado a BAJADA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba bajada
        if(salon.getPersiana().getEstado() != salon.getPersiana().getEstado().BAJADA){
            salon.getPersiana().setEstado(EstadoPersiana.BAJADA);
            System.out.println("Bajando la persiana del salon\n");
        }else{
            System.out.println("La persiana del salon ya esta bajada\n");
        }
        
    }
    
    private void mediaAlturaPersianaSalon(){
        //compruebo el estado de la persina, si es distinto de MEDIA_ALTURA, entonces
        //entra dentro del if y me cambia el estado a MEDIA_ALTURA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba a media altura
        if (salon.getPersiana().getEstado()!=salon.getPersiana().getEstado().MEDIA_ALTURA){
            salon.getPersiana().setEstado(EstadoPersiana.MEDIA_ALTURA);
            System.out.println("Poniendo la persiana del salon a media altura\n");
        }else{
            System.out.println("La persiana ya esta a media altura\n");
        }
        
    }
    
    private void encenderLucesSalon(){
        //primero compruebo que esten encendida, si esta encendida informo al usuario
        //sino enciendo la luz e informo de que ha encendido las luces
        if(!salon.getLuz().isEstado()){
            salon.getLuz().setEstado(true);
            System.out.println("Se ha encendido la luz del salon\n");
            
        }else{
            System.out.println("La luz del salon ya estaba encendida\n");  
        }
        
    }
    
    private void apagarLucesManualSalon(){
        //primero compruebo que esten encendida, si esta encendida la apago e
        //informo al usuario, sino informo al usuario de que ya estaba apagada
        if(salon.getLuz().isEstado()){
            salon.getLuz().setEstado(false);
            System.out.println("se ha apagado la luz del salon\n");
        }else{
            System.out.println("La luz del salon ya esta apagada\n");
        }
        
    }
    
    
    private void apagarLucesGeneral(){
        //si la luz del salon o del dormitorio es true, entra dentro del true, y cambia
        //ambos estado a false, sino entra en el else y le indica al usuario que ambas luces
        //ya estaban apagadas
        
        if(!salon.getLuz().isEstado() && !dormitorio.getLuz().isEstado()){
            System.out.println("Las luces del salon y del dormitorio ya estan apagadas\n");
        }
        
        if(salon.getLuz().isEstado()){
            salon.getLuz().setEstado(false);
            System.out.println("Apagando las luces del salon\n");
        }else{
            System.out.println("Las lueces del salon ya estan apagadas");
        }
        if (dormitorio.getLuz().isEstado()){           
            dormitorio.getLuz().setEstado(false);
            System.out.println("Apagando las luces del dormitorio\n");
        }else{
            System.out.println("Las luces del dormitorio ya estan apagadas");
        }
   
    }
    
    
    private void consultarLucesSalon(){
        //si el estado de la luz es true, esta encendida, sino esta apagada
        //e informo al usuario
        if(salon.getLuz().isEstado()){
            System.out.println("La luz del salon esta encendida\n");
        }else{
            System.out.println("La luz del salon esta apagada\n");
        }
    }
    
    private void encenderVigilanciaSalon(){
        //creo 3 variables LocalTime, horaManiana para establecer la hora de la mañana
        //horaTarde para estableces la hora fin del metodo, y ahora, para saber la hora a la que estamos
        
        LocalTime horaManiana = LocalTime.of(8, 00);
        LocalTime horaTarde = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        
        //primero compruebo que la camara esta encendida, porque si esta encendida no tengo
        //que encenderla
        if(salon.getCamara().isEstado()){
            System.out.println("La camara del salon ya esta encendida\n");
        }else{
            salon.getCamara().setEstado(true);
            System.out.println("Encendiendo la camara del salon\n");
        }
        //ahora creo un if, si esta despues de las 8 y antes de las 18, y si la persiana no esta bajada
        //y la luz no esta encendida, la enciende
        if (horaManiana.isBefore(ahora) && horaTarde.isAfter(ahora)) {
            if(salon.getPersiana().getEstado() == dormitorio.getPersiana().getEstado().BAJADA){
                if(!salon.getLuz().isEstado()){
                    salon.getLuz().setEstado(true);
                    System.out.println("Encendiendo luz para poder grabar bien");
                }
            }
        }
        //creo 3 objetos LocalDateTime, el fechaYHora para guardar el dia y la hora de la que se ejecuta el programa
        //fechaDeNoche donde guarda el dia de hoy y la hora de las 20, y fechaDeManiana que suma 12h al objeto de fechaDeNoche
        LocalDateTime fechaYHora = LocalDateTime.now();
        LocalDateTime fechaDeNoche=LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 00));
        LocalDateTime fechaDeManania = fechaDeNoche.plusHours(12);
        
        //y aqui compruebo que hoy es despues de las 22 y antes de las 8 del dia siguiente
        //y si la luz esta apagada, la enciende
        if (fechaDeNoche.isBefore(fechaYHora) && fechaDeManania.isAfter(fechaYHora)) {
            if (!salon.getLuz().isEstado()) {
                salon.getLuz().setEstado(true);
                System.out.println("Encendiendo la luz");
            }
        }
    }
    
    private void apagarVigilanciaSalon(){
        //creo 3 variables LocalTime, horaManiana para establecer la hora de la mañana
        //horaTarde para estableces la hora fin del metodo, y ahora, para saber la hora a la que estamos
        
        LocalTime horaManiana = LocalTime.of(8, 00);
        LocalTime horaTarde = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        
        //primero compruebo que la camara esta apagada, porque si esta apagada no tengo
        //que apagarla
        if(!salon.getCamara().isEstado()){
            System.out.println("La camara del salon ya estaba apagada\n");
        }else{
            salon.getCamara().setEstado(false);
            System.out.println("Se ha apagado la camara del salon\n");
        }
        
        //ahora creo un if, si esta despues de las 8 y antes de las 18, y si la persiana no esta bajada
        //y la luz no esta apagada, la apaga
        if (horaManiana.isBefore(ahora) && horaTarde.isAfter(ahora)) {
            if(salon.getPersiana().getEstado() == dormitorio.getPersiana().getEstado().BAJADA){
                if(salon.getLuz().isEstado()){
                    salon.getLuz().setEstado(false);
                    System.out.println("Se ha apagado luz del salon");
                }
            }
        }
        
        //creo 3 objetos LocalDateTime, el fechaYHora para guardar el dia y la hora de la que se ejecuta el programa
        //fechaDeNoche donde guarda el dia de hoy y la hora de las 20, y fechaDeManiana que suma 12h al objeto de fechaDeNoche
        LocalDateTime fechaYHora = LocalDateTime.now();
        LocalDateTime fechaDeNoche=LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 00));
        LocalDateTime fechaDeManania = fechaDeNoche.plusHours(12);
        
        //y aqui compruebo que hoy es despues de las 22 y antes de las 8 del dia siguiente
        //y si la luz esta encendida, la apaga
        if (fechaDeNoche.isBefore(fechaYHora) && fechaDeManania.isAfter(fechaYHora)) {
            if (salon.getLuz().isEstado()) {
                salon.getLuz().setEstado(false);
                System.out.println("Apagando la luz");
            }
        }
    }
    
    private void consultarVigilanciaSalon(){
        //compruebo el estado de la camara, si es true esta encendida y le mando un mensaje
        //al usuario, en otro caso es false y le mando un mensaje de que esta  apagada
        if(salon.getCamara().isEstado()){
            System.out.println("La camara del salon esta encendida\n");
        }else{
            System.out.println("La camara del salon esta apagada\n");
        }
    }
    
    private void consultarPersianaDormitorio(){
        //creo un switch para consultar el estado
        switch (dormitorio.getPersiana().getEstado()) {
            case BAJADA:
                System.out.println("La persiana del dormitorio esta bajada\n");
                break;
            case MEDIA_ALTURA:
                System.out.println("La persiana del dormitorio esta a media altura\n");
                break;
            case SUBIDA:
                System.out.println("La persiana del dormitorio esta subida\n");
                break;
            default:
                break;
        }
    }
    
    
    private void subirPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de SUBIDA, entonces
        //entra dentro del if y me cambia el estado a SUBIDA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba suibida
        if(dormitorio.getPersiana().getEstado() != dormitorio.getPersiana().getEstado().SUBIDA){
            dormitorio.getPersiana().setEstado(EstadoPersiana.SUBIDA);
            System.out.println("Subiendo la persiana del dormitorio\n");
        }else{
            System.out.println("La persiana del dormitorio ya esta subida\n");
        }
    }
    
    private void bajarPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de BAJADA, entonces
        //entra dentro del if y me cambia el estado a BAJADA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba bajada
        if(dormitorio.getPersiana().getEstado() != dormitorio.getPersiana().getEstado().BAJADA){
            dormitorio.getPersiana().setEstado(EstadoPersiana.BAJADA);
            System.out.println("Bajando la persiana del dormitorio\n");
        }else{
            System.out.println("La persiana del dormitorio ya esta bajada\n");
        }
    }
    
    private void mediaAlturaPersianaDormitorio(){
        //compruebo el estado de la persina, si es distinto de MEDIA_ALTURA, entonces
        //entra dentro del if y me cambia el estado a MEDIA_ALTURA, en otro caso le mandara
        //un mensaje al usuario indicando que la persina ya estaba a media altura
        if(dormitorio.getPersiana().getEstado() != EstadoPersiana.MEDIA_ALTURA){
            dormitorio.getPersiana().setEstado(EstadoPersiana.MEDIA_ALTURA);
            System.out.println("Poniendo la persiana del dormitorio a media altura\n");
        }else{
            System.out.println("La persiana del dormitorio ya esta a media altura\n");
        }
    }
    
    private void encenderLucesDormitorio(){
        //compruebo que las luces son true, si son true le muestro un mensaje
        //al usuario indicando que ya estaban encendida, sino las apago
        if(dormitorio.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta encendida\n");
        }else{
            dormitorio.getLuz().setEstado(true);
            System.out.println("Encendiendo luz del dormitorio\n");
        }
    }
    
    private void apagarLucesManualDormitorio(){
        //compruebo que las luces son false, si son false le muestro un mensaje
        //al usuario indicando que ya estaban apagadas, sino las enciendo
        if(!dormitorio.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta apagada\n");
        }else{
            dormitorio.getLuz().setEstado(false);
            System.out.println("Apagando luz del dormitorio\n");
        }
    }
    
    private void apagarLucesEco(){
        //creo 3 objetos LocalTime
        LocalTime horaManiana = LocalTime.of(8, 00);
        LocalTime horaTarde = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        
        //si horaManiana es antes que ahora y horaTarde despues de ahora comprueba que las persinas entra dentro
        // del if y compruebas que la persiana no esten subidas, y por ultimo comprueba que la luz este encendida, si esta
        //encendida la apaga
        if (horaManiana.isBefore(ahora) && horaTarde.isAfter(ahora)) {
            if (salon.getPersiana().getEstado() == salon.getPersiana().getEstado().SUBIDA) {
                System.out.println("La persiana del salon está subida \n");
                if (salon.getLuz().isEstado()) {
                    salon.getLuz().setEstado(false);
                    System.out.println("La luz del salon esta encendida, procediendo a su apagado\n");
                } else {
                    System.out.println("La luz del salon ya se encuentra apagada \n");
                }
            } else {
                System.out.println("La persiana del salon se encuentra bajada \n");
            }
            if (dormitorio.getPersiana().getEstado() == dormitorio.getPersiana().getEstado().SUBIDA) {
                System.out.println("La persiana del dormitorio está subida \n");
                if (dormitorio.getLuz().isEstado()) {
                    System.out.println("La luz del dormitorio esta encendida, procediendo a su apagado\n");
                    dormitorio.getLuz().setEstado(false);
                } else {
                    System.out.println("La luz del dormitorio ya se encuentra apagada \n");
                }
            } else {
                System.out.println("La persiana del dormitorio se encuentra bajada \n");
            }

        } else {
            System.out.println("Está fuera del rango del horario de apagado eco");
        }
        
    }
    
    private void consultarLucesDormitorio(){
        //si es true, las luces estaban encendida, sino estan apagadas
        if(dormitorio.getLuz().isEstado()){
            System.out.println("La luz del dormitorio esta encendida\n");
        }else{
            System.out.println("La luz del dormitorio esta apagada\n");
        }
    }
    
    private void encenderVigilanciaDormitorio(){
        //creo 3 variables LocalTime, horaManiana para establecer la hora de la mañana
        //horaTarde para estableces la hora fin del metodo, y ahora, para saber la hora a la que estamos
        LocalTime horaManiana = LocalTime.of(8, 00);
        LocalTime horaTarde = LocalTime.of(18, 00);
        
        LocalTime ahora = LocalTime.now();
   
        //primero compruebo que la camara esta encendida, porque si esta encendida no tengo
        //que encenderla
        if(dormitorio.getCamara().isEstado()){
            System.out.println("La camara del dormitorio ya esta encendida\n");
        }else{
            dormitorio.getCamara().setEstado(true);
            System.out.println("Encendiendo la camara del dormitorio\n");
        }
        
        //ahora creo un if, si esta despues de las 8 y antes de las 18, y si la persiana no esta bajada
        //y la luz no esta encendida, la enciende
        if (horaManiana.isBefore(ahora) && horaTarde.isAfter(ahora)) {
            if(dormitorio.getPersiana().getEstado() == dormitorio.getPersiana().getEstado().BAJADA){
                if(!dormitorio.getLuz().isEstado()){
                    dormitorio.getLuz().setEstado(true);
                    System.out.println("Encendiendo luz para poder grabar bien");
                }
            }
        }
        
        //creo 3 objetos LocalDateTime, el fechaYHora para guardar el dia y la hora de la que se ejecuta el programa
        //fechaDeNoche donde guarda el dia de hoy y la hora de las 20, y fechaDeManiana que suma 12h al objeto de fechaDeNoche
        LocalDateTime fechaYHora = LocalDateTime.now();
        LocalDateTime fechaDeNoche=LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 00));
        LocalDateTime fechaDeManania = fechaDeNoche.plusHours(12);
        
        //y aqui compruebo que hoy es despues de las 22 y antes de las 8 del dia siguiente
        //y si la luz esta apagada, la enciende
        
        if (fechaDeNoche.isBefore(fechaYHora) && fechaDeManania.isAfter(fechaYHora)) {
            if (!dormitorio.getLuz().isEstado()) {
                dormitorio.getLuz().setEstado(true);
                System.out.println("Encendiendo luz para poder grabar bien");
            }
        }
        
    }
    
    private void apagarVigilanciaDormitorio(){
        //creo 3 variables LocalTime, horaManiana para establecer la hora de la mañana
        //horaTarde para estableces la hora fin del metodo, y ahora, para saber la hora a la que estamos
        
        LocalTime horaManiana = LocalTime.of(8, 00);
        LocalTime horaTarde = LocalTime.of(18, 00);
        LocalTime ahora = LocalTime.now();
        
        //primero compruebo que la camara esta apagada, porque si esta apagada no tengo
        //que apagarla
        
        if(!dormitorio.getCamara().isEstado()){
            System.out.println("La camara del dormitorio ya estaba apagada\n");
        }else{
            dormitorio.getCamara().setEstado(false);
            System.out.println("Se ha apagado la camara del dormitorio\n");
        }
        //ahora creo un if, si esta despues de las 8 y antes de las 18, y si la persiana no esta bajada
        //y la luz no esta apagada, la apaga
        if (horaManiana.isBefore(ahora) && horaTarde.isAfter(ahora)) {
            if(dormitorio.getPersiana().getEstado() == dormitorio.getPersiana().getEstado().BAJADA){
                if(dormitorio.getLuz().isEstado()){
                    dormitorio.getLuz().setEstado(false);
                    System.out.println("Se ha apagado luz del dormitorio");
                }
            }
        }
        
        //creo 3 objetos LocalDateTime, el fechaYHora para guardar el dia y la hora de la que se ejecuta el programa
        //fechaDeNoche donde guarda el dia de hoy y la hora de las 20, y fechaDeManiana que suma 12h al objeto de fechaDeNoche
        LocalDateTime fechaYHora = LocalDateTime.now();
        LocalDateTime fechaDeNoche=LocalDateTime.of(LocalDate.now(), LocalTime.of(20, 00));
        LocalDateTime fechaDeManania = fechaDeNoche.plusHours(12);
        
        //y aqui compruebo que hoy es despues de las 22 y antes de las 8 del dia siguiente
        //y si la luz esta encendida, la apaga
        
        if (fechaDeNoche.isBefore(fechaYHora) && fechaDeManania.isAfter(fechaYHora)) {
            if (dormitorio.getLuz().isEstado()) {
                dormitorio.getLuz().setEstado(false);
                System.out.println("Apagando la luz");
            }
        }
        
        
    }
    
    private void consultarVigilanciaDormitorio(){
        //si es true la camara esta encendida, en otro caso sera false
        //por lo que la camara esta apagada
        if(dormitorio.getCamara().isEstado()){
            System.out.println("La camara esta encendida\n");
        }else{
            System.out.println("La camara esta apagada \n");
        }
    }
    
    private void consultarEstadoGeneral(){
        //los metodos de fecha y hora
        Reloj.verFecha();
        Reloj.verHora();
        
        //metodo para consultar la puerta del garaje
        consultarEstadoGaraje();
        
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