package entity;

public class Goles {
    private int idgol ;
    private int idjugadoranoto;
    private int idequipo;
    private String minuto;
    private int idpartido;

    public Goles() {
    }

    public Goles(int idgol, int idjugadoranoto, int idequipo, String minuto, int idpartido) {
        this.idgol = idgol;
        this.idjugadoranoto = idjugadoranoto;
        this.idequipo = idequipo;
        this.minuto = minuto;
        this.idpartido = idpartido;
    }
    
    public int getIdgol() {
        return idgol;
    }
    public void setIdgol(int idgol) {
        this.idgol = idgol;
    }
    public int getIdjugadoranoto() {
        return idjugadoranoto;
    }
    public void setIdjugadoranoto(int idjugadoranoto) {
        this.idjugadoranoto = idjugadoranoto;
    }
    public int getIdequipo() {
        return idequipo;
    }
    public void setIdequipo(int idequipo) {
        this.idequipo = idequipo;
    }
    public String getMinuto() {
        return minuto;
    }
    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }
    public int getIdpartido() {
        return idpartido;
    }
    public void setIdpartido(int idpartido) {
        this.idpartido = idpartido;
    }
    
}
