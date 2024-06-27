package entity;

import java.util.List;

public class Rol {
    private int id;
    private String nombre;
    private List<Permiso> idpermisos;
    
    public Rol() {
    }

    public Rol(int id, String nombre, List<Permiso> idpermisos) {
        this.id = id;
        this.nombre = nombre;
        this.idpermisos = idpermisos;
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

    public List<Permiso> getIdpermisos() {
        return idpermisos;
    }

    public void setIdpermisos(List<Permiso> idpermisos) {
        this.idpermisos = idpermisos;
    }

    
    
}
