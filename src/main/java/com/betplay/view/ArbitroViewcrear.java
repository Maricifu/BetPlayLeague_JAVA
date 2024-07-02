package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Arbitro;

public class ArbitroViewcrear {
    private Controller controlador;

    public ArbitroViewcrear(Controller controlador) {
        this.controlador = controlador;
    }

    public ArbitroViewcrear() {
    }

    Arbitro arbitro = new Arbitro();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Árbitro");
            System.out.println("2. Actualizar Árbitro");
            System.out.println("3. Buscar Árbitro");
            System.out.println("4. Eliminar Árbitro");
            System.out.println("5. Listar Todos los Árbitros");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del árbitro: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese los años de experiencia: ");
                    int experiencia = sc.nextInt();
                    sc.nextLine();

                    arbitro = new Arbitro(id, nombre, experiencia);
                    controlador.arbitros.put(id, arbitro);
                    break;

                case 2:
                    System.out.println("Ingrese el id del árbitro: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.arbitros.containsKey(idAct)) {
                        Arbitro arbitroAct = controlador.arbitros.get(idAct);

                        System.out.println("Ingrese el nuevo nombre: ");
                        String nuevoNombre = sc.nextLine();
                        arbitroAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese los nuevos años de experiencia: ");
                        int nuevaExperiencia = sc.nextInt();
                        sc.nextLine();
                        arbitroAct.setExperiencia(nuevaExperiencia);

                    } else {
                        System.out.println("El árbitro con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del árbitro: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.arbitros.containsKey(idBuscar)) {
                        Arbitro arb = controlador.arbitros.get(idBuscar);
                        System.out.println("Nombre: " + arb.getNombre());
                        System.out.println("Años de experiencia: " + arb.getExperiencia());
                    } else {
                        System.out.println("El árbitro con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del árbitro a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.arbitros.containsKey(idEliminar)) {
                        controlador.arbitros.remove(idEliminar);
                        System.out.println("El árbitro con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El árbitro con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los árbitros:");
                    for (Arbitro arb : controlador.arbitros.values()) {
                        System.out.println("ID: " + arb.getId() + ", Nombre: " + arb.getNombre() + ", Años de experiencia: " + arb.getExperiencia());
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
