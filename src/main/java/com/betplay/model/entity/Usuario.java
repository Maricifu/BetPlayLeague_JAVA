package com.betplay.model.entity;

public class Usuario {

    private String id;
    private String nombre;
    private String email;
    private String password;
    private Rol idrol;
    public Usuario() {
    }
    public Usuario(String id, String nombre, String email, String password, Rol idrol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.idrol = idrol;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Rol getIdrol() {
        return idrol;
    }
    public void setIdrol(Rol idrol) {
        this.idrol = idrol;
    }

}
