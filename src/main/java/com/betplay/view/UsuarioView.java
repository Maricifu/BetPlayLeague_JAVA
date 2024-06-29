package com.betplay.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Usuario;

public class UsuarioView {
    private Controller controlador;

    public UsuarioView(Controller controlador) {
        this.controlador = controlador;
    }

    public UsuarioView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Usuario");
            System.out.println("2. Actualizar Usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Listar Usuarios");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Usuario usuario;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del usuario: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese el email del usuario: ");
                    String email = sc.nextLine();

                    System.out.println("Ingrese la contraseña del usuario: ");
                    String password = sc.nextLine();

                    System.out.println("Ingrese el id del rol del usuario: ");
                    int idRol = sc.nextInt();
                    sc.nextLine();

                    usuario = new Usuario(id, nombre, email, password, idRol);
                    controlador.usuarios.put(id, usuario);
                    System.out.println("Usuario registrado correctamente.");
                    break;

                case 2:
                    System.out.println("Ingrese el id del usuario a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.usuarios.containsKey(idActualizar)) {
                        usuario = controlador.usuarios.get(idActualizar);

                        System.out.println("Ingrese el nuevo nombre del usuario: ");
                        nombre = sc.nextLine();
                        usuario.setNombre(nombre);

                        System.out.println("Ingrese el nuevo email del usuario: ");
                        email = sc.nextLine();
                        usuario.setEmail(email);

                        System.out.println("Ingrese la nueva contraseña del usuario: ");
                        password = sc.nextLine();
                        usuario.setPassword(password);

                        System.out.println("Ingrese el nuevo id del rol del usuario: ");
                        idRol = sc.nextInt();
                        sc.nextLine();
                        usuario.setIdrol(idRol);

                        System.out.println("Usuario actualizado correctamente.");
                    } else {
                        System.out.println("El usuario con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del usuario a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.usuarios.containsKey(idEliminar)) {
                        controlador.usuarios.remove(idEliminar);
                        System.out.println("El usuario con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El usuario con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de usuarios:");
                    for (Usuario u : controlador.usuarios.values()) {
                        System.out.println("ID: " + u.getId() + ", Nombre: " + u.getNombre() + ", Email: "
                                + u.getEmail() + ", Rol: " + u.getIdrol());
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
