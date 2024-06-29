package com.betplay.view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Goles;
import com.betplay.model.entity.Incidente;
import com.betplay.model.entity.Partido;
import com.betplay.model.entity.Resultado;
import com.betplay.model.entity.Tarjeta;

public class PartidoView {
    private Controller controlador;
    private SimpleDateFormat dateFormat;

    public PartidoView(Controller controlador) {
        this.controlador = controlador;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public PartidoView() {
    }


    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Partido");
            System.out.println("2. Actualizar Partido");
            System.out.println("3. Eliminar Partido");
            System.out.println("4. Listar Partidos");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Partido partido;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del partido: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el equipo local: ");
                    String equipoLocal = sc.nextLine();

                    System.out.println("Ingrese el equipo visitante: ");
                    String equipoVisitante = sc.nextLine();

                    System.out.println("Ingrese la fecha del partido (yyyy-MM-dd): ");
                    Date fechaPartido;
                    try {
                        fechaPartido = dateFormat.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        continue;
                    }

                    System.out.println("Ingrese la hora del partido: ");
                    String horaPartido = sc.nextLine();

                    System.out.println("Ingrese el estadio: ");
                    String estadio = sc.nextLine();

                    List<Goles> goles = new ArrayList<>();
                    List<Tarjeta> tarjetas = new ArrayList<>();
                    List<Incidente> incidentes = new ArrayList<>();
                    Resultado resultado = null;

                    partido = new Partido(id, equipoLocal, equipoVisitante, fechaPartido, horaPartido, estadio, goles,
                            tarjetas, incidentes, resultado);
                    controlador.partidos.put(id, partido);
                    break;

                case 2:
                    System.out.println("Ingrese el id del partido a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.partidos.containsKey(idActualizar)) {
                        partido = controlador.partidos.get(idActualizar);

                        System.out.println("Ingrese el nuevo equipo local: ");
                        equipoLocal = sc.nextLine();
                        partido.setEquipolocal(equipoLocal);

                        System.out.println("Ingrese el nuevo equipo visitante: ");
                        equipoVisitante = sc.nextLine();
                        partido.setEquipovisitante(equipoVisitante);

                        System.out.println("Ingrese la nueva fecha del partido (yyyy-MM-dd): ");
                        try {
                            fechaPartido = dateFormat.parse(sc.nextLine());
                            partido.setFecha(fechaPartido);
                        } catch (Exception e) {
                            System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        }

                        System.out.println("Ingrese la nueva hora del partido: ");
                        horaPartido = sc.nextLine();
                        partido.setHora(horaPartido);

                        System.out.println("Ingrese el nuevo estadio: ");
                        estadio = sc.nextLine();
                        partido.setEstadio(estadio);

                        System.out.println("Partido actualizado correctamente.");
                    } else {
                        System.out.println("El partido con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del partido a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.partidos.containsKey(idEliminar)) {
                        controlador.partidos.remove(idEliminar);
                        System.out.println("El partido con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El partido con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de partidos:");
                    for (Partido p : controlador.partidos.values()) {
                        System.out.println("ID: " + p.getId() + ", Local: " + p.getEquipolocal() + ", Visitante: "
                                + p.getEquipovisitante() + ", Fecha: " + dateFormat.format(p.getFecha()) + ", Hora: "
                                + p.getHora() + ", Estadio: " + p.getEstadio());
                        System.out.println("-----------------------------------");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
