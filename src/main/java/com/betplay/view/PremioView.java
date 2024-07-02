package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Premio;

public class PremioView {
    private Controller controlador;

    public PremioView(Controller controlador) {
        this.controlador = controlador;
    }

    public PremioView() {
    }

    Premio premio = new Premio();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Premio/Reconocimiento");
            System.out.println("2. Actualizar Premio/Reconocimiento");
            System.out.println("3. Buscar Premio/Reconocimiento");
            System.out.println("4. Eliminar Premio/Reconocimiento");
            System.out.println("5. Listar Todos los Premios/Reconocimientos");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del premio/reconocimiento: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del premio/reconocimiento: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la descripción: ");
                    String descripcion = sc.nextLine();

                    System.out.println("Ingrese los criterios: ");
                    String criterios = sc.nextLine();

                    System.out.println("Ingrese los destinatarios: ");
                    String destinatarios = sc.nextLine();

                    System.out.println("Ingrese la fecha (YYYY-MM-DD): ");
                    String fecha = sc.nextLine();

                    premio = new Premio(id, nombre, descripcion, criterios, destinatarios, fecha);
                    controlador.premios.put(id, premio);
                    System.out.println("Premio/Reconocimiento agregado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del premio/reconocimiento a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.premios.containsKey(idAct)) {
                        Premio premioAct = controlador.premios.get(idAct);

                        System.out.println("Ingrese el nuevo nombre del premio/reconocimiento: ");
                        String nuevoNombre = sc.nextLine();
                        premioAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese la nueva descripción: ");
                        String nuevaDescripcion = sc.nextLine();
                        premioAct.setDescripcion(nuevaDescripcion);

                        System.out.println("Ingrese los nuevos criterios: ");
                        String nuevosCriterios = sc.nextLine();
                        premioAct.setCriterios(nuevosCriterios);

                        System.out.println("Ingrese los nuevos destinatarios: ");
                        String nuevosDestinatarios = sc.nextLine();
                        premioAct.setDestinatarios(nuevosDestinatarios);

                        System.out.println("Ingrese la nueva fecha (YYYY-MM-DD): ");
                        String nuevaFecha = sc.nextLine();
                        premioAct.setFecha(nuevaFecha);

                        System.out.println("Premio/Reconocimiento actualizado con éxito.");
                    } else {
                        System.out.println("El premio/reconocimiento con el id: " + idAct + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del premio/reconocimiento a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.premios.containsKey(idBuscar)) {
                        Premio premioBuscado = controlador.premios.get(idBuscar);
                        System.out.println("Nombre: " + premioBuscado.getNombre());
                        System.out.println("Descripción: " + premioBuscado.getDescripcion());
                        System.out.println("Criterios: " + premioBuscado.getCriterios());
                        System.out.println("Destinatarios: " + premioBuscado.getDestinatarios());
                        System.out.println("Fecha: " + premioBuscado.getFecha());
                    } else {
                        System.out.println("El premio/reconocimiento con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del premio/reconocimiento a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.premios.containsKey(idEliminar)) {
                        controlador.premios.remove(idEliminar);
                        System.out.println("El premio/reconocimiento con el id: " + idEliminar + " ha sido eliminado.");
                    } else {
                        System.out.println("El premio/reconocimiento con el id: " + idEliminar + " no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los premios/reconocimientos:");
                    for (Premio premio : controlador.premios.values()) {
                        System.out.println("ID: " + premio.getId() + ", Nombre: " + premio.getNombre());
                        System.out.println("Descripción: " + premio.getDescripcion());
                        System.out.println("Criterios: " + premio.getCriterios());
                        System.out.println("Destinatarios: " + premio.getDestinatarios());
                        System.out.println("Fecha: " + premio.getFecha());
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
