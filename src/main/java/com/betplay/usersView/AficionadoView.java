package com.betplay.usersView;

import java.util.Scanner;

import com.betplay.view.EntradaView;
import com.betplay.view.PartidoView;

public class AficionadoView {
    private Scanner scanner;

    public AficionadoView() {
        this.scanner = new Scanner(System.in);
    }

    public void showAficionadoMenu() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de Aficionado:");
            System.out.println("------------------------------");
            System.out.println("| 1. Venta de Entradas          |");
            System.out.println("| 2. Consulta de Calendario de Partidos |");
            System.out.println("| 0. Salir                      |");
            System.out.println("------------------------------");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    sellTickets();
                    break;
                case 2:
                    viewMatchSchedule();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void sellTickets() {
        EntradaView entradaView = new EntradaView();
        entradaView.start();
    }

    private void viewMatchSchedule() {
        PartidoView partidoView = new PartidoView();
        partidoView.start();
    }
}
