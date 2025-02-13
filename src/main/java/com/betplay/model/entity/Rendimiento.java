package com.betplay.model.entity;

public class Rendimiento {

    private int id;
    private int idjugador;
    private int idpartido;
    private String minutosjugados;
    private int goles;
    private int asistencias;

    public Rendimiento() {
    }

    public Rendimiento(int id, int idjugador, int idpartido, String minutosjugados, int goles, int asistencias) {
        this.id = id;
        this.idjugador = idjugador;
        this.idpartido = idpartido;
        this.minutosjugados = minutosjugados;
        this.goles = goles;
        this.asistencias = asistencias;
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

    public int getIdpartido() {
        return idpartido;
    }

    public void setIdpartido(int idpartido) {
        this.idpartido = idpartido;
    }

    public String getMinutosjugados() {
        return minutosjugados;
    }

    public void setMinutosjugados(String minutosjugados) {
        this.minutosjugados = minutosjugados;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    }
