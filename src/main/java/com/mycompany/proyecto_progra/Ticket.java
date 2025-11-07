
package com.mycompany.proyecto_progra;

import java.sql.Timestamp;


public class Ticket {//clase2
    
   //atri
     private int ticket_id;
    private String placa;
    private String area_id;
    private Timestamp fecha_ingreso;
    private Timestamp fecha_salida;
    private String modo_pago;
    private double monto;
    private String estado;
    
// Constructor vacío, sirve para crear el ticket sin datos y llenarlo después
    public Ticket() {
    }
    
    
//cons2
    public Ticket(int ticket_id, String placa, String area_id, Timestamp fecha_ingreso, Timestamp fecha_salida, String modo_pago, double monto, String estado) {
  
        this.placa = placa;
        this.area_id = area_id;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_salida = fecha_salida;
        this.modo_pago = modo_pago;
        this.monto = monto;
        this.estado = estado;
    }

    
    
    
    
    public int getTicket_id() {
        return ticket_id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getArea_id() {
        return area_id;
    }

    public Timestamp getFecha_ingreso() {
        return fecha_ingreso;
    }

    public Timestamp getFecha_salida() {
        return fecha_salida;
    }

    public String getModo_pago() {
        return modo_pago;
    }

    public double getMonto() {
        return monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public void setFecha_ingreso(Timestamp fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_salida(Timestamp fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public void setModo_pago(String modo_pago) {
        this.modo_pago = modo_pago;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
