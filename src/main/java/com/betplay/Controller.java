package com.betplay;

import java.util.Hashtable;

import com.betplay.model.entity.Actividad;
import com.betplay.model.entity.Comunicacion;
import com.betplay.model.entity.Entrada;
import com.betplay.model.entity.Entrenador;
import com.betplay.model.entity.Entrenamiento;
import com.betplay.model.entity.Equipo;
import com.betplay.model.entity.Estadio;
import com.betplay.model.entity.Goles;
import com.betplay.model.entity.Incidente;
import com.betplay.model.entity.Jugador;
import com.betplay.model.entity.Lesion;
import com.betplay.model.entity.Partido;
import com.betplay.model.entity.Patrocinador;
import com.betplay.model.entity.Permiso;
import com.betplay.model.entity.Rendimiento;
import com.betplay.model.entity.Resultado;
import com.betplay.model.entity.Rol;
import com.betplay.model.entity.Tarjeta;
import com.betplay.model.entity.Transferencia;
import com.betplay.model.entity.Usuario;

public class Controller {
    public static Hashtable<Integer, Actividad> actividades = new Hashtable<>();
    public static Hashtable<Integer, Comunicacion> comunicaciones = new Hashtable<>();
    public static Hashtable<Integer, Entrada> entradas = new Hashtable<>();
    public static Hashtable<Integer, Equipo> equipos = new Hashtable<>();
    public static Hashtable<Integer, Jugador> jugadores = new Hashtable<>();
    public static Hashtable<Integer, Partido> partidos = new Hashtable<>();
    public static Hashtable<Integer, Goles> goles = new Hashtable<>();
    public static Hashtable<Integer, Tarjeta> tarjetas = new Hashtable<>();
    public static Hashtable<Integer, Incidente> incidentes = new Hashtable<>();
    public static Hashtable<Integer, Resultado> resultados = new Hashtable<>();
    public static Hashtable<Integer, Lesion> lesiones = new Hashtable<>();
    public static Hashtable<Integer, Rendimiento> rendimientos = new Hashtable<>();
    public static Hashtable<Integer, Entrenamiento> entrenamientos = new Hashtable<>();
    public static Hashtable<Integer, Transferencia> transferencias = new Hashtable<>();
    public static Hashtable<Integer, Usuario> usuarios = new Hashtable<>();
    public static Hashtable<Integer, Rol> roles = new Hashtable<>();
    public static Hashtable<Integer, Permiso> permisos = new Hashtable<>();
    public static Hashtable<Integer, Patrocinador> patrocinadores = new Hashtable<>();
    public static Hashtable<Integer, Entrenador> entrenadores = new Hashtable<>();
    public static Hashtable<Integer, Estadio> estadios = new Hashtable<>();
}
