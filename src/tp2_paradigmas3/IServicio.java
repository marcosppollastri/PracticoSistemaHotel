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
    float telefono = 40;
    float internet = 60;
    float spa = 100;
    float bar = 50;
    
    public boolean activarTelefono();
    public boolean activarInternet();
    public boolean activarBar();
    public boolean activarSpa();
            
}
