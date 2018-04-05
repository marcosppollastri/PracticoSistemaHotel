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
public interface IServicio {
    public boolean activarTelefono(Habitacion habitacion);
    public boolean activarInternet(Habitacion habitacion);
    public boolean activarBar(Habitacion habitacion);
    public boolean activarSpa(Habitacion habitacion);
            
}
