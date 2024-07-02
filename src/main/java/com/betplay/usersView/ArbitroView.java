package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.view.IncidenteView;
import com.betplay.view.ResultadoView;

public class ArbitroView {
    private Scanner scanner;
    private UserDatabase userDatabase;

    public ArbitroView(UserDatabase userDatabase) {
        this.scanner = new Scanner(System.in);
        this.userDatabase = userDatabase;
    }

    public ArbitroView() {
    }

    public void showArbitroMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Árbitro:");
            System.out.println("------------------------------");
            System.out.println("| 1. Registro de Resultados  |");
            System.out.println("| 2. Gestión de Incidentes   |");
            System.out.println("| 0. Salir                   |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int eleccion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (eleccion) {
                case 1:
                    ResultadoView resultadoView = new ResultadoView();
                    resultadoView.start();
                    break;
                case 2:
                    while (true) {
                        System.out.println("\nGestión de Incidentes:");
                        System.out.println("-------------------------------");
                        System.out.println("| 1. Registrar Incidente      |");
                        System.out.println("| 0. Volver al Menú Principal |");
                        System.out.println("-------------------------------");
                        System.out.print("Opción: ");
            
                        int choice = scanner.nextInt();
                        scanner.nextLine(); 
            
                        switch (choice) {
                            case 1 -> {
                                IncidenteView incidenteView = new IncidenteView();
                                incidenteView.start();
                            }
                            case 0 -> {
                                return;
                            }
                            default -> System.out.println("Opción inválida. Intente de nuevo.");
                        }
                    }
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
