package com.betplay.model.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Lesion;

public class LesionView {
    private Controller controlador;

    public LesionView(Controller controlador) {
        this.controlador = controlador;
    }

    public LesionView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("1. Registrar Lesión");
            System.out.println("2. Actualizar Lesión");
            System.out.println("3. Eliminar Lesión");
            System.out.println("4. Listar Lesiones");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Lesion lesion;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la lesión: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del jugador afectado: ");
                    int idJugador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el tipo de lesión: ");
                    String tipoLesion = sc.nextLine();

                    System.out.println("Ingrese la gravedad de la lesión: ");
                    String gravedad = sc.nextLine();

                    System.out.println("Ingrese la fecha de inicio (yyyy-MM-dd): ");
                    Date fechaInicio;
                    try {
                        fechaInicio = dateFormat.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        continue;
                    }

                    System.out.println("Ingrese la fecha de fin (yyyy-MM-dd): ");
                    Date fechaFin;
                    try {
                        fechaFin = dateFormat.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        continue;
                    }

                    lesion = new Lesion(id, idJugador, tipoLesion, gravedad, fechaInicio, fechaFin);
                    controlador.lesiones.put(id, lesion);
                    break;

                case 2:
                    System.out.println("Ingrese el id de la lesión a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.lesiones.containsKey(idActualizar)) {
                        Lesion lesionActualizar = controlador.lesiones.get(idActualizar);

                        System.out.println("Ingrese el nuevo id del jugador afectado: ");
                        int nuevoIdJugador = sc.nextInt();
                        sc.nextLine();
                        lesionActualizar.setIdjugador(nuevoIdJugador);

                        System.out.println("Ingrese el nuevo tipo de lesión: ");
                        String nuevoTipoLesion = sc.nextLine();
                        lesionActualizar.setTipolesion(nuevoTipoLesion);

                        System.out.println("Ingrese la nueva gravedad de la lesión: ");
                        String nuevaGravedad = sc.nextLine();
                        lesionActualizar.setGravedad(nuevaGravedad);

                        System.out.println("Ingrese la nueva fecha de inicio (yyyy-MM-dd): ");
                        Date nuevaFechaInicio;
                        try {
                            nuevaFechaInicio = dateFormat.parse(sc.nextLine());
                            lesionActualizar.setFechainicio(nuevaFechaInicio);
                        } catch (Exception e) {
                            System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        }

                        System.out.println("Ingrese la nueva fecha de fin (yyyy-MM-dd): ");
                        Date nuevaFechaFin;
                        try {
                            nuevaFechaFin = dateFormat.parse(sc.nextLine());
                            lesionActualizar.setFechafin(nuevaFechaFin);
                        } catch (Exception e) {
                            System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        }

                        System.out.println("Lesión actualizada correctamente.");
                    } else {
                        System.out.println("La lesión con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la lesión a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.lesiones.containsKey(idEliminar)) {
                        controlador.lesiones.remove(idEliminar);
                        System.out.println("La lesión con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La lesión con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de lesiones:");
                    for (Lesion l : controlador.lesiones.values()) {
                        System.out.println("ID: " + l.getId() + ", Jugador: " + l.getIdjugador() + ", Tipo: " + l.getTipolesion()
                                + ", Gravedad: " + l.getGravedad() + ", Inicio: " + dateFormat.format(l.getFechainicio())
                                + ", Fin: " + dateFormat.format(l.getFechafin()));
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
