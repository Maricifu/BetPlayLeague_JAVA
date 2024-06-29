package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Actividad;

public class ActividadView {
    private Controller controlador;

    public ActividadView(Controller controlador) {
        this.controlador = controlador;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("1. Crear Actividad");
                System.out.println("2. Actualizar Actividad");
                System.out.println("3. Buscar Actividad");
                System.out.println("4. Eliminar Actividad");
                System.out.println("5. Listar Todas las Actividades");
                System.out.println("6. Salir");
                int choice = sc.nextInt();
                sc.nextLine();
                Actividad actividad;

                switch (choice) {
                    case 1:
                        System.out.println("Ingrese el id de la actividad: ");
                        int idact = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese la descripcion: ");
                        String descripcion = sc.nextLine();

                        System.out.println("Ingrese la duracion: ");
                        String duracion = sc.nextLine();

                        actividad = new Actividad(idact, descripcion, duracion);
                        controlador.actividades.put(idact, actividad);
                        break;

                    case 2:
                        System.out.println("Ingrese el id de la actividad: ");
                        int codigoacti = sc.nextInt();
                        sc.nextLine();

                        if (controlador.actividades.containsKey(codigoacti)) {
                            Actividad actividadact = controlador.actividades.get(codigoacti);

                            System.out.println("Ingrese la nueva descripcion de la actividad: ");
                            String nuevadescripcion = sc.nextLine();
                            actividadact.setDescripcion(nuevadescripcion);

                            System.out.println("Ingrese la nueva duracion de la actividad: ");
                            String nuevaduracion = sc.nextLine();
                            actividadact.setDuracion(nuevaduracion);

                        } else {
                            System.out.println("La actividad con el id: " + codigoacti + " no existe");
                        }
                        break;

                    case 3:
                        System.out.println("Ingrese el id de la actividad: ");
                        int codigoa = sc.nextInt();
                        sc.nextLine();

                        if (controlador.actividades.containsKey(codigoa)) {
                            Actividad ac = controlador.actividades.get(codigoa);
                            System.out.println("La descripcion de la actividad es: " + ac.getDescripcion());
                            System.out.println("La duracion de la actividad es: " + ac.getDuracion());
                        } else {
                            System.out.println("La actividad con el id: " + codigoa + " no existe.");
                        }
                        break;

                    case 4:
                        System.out.println("Ingrese el id de la actividad a eliminar: ");
                        int actividadeliminar = sc.nextInt();
                        sc.nextLine();
                        if (controlador.actividades.containsKey(actividadeliminar)) {
                            controlador.actividades.remove(actividadeliminar);
                            System.out.println("La actividad con el id: " + actividadeliminar + " ha sido eliminada");
                        } else {
                            System.out.println("La actividad con el id: " + actividadeliminar + " no existe");
                        }
                        break;

                    case 5:
                        System.out.println("Listado de todas las actividades:");
                        for (Actividad act : controlador.actividades.values()) {
                            System.out.println("ID: " + act.getId() + ", Descripción: " + act.getDescripcion() + ", Duración: " + act.getDuracion());
                            System.out.println("-----------------------------------");
                        }
                        break;

                    case 6:
                        return;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        } finally {
            sc.close(); 
        }
    }
}
