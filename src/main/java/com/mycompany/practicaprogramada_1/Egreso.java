
package com.mycompany.practicaprogramada_1;


public class Egreso extends Transaccion{

    
    
    
    public Egreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
    }

    
    
    
    @Override
    public double calcularImpuestos() {
        return 0;
    }

    @Override
    public double procesarTransaccion() {
        return 0;
    }
    
    
    
    
    
}
