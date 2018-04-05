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
public class Transaccion {
    
   protected Persona cliente;
   protected Habitacion habitacion;
   protected float monto;

    public Transaccion(Persona cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        habitacion.calcularCosto();
        monto = habitacion.getCosto();
        
    }

    public float getMonto() {
        return (float) (monto);
    }
    
    
   
    
}
