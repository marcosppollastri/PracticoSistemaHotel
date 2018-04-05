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
public class TP2_Paradigmas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HabitacionSuite suite = new HabitacionSuite();
        Persona cliente = new Persona("Marcos","Peña", "3804704649");
        Pago pago = new Pago(cliente, suite);
        suite.calcularCosto();
        System.out.print("Nombre: "+cliente.getNombre()+" "+cliente.getApellido()+"\n");
        System.out.print("Costo: "+suite.getCosto()+"\n");
    }
    
}
