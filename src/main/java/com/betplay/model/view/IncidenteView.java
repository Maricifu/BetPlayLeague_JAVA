package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Incidente;

public class IncidenteView {
    private Controller controlador;

    public IncidenteView(Controller controlador) {
        this.controlador = controlador;
    }

    public IncidenteView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Incidente");
            System.out.println("2. Actualizar Incidente");
            System.out.println("3. Eliminar Incidente");
            System.out.println("4. Listar Incidentes por Partido");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Incidente incidente;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del incidente: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del partido: ");
                    int idPartido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la descripción del incidente: ");
                    String descripcion = sc.nextLine();

                    System.out.println("Ingrese el minuto del incidente: ");
                    String minuto = sc.nextLine();

                    incidente = new Incidente(id, idPartido, descripcion, minuto);
                    controlador.incidentes.put(id, incidente);
                    break;

                case 2:
                    System.out.println("Ingrese el id del incidente a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.incidentes.containsKey(idActualizar)) {
                        Incidente incidenteActualizar = controlador.incidentes.get(idActualizar);

                        System.out.println("Ingrese la nueva descripción del incidente: ");
                        String nuevaDescripcion = sc.nextLine();
                        incidenteActualizar.setDescripcion(nuevaDescripcion);

                        System.out.println("Ingrese el nuevo minuto del incidente: ");
                        String nuevoMinuto = sc.nextLine();
                        incidenteActualizar.setMinuto(nuevoMinuto);

                        System.out.println("Incidente actualizado correctamente.");
                    } else {
                        System.out.println("El incidente con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del incidente a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.incidentes.containsKey(idEliminar)) {
                        controlador.incidentes.remove(idEliminar);
                        System.out.println("El incidente con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El incidente con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del partido para listar sus incidentes: ");
                    int idPartidoBuscar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Listado de incidentes para el partido con id " + idPartidoBuscar + ":");
                    boolean found = false;
                    for (Incidente i : controlador.incidentes.values()) {
                        if (i.getIdpartido() == idPartidoBuscar) {
                            System.out.println("ID Incidente: " + i.getId() + ", Descripción: " + i.getDescripcion() + ", Minuto: " + i.getMinuto());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontraron incidentes para el partido con id " + idPartidoBuscar);
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
