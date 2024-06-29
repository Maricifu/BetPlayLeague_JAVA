// package com.betplay.view;

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// import com.betplay.Controller;
// import com.betplay.model.entity.Permiso;
// import com.betplay.model.entity.Rol;

// public class RolView {
//     private Controller controlador;

//     public RolView(Controller controlador) {
//         this.controlador = controlador;
//     }

//     public RolView() {
//     }


//     public void start() {
//         Scanner sc = new Scanner(System.in);

//         while (true) {
//             System.out.println("1. Registrar Rol");
//             System.out.println("2. Actualizar Rol");
//             System.out.println("3. Eliminar Rol");
//             System.out.println("4. Listar Roles");
//             System.out.println("5. Salir");
//             int choice = sc.nextInt();
//             sc.nextLine();
//             Rol rol;

//             switch (choice) {
//                 case 1:
//                     System.out.println("Ingrese el id del rol: ");
//                     int id = sc.nextInt();
//                     sc.nextLine();

//                     System.out.println("Ingrese el nombre del rol: ");
//                     String nombre = sc.nextLine();

//                     List<Permiso> permisos = new ArrayList<>();
//                     while (true) {
//                         System.out.println("Ingrese el id del permiso (0 para terminar): ");
//                         int idPermiso = sc.nextInt();
//                         sc.nextLine();
//                         if (idPermiso == 0) {
//                             break;
//                         }
//                         Permiso permiso = controlador.permisos.get(idPermiso);
//                         if (permiso != null) {
//                             permisos.add(permiso);
//                         } else {
//                             System.out.println("Permiso no encontrado. Intente de nuevo.");
//                         }
//                     }

//                     rol = new Rol(id, nombre, permisos);
//                     controlador.roles.put(id, rol);
//                     break;

//                 case 2:
//                     System.out.println("Ingrese el id del rol a actualizar: ");
//                     int idActualizar = sc.nextInt();
//                     sc.nextLine();

//                     if (controlador.roles.containsKey(idActualizar)) {
//                         rol = controlador.roles.get(idActualizar);

//                         System.out.println("Ingrese el nuevo nombre del rol: ");
//                         nombre = sc.nextLine();
//                         rol.setNombre(nombre);

//                         permisos = new ArrayList<>();
//                         while (true) {
//                             System.out.println("Ingrese el id del permiso (0 para terminar): ");
//                             int idPermiso = sc.nextInt();
//                             sc.nextLine();
//                             if (idPermiso == 0) {
//                                 break;
//                             }
//                             Permiso permiso = controlador.permisos.get(idPermiso);
//                             if (permiso != null) {
//                                 permisos.add(permiso);
//                             } else {
//                                 System.out.println("Permiso no encontrado. Intente de nuevo.");
//                             }
//                         }
//                         rol.setIdpermisos(permisos);

//                         System.out.println("Rol actualizado correctamente.");
//                     } else {
//                         System.out.println("El rol con el id: " + idActualizar + " no existe");
//                     }
//                     break;

//                 case 3:
//                     System.out.println("Ingrese el id del rol a eliminar: ");
//                     int idEliminar = sc.nextInt();
//                     sc.nextLine();
//                     if (controlador.roles.containsKey(idEliminar)) {
//                         controlador.roles.remove(idEliminar);
//                         System.out.println("El rol con el id: " + idEliminar + " ha sido eliminado");
//                     } else {
//                         System.out.println("El rol con el id: " + idEliminar + " no existe");
//                     }
//                     break;

//                 case 4:
//                     System.out.println("Listado de roles:");
//                     for (Rol r : controlador.roles.values()) {
//                         System.out.println("ID: " + r.getId() + ", Nombre: " + r.getNombre());
//                         System.out.println("Permisos:");
//                         for (Permiso p : r.getIdpermisos()) {
//                             System.out.println("   ID Permiso: " + p.getId() + ", Descripción: " + p.getDescripcion());
//                         }
//                         System.out.println("-----------------------------------");
//                     }
//                     break;

//                 case 5:
//                     return;

//                 default:
//                     System.out.println("Opción no válida. Intente de nuevo.");
//             }
//         }
//     }
// }
