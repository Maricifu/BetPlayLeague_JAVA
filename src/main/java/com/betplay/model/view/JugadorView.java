package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Jugador;

public class JugadorView {
    private Controller controlador;

    public JugadorView(Controller controlador) {
        this.controlador = controlador;
    }

    public JugadorView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Jugador");
            System.out.println("2. Actualizar Jugador");
            System.out.println("3. Eliminar Jugador");
            System.out.println("4. Listar Jugadores");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Jugador jugador;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del jugador: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del jugador: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el apellido del jugador: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese la edad del jugador: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el dorsal del jugador: ");
                    int dorsal = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la posición del jugador: ");
                    String posicion = sc.nextLine();

                    jugador = new Jugador(id, nombre, apellido, edad, dorsal, posicion);
                    controlador.jugadores.put(id, jugador);
                    break;

                case 2:
                    System.out.println("Ingrese el id del jugador a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.jugadores.containsKey(idActualizar)) {
                        Jugador jugadorActualizar = controlador.jugadores.get(idActualizar);

                        System.out.println("Ingrese el nuevo nombre del jugador: ");
                        String nuevoNombre = sc.nextLine();
                        jugadorActualizar.setNombre(nuevoNombre);

                        System.out.println("Ingrese el nuevo apellido del jugador: ");
                        String nuevoApellido = sc.nextLine();
                        jugadorActualizar.setApellido(nuevoApellido);

                        System.out.println("Ingrese la nueva edad del jugador: ");
                        int nuevaEdad = sc.nextInt();
                        sc.nextLine();
                        jugadorActualizar.setEdad(nuevaEdad);

                        System.out.println("Ingrese el nuevo dorsal del jugador: ");
                        int nuevoDorsal = sc.nextInt();
                        sc.nextLine();
                        jugadorActualizar.setDorsal(nuevoDorsal);

                        System.out.println("Ingrese la nueva posición del jugador: ");
                        String nuevaPosicion = sc.nextLine();
                        jugadorActualizar.setPosicion(nuevaPosicion);

                        System.out.println("Jugador actualizado correctamente.");
                    } else {
                        System.out.println("El jugador con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del jugador a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.jugadores.containsKey(idEliminar)) {
                        controlador.jugadores.remove(idEliminar);
                        System.out.println("El jugador con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El jugador con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de jugadores:");
                    for (Jugador j : controlador.jugadores.values()) {
                        System.out.println("ID: " + j.getId() + ", Nombre: " + j.getNombre() + ", Apellido: " + j.getApellido()
                                + ", Edad: " + j.getEdad() + ", Dorsal: " + j.getDorsal() + ", Posición: " + j.getPosicion());
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
