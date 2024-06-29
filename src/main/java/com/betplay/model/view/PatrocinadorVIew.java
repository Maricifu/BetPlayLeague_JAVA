package com.betplay.model.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Patrocinador;

public class PatrocinadorVIew {
    private Controller controlador;
    private SimpleDateFormat dateFormat;

    public PatrocinadorVIew(Controller controlador) {
        this.controlador = controlador;
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Patrocinador");
            System.out.println("2. Actualizar Patrocinador");
            System.out.println("3. Eliminar Patrocinador");
            System.out.println("4. Listar Patrocinadores");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Patrocinador patrocinador;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del patrocinador: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del patrocinador: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el tipo de patrocinio: ");
                    String tipo = sc.nextLine();

                    System.out.println("Ingrese el monto del patrocinio: ");
                    double monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la fecha de inicio del patrocinio (yyyy-MM-dd): ");
                    Date fechaInicio;
                    try {
                        fechaInicio = dateFormat.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        continue;
                    }

                    System.out.println("Ingrese la fecha de fin del patrocinio (yyyy-MM-dd): ");
                    Date fechaFin;
                    try {
                        fechaFin = dateFormat.parse(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        continue;
                    }

                    patrocinador = new Patrocinador(id, nombre, tipo, monto, fechaInicio, fechaFin);
                    controlador.patrocinadores.put(id, patrocinador);
                    break;

                case 2:
                    System.out.println("Ingrese el id del patrocinador a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.patrocinadores.containsKey(idActualizar)) {
                        patrocinador = controlador.patrocinadores.get(idActualizar);

                        System.out.println("Ingrese el nuevo nombre del patrocinador: ");
                        nombre = sc.nextLine();
                        patrocinador.setNombre(nombre);

                        System.out.println("Ingrese el nuevo tipo de patrocinio: ");
                        tipo = sc.nextLine();
                        patrocinador.setTipo(tipo);

                        System.out.println("Ingrese el nuevo monto del patrocinio: ");
                        monto = sc.nextDouble();
                        sc.nextLine();
                        patrocinador.setMonto(monto);

                        System.out.println("Ingrese la nueva fecha de inicio del patrocinio (yyyy-MM-dd): ");
                        try {
                            fechaInicio = dateFormat.parse(sc.nextLine());
                            patrocinador.setFechaInicio(fechaInicio);
                        } catch (Exception e) {
                            System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        }

                        System.out.println("Ingrese la nueva fecha de fin del patrocinio (yyyy-MM-dd): ");
                        try {
                            fechaFin = dateFormat.parse(sc.nextLine());
                            patrocinador.setFechaFin(fechaFin);
                        } catch (Exception e) {
                            System.out.println("Formato de fecha incorrecto. Utilice yyyy-MM-dd.");
                        }

                        System.out.println("Patrocinador actualizado correctamente.");
                    } else {
                        System.out.println("El patrocinador con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del patrocinador a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.patrocinadores.containsKey(idEliminar)) {
                        controlador.patrocinadores.remove(idEliminar);
                        System.out.println("El patrocinador con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El patrocinador con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de patrocinadores:");
                    for (Patrocinador p : controlador.patrocinadores.values()) {
                        System.out.println("ID: " + p.getId() + ", Nombre: " + p.getNombre() + ", Tipo: " + p.getTipo()
                                + ", Monto: " + p.getMonto() + ", Fecha Inicio: " + dateFormat.format(p.getFechaInicio())
                                + ", Fecha Fin: " + dateFormat.format(p.getFechaFin()));
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
