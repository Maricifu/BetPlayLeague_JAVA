package com.betplay.model.entity;

public class Arbitro {
    private int id;
    private String nombre;
    private int experiencia;

    public Arbitro() {
    }

    public Arbitro(int id, String nombre, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.experiencia = experiencia;
    }

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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
