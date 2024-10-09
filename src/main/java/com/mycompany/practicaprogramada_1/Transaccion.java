
package com.mycompany.practicaprogramada_1;


public abstract class Transaccion {
   protected double monto;
   protected String descripcion;
   protected String fecha;

    public Transaccion(double monto, String descripcion, String fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

   
   
   
   
   
   
   
    public abstract double calcularImpuestos();
    public abstract double procesarTransaccion();
}
