package com.betplay.model.entity;

import java.util.List;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    private String fechaPublicacion;
    private List<String> destinatarios;
    
    public Comunicacion() {
    }

    public Comunicacion(int id, String titulo, String contenido, String fechaPublicacion, List<String> destinatarios) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
        this.destinatarios = destinatarios;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public String getFechaPublicacion() {
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public List<String> getDestinatarios() {
        return destinatarios;
    }
    
    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }
}