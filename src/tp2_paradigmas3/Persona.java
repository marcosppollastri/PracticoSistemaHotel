/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2_paradigmas3;

/**
 *
 * @author Marcos
 */
public class Persona {
    
   protected String nombre;
   protected String apellido;
   protected int id;
   protected String telefono;

    public Persona(String nombre, String apellido, int id, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
    }

    Persona(String marcos, String peña, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
   
    
}
