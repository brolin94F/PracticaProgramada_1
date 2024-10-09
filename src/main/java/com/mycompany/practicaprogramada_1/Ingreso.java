
package com.mycompany.practicaprogramada_1;


public class Ingreso extends Transaccion {

    
    public Ingreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
    }

    
    
    
    
    
    
    
    
    
    
    @Override
    public double calcularImpuestos() {
        return 0.13*monto;
    }

    @Override
    public double procesarTransaccion() {
        return -1;
    }

    
    
    
    
    
    
    
    
}
