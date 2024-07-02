package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.MedioComunicacion;

public class MedioComunicacionView {
    private Controller controlador;

    public MedioComunicacionView(Controller controlador) {
        this.controlador = controlador;
    }

    public MedioComunicacionView() {
    }

    MedioComunicacion medio = new MedioComunicacion();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Medio de Comunicación");
            System.out.println("2. Actualizar Medio de Comunicación");
            System.out.println("3. Buscar Medio de Comunicación");
            System.out.println("4. Eliminar Medio de Comunicación");
            System.out.println("5. Listar Todos los Medios de Comunicación");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del medio de comunicación: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del medio de comunicación: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el tipo de medio: ");
                    String tipo = sc.nextLine();

                    System.out.println("Ingrese los periodistas acreditados: ");
                    String periodistasAcreditados = sc.nextLine();

                    medio = new MedioComunicacion(id, nombre, tipo, periodistasAcreditados);
                    controlador.medios.put(id, medio);
                    System.out.println("Medio de comunicación agregado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del medio de comunicación a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.medios.containsKey(idAct)) {
                        MedioComunicacion medioAct = controlador.medios.get(idAct);

                        System.out.println("Ingrese el nuevo nombre del medio de comunicación: ");
                        String nuevoNombre = sc.nextLine();
                        medioAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese el nuevo tipo de medio: ");
                        String nuevoTipo = sc.nextLine();
                        medioAct.setTipo(nuevoTipo);

                        System.out.println("Ingrese los nuevos periodistas acreditados: ");
                        String nuevosPeriodistasAcreditados = sc.nextLine();
                        medioAct.setPeriodistasAcreditados(nuevosPeriodistasAcreditados);

                        System.out.println("Medio de comunicación actualizado con éxito.");
                    } else {
                        System.out.println("El medio de comunicación con el id: " + idAct + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del medio de comunicación a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.medios.containsKey(idBuscar)) {
                        MedioComunicacion medioBuscado = controlador.medios.get(idBuscar);
                        System.out.println("Nombre: " + medioBuscado.getNombre());
                        System.out.println("Tipo: " + medioBuscado.getTipo());
                        System.out.println("Periodistas acreditados: " + medioBuscado.getPeriodistasAcreditados());
                    } else {
                        System.out.println("El medio de comunicación con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del medio de comunicación a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.medios.containsKey(idEliminar)) {
                        controlador.medios.remove(idEliminar);
                        System.out.println("El medio de comunicación con el id: " + idEliminar + " ha sido eliminado.");
                    } else {
                        System.out.println("El medio de comunicación con el id: " + idEliminar + " no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los medios de comunicación:");
                    for (MedioComunicacion medio : controlador.medios.values()) {
                        System.out.println("ID: " + medio.getId() + ", Nombre: " + medio.getNombre() + ", Tipo: " + medio.getTipo());
                        System.out.println("Periodistas acreditados: " + medio.getPeriodistasAcreditados());
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
