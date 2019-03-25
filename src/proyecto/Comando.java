/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Andrés y Diego
 */
public enum Comando {
    
    //los tipos ENUM tienen dos caracteristicas fundamentales:
    //1- el constructor es privado
    //2- solo pueden instanciarse con un tipo de objeto concreto
    
    //apagar el sistema
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    
    //comandos del reloj
    CONSULTAR_HORA(1, "Consulta la hora del sistema"),
    
    //comandos del garaje
    CONSULTAR_PUERTA_GARAJE(3, "Consulta la puerta del garaje"),
    SUBIR_PUERTA_GARAJE(4, "Sube la puerta del garaje"),
    BAJAR_PUERTA_GARAJE(5, "Baja la puerta del garaje"),
    
    //comandos del salón
    CONSULTAR_PERSIANA_SALON(6, "Consulta la ventana del salon"),
    SUBIR_PERSIANA_SALON(7, "Sube la ventana del salon"),
    BAJAR_PERSIANA_SALON(8, "Baja la ventana del salon"),
    MEDIAALTURA_PERSIANA_SALON(9, "deja la ventana del salon a media altura del salon"),
    ENCENDER_LUCES_SALON(10, "encender luces del salon"),
    APAGAR_LUCES_MANUAL_SALON(11, "apagar la luz manualmente en el salon"),
    APAGAR_LUCES_GENERAL(12, "apagado general de luces"),
    APAGAR_LUCES_ECO(13, "apagado eco de luces"),
    CONSULTAR_LUCES_SALON(14, "consultar el estado de las luces del salon"),
    ENCENDER_VIGILANCIA_SALON(15, "encender la vigilancia en el salon"),
    APAGAR_VIGILANCIA_SALON(16, "apagar vigilancia en el salon"),
    CONSULTAR_VIGILANCIA_SALON(17, "consultar estado de vigilancia en el salon"),
    
    //comandos del dormitorio
    CONSULTAR_PERSIANA_DORMITORIO(18, "Consulta la ventana del dormitorio"),
    SUBIR_PERSIANA_DORMITORIO(19, "Sube la ventana del dormitorio"),
    BAJAR_PERSIANA_DORMITORIO(20, "Baja la ventana del dormitorio"),
    MEDIAALTURA_PERSIANA_DORMITORIO(21, "deja la ventana del salon a media altura del dormitorio"),
    ENCENDER_LUCES_DORMITORIO(22, "encender luces del salon"),
    APAGAR_LUCES_MANUAL_DORMITORIO(23, "apagar la luz manualmente en el dormitorio"),
    CONSULTAR_LUCES_DORMITORIO(26, "consultar el estado de las luces del salon"),
    ENCENDER_VIGILANCIA_DORMITORIO(27, "encender la vigilancia en el dormitorio"),
    APAGAR_VIGILANCIA_DORMITORIO(28, "apagar vigilancia en el dormitorio"),
    CONSULTAR_VIGILANCIA_DORMITORIO(29, "consultar estado de vigilancia en el dormitorio"),
    
    //comando consulta de la vivienda
    CONSULTAR_ESTADO_GENERAL(30, "consulta el estado general de la vivienda");
    
    private int codigo;
    private String descripcion;

    private Comando(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
}
