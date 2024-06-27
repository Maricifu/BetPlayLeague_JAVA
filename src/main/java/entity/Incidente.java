package entity;

public class Incidente {
    private int id;
    private int idpartido;
    private String descripcion;
    private String minuto;
    public Incidente() {
    }
    public Incidente(int id, int idpartido, String descripcion, String minuto) {
        this.id = id;
        this.idpartido = idpartido;
        this.descripcion = descripcion;
        this.minuto = minuto;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdpartido() {
        return idpartido;
    }
    public void setIdpartido(int idpartido) {
        this.idpartido = idpartido;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    }
