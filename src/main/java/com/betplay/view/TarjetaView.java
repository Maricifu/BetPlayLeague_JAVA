package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Tarjeta;

public class TarjetaView {
    private Controller controlador;

    public TarjetaView(Controller controlador) {
        this.controlador = controlador;
    }

    public TarjetaView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Tarjeta");
            System.out.println("2. Actualizar Tarjeta");
            System.out.println("3. Eliminar Tarjeta");
            System.out.println("4. Listar Tarjetas");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Tarjeta tarjeta;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la tarjeta: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del jugador: ");
                    int idJugador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del partido: ");
                    int idPartido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el tipo de tarjeta (Roja/Amarilla): ");
                    String tipo = sc.nextLine();

                    System.out.println("Ingrese el minuto de la tarjeta: ");
                    String minuto = sc.nextLine();

                    tarjeta = new Tarjeta(id, idJugador, idPartido, tipo, minuto);
                    controlador.tarjetas.put(id, tarjeta);
                    break;

                case 2:
                    System.out.println("Ingrese el id de la tarjeta a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.tarjetas.containsKey(idActualizar)) {
                        tarjeta = controlador.tarjetas.get(idActualizar);

                        System.out.println("Ingrese el nuevo id del jugador: ");
                        idJugador = sc.nextInt();
                        sc.nextLine();
                        tarjeta.setIdjugador(idJugador);

                        System.out.println("Ingrese el nuevo id del partido: ");
                        idPartido = sc.nextInt();
                        sc.nextLine();
                        tarjeta.setIdpartido(idPartido);

                        System.out.println("Ingrese el nuevo tipo de tarjeta (Roja/Amarilla): ");
                        tipo = sc.nextLine();
                        tarjeta.setTipo(tipo);

                        System.out.println("Ingrese el nuevo minuto de la tarjeta: ");
                        minuto = sc.nextLine();
                        tarjeta.setMinuto(minuto);

                        System.out.println("Tarjeta actualizada correctamente.");
                    } else {
                        System.out.println("La tarjeta con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la tarjeta a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.tarjetas.containsKey(idEliminar)) {
                        controlador.tarjetas.remove(idEliminar);
                        System.out.println("La tarjeta con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La tarjeta con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de tarjetas:");
                    for (Tarjeta t : controlador.tarjetas.values()) {
                        System.out.println("ID: " + t.getId() + ", ID Jugador: " + t.getIdjugador()
                                + ", ID Partido: " + t.getIdpartido() + ", Tipo: " + t.getTipo()
                                + ", Minuto: " + t.getMinuto());
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
