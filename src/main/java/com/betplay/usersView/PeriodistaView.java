package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.view.ComunicacionView;
import com.betplay.view.MedioComunicacionView;
import com.betplay.view.NoticiaComunicadoView;
import com.betplay.view.PartidoView;

public class PeriodistaView {
    private Scanner scanner;

    public PeriodistaView() {
        this.scanner = new Scanner(System.in);
    }

    public void showPeriodistaMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Periodista:");
            System.out.println("------------------------------");
            System.out.println("| 1. Visualización de Estadísticas   |");
            System.out.println("| 2. Gestión de Noticias y Comunicados|");
            System.out.println("| 3. Consulta de Calendario de Partidos|");
            System.out.println("| 4. Gestión de Medios de Comunicación|");
            System.out.println("| 5. Gestión de Relaciones Públicas  |");
            System.out.println("| 0. Salir                           |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    viewStatistics();
                    break;
                case 2:
                    manageNews();
                    break;
                case 3:
                    viewMatchSchedule();
                    break;
                case 4:
                    manageMedia();
                    break;
                case 5:
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

    private void viewStatistics() {
        //falta por implementar
    }

    private void manageNews() {
        NoticiaComunicadoView noticiaComunicadoView = new NoticiaComunicadoView();
        noticiaComunicadoView.start();
    }

    private void viewMatchSchedule() {
        PartidoView partidoView = new PartidoView();
        partidoView.start();
    }

    private void manageMedia() {
        MedioComunicacionView medioComunicacionView = new MedioComunicacionView();
        medioComunicacionView.start();
    }

    private void managePublicRelations() {
        ComunicacionView comunicacionView = new ComunicacionView();
        comunicacionView.start();
    }
}
