package com.catalogo.vehiculos.models;

import org.springframework.data.annotation.Id;


import java.util.Date;

public class Alquiler {
    @Id
    private String id;
    private String username;
    private String vehiculoId;
    private String vehiculoNombre;
    private Date fechaInicio;
    private Date fechaFinal;
    private String lugarEntrega;
    private String lugarRegreso;
<<<<<<< HEAD
    private boolean entregado;

    public Alquiler(String id, String username, String vehiculoId, String vehiculoNombre, Date fechaInicio, Date fechaFinal, String lugarEntrega, String lugarRegreso, boolean entregado) {
=======
    /*
    Entidad de alquiler para manejar la aplicacion.
    */
    public Alquiler(String id, String username, String vehiculoId, Date fechaInicio, Date fechaFinal, String lugarEntrega, String lugarRegreso) {
>>>>>>> 9e9fe4eb6cb876b381158133191d7b3062533a33
        this.id = id;
        this.username = username;
        this.vehiculoId = vehiculoId;
        this.vehiculoNombre = vehiculoNombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.lugarEntrega = lugarEntrega;
        this.lugarRegreso = lugarRegreso;
        this.entregado = entregado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(String vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getVehiculoNombre() {
        return vehiculoNombre;
    }

    public void setVehiculoNombre(String vehiculoNombre) {
        this.vehiculoNombre = vehiculoNombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }


    public String getLugarEntrega() {
        return lugarEntrega;
    }

    public void setLugarEntrega(String lugarEntrega) {
        this.lugarEntrega = lugarEntrega;
    }

    public String getLugarRegreso() {
        return lugarRegreso;
    }

    public void setLugarRegreso(String lugarRegreso) {
        this.lugarRegreso = lugarRegreso;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
