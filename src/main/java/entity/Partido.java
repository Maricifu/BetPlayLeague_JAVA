package entity;

import java.util.Date;
import java.util.List;

public class Partido {
    private int id;
    private String equipolocal;
    private String equipovisitante;
    private Date fecha;
    private String hora;
    private String estadio;
    private List<Goles> goles;
    private List<Tarjeta> listatarjetas;
    private List<String> incidentes;
    private String resultado;

    public Partido() {
    }

    public Partido(int id, String equipolocal, String equipovisitante, Date fecha, String hora, String estadio,
            List<Goles> goles, List<Tarjeta> listatarjetas, List<String> incidentes, String resultado) {
        this.id = id;
        this.equipolocal = equipolocal;
        this.equipovisitante = equipovisitante;
        this.fecha = fecha;
        this.hora = hora;
        this.estadio = estadio;
        this.goles = goles;
        this.listatarjetas = listatarjetas;
        this.incidentes = incidentes;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipolocal() {
        return equipolocal;
    }

    public void setEquipolocal(String equipolocal) {
        this.equipolocal = equipolocal;
    }

    public String getEquipovisitante() {
        return equipovisitante;
    }

    public void setEquipovisitante(String equipovisitante) {
        this.equipovisitante = equipovisitante;
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

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public List<Goles> getGoles() {
        return goles;
    }

    public void setGoles(List<Goles> goles) {
        this.goles = goles;
    }

    public List<Tarjeta> getListatarjetas() {
        return listatarjetas;
    }

    public void setListatarjetas(List<Tarjeta> listatarjetas) {
        this.listatarjetas = listatarjetas;
    }

    public List<String> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<String> incidentes) {
        this.incidentes = incidentes;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    

}
