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
//la clase garaje es un subtipo o subclase de estancia
//Garaje entiende (hereda) a Estancia
public class Garaje extends Estancia {
    
    private int capacidadVehiculos;
    private Puerta puertaGaraje;
    
    //los constructores son los unicos metodos que no se heredan

    public Garaje(int capacidadVehiculos, Puerta puertaGaraje, int m2) {
        //llamada al constructor de la clase padre
        super(m2);
        this.capacidadVehiculos = capacidadVehiculos;
        this.puertaGaraje = puertaGaraje;
    }
    
    public Garaje() {
        super();//crea la estancia con m2=0
        this.capacidadVehiculos = 0;
        this.puertaGaraje = new Puerta();
    }

    //ejemplo de acceso a metodo heredado usando
    //el puntero super, que apunta a la clase padre
    //de la clase en la que estoy
    
    @Override
    public String toString() {
        return super.toString() + "\nGaraje{" + "capacidadVehiculos=" + capacidadVehiculos + ", \n" + puertaGaraje + '}';
    }

    public int getCapacidadVehiculos() {
        return capacidadVehiculos;
    }

    public void setCapacidadVehiculos(int capacidadVehiculos) {
        this.capacidadVehiculos = capacidadVehiculos;
    }

    public Puerta getPuertaGaraje() {
        return puertaGaraje;
    }

    public void setPuertaGaraje(Puerta puertaGaraje) {
        this.puertaGaraje = puertaGaraje;
    }
    
    
    
}
