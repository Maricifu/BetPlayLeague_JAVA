package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.view.LesionView;

public class MedicoEquipoView {
    private Scanner scanner;

    public MedicoEquipoView() {
        this.scanner = new Scanner(System.in);
    }

    public void showMedicoEquipoMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Médico del Equipo:");
            System.out.println("------------------------------");
            System.out.println("| 1. Gestión de Lesiones de Jugadores |");
            System.out.println("| 0. Salir                             |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    managePlayerInjuries();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void managePlayerInjuries() {
        LesionView lesionView = new LesionView();
        lesionView.start();
    }
}
