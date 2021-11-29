package com.catalogo.vehiculos.models;

import org.springframework.data.annotation.Id;

public class Vehiculos {
    @Id
    private String id;
    private String nombre;
    private String placa;
    private String marca;
    private String modelo;
    private String color;
    private String cilindraje;
    private boolean fullEquipo;
    private String image_URL;
    private String transmision;
    private String categoria;
    private double tarifa;
    private boolean disponible;
    
    /*
    Entidad realizada para la correcta manipulacion de los vehiculos
    */

    public Vehiculos(String id, String nombre, String placa, String marca, String modelo, String color, String cilindraje, boolean fullEquipo, String image_URL, String transmision, String categoria, double tarifa, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
        this.fullEquipo = fullEquipo;
        this.image_URL = image_URL;
        this.transmision = transmision;
        this.categoria = categoria;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isFullEquipo() {
        return fullEquipo;
    }

    public void setFullEquipo(boolean fullEquipo) {
        this.fullEquipo = fullEquipo;
    }

    public String getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(String image_URL) {
        this.image_URL = image_URL;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
