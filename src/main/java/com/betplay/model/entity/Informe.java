package com.betplay.model.entity;

public class Informe {
    private int id;
    private String tipo;
    private String contenido;

    // Constructor vacío
    public Informe() {
    }

    // Constructor con parámetros
    public Informe(int id, String tipo, String contenido) {
        this.id = id;
        this.tipo = tipo;
        this.contenido = contenido;
    }

    // Getters y Setters
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
