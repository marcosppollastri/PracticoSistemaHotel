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
public abstract class  Habitacion implements IServicio{
    
    protected float costo;
    protected boolean flagTelefono;
    protected boolean flagInternet,
                    flagSpa, flagBar;

   /* public Habitacion() {
        this.flagInternet = false;
        this.flagTelefono = false;
        this.flagBar = false;
        this.flagSpa = false;

    }*/
    
    /**
     *
     * @return
     */
    
    public float getCosto(){
        return costo;
    }

    public float calcularCosto() {
        if(flagTelefono)
            activarTelefono();
        if(flagInternet)
            activarInternet();
        if(flagBar)
            activarBar();
        if(flagSpa)
            activarSpa();
        
        return costo;
    }
    
    @Override
    public boolean activarTelefono() {
        flagTelefono = true;
        costo += telefono;
        return flagTelefono;
       
    }

    @Override
    public boolean activarInternet() {
        flagInternet = true;
        costo += internet;
        return flagInternet;
    }

    @Override
    public boolean activarBar() {
        flagBar = true;
        costo += bar;
        return flagBar;
    }

    @Override
    public boolean activarSpa() {
        flagSpa = true;
        costo += spa;
        return flagSpa;
    }
    
}
