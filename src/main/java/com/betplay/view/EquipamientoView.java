package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Equipamiento;

public class EquipamientoView {
    private Controller controlador;

    public EquipamientoView(Controller controlador) {
        this.controlador = controlador;
    }

    public EquipamientoView() {
    }

    Equipamiento equipamiento = new Equipamiento();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Equipamiento");
            System.out.println("2. Actualizar Equipamiento");
            System.out.println("3. Buscar Equipamiento");
            System.out.println("4. Eliminar Equipamiento");
            System.out.println("5. Listar Todos los Equipamientos");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del equipamiento: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el tipo de equipamiento: ");
                    String tipo = sc.nextLine();

                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el equipo asociado: ");
                    String equipoAsociado = sc.nextLine();

                    System.out.println("Ingrese la fecha de adquisición (YYYY-MM-DD): ");
                    String fechaAdquisicion = sc.nextLine();

                    equipamiento = new Equipamiento(id, tipo, cantidad, equipoAsociado, fechaAdquisicion);
                    controlador.equipamientos.put(id, equipamiento);
                    System.out.println("Equipamiento agregado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del equipamiento a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.equipamientos.containsKey(idAct)) {
                        Equipamiento equipamientoAct = controlador.equipamientos.get(idAct);

                        System.out.println("Ingrese el nuevo tipo de equipamiento: ");
                        String nuevoTipo = sc.nextLine();
                        equipamientoAct.setTipo(nuevoTipo);

                        System.out.println("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = sc.nextInt();
                        sc.nextLine();
                        equipamientoAct.setCantidad(nuevaCantidad);

                        System.out.println("Ingrese el nuevo equipo asociado: ");
                        String nuevoEquipoAsociado = sc.nextLine();
                        equipamientoAct.setEquipoAsociado(nuevoEquipoAsociado);

                        System.out.println("Ingrese la nueva fecha de adquisición (YYYY-MM-DD): ");
                        String nuevaFechaAdquisicion = sc.nextLine();
                        equipamientoAct.setFechaAdquisicion(nuevaFechaAdquisicion);

                        System.out.println("Equipamiento actualizado con éxito.");
                    } else {
                        System.out.println("El equipamiento con el id: " + idAct + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del equipamiento a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.equipamientos.containsKey(idBuscar)) {
                        Equipamiento eq = controlador.equipamientos.get(idBuscar);
                        System.out.println("Tipo: " + eq.getTipo());
                        System.out.println("Cantidad: " + eq.getCantidad());
                        System.out.println("Equipo Asociado: " + eq.getEquipoAsociado());
                        System.out.println("Fecha de Adquisición: " + eq.getFechaAdquisicion());
                    } else {
                        System.out.println("El equipamiento con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del equipamiento a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.equipamientos.containsKey(idEliminar)) {
                        controlador.equipamientos.remove(idEliminar);
                        System.out.println("El equipamiento con el id: " + idEliminar + " ha sido eliminado.");
                    } else {
                        System.out.println("El equipamiento con el id: " + idEliminar + " no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los equipamientos:");
                    for (Equipamiento eq : controlador.equipamientos.values()) {
                        System.out.println("ID: " + eq.getId() + ", Tipo: " + eq.getTipo() + ", Cantidad: " + eq.getCantidad());
                        System.out.println("Equipo Asociado: " + eq.getEquipoAsociado() + ", Fecha de Adquisición: " + eq.getFechaAdquisicion());
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
