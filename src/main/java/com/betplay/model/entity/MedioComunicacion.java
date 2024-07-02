package com.betplay.model.entity;

public class MedioComunicacion {
    private int id;
    private String nombre;
    private String tipo;
    private String periodistasAcreditados;

    // Constructor vacío
    public MedioComunicacion() {
    }

    // Constructor con parámetros
    public MedioComunicacion(int id, String nombre, String tipo, String periodistasAcreditados) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.periodistasAcreditados = periodistasAcreditados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeriodistasAcreditados() {
        return periodistasAcreditados;
    }

    public void setPeriodistasAcreditados(String periodistasAcreditados) {
        this.periodistasAcreditados = periodistasAcreditados;
    }
}
