package entity;

public class Actividad {
    private int id;
    private String descripcion;
    private String duracion;
    public Actividad() {
    }
    public Actividad(int id, String descripcion, String duracion) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    

}
