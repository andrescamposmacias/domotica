/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author andres
 */
public enum Comando {
    
    //los tipos ENUM tienen dos caracteristicas fundamentales:
    //1- el constructor es privado
    //2- solo pueden instanciarse con un tipo de objeto concreto
    
    APAGAR_SISTEMA(0, "Apagar Sistema"),
    CONSULTAR_HORA(1, "Consulta la hora del sistema"),
    MODIFICAR_HORA(2, "Modifica la hora de la centralita"),
    CONSULTAR_PUERTA_GARAJE(3, "Consulta la puerta del garaje"),
    SUBIR_PUERTA_GARAJE(4, "Sube la puerta del garaje"),
    BAJAR_PUERTA_GARAJE(5, "Baja la puerta del garaje"),
    CONSULTAR_PERSIANA_SALON(6, "Consulta la ventana del salon"),
    SUBIR_PERSIANA_SALON(7, "Sube la ventana del salon"),
    BAJAR_PERSIANA_SALON(8, "Baja la ventana del salon"),
    MEDIAALTURA_PERSIANA_SALON(9, "deja la ventana del salon a media altura");
    
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
