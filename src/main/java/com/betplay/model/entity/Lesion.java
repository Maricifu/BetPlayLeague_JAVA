package com.betplay.model.entity;

import java.util.Date;

public class Lesion {
    private int id;
    private int idjugador;
    private String tipolesion;
    private String gravedad;
    private Date fechainicio;
    private Date fechafin;

    public Lesion() {
    }

    public Lesion(int id, int idjugador, String tipolesion, String gravedad, Date fechainicio, Date fechafin) {
        this.id = id;
        this.idjugador = idjugador;
        this.tipolesion = tipolesion;
        this.gravedad = gravedad;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdjugador() {
        return idjugador;
    }

    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }

    public String getTipolesion() {
        return tipolesion;
    }

    public void setTipolesion(String tipolesion) {
        this.tipolesion = tipolesion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    
}
