package com.betplay.usersView;

import java.util.Scanner;
// import com.betplay.model.entity.Permiso;
// import com.betplay.model.entity.Rol;
import com.betplay.model.entity.Usuario;

public class AdminView {
    private Scanner scanner;
    private UserDatabase userDatabase;

    public AdminView(UserDatabase userDatabase) {
        this.scanner = new Scanner(System.in);
        this.userDatabase = userDatabase;
    }

    public void showAdminMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("   Seleccione una opción:");
            System.out.println("------------------------------");
            System.out.println("| 1. Gestión de Equipos       |");
            System.out.println("| 2. Gestión de Jugadores     |");
            System.out.println("| 3. Programación de Partidos |");
            System.out.println("| 4. Registro de Resultados   |");
            System.out.println("| 5. Gestión de Noticias      |");
            System.out.println("| 6. Gestión de Entrenadores  |");
            System.out.println("| 7. Gestión de Árbitros      |");
            System.out.println("| 8. Gestión de Estadios      |");
            System.out.println("| 9. Gestión de Patrocinios   |");
            System.out.println("| 10. Generación de Informes  |");
            System.out.println("| 11. Gestión de Incidentes   |");
            System.out.println("| 12. Gestión de Medios       |");
            System.out.println("| 13. Gestión de Transferencias|");
            System.out.println("| 14. Gestión de Equipamiento |");
            System.out.println("| 15. Gestión de Premios      |");
            System.out.println("| 16. Gestión de Usuarios     |");
            System.out.println("| 17. Gestión de Patrocinadores|");
            System.out.println("| 18. Gestión de Relaciones   |");
            System.out.println("| 0. Salir                    |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manageTeams();
                    break;
                case 2:
                    managePlayers();
                    break;
                case 3:
                    scheduleMatches();
                    break;
                case 4:
                    recordResults();
                    break;
                case 5:
                    manageNews();
                    break;
                case 6:
                    manageCoaches();
                    break;
                case 7:
                    manageReferees();
                    break;
                case 8:
                    manageStadiums();
                    break;
                case 9:
                    manageSponsorships();
                    break;
                case 10:
                    generateReports();
                    break;
                case 11:
                    manageIncidents();
                    break;
                case 12:
                    manageMedia();
                    break;
                case 13:
                    manageTransfers();
                    break;
                case 14:
                    manageEquipment();
                    break;
                case 15:
                    manageAwards();
                    break;
                case 16:
                    manageUsers();
                    break;
                case 17:
                    manageSponsors();
                    break;
                case 18:
                    managePublicRelations();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void manageTeams() {
        // Lógica para gestión de equipos
        System.out.println("Gestión de Equipos - (Funcionalidad pendiente de implementar)");
    }

    private void managePlayers() {
        // Lógica para gestión de jugadores
        System.out.println("Gestión de Jugadores - (Funcionalidad pendiente de implementar)");
    }

    private void scheduleMatches() {
        // Lógica para programación de partidos
        System.out.println("Programación de Partidos - (Funcionalidad pendiente de implementar)");
    }

    private void recordResults() {
        // Lógica para registro de resultados
        System.out.println("Registro de Resultados - (Funcionalidad pendiente de implementar)");
    }

    private void manageNews() {
        // Lógica para gestión de noticias
        System.out.println("Gestión de Noticias - (Funcionalidad pendiente de implementar)");
    }

    private void manageCoaches() {
        // Lógica para gestión de entrenadores
        System.out.println("Gestión de Entrenadores - (Funcionalidad pendiente de implementar)");
    }

    private void manageReferees() {
        // Lógica para gestión de árbitros
        System.out.println("Gestión de Árbitros - (Funcionalidad pendiente de implementar)");
    }

    private void manageStadiums() {
        // Lógica para gestión de estadios
        System.out.println("Gestión de Estadios - (Funcionalidad pendiente de implementar)");
    }

    private void manageSponsorships() {
        // Lógica para gestión de patrocinios
        System.out.println("Gestión de Patrocinios - (Funcionalidad pendiente de implementar)");
    }

    private void generateReports() {
        // Lógica para generación de informes
        System.out.println("Generación de Informes - (Funcionalidad pendiente de implementar)");
    }

    private void manageIncidents() {
        // Lógica para gestión de incidentes
        System.out.println("Gestión de Incidentes - (Funcionalidad pendiente de implementar)");
    }

    private void manageMedia() {
        // Lógica para gestión de medios de comunicación
        System.out.println("Gestión de Medios - (Funcionalidad pendiente de implementar)");
    }

    private void manageTransfers() {
        // Lógica para gestión de transferencias
        System.out.println("Gestión de Transferencias - (Funcionalidad pendiente de implementar)");
    }

    private void manageEquipment() {
        // Lógica para gestión de equipamiento
        System.out.println("Gestión de Equipamiento - (Funcionalidad pendiente de implementar)");
    }

    private void manageAwards() {
        // Lógica para gestión de premios y reconocimientos
        System.out.println("Gestión de Premios - (Funcionalidad pendiente de implementar)");
    }

    private void manageUsers() {
        // Lógica para gestión de usuarios y roles
        boolean exit = false;

        while (!exit) {
            System.out.println("\nGestión de Usuarios:");
            System.out.println("------------------------------");
            System.out.println("| 1. Agregar Usuario         |");
            System.out.println("| 2. Editar Usuario          |");
            System.out.println("| 3. Eliminar Usuario        |");
            System.out.println("| 4. Volver al Menú Principal|");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addUser();
                    break;
                case 2:
                    editUser();
                    break;
                case 3:
                    deleteUser();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void addUser() {
        // System.out.println("\nAgregar Usuario:");
        // System.out.print("ID: ");
        // String id = scanner.nextLine();
        // System.out.print("Nombre: ");
        // String nombre = scanner.nextLine();
        // System.out.print("Email: ");
        // String email = scanner.nextLine();
        // System.out.print("Contraseña: ");
        // String password = scanner.nextLine();

        // System.out.println("Seleccione el Rol:");
        // // Se asume que existe un método en UserDatabase para obtener la lista de roles
        // List<Rol> roles = userDatabase.getRoles();
        // for (int i = 0; i < roles.size(); i++) {
        //     System.out.println((i + 1) + ". " + roles.get(i).getNombre());
        // }
        // int rolChoice = scanner.nextInt();
        // scanner.nextLine(); // Consume newline
        // Rol selectedRol = roles.get(rolChoice - 1);

        // Usuario nuevoUsuario = new Usuario(id, nombre, email, password, selectedRol);
        // userDatabase.addUsuario(nuevoUsuario);
        // System.out.println("Usuario agregado exitosamente.");
    }

    private void editUser() {
        // System.out.println("\nEditar Usuario:");
        // System.out.print("ID del Usuario a Editar: ");
        // String id = scanner.nextLine();

        // Usuario usuario = userDatabase.getUsuario(id);
        // if (usuario != null) {
        //     System.out.print("Nuevo Nombre (deje en blanco para mantener el actual): ");
        //     String nombre = scanner.nextLine();
        //     if (!nombre.isEmpty()) {
        //         usuario.setNombre(nombre);
        //     }
        //     System.out.print("Nuevo Email (deje en blanco para mantener el actual): ");
        //     String email = scanner.nextLine();
        //     if (!email.isEmpty()) {
        //         usuario.setEmail(email);
        //     }
        //     System.out.print("Nueva Contraseña (deje en blanco para mantener la actual): ");
        //     String password = scanner.nextLine();
        //     if (!password.isEmpty()) {
        //         usuario.setPassword(password);
        //     }

        //     System.out.println("Seleccione el nuevo Rol (deje en blanco para mantener el actual):");
        //     // Se asume que existe un método en UserDatabase para obtener la lista de roles
        //     List<Rol> roles = userDatabase.getRoles();
        //     for (int i = 0; i < roles.size(); i++) {
        //         System.out.println((i + 1) + ". " + roles.get(i).getNombre());
        //     }
        //     String rolChoiceStr = scanner.nextLine();
        //     if (!rolChoiceStr.isEmpty()) {
        //         int rolChoice = Integer.parseInt(rolChoiceStr);
        //         Rol selectedRol = roles.get(rolChoice - 1);
        //         usuario.setRol(selectedRol);
        //     }

        //     System.out.println("Usuario editado exitosamente.");
        // } else {
        //     System.out.println("Usuario no encontrado.");
        // }
    }

    private void deleteUser() {
        System.out.println("\nEliminar Usuario:");
        System.out.print("ID del Usuario a Eliminar: ");
        String id = scanner.nextLine();

        Usuario usuario = userDatabase.getUsuario(id);
        if (usuario != null) {
            userDatabase.removeUsuario(id);
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void manageSponsors() {
        // Lógica para gestión de patrocinadores
        System.out.println("Gestión de Patrocinadores - (Funcionalidad pendiente de implementar)");
    }

    private void managePublicRelations() {
        // Lógica para gestión de relaciones públicas
        System.out.println("Gestión de Relaciones Públicas - (Funcionalidad pendiente de implementar)");
    }
}