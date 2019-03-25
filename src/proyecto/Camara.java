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
public class Camara {
    //creo los atributos
    private boolean estado;
    private String ip; //direccion ip de la camara

    //creo el constructor
    public Camara(boolean estado, String ip) {
        this.estado = estado;
        this.ip = ip;
    }

    //los getters y los setters
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    //el toString
    @Override
    public String toString() {
        return "Camara{" + "estado=" + estado + ", ip=" + ip + '}';
    }
    
}
