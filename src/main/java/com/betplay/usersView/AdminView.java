package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.model.entity.Usuario;
import com.betplay.view.ArbitroViewcrear;
import com.betplay.view.ComunicacionView;
import com.betplay.view.EntrenadorView;
import com.betplay.view.EquipamientoView;
import com.betplay.view.EquipoView;
import com.betplay.view.EstadioView;
import com.betplay.view.IncidenteView;
import com.betplay.view.InformeView;
import com.betplay.view.JugadorView;
import com.betplay.view.MedioComunicacionView;
import com.betplay.view.NoticiaComunicadoView;
import com.betplay.view.PartidoView;
import com.betplay.view.PatrocinadorVIew;
import com.betplay.view.PremioView;
import com.betplay.view.ResultadoView;
import com.betplay.view.TransferenciaView;

public class AdminView {
    private Scanner scanner;
    private UserDatabase userDatabase;

    public AdminView(UserDatabase userDatabase) {
        this.scanner = new Scanner(System.in);
        this.userDatabase = userDatabase;
    }
    public AdminView(){

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
        EquipoView equipoview = new EquipoView();
        equipoview.start();
    }

    private void managePlayers() {
        JugadorView jugadorview = new JugadorView();
        jugadorview.start();
    }

    private void scheduleMatches() {
        PartidoView partidoview = new PartidoView();
        partidoview.start();
    }

    private void recordResults() {
        ResultadoView resultadoview = new ResultadoView();
        resultadoview.start();
    }

    private void manageNews() {
        NoticiaComunicadoView noticiacomunicadoview = new NoticiaComunicadoView();
        noticiacomunicadoview.start();
    }

    private void manageCoaches() {
        EntrenadorView entrenadorview = new EntrenadorView();
        entrenadorview.start();
    }

    private void manageReferees() {
        ArbitroViewcrear arbitroview = new ArbitroViewcrear();
        arbitroview.start();
    }

    private void manageStadiums() {
        EstadioView estadioview = new EstadioView();
        estadioview.start();
    }

    private void manageSponsorships() {
        PatrocinadorVIew patrocinadorview = new PatrocinadorVIew();
        patrocinadorview.start();
    }

    private void generateReports() {
        InformeView informeview = new InformeView();
        informeview.start();
    }

    private void manageIncidents() {
        IncidenteView incidenteview = new IncidenteView();
        incidenteview.start();
    }

    private void manageMedia() {
        MedioComunicacionView medioscom = new MedioComunicacionView();
        medioscom.start();
    }

    private void manageTransfers() {
        TransferenciaView transferenciaview = new TransferenciaView();
        transferenciaview.start();
    }

    private void manageEquipment() {
        EquipamientoView equipamientoview = new EquipamientoView();
        equipamientoview.start();
    }

    private void manageAwards() {
        PremioView premioview = new PremioView();
        premioview.start();
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
        PatrocinadorVIew patrocinadorview = new PatrocinadorVIew();
        patrocinadorview.start();
    }

    private void managePublicRelations() {
        ComunicacionView comunicacionview = new ComunicacionView();
        comunicacionview.start();
    }
}