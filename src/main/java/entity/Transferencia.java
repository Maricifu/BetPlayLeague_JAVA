package entity;

import java.util.Date;

public class Transferencia {

    private int id;
    private int idjugador;
    private int idequipoorigen;
    private int idequipodestino;
    private double monto;
    private Date fecha;
    public Transferencia() {
    }
    public Transferencia(int id, int idjugador, int idequipoorigen, int idequipodestino, double monto, Date fecha) {
        this.id = id;
        this.idjugador = idjugador;
        this.idequipoorigen = idequipoorigen;
        this.idequipodestino = idequipodestino;
        this.monto = monto;
        this.fecha = fecha;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdjugador() {
        return idjugador;
    }
    public void setIdjugador(int idjugador) {
        this.idjugador = idjugador;
    }
    public int getIdequipoorigen() {
        return idequipoorigen;
    }
    public void setIdequipoorigen(int idequipoorigen) {
        this.idequipoorigen = idequipoorigen;
    }
    public int getIdequipodestino() {
        return idequipodestino;
    }
    public void setIdequipodestino(int idequipodestino) {
        this.idequipodestino = idequipodestino;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
