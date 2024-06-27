package entity;

import java.util.Date;
import java.util.List;

public class Entrenamiento {
    private int id;
    private int idequipo;
    private Date fecha;
    private String hora;
    private String lugar;
    private String actividades;
    private List<Jugador> lstjugadores;

    public Entrenamiento() {
    }

    public Entrenamiento(int id, int idequipo, Date fecha, String hora, String lugar, String actividades,
            List<Jugador> lstjugadores) {
        this.id = id;
        this.idequipo = idequipo;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.actividades = actividades;
        this.lstjugadores = lstjugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public List<Jugador> getLstjugadores() {
        return lstjugadores;
    }

    public void setLstjugadores(List<Jugador> lstjugadores) {
        this.lstjugadores = lstjugadores;
    }
    
}
