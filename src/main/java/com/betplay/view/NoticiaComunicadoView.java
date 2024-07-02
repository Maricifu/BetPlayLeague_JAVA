package com.betplay.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import com.betplay.Controller;
import com.betplay.model.entity.NoticiaComunicado;

public class NoticiaComunicadoView {
    private Controller controlador;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public NoticiaComunicadoView(Controller controlador) {
        this.controlador = controlador;
    }

    public NoticiaComunicadoView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear NoticiaComunicado");
            System.out.println("2. Actualizar NoticiaComunicado");
            System.out.println("3. Buscar NoticiaComunicado");
            System.out.println("4. Eliminar NoticiaComunicado");
            System.out.println("5. Listar Todos los NoticiasComunicados");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            NoticiaComunicado noticia;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la noticia/comunicado: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el titulo: ");
                    String titulo = sc.nextLine();

                    System.out.println("Ingrese el contenido: ");
                    String contenido = sc.nextLine();

                    System.out.println("Ingrese la fecha de publicacion (dd/MM/yyyy): ");
                    String fechaPublicacionStr = sc.nextLine();
                    Date fechaPublicacion = null;
                    try {
                        fechaPublicacion = dateFormat.parse(fechaPublicacionStr);
                    } catch (ParseException e) {
                        System.out.println("Fecha no válida. Intente de nuevo.");
                        break;
                    }

                    System.out.println("Ingrese los destinatarios (separados por comas): ");
                    String destinatariosStr = sc.nextLine();
                    List<String> destinatarios = new ArrayList<>();
                    for (String destinatario : destinatariosStr.split(",")) {
                        destinatarios.add(destinatario.trim());
                    }

                    noticia = new NoticiaComunicado(id, titulo, contenido, fechaPublicacion, destinatarios);
                    controlador.noticias.put(id, noticia);
                    break;

                case 2:
                    System.out.println("Ingrese el id de la noticia/comunicado: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.noticias.containsKey(idAct)) {
                        NoticiaComunicado noticiaAct = controlador.noticias.get(idAct);

                        System.out.println("Ingrese el nuevo titulo: ");
                        String nuevoTitulo = sc.nextLine();
                        noticiaAct.setTitulo(nuevoTitulo);

                        System.out.println("Ingrese el nuevo contenido: ");
                        String nuevoContenido = sc.nextLine();
                        noticiaAct.setContenido(nuevoContenido);

                        System.out.println("Ingrese la nueva fecha de publicacion (dd/MM/yyyy): ");
                        String nuevaFechaPublicacionStr = sc.nextLine();
                        Date nuevaFechaPublicacion = null;
                        try {
                            nuevaFechaPublicacion = dateFormat.parse(nuevaFechaPublicacionStr);
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Intente de nuevo.");
                            break;
                        }
                        noticiaAct.setFechaPublicacion(nuevaFechaPublicacion);

                        System.out.println("Ingrese los nuevos destinatarios (separados por comas): ");
                        String nuevosDestinatariosStr = sc.nextLine();
                        List<String> nuevosDestinatarios = new ArrayList<>();
                        for (String destinatario : nuevosDestinatariosStr.split(",")) {
                            nuevosDestinatarios.add(destinatario.trim());
                        }
                        noticiaAct.setDestinatarios(nuevosDestinatarios);

                    } else {
                        System.out.println("La noticia/comunicado con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la noticia/comunicado: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.noticias.containsKey(idBuscar)) {
                        NoticiaComunicado noticiaEncontrada = controlador.noticias.get(idBuscar);
                        System.out.println("Titulo: " + noticiaEncontrada.getTitulo());
                        System.out.println("Contenido: " + noticiaEncontrada.getContenido());
                        System.out.println("Fecha de Publicación: " + dateFormat.format(noticiaEncontrada.getFechaPublicacion()));
                        System.out.println("Destinatarios: " + String.join(", ", noticiaEncontrada.getDestinatarios()));
                    } else {
                        System.out.println("La noticia/comunicado con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id de la noticia/comunicado a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.noticias.containsKey(idEliminar)) {
                        controlador.noticias.remove(idEliminar);
                        System.out.println("La noticia/comunicado con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La noticia/comunicado con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todas las noticias/comunicados:");
                    for (NoticiaComunicado noticiaListado : controlador.noticias.values()) {
                        System.out.println("ID: " + noticiaListado.getId() + ", Titulo: " + noticiaListado.getTitulo() + ", Contenido: " + noticiaListado.getContenido() + ", Fecha de Publicación: " + dateFormat.format(noticiaListado.getFechaPublicacion()) + ", Destinatarios: " + String.join(", ", noticiaListado.getDestinatarios()));
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
