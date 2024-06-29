package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Goles;

public class GolesView {
    private Controller controlador;

    public GolesView(Controller controlador) {
        this.controlador = controlador;
    }

    public GolesView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Gol");
            System.out.println("2. Actualizar Gol");
            System.out.println("3. Eliminar Gol");
            System.out.println("4. Listar Goles por Partido");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Goles gol;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del gol: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del jugador que anotó el gol: ");
                    int idJugador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del equipo: ");
                    int idEquipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el minuto del gol: ");
                    String minuto = sc.nextLine();

                    System.out.println("Ingrese el id del partido: ");
                    int idPartido = sc.nextInt();
                    sc.nextLine();

                    gol = new Goles(id, idJugador, idEquipo, minuto, idPartido);
                    controlador.goles.put(id, gol);
                    break;

                case 2:
                    System.out.println("Ingrese el id del gol a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.goles.containsKey(idActualizar)) {
                        Goles golActualizar = controlador.goles.get(idActualizar);

                        System.out.println("Ingrese el nuevo id del jugador que anotó el gol: ");
                        int nuevoIdJugador = sc.nextInt();
                        sc.nextLine();
                        golActualizar.setIdjugadoranoto(nuevoIdJugador);

                        System.out.println("Ingrese el nuevo id del equipo: ");
                        int nuevoIdEquipo = sc.nextInt();
                        sc.nextLine();
                        golActualizar.setIdequipo(nuevoIdEquipo);

                        System.out.println("Ingrese el nuevo minuto del gol: ");
                        String nuevoMinuto = sc.nextLine();
                        golActualizar.setMinuto(nuevoMinuto);

                        System.out.println("Ingrese el nuevo id del partido: ");
                        int nuevoIdPartido = sc.nextInt();
                        sc.nextLine();
                        golActualizar.setIdpartido(nuevoIdPartido);

                        System.out.println("Gol actualizado correctamente.");
                    } else {
                        System.out.println("El gol con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del gol a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.goles.containsKey(idEliminar)) {
                        controlador.goles.remove(idEliminar);
                        System.out.println("El gol con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El gol con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del partido para listar sus goles: ");
                    int idPartidoBuscar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Listado de goles para el partido con id " + idPartidoBuscar + ":");
                    boolean found = false;
                    for (Goles g : controlador.goles.values()) {
                        if (g.getIdpartido() == idPartidoBuscar) {
                            System.out.println("ID Gol: " + g.getIdgol() + ", Jugador: " + g.getIdjugadoranoto() + ", Equipo: " + g.getIdequipo() + ", Minuto: " + g.getMinuto());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontraron goles para el partido con id " + idPartidoBuscar);
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
