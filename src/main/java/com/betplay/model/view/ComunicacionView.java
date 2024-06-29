package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Comunicacion;

public class ComunicacionView {
    private Controller controlador;

    public ComunicacionView() {
    }

    public ComunicacionView(Controller controlador) {
        this.controlador = controlador;
    }

    public void start(){
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear comunicacion");
            System.out.println("2. Actualizar comunicacion");
            System.out.println("3. Buscar comunicacion");
            System.out.println("4. Eliminar comunicacion");
            System.out.println("5. Listar Todas las comunicacion");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Comunicacion comunicacion;

            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Opcion invalida, intentelo de nuevo.");
            }
        }
    }
}
