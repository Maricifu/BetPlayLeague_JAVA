package com.betplay.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Comunicacion;

public class ComunicacionView {
    private Controller controlador;
    
    public ComunicacionView(Controller controlador) {
        this.controlador = controlador;
    }

    public ComunicacionView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Comunicación");
            System.out.println("2. Actualizar Comunicación");
            System.out.println("3. Buscar Comunicación");
            System.out.println("4. Eliminar Comunicación");
            System.out.println("5. Listar Todas las Comunicaciones");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Comunicacion comunicacion;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la comunicación: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el título: ");
                    String titulo = sc.nextLine();

                    System.out.println("Ingrese el contenido: ");
                    String contenido = sc.nextLine();

                    System.out.println("Ingrese la fecha de publicación: ");
                    String fechaPublicacion = sc.nextLine();

                    System.out.println("Ingrese los destinatarios (separados por coma): ");
                    String destinatariosStr = sc.nextLine();
                    List<String> destinatarios = new ArrayList<>();
                    for (String destinatario : destinatariosStr.split(",")) {
                        destinatarios.add(destinatario.trim());
                    }

                    comunicacion = new Comunicacion(id, titulo, contenido, fechaPublicacion, destinatarios);
                    controlador.comunicaciones.put(id, comunicacion);
                    break;

                case 2:
                    System.out.println("Ingrese el id de la comunicación: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.comunicaciones.containsKey(idAct)) {
                        Comunicacion comunicacionAct = controlador.comunicaciones.get(idAct);

                        System.out.println("Ingrese el nuevo título: ");
                        String nuevoTitulo = sc.nextLine();
                        comunicacionAct.setTitulo(nuevoTitulo);

                        System.out.println("Ingrese el nuevo contenido: ");
                        String nuevoContenido = sc.nextLine();
                        comunicacionAct.setContenido(nuevoContenido);

                        System.out.println("Ingrese la nueva fecha de publicación: ");
                        String nuevaFechaPublicacion = sc.nextLine();
                        comunicacionAct.setFechaPublicacion(nuevaFechaPublicacion);

                        System.out.println("Ingrese los nuevos destinatarios (separados por coma): ");
                        String nuevosDestinatariosStr = sc.nextLine();
                        List<String> nuevosDestinatarios = new ArrayList<>();
                        for (String destinatario : nuevosDestinatariosStr.split(",")) {
                            nuevosDestinatarios.add(destinatario.trim());
                        }
                        comunicacionAct.setDestinatarios(nuevosDestinatarios);

                    } else {
                        System.out.println("La comunicación con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la comunicación: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.comunicaciones.containsKey(idBuscar)) {
                        Comunicacion com = controlador.comunicaciones.get(idBuscar);
                        System.out.println("Título: " + com.getTitulo());
                        System.out.println("Contenido: " + com.getContenido());
                        System.out.println("Fecha de publicación: " + com.getFechaPublicacion());
                        System.out.println("Destinatarios: " + String.join(", ", com.getDestinatarios()));
                    } else {
                        System.out.println("La comunicación con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id de la comunicación a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.comunicaciones.containsKey(idEliminar)) {
                        controlador.comunicaciones.remove(idEliminar);
                        System.out.println("La comunicación con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La comunicación con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todas las comunicaciones:");
                    for (Comunicacion com : controlador.comunicaciones.values()) {
                        System.out.println("ID: " + com.getId() + ", Título: " + com.getTitulo() + ", Contenido: " + com.getContenido() + ", Fecha de Publicación: " + com.getFechaPublicacion() + ", Destinatarios: " + String.join(", ", com.getDestinatarios()));
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
