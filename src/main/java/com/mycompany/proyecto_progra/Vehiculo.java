
package com.mycompany.proyecto_progra;


public class Vehiculo {//clase1
    
    public String placa;
    public String tipoVehiculo;//Atributos
    public String tipoArea;

    public Vehiculo(String placa, String tipoVehiculo, String tipoArea) {//Creo mi constructor con parametros, alt+insert
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoArea = tipoArea;
    }
    
     /*GETTERS y SETTERS:
       - GET = Me da el valor (leer).
       - SET = cambia el valor (escribir).
       Sirven para cuidar los datos (encapsulamiento).*/

    public String getPlaca() {
        return placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipoVehiculo=" + tipoVehiculo + ", tipoArea=" + tipoArea + '}';//alt+insert
    }
    
    
}