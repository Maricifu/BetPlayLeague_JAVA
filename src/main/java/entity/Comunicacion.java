package entity;

import java.util.Date;
import java.util.List;

public class Comunicacion {
    private int id;
    private String titulo;
    private String contenido;
    private Date fechaPublicacion;
    private List<String> destinatarios;
    
    public Comunicacion(int id, String titulo, String contenido, Date fechaPublicacion, List<String> destinatarios) {
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
    
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
    
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    
    public List<String> getDestinatarios() {
        return destinatarios;
    }
    
    public void setDestinatarios(List<String> destinatarios) {
        this.destinatarios = destinatarios;
    }
}