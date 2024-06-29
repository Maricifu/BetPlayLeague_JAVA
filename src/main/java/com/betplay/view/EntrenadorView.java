package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Entrenador;

public class EntrenadorView {
    private Controller controlador;

    public EntrenadorView(Controller controlador) {
        this.controlador = controlador;
    }

    public EntrenadorView() {
    }
    Entrenador entrenador = new Entrenador();


    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Entrenador");
            System.out.println("2. Actualizar Entrenador");
            System.out.println("3. Buscar Entrenador");
            System.out.println("4. Eliminar Entrenador");
            System.out.println("5. Listar Todos los Entrenadores");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del entrenador: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el apellido: ");
                    String apellido = sc.nextLine();

                    System.out.println("Ingrese la edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id de la federación: ");
                    int idFederacion = sc.nextInt();
                    sc.nextLine();

                    entrenador = new Entrenador(id, nombre, apellido, edad, idFederacion);
                    controlador.entrenadores.put(id, entrenador);
                    break;

                case 2:
                    System.out.println("Ingrese el id del entrenador: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entrenadores.containsKey(idAct)) {
                        Entrenador entrenadorAct = controlador.entrenadores.get(idAct);

                        System.out.println("Ingrese el nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();
                        entrenadorAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese el nuevo apellido: ");
                        String nuevoApellido = sc.nextLine();
                        entrenadorAct.setApellido(nuevoApellido);

                        System.out.println("Ingrese la nueva edad: ");
                        int nuevaEdad = sc.nextInt();
                        sc.nextLine();
                        entrenadorAct.setEdad(nuevaEdad);

                        System.out.println("Ingrese el nuevo id de la federación: ");
                        int nuevoIdFederacion = sc.nextInt();
                        sc.nextLine();
                        entrenadorAct.setIdFederacion(nuevoIdFederacion);

                    } else {
                        System.out.println("El entrenador con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del entrenador: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entrenadores.containsKey(idBuscar)) {
                        Entrenador ent = controlador.entrenadores.get(idBuscar);
                        System.out.println("Nombre: " + ent.getNombre());
                        System.out.println("Apellido: " + ent.getApellido());
                        System.out.println("Edad: " + ent.getEdad());
                        System.out.println("ID Federación: " + ent.getIdFederacion());
                    } else {
                        System.out.println("El entrenador con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del entrenador a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.entrenadores.containsKey(idEliminar)) {
                        controlador.entrenadores.remove(idEliminar);
                        System.out.println("El entrenador con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El entrenador con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los entrenadores:");
                    for (Entrenador ent : controlador.entrenadores.values()) {
                        System.out.println("ID: " + ent.getId() + ", Nombre: " + ent.getNombre() + ", Apellido: " + ent.getApellido() + ", Edad: " + ent.getEdad() + ", ID Federación: " + ent.getIdFederacion());
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
