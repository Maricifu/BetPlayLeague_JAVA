package com.betplay.model.entity;

public class Equipamiento {
    private int id;
    private String tipo;
    private int cantidad;
    private String equipoAsociado;
    private String fechaAdquisicion;

    public Equipamiento() {
    }

    public Equipamiento(int id, String tipo, int cantidad, String equipoAsociado, String fechaAdquisicion) {
        this.id = id;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.equipoAsociado = equipoAsociado;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEquipoAsociado() {
        return equipoAsociado;
    }

    public void setEquipoAsociado(String equipoAsociado) {
        this.equipoAsociado = equipoAsociado;
    }

    public String getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(String fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
}
