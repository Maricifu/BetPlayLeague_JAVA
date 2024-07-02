package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Informe;

public class InformeView {
    private Controller controlador;

    public InformeView(Controller controlador) {
        this.controlador = controlador;
    }

    public InformeView() {
    }

    Informe informe = new Informe();

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Generar Informe");
            System.out.println("2. Actualizar Informe");
            System.out.println("3. Buscar Informe");
            System.out.println("4. Eliminar Informe");
            System.out.println("5. Listar Todos los Informes");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del informe: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el tipo de informe: ");
                    String tipo = sc.nextLine();

                    // Aquí se recopila la información necesaria y se genera el contenido del informe
                    String contenido = "Contenido generado del informe sobre " + tipo;

                    informe = new Informe(id, tipo, contenido);
                    controlador.informes.put(id, informe);
                    System.out.println("Informe generado con éxito.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del informe a actualizar: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.informes.containsKey(idAct)) {
                        Informe informeAct = controlador.informes.get(idAct);

                        System.out.println("Ingrese el nuevo tipo de informe: ");
                        String nuevoTipo = sc.nextLine();
                        informeAct.setTipo(nuevoTipo);

                        // Aquí se puede actualizar el contenido del informe
                        System.out.println("Ingrese el nuevo contenido del informe: ");
                        String nuevoContenido = sc.nextLine();
                        informeAct.setContenido(nuevoContenido);

                        System.out.println("Informe actualizado con éxito.");
                    } else {
                        System.out.println("El informe con el id: " + idAct + " no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del informe a buscar: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.informes.containsKey(idBuscar)) {
                        Informe inf = controlador.informes.get(idBuscar);
                        System.out.println("Tipo de informe: " + inf.getTipo());
                        System.out.println("Contenido: " + inf.getContenido());
                    } else {
                        System.out.println("El informe con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del informe a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.informes.containsKey(idEliminar)) {
                        controlador.informes.remove(idEliminar);
                        System.out.println("El informe con el id: " + idEliminar + " ha sido eliminado.");
                    } else {
                        System.out.println("El informe con el id: " + idEliminar + " no existe.");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los informes:");
                    for (Informe inf : controlador.informes.values()) {
                        System.out.println("ID: " + inf.getId() + ", Tipo: " + inf.getTipo());
                        System.out.println("Contenido: " + inf.getContenido());
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
    