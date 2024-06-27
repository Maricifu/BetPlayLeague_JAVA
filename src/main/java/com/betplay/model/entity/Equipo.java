package com.betplay.model.entity;

import java.util.List;

public class Equipo {
    private int id;
    private String nombre;
    private String ciudad;
    private String estadio;
    private List<Jugador> lstJugadores;
    private List<Entrenador> lstEntrenadores;

    public Equipo() {
    }

    public Equipo(int id, String nombre, String ciudad, String estadio, List<Jugador> lstJugadores,
            List<Entrenador> lstEntrenadores) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estadio = estadio;
        this.lstJugadores = lstJugadores;
        this.lstEntrenadores = lstEntrenadores;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<Jugador> getLstJugadores() {
        return lstJugadores;
    }

    public void setLstJugadores(List<Jugador> lstJugadores) {
        this.lstJugadores = lstJugadores;
    }

    public List<Entrenador> getLstEntrenadores() {
        return lstEntrenadores;
    }

    public void setLstEntrenadores(List<Entrenador> lstEntrenadores) {
        this.lstEntrenadores = lstEntrenadores;
    }
    
    
}
