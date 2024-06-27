package com.betplay.model.entity;

public class Tarjeta {
    private int id;
    private int idjugador;
    private int idpartido;
    private String tipo;
    private String minuto;
    public Tarjeta() {
    }
    public Tarjeta(int id, int idjugador, int idpartido, String tipo, String minuto) {
        this.id = id;
        this.idjugador = idjugador;
        this.idpartido = idpartido;
        this.tipo = tipo;
        this.minuto = minuto;
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
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    
}
