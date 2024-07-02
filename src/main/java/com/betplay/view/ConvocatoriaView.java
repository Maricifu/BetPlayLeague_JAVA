package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Convocatoria;

public class ConvocatoriaView {
    private Controller controlador;

    public ConvocatoriaView(Controller controlador) {
        this.controlador = controlador;
    }

    public ConvocatoriaView() {
    }

    Convocatoria convocatoria = new Convocatoria();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Convocatoria");
            System.out.println("2. Actualizar Convocatoria");
            System.out.println("3. Buscar Convocatoria");
            System.out.println("4. Eliminar Convocatoria");
            System.out.println("5. Listar Todas las Convocatorias");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la convocatoria: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la descripción de la convocatoria: ");
                    String descripcion = sc.nextLine();

                    System.out.println("Ingrese la fecha de la convocatoria (YYYY-MM-DD): ");
                    String fecha = sc.nextLine();

                    // Aquí se podría implementar la lógica para seleccionar jugadores convocados
                    // Podría ser una lista de IDs de jugadores o una referencia a los objetos Jugador
                    System.out.println("Ingrese la lista de jugadores convocados (separados por coma): ");
                    String jugadoresConvocados = sc.nextLine();

                    convocatoria = new Convocatoria(id, descripcion, fecha, jugadoresConvocados);
                    controlador.convocatorias.put(id, convocatoria);
                    System.out.println("Convocatoria agregada con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id de la convocatoria a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.convocatorias.containsKey(idAct)) {
                        Convocatoria convocatoriaAct = controlador.convocatorias.get(idAct);

                        System.out.println("Ingrese la nueva descripción de la convocatoria: ");
                        String nuevaDescripcion = sc.nextLine();
                        convocatoriaAct.setDescripcion(nuevaDescripcion);

                        System.out.println("Ingrese la nueva fecha de la convocatoria (YYYY-MM-DD): ");
                        String nuevaFecha = sc.nextLine();
                        convocatoriaAct.setFecha(nuevaFecha);

                        // Aquí también se podría implementar la lógica para actualizar jugadores convocados
                        System.out.println("Ingrese la lista actualizada de jugadores convocados (separados por coma): ");
                        String nuevosJugadoresConvocados = sc.nextLine();
                        convocatoriaAct.setJugadoresConvocados(nuevosJugadoresConvocados);

                        System.out.println("Convocatoria actualizada con éxito.");
                    } else {
                        System.out.println("La convocatoria con el id: " + idAct + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la convocatoria a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.convocatorias.containsKey(idBuscar)) {
                        Convocatoria convocatoriaBuscada = controlador.convocatorias.get(idBuscar);
                        System.out.println("Descripción: " + convocatoriaBuscada.getDescripcion());
                        System.out.println("Fecha: " + convocatoriaBuscada.getFecha());
                        System.out.println("Jugadores Convocados: " + convocatoriaBuscada.getJugadoresConvocados());
                    } else {
                        System.out.println("La convocatoria con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id de la convocatoria a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.convocatorias.containsKey(idEliminar)) {
                        controlador.convocatorias.remove(idEliminar);
                        System.out.println("La convocatoria con el id: " + idEliminar + " ha sido eliminada.");
                    } else {
                        System.out.println("La convocatoria con el id: " + idEliminar + " no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todas las convocatorias:");
                    for (Convocatoria convocatoria : controlador.convocatorias.values()) {
                        System.out.println("ID: " + convocatoria.getId() + ", Descripción: " + convocatoria.getDescripcion());
                        System.out.println("Fecha: " + convocatoria.getFecha());
                        System.out.println("Jugadores Convocados: " + convocatoria.getJugadoresConvocados());
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
