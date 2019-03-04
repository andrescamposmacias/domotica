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
    private Usuario usuario = new Usuario ("andres", "diegoCallate");
    private LocalDate fechaInstalacion;
    private String identificador;
    
   public boolean comprobacion(){
       
       return usuario.equals(Vista.login());
    
   } 
         
}
