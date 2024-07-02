package com.betplay;

import java.util.Scanner;

import com.betplay.usersView.LoginView;
import com.betplay.usersView.UserDatabase;

public class Main {
    public static void main(String[] args) {

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
                    UserDatabase userDatabase = new UserDatabase();
                    userDatabase.initializeDefaultUsers(); // Inicializar usuarios predeterminados
                    LoginView loginView = new LoginView(userDatabase);
                    loginView.showLogin();
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
