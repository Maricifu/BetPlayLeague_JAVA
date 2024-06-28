package com.betplay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Controllers

        Scanner scanner = new Scanner(System.in);

        // Menú inicial
        while (true) {
            limpiarPantalla();
            System.out.println("  ██████╗ ███████╗████████╗██████╗ ██╗      █████╗ ██╗   ██╗    ██╗     ███████╗ █████╗  ██████╗ ██╗   ██╗███████╗\n" + //
                                " ██╔══██╗██╔════╝╚══██╔══╝██╔══██╗██║     ██╔══██╗╚██╗ ██╔╝    ██║     ██╔════╝██╔══██╗██╔════╝ ██║   ██║██╔════╝\n" + //
                                " ██████╔╝█████╗     ██║   ██████╔╝██║     ███████║ ╚████╔╝     ██║     █████╗  ███████║██║  ███╗██║   ██║█████╗  \n" + //
                                " ██╔══██╗██╔══╝     ██║   ██╔═══╝ ██║     ██╔══██║  ╚██╔╝      ██║     ██╔══╝  ██╔══██║██║   ██║██║   ██║██╔══╝  \n" + //
                                " ██████╔╝███████╗   ██║   ██║     ███████╗██║  ██║   ██║       ███████╗███████╗██║  ██║╚██████╔╝╚██████╔╝███████╗\n" + //
                                " ╚═════╝ ╚══════╝   ╚═╝   ╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝       ╚══════╝╚══════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝");
            System.out.println("                                                                                                                ");
            System.out.println(" ,-------------------------,");
            System.out.println(" |  Seleccione una opcion: |");
            System.out.println(" |-------------------------|");
            System.out.println(" | 1. Login                |");
            System.out.println(" | 2. Salir                |");
            System.out.println(" '-------------------------'");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println(" ,------------------------------,");
                    System.out.println(" |    Seleccione su usuario:    |");
                    System.out.println(" |------------------------------|");
                    System.out.println(" | 1. Administrador de la liga  |");
                    System.out.println(" | 2. Aficionado                |");
                    System.out.println(" | 3. Equipo técnico            |");
                    System.out.println(" | 4. Arbitro                   |");
                    System.out.println(" | 5. Periodista                |");
                    System.out.println(" | 6. Médico del equipo         |");
                    System.out.println(" | 7. Volver al menu            |");
                    System.out.println(" '---------------------------- -'");
                    System.out.print("Opción: ");

                    int userChoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (userChoice) {
                        case 1 -> {
                             // administradorlogin();
                        }
                        case 2 -> {
                            // aficionadologin();
                        }
                        case 3 -> {
                            // equipotecnicologin();
                        }
                        case 4 -> {
                            // arbitrologin();
                        }
                        case 5 -> {
                            // periodistalogin();
                        }
                        case 6 -> {
                            // medicomedicologin();
                        }
                        case 7 -> {
                            return;
                        }
                        default -> System.out.println("Opción inválida. Intente de nuevo.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo de la aplicación...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    // limpiar pantalla
    private static void limpiarPantalla() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}