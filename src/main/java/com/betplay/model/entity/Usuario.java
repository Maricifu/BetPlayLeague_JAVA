package com.betplay.model.entity;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String password;
    private int idrol;
    public Usuario() {
    }
    public Usuario(int id, String nombre, String email, String password, int idrol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.idrol = idrol;
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
    public int getIdrol() {
        return idrol;
    }
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }

}
