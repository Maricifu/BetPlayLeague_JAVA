package com.betplay.model.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Entrada;

public class EntradaView {
    private Controller controlador;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public EntradaView(Controller controlador) {
        this.controlador = controlador;
    }

    public EntradaView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Entrada");
            System.out.println("2. Actualizar Entrada");
            System.out.println("3. Buscar Entrada");
            System.out.println("4. Eliminar Entrada");
            System.out.println("5. Listar Todas las Entradas");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Entrada entrada;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id de la entrada: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el partido: ");
                    String partido = sc.nextLine();

                    System.out.println("Ingrese el comprador: ");
                    String comprador = sc.nextLine();

                    System.out.println("Ingrese la fecha de compra (dd/MM/yyyy): ");
                    String fechaCompraStr = sc.nextLine();
                    Date fechaCompra = null;
                    try {
                        fechaCompra = dateFormat.parse(fechaCompraStr);
                    } catch (ParseException e) {
                        System.out.println("Fecha no válida. Intente de nuevo.");
                        break;
                    }

                    System.out.println("Ingrese la cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el precio total: ");
                    double precioTotal = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Ingrese la ubicacion: ");
                    String ubicacion = sc.nextLine();

                    entrada = new Entrada(id, partido, comprador, fechaCompra, cantidad, precioTotal, ubicacion);
                    controlador.entradas.put(id, entrada);
                    break;

                case 2:
                    System.out.println("Ingrese el id de la entrada: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entradas.containsKey(idAct)) {
                        Entrada entradaAct = controlador.entradas.get(idAct);

                        System.out.println("Ingrese el nuevo partido: ");
                        String nuevoPartido = sc.nextLine();
                        entradaAct.setPartido(nuevoPartido);

                        System.out.println("Ingrese el nuevo comprador: ");
                        String nuevoComprador = sc.nextLine();
                        entradaAct.setComprador(nuevoComprador);

                        System.out.println("Ingrese la nueva fecha de compra (dd/MM/yyyy): ");
                        String nuevaFechaCompraStr = sc.nextLine();
                        Date nuevaFechaCompra = null;
                        try {
                            nuevaFechaCompra = dateFormat.parse(nuevaFechaCompraStr);
                        } catch (ParseException e) {
                            System.out.println("Fecha no válida. Intente de nuevo.");
                            break;
                        }
                        entradaAct.setFechaCompra(nuevaFechaCompra);

                        System.out.println("Ingrese la nueva cantidad: ");
                        int nuevaCantidad = sc.nextInt();
                        sc.nextLine();
                        entradaAct.setCantidad(nuevaCantidad);

                        System.out.println("Ingrese el nuevo precio total: ");
                        double nuevoPrecioTotal = sc.nextDouble();
                        sc.nextLine();
                        entradaAct.setPrecioTotal(nuevoPrecioTotal);

                        System.out.println("Ingrese la nueva ubicacion: ");
                        String nuevaUbicacion = sc.nextLine();
                        entradaAct.setUbicacion(nuevaUbicacion);

                    } else {
                        System.out.println("La entrada con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id de la entrada: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entradas.containsKey(idBuscar)) {
                        Entrada ent = controlador.entradas.get(idBuscar);
                        System.out.println("Partido: " + ent.getPartido());
                        System.out.println("Comprador: " + ent.getComprador());
                        System.out.println("Fecha de compra: " + dateFormat.format(ent.getFechaCompra()));
                        System.out.println("Cantidad: " + ent.getCantidad());
                        System.out.println("Precio Total: " + ent.getPrecioTotal());
                        System.out.println("Ubicación: " + ent.getUbicacion());
                    } else {
                        System.out.println("La entrada con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id de la entrada a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.entradas.containsKey(idEliminar)) {
                        controlador.entradas.remove(idEliminar);
                        System.out.println("La entrada con el id: " + idEliminar + " ha sido eliminada");
                    } else {
                        System.out.println("La entrada con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todas las entradas:");
                    for (Entrada ent : controlador.entradas.values()) {
                        System.out.println("ID: " + ent.getId() + ", Partido: " + ent.getPartido() + ", Comprador: " + ent.getComprador() + ", Fecha de Compra: " + dateFormat.format(ent.getFechaCompra()) + ", Cantidad: " + ent.getCantidad() + ", Precio Total: " + ent.getPrecioTotal() + ", Ubicación: " + ent.getUbicacion());
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
