package com.example.juanacastro.foodoclock.model;

/**
 * Created by juan.a.castro on 14/11/2016.
 */
public class Picture {

    private String RpictureCard;
    private String Distancia;
    private String Name_restaurant;
    private String tipo_restaurante;
    private String puntaje = "190 Pts";


    public String getRpictureCard() {
        return RpictureCard;
    }

    public void setRpictureCard(String rpictureCard) {
        RpictureCard = rpictureCard;
    }

    public String getDistancia() {
        return Distancia;
    }

    public void setDistancia(String distancia) {
        Distancia = distancia;
    }

    public String getName_restaurant() {
        return Name_restaurant;
    }

    public void setName_restaurant(String name_restaurant) {
        Name_restaurant = name_restaurant;
    }

    public String getTipo_restaurante() {
        return tipo_restaurante;
    }

    public void setTipo_restaurante(String tipo_restaurante) {
        this.tipo_restaurante = tipo_restaurante;
    }

    public String getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(String puntaje) {
        this.puntaje = puntaje;
    }

    public Picture(String rpictureCard, String distancia, String name_restaurant, String tipo_restaurante, String puntaje) {
        this.RpictureCard = rpictureCard;
        this.Distancia = distancia;
        this.Name_restaurant = name_restaurant;
        this.tipo_restaurante = tipo_restaurante;
        this.puntaje = puntaje;
    }


}
