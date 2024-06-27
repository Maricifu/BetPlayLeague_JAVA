package entity;

public class Resultado {

    private int id;
    private int idpartido;
    private Goles golesequipolocal;
    private Goles golesequipovisitante;

    public Resultado() {
    }

    public Resultado(int id, int idpartido, Goles golesequipolocal, Goles golesequipovisitante) {
        this.id = id;
        this.idpartido = idpartido;
        this.golesequipolocal = golesequipolocal;
        this.golesequipovisitante = golesequipovisitante;
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
    public Goles getGolesequipolocal() {
        return golesequipolocal;
    }
    public void setGolesequipolocal(Goles golesequipolocal) {
        this.golesequipolocal = golesequipolocal;
    }
    public Goles getGolesequipovisitante() {
        return golesequipovisitante;
    }
    public void setGolesequipovisitante(Goles golesequipovisitante) {
        this.golesequipovisitante = golesequipovisitante;
    }

    
}
