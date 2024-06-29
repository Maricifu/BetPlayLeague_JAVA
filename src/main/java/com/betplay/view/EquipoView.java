package com.betplay.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.betplay.Controller;
import com.betplay.model.entity.Entrenador;
import com.betplay.model.entity.Equipo;
import com.betplay.model.entity.Jugador;

public class EquipoView {
    private Controller controlador;

    public EquipoView(Controller controlador) {
        this.controlador = controlador;
    }

    public EquipoView() {
    }

    public void start() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar Todos los Equipos");
            System.out.println("6. Salir");
            int choice = sc.nextInt();
            sc.nextLine();
            Equipo equipo;
            ArrayList<Jugador> jugadoresz = new ArrayList<>();
            ArrayList<Entrenador> entrenadorz = new ArrayList<>();



            switch (choice) {
                case 1:
                    System.out.println("Ingrese el id del equipo: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese el nombre del equipo: ");
                    String nombre = sc.nextLine();

                    System.out.println("Ingrese la ciudad: ");
                    String ciudad = sc.nextLine();

                    System.out.println("Ingrese el estadio: ");
                    String estadio = sc.nextLine();

                    // Crear lista de jugadores (puedes implementarlo según tus necesidades)
                    List<Jugador> jugadores = null; // Aquí deberías implementar la lógica para crear la lista de jugadores

                    // Crear lista de entrenadores (puedes implementarlo según tus necesidades)
                    List<Entrenador> entrenadores = null; // Aquí deberías implementar la lógica para crear la lista de entrenadores

                    equipo = new Equipo(id, nombre, ciudad, estadio, jugadores, entrenadores);
                    controlador.equipos.put(id, equipo);
                    break;

                case 2:
                    System.out.println("Ingrese el id del equipo: ");
                    int idAct = sc.nextInt();
                    sc.nextLine();

                    if (controlador.equipos.containsKey(idAct)) {
                        Equipo equipoAct = controlador.equipos.get(idAct);

                        System.out.println("Ingrese el nuevo nombre del equipo: ");
                        String nuevoNombre = sc.nextLine();
                        equipoAct.setNombre(nuevoNombre);

                        System.out.println("Ingrese la nueva ciudad: ");
                        String nuevaCiudad = sc.nextLine();
                        equipoAct.setCiudad(nuevaCiudad);

                        System.out.println("Ingrese el nuevo estadio: ");
                        String nuevoEstadio = sc.nextLine();
                        equipoAct.setEstadio(nuevoEstadio);

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
                        equipoAct.setLstJugadores(jugadoresz);

                        do {
                            System.out.println("Ingrese el ID del Entrenador:");
                            int identrenador = sc.nextInt();
                            sc.nextLine();
                            Entrenador entrenador = new Entrenador();
                            
    
                            if (controlador.entrenadores.containsKey(identrenador)) {
                                entrenador= controlador.entrenadores.get(identrenador);
                                entrenadorz.add(entrenador);
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
                        equipoAct.setLstEntrenadores(entrenadorz);

                    } else {
                        System.out.println("El equipo con el id: " + idAct + " no existe");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese el id del equipo: ");
                    int idBuscar = sc.nextInt();
                    sc.nextLine();

                    if (controlador.equipos.containsKey(idBuscar)) {
                        Equipo eq = controlador.equipos.get(idBuscar);
                        System.out.println("Nombre: " + eq.getNombre());
                        System.out.println("Ciudad: " + eq.getCiudad());
                        System.out.println("Estadio: " + eq.getEstadio());
                        for (Jugador jugador : eq.getLstJugadores()) {
                            System.out.println("- ID: " + jugador.getId()+ ", Nombre: "+ jugador.getNombre());
                        }
                        for (Entrenador entrenador : eq.getLstEntrenadores()) {
                            System.out.println("- ID: " + entrenador.getId()+ ", Nombre: "+ entrenador.getNombre());
                        }
                    } else {
                        System.out.println("El equipo con el id: " + idBuscar + " no existe.");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese el id del equipo a eliminar: ");
                    int idEliminar = sc.nextInt();
                    sc.nextLine();
                    if (controlador.equipos.containsKey(idEliminar)) {
                        controlador.equipos.remove(idEliminar);
                        System.out.println("El equipo con el id: " + idEliminar + " ha sido eliminado");
                    } else {
                        System.out.println("El equipo con el id: " + idEliminar + " no existe");
                    }
                    break;

                case 5:
                    System.out.println("Listado de todos los equipos:");
                    for (Equipo eq : controlador.equipos.values()) {
                        System.out.println("ID: " + eq.getId() + ", Nombre: " + eq.getNombre() + ", Ciudad: " + eq.getCiudad() + ", Estadio: " + eq.getEstadio());
                        for (Jugador jugador : eq.getLstJugadores()) {
                            System.out.println("- ID: " + jugador.getId()+ ", Nombre: "+ jugador.getNombre());
                        }
                        for (Entrenador entrenador : eq.getLstEntrenadores()) {
                            System.out.println("- ID: " + entrenador.getId()+ ", Nombre: "+ entrenador.getNombre());
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
