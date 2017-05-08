package com.example.juanacastro.foodoclock.model;

/**
 * Created by home on 07/05/2017.
 */
public class Descripcion {

    private String costo_promedio;
    private String Tarjeta_debito;
    private String Tarjeta_credito;
    private String Tipo_restaurante;
    private String Descripcion;
    private String Direccion;
    private String wifi;

    public String getBarra() {
        return barra;
    }

    public void setBarra(String barra) {
        this.barra = barra;
    }

    public String getCosto_promedio() {
        return costo_promedio;
    }

    public void setCosto_promedio(String costo_promedio) {
        this.costo_promedio = costo_promedio;
    }

    public String getTarjeta_debito() {
        return Tarjeta_debito;
    }

    public void setTarjeta_debito(String tarjeta_debito) {
        Tarjeta_debito = tarjeta_debito;
    }

    public String getTarjeta_credito() {
        return Tarjeta_credito;
    }

    public void setTarjeta_credito(String tarjeta_credito) {
        Tarjeta_credito = tarjeta_credito;
    }

    public String getTipo_restaurante() {
        return Tipo_restaurante;
    }

    public void setTipo_restaurante(String tipo_restaurante) {
        Tipo_restaurante = tipo_restaurante;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    private String barra;

    public Descripcion(String costo_promedio, String tarjeta_debito, String tarjeta_credito, String tipo_restaurante, String descripcion, String direccion, String wifi, String barra) {
        this.costo_promedio = costo_promedio;
        this.Tarjeta_debito = tarjeta_debito;
        this.Tarjeta_credito = tarjeta_credito;
        this.Tipo_restaurante = tipo_restaurante;
        this.Descripcion = descripcion;
        this.Direccion = direccion;
        this.wifi = wifi;
        this.barra = barra;
    }




}
