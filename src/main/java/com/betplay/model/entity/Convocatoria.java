package com.betplay.model.entity;

public class Convocatoria {
    private int id;
    private String descripcion;
    private String fecha;
    private String jugadoresConvocados;

    public Convocatoria() {
    }

    public Convocatoria(int id, String descripcion, String fecha, String jugadoresConvocados) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.jugadoresConvocados = jugadoresConvocados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public void setJugadoresConvocados(String jugadoresConvocados) {
        this.jugadoresConvocados = jugadoresConvocados;
    }
}
