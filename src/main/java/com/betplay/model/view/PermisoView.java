package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Permiso;

public class PermisoView {
    private Controller controlador;

    public PermisoView(Controller controlador) {
        this.controlador = controlador;
    }

    public PermisoView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Permiso");
            System.out.println("2. Actualizar Permiso");
            System.out.println("3. Eliminar Permiso");
            System.out.println("4. Listar Permisos");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Permiso permiso;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del permiso: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la descripción del permiso: ");
                    String descripcion = sc.nextLine();

                    permiso = new Permiso(id, descripcion);
                    controlador.permisos.put(id, permiso);
                    break;

                case 2:
                    System.out.println("Ingrese el id del permiso a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.permisos.containsKey(idActualizar)) {
                        permiso = controlador.permisos.get(idActualizar);

                        System.out.println("Ingrese la nueva descripción del permiso: ");
                        descripcion = sc.nextLine();
                        permiso.setDescripcion(descripcion);

                        System.out.println("Permiso actualizado correctamente.");
                    } else {
                        System.out.println("El permiso con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del permiso a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.permisos.containsKey(idEliminar)) {
                        controlador.permisos.remove(idEliminar);
                        System.out.println("El permiso con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El permiso con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de permisos:");
                    for (Permiso p : controlador.permisos.values()) {
                        System.out.println("ID: " + p.getId() + ", Descripción: " + p.getDescripcion());
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
