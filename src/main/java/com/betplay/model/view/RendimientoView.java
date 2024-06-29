package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Rendimiento;

public class RendimientoView {
    private Controller controlador;

    public RendimientoView(Controller controlador) {
        this.controlador = controlador;
    }

    public RendimientoView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Rendimiento");
            System.out.println("2. Actualizar Rendimiento");
            System.out.println("3. Eliminar Rendimiento");
            System.out.println("4. Listar Rendimientos");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Rendimiento rendimiento;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del rendimiento: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del jugador: ");
                    int idJugador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del partido: ");
                    int idPartido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese los minutos jugados: ");
                    String minutosJugados = sc.nextLine();

                    System.out.println("Ingrese la cantidad de goles: ");
                    int goles = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la cantidad de asistencias: ");
                    int asistencias = sc.nextInt();
                    sc.nextLine();

                    rendimiento = new Rendimiento(id, idJugador, idPartido, minutosJugados, goles, asistencias);
                    controlador.rendimientos.put(id, rendimiento);
                    break;

                case 2:
                    System.out.println("Ingrese el id del rendimiento a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.rendimientos.containsKey(idActualizar)) {
                        rendimiento = controlador.rendimientos.get(idActualizar);

                        System.out.println("Ingrese los nuevos minutos jugados: ");
                        minutosJugados = sc.nextLine();
                        rendimiento.setMinutosjugados(minutosJugados);

                        System.out.println("Ingrese la nueva cantidad de goles: ");
                        goles = sc.nextInt();
                        sc.nextLine();
                        rendimiento.setGoles(goles);

                        System.out.println("Ingrese la nueva cantidad de asistencias: ");
                        asistencias = sc.nextInt();
                        sc.nextLine();
                        rendimiento.setAsistencias(asistencias);

                        System.out.println("Rendimiento actualizado correctamente.");
                    } else {
                        System.out.println("El rendimiento con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del rendimiento a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.rendimientos.containsKey(idEliminar)) {
                        controlador.rendimientos.remove(idEliminar);
                        System.out.println("El rendimiento con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El rendimiento con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de rendimientos:");
                    for (Rendimiento r : controlador.rendimientos.values()) {
                        System.out.println("ID: " + r.getId() + ", Jugador: " + r.getIdjugador() + ", Partido: " + r.getIdpartido()
                                + ", Minutos Jugados: " + r.getMinutosjugados() + ", Goles: " + r.getGoles() + ", Asistencias: " + r.getAsistencias());
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
