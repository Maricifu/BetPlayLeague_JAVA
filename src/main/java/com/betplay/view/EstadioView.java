package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Estadio;

public class EstadioView {
    private Controller controlador;

    public EstadioView(Controller controlador) {
        this.controlador = controlador;
    }

    public EstadioView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Estadio");
            System.out.println("2. Actualizar Estadio");
            System.out.println("3. Buscar Estadio");
            System.out.println("4. Eliminar Estadio");
            System.out.println("5. Listar Todos los Estadios");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Estadio estadio;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del estadio: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del estadio: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la ubicación del estadio: ");
                    String ubicacion = sc.nextLine();

                    System.out.println("Ingrese la capacidad del estadio: ");
                    int capacidad = sc.nextInt();
                    sc.nextLine();

                    estadio = new Estadio(id, nombre, ubicacion, capacidad);
                    controlador.estadios.put(id, estadio);
                    break;

                case 2:
                    System.out.println("Ingrese el id del estadio: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.estadios.containsKey(idAct)) {
                        Estadio estadioAct = controlador.estadios.get(idAct);

                        System.out.println("Ingrese el nuevo nombre del estadio: ");
                        String nuevoNombre = sc.nextLine();
                        estadioAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese la nueva ubicación del estadio: ");
                        String nuevaUbicacion = sc.nextLine();
                        estadioAct.setUbicacion(nuevaUbicacion);

                        System.out.println("Ingrese la nueva capacidad del estadio: ");
                        int nuevaCapacidad = sc.nextInt();
                        sc.nextLine();
                        estadioAct.setCapacidad(nuevaCapacidad);

                    } else {
                        System.out.println("El estadio con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del estadio: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.estadios.containsKey(idBuscar)) {
                        Estadio est = controlador.estadios.get(idBuscar);
                        System.out.println("Nombre: " + est.getNombre());
                        System.out.println("Ubicación: " + est.getUbicacion());
                        System.out.println("Capacidad: " + est.getCapacidad());
                    } else {
                        System.out.println("El estadio con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del estadio a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.estadios.containsKey(idEliminar)) {
                        controlador.estadios.remove(idEliminar);
                        System.out.println("El estadio con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El estadio con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los estadios:");
                    for (Estadio est : controlador.estadios.values()) {
                        System.out.println("ID: " + est.getId() + ", Nombre: " + est.getNombre() + ", Ubicación: " + est.getUbicacion() + ", Capacidad: " + est.getCapacidad());
                        System.out.println("-----------------------------------");
                    }
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
