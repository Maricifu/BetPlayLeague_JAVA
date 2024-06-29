package com.betplay.model.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Transferencia;

public class TransferenciaView {
    private Controller controlador;

    public TransferenciaView(Controller controlador) {
        this.controlador = controlador;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Transferencia");
            System.out.println("2. Actualizar Transferencia");
            System.out.println("3. Eliminar Transferencia");
            System.out.println("4. Listar Transferencias");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Transferencia transferencia;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la transferencia: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del jugador: ");
                    int idJugador = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del equipo origen: ");
                    int idEquipoOrigen = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del equipo destino: ");
                    int idEquipoDestino = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el monto de la transferencia: ");
                    double monto = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la fecha de la transferencia (Formato: dd/MM/yyyy): ");
                    String fechaString = sc.nextLine();
                    Date fecha = null;
                    try {
                        fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
                    } catch (Exception e) {
                        System.out.println("Error al parsear la fecha. Utilice el formato dd/MM/yyyy.");
                        break;
                    }

                    transferencia = new Transferencia(id, idJugador, idEquipoOrigen, idEquipoDestino, monto, fecha);
                    controlador.transferencias.put(id, transferencia);
                    System.out.println("Transferencia registrada correctamente.");
                    break;

                case 2:
                    System.out.println("Ingrese el id de la transferencia a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.transferencias.containsKey(idActualizar)) {
                        transferencia = controlador.transferencias.get(idActualizar);

                        System.out.println("Ingrese el nuevo id del jugador: ");
                        idJugador = sc.nextInt();
                        sc.nextLine();
                        transferencia.setIdjugador(idJugador);

                        System.out.println("Ingrese el nuevo id del equipo origen: ");
                        idEquipoOrigen = sc.nextInt();
                        sc.nextLine();
                        transferencia.setIdequipoorigen(idEquipoOrigen);

                        System.out.println("Ingrese el nuevo id del equipo destino: ");
                        idEquipoDestino = sc.nextInt();
                        sc.nextLine();
                        transferencia.setIdequipodestino(idEquipoDestino);

                        System.out.println("Ingrese el nuevo monto de la transferencia: ");
                        monto = sc.nextDouble();
                        sc.nextLine();
                        transferencia.setMonto(monto);

                        System.out.println("Ingrese la nueva fecha de la transferencia (Formato: dd/MM/yyyy): ");
                        fechaString = sc.nextLine();
                        try {
                            fecha = new SimpleDateFormat("dd/MM/yyyy").parse(fechaString);
                            transferencia.setFecha(fecha);
                        } catch (Exception e) {
                            System.out.println("Error al parsear la fecha. Utilice el formato dd/MM/yyyy.");
                            break;
                        }

                        System.out.println("Transferencia actualizada correctamente.");
                    } else {
                        System.out.println("La transferencia con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la transferencia a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.transferencias.containsKey(idEliminar)) {
                        controlador.transferencias.remove(idEliminar);
                        System.out.println("La transferencia con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La transferencia con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de transferencias:");
                    for (Transferencia t : controlador.transferencias.values()) {
                        System.out.println("ID: " + t.getId() + ", ID Jugador: " + t.getIdjugador()
                                + ", ID Equipo Origen: " + t.getIdequipoorigen() + ", ID Equipo Destino: "
                                + t.getIdequipodestino() + ", Monto: " + t.getMonto() + ", Fecha: "
                                + new SimpleDateFormat("dd/MM/yyyy").format(t.getFecha()));
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
