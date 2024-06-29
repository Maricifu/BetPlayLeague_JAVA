package com.betplay.model.entity;

import java.util.List;

public class Rol {
    private String id;
    private String nombre;
    private List<Permiso> permisos;
    
    public Rol() {
    }

    public Rol(String id, String nombre, List<Permiso> permisos) {
        this.id = id;
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Permiso> getIdpermisos() {
        return permisos;
    }

    public void setIdpermisos(List<Permiso> idpermisos) {
        this.permisos = idpermisos;
    }

    
    
}
