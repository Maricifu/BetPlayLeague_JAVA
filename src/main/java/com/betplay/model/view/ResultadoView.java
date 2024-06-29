package com.betplay.model.view;

import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Goles;
import com.betplay.model.entity.Resultado;

public class ResultadoView {
    private Controller controlador;

    public ResultadoView(Controller controlador) {
        this.controlador = controlador;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Registrar Resultado");
            System.out.println("2. Actualizar Resultado");
            System.out.println("3. Eliminar Resultado");
            System.out.println("4. Listar Resultados");
            System.out.println("5. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Resultado resultado;

            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del resultado: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del partido: ");
                    int idPartido = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del gol del equipo local: ");
                    int idGolLocal = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del gol del equipo visitante: ");
                    int idGolVisitante = sc.nextInt();
                    sc.nextLine();

                    Goles golLocal = controlador.goles.get(idGolLocal);
                    Goles golVisitante = controlador.goles.get(idGolVisitante);

                    resultado = new Resultado(id, idPartido, golLocal, golVisitante);
                    controlador.resultados.put(id, resultado);
                    break;

                case 2:
                    System.out.println("Ingrese el id del resultado a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.resultados.containsKey(idActualizar)) {
                        resultado = controlador.resultados.get(idActualizar);

                        System.out.println("Ingrese el nuevo id del gol del equipo local: ");
                        idGolLocal = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Ingrese el nuevo id del gol del equipo visitante: ");
                        idGolVisitante = sc.nextInt();
                        sc.nextLine();

                        golLocal = controlador.goles.get(idGolLocal);
                        golVisitante = controlador.goles.get(idGolVisitante);

                        resultado.setGolesequipolocal(golLocal);
                        resultado.setGolesequipovisitante(golVisitante);

                        System.out.println("Resultado actualizado correctamente.");
                    } else {
                        System.out.println("El resultado con el id: " + idActualizar + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del resultado a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.resultados.containsKey(idEliminar)) {
                        controlador.resultados.remove(idEliminar);
                        System.out.println("El resultado con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El resultado con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 4:
                    System.out.println("Listado de resultados:");
                    for (Resultado r : controlador.resultados.values()) {
                        System.out.println("ID: " + r.getId() + ", Partido: " + r.getIdpartido()
                                + ", Gol Equipo Local: " + r.getGolesequipolocal().getIdgol()
                                + ", Gol Equipo Visitante: " + r.getGolesequipovisitante().getIdgol());
                        System.out.println("-----------------------------------");
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
