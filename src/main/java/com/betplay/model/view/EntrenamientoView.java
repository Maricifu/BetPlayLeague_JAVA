package com.betplay.model.view;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Entrenamiento;
import com.betplay.model.entity.Jugador;

public class EntrenamientoView {
    private Controller controlador;

    public EntrenamientoView(Controller controlador) {
        this.controlador = controlador;
    }

    public EntrenamientoView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Entrenamiento");
            System.out.println("2. Actualizar Entrenamiento");
            System.out.println("3. Buscar Entrenamiento");
            System.out.println("4. Eliminar Entrenamiento");
            System.out.println("5. Listar Todos los Entrenamientos");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Entrenamiento entrenamiento;
            ArrayList<Jugador> jugadoresz = new ArrayList<>();


            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del entrenamiento: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el id del equipo: ");
                    int idEquipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese la fecha (yyyy-MM-dd): ");
                    String fechaStr = sc.nextLine();
                    Date fecha = java.sql.Date.valueOf(fechaStr);

                    System.out.println("Ingrese la hora: ");
                    String hora = sc.nextLine();

                    System.out.println("Ingrese el lugar: ");
                    String lugar = sc.nextLine();

                    System.out.println("Ingrese las actividades: ");
                    String actividades = sc.nextLine();

                    do {
                        System.out.println("Ingrese el ID del jugador:");
                        int idjugador = sc.nextInt();
                        sc.nextLine();
                        Jugador jugadors = new Jugador();
                        

                        if (controlador.jugadores.containsKey(idjugador)) {
                            jugadors= controlador.jugadores.get(idjugador);
                            jugadoresz.add(jugadors);
                        } else {
                            System.out.println("El jugador que quieres agregar no existe.");
                        }
                        
                        System.out.println("¿Quiere agregar otro jugador? \n 1: Sí \n 2: No");
                        int opcion = sc.nextInt();
                        sc.nextLine(); 
                        if (opcion == 2) {
                            break;
                        }
                    } while (true);

                    entrenamiento = new Entrenamiento(id, idEquipo, fecha, hora, lugar, actividades, jugadoresz);
                    controlador.entrenamientos.put(id, entrenamiento);
                    break;

                case 2:
                    System.out.println("Ingrese el id del entrenamiento: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entrenamientos.containsKey(idAct)) {
                        Entrenamiento entrenamientoAct = controlador.entrenamientos.get(idAct);

                        System.out.println("Ingrese el nuevo id del equipo: ");
                        int nuevoIdEquipo = sc.nextInt();
                        sc.nextLine();
                        entrenamientoAct.setIdequipo(nuevoIdEquipo);

                        System.out.println("Ingrese la nueva fecha (yyyy-MM-dd): ");
                        String nuevaFechaStr = sc.nextLine();
                        Date nuevaFecha = java.sql.Date.valueOf(nuevaFechaStr);
                        entrenamientoAct.setFecha(nuevaFecha);

                        System.out.println("Ingrese la nueva hora: ");
                        String nuevaHora = sc.nextLine();
                        entrenamientoAct.setHora(nuevaHora);

                        System.out.println("Ingrese el nuevo lugar: ");
                        String nuevoLugar = sc.nextLine();
                        entrenamientoAct.setLugar(nuevoLugar);

                        System.out.println("Ingrese las nuevas actividades: ");
                        String nuevasActividades = sc.nextLine();
                        entrenamientoAct.setActividades(nuevasActividades);

                        do {
                            System.out.println("Ingrese el ID del jugador:");
                            int idjugador = sc.nextInt();
                            sc.nextLine();
                            Jugador jugadors = new Jugador();
                            
    
                            if (controlador.jugadores.containsKey(idjugador)) {
                                jugadors= controlador.jugadores.get(idjugador);
                                jugadoresz.add(jugadors);
                            } else {
                                System.out.println("El jugador que quieres agregar no existe.");
                            }
                            
                            System.out.println("¿Quiere agregar otro jugador? \n 1: Sí \n 2: No");
                            int opcion = sc.nextInt();
                            sc.nextLine(); 
                            if (opcion == 2) {
                                break;
                            }
                        } while (true);
                        entrenamientoAct.setLstjugadores(jugadoresz);

                    } else {
                        System.out.println("El entrenamiento con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del entrenamiento: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.entrenamientos.containsKey(idBuscar)) {
                        Entrenamiento ent = controlador.entrenamientos.get(idBuscar);
                        System.out.println("ID Equipo: " + ent.getIdequipo());
                        System.out.println("Fecha: " + ent.getFecha());
                        System.out.println("Hora: " + ent.getHora());
                        System.out.println("Lugar: " + ent.getLugar());
                        System.out.println("Actividades: " + ent.getActividades());
                        System.out.println("Jugadores:");
                    for (Jugador jugador : ent.getLstjugadores()) {
                        System.out.println("- ID: " + jugador.getId()+ ", Nombre: "+ jugador.getNombre());
                    }
                    } else {
                        System.out.println("El entrenamiento con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del entrenamiento a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.entrenamientos.containsKey(idEliminar)) {
                        controlador.entrenamientos.remove(idEliminar);
                        System.out.println("El entrenamiento con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El entrenamiento con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los entrenamientos:");
                    for (Entrenamiento ent : controlador.entrenamientos.values()) {
                        System.out.println("ID: " + ent.getId() + ", ID Equipo: " + ent.getIdequipo() + ", Fecha: " + ent.getFecha() + ", Hora: " + ent.getHora() + ", Lugar: " + ent.getLugar() + ", Actividades: " + ent.getActividades());
                        for (Jugador jugador : ent.getLstjugadores()) {
                            System.out.println("- ID: " + jugador.getId()+ ", Nombre: "+ jugador.getNombre());
                        }
                        System.out.println("-----------------------------------");
                    }
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
