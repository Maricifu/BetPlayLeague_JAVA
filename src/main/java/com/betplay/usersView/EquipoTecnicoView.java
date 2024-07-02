package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.view.ConvocatoriaView;
import com.betplay.view.EntrenadorView;
import com.betplay.view.EntrenamientoView;
import com.betplay.view.EquipamientoView;
import com.betplay.view.InformeView;
import com.betplay.view.JugadorView;
import com.betplay.view.LesionView;
import com.betplay.view.PartidoView;
import com.betplay.view.RendimientoView;
import com.betplay.view.TransferenciaView;

public class EquipoTecnicoView {
    private Scanner scanner;

    public EquipoTecnicoView() {
        this.scanner = new Scanner(System.in);
    }

    public void showEquipoTecnicoMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Equipo Técnico:");
            System.out.println("------------------------------");
            System.out.println("| 1. Gestión de Jugadores          |");
            System.out.println("| 2. Visualización de Estadísticas  |");
            System.out.println("| 3. Gestión de Entrenadores       |");
            System.out.println("| 4. Generación de Informes         |");
            System.out.println("| 5. Consulta de Calendario de Partidos |");
            System.out.println("| 6. Gestión de Lesiones de Jugadores |");
            System.out.println("| 7. Gestión de Entrenamientos     |");
            System.out.println("| 8. Seguimiento de Rendimiento de Jugadores |");
            System.out.println("| 9. Gestión de Transferencias     |");
            System.out.println("| 10. Gestión de Equipamiento       |");
            System.out.println("| 11. Gestión de Convocatorias      |");
            System.out.println("| 0. Salir                         |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    managePlayers();
                    break;
                case 2:
                    viewStatistics();
                    break;
                case 3:
                    manageCoaches();
                    break;
                case 4:
                    generateReports();
                    break;
                case 5:
                    viewMatchSchedule();
                    break;
                case 6:
                    managePlayerInjuries();
                    break;
                case 7:
                    manageTrainings();
                    break;
                case 8:
                    trackPlayerPerformance();
                    break;
                case 9:
                    managePlayerTransfers();
                    break;
                case 10:
                    manageEquipment();
                    break;
                case 11:
                    managePlayerCallUps();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void managePlayers() {
        JugadorView jugadorView = new JugadorView();
        jugadorView.start();
    }

    private void viewStatistics() {
        InformeView informeView = new InformeView();
        informeView.start();
    }

    private void manageCoaches() {
        EntrenadorView entrenadorView = new EntrenadorView();
        entrenadorView.start();
    }

    private void generateReports() {
        InformeView informeView = new InformeView();
        informeView.start();
    }

    private void viewMatchSchedule() {
        PartidoView partidoView = new PartidoView();
        partidoView.start();
    }

    private void managePlayerInjuries() {
        LesionView lesionview = new LesionView();
        lesionview.start();
    }

    private void manageTrainings() {
        EntrenamientoView entrenamientoview = new EntrenamientoView();
        entrenamientoview.start();
    }

    private void trackPlayerPerformance() {
        RendimientoView rendimientoview = new RendimientoView();
        rendimientoview.start();
    }

    private void managePlayerTransfers() {
        TransferenciaView transferenciaView = new TransferenciaView();
        transferenciaView.start();
    }

    private void manageEquipment() {
        EquipamientoView equipamientoView = new EquipamientoView();
        equipamientoView.start();
    }

    private void managePlayerCallUps() {
        ConvocatoriaView convocatoriaView = new ConvocatoriaView();
        convocatoriaView.start();
    }
}
