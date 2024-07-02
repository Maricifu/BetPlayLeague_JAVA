package com.betplay.usersView;

import java.util.Scanner;
import com.betplay.model.entity.Permiso;
import com.betplay.model.entity.Rol;
import com.betplay.model.entity.Usuario;

public class LoginView {
    private Scanner scanner;
    private UserDatabase userDatabase;

    public LoginView(UserDatabase userDatabase) {
        this.scanner = new Scanner(System.in);
        this.userDatabase = userDatabase;
    }

    public void showLogin() {
        System.out.println("Bienvenido al Sistema de la Liga de Fútbol");
        System.out.println(" ,-------------------------,");
        System.out.println(" |    Ingrese su Email:    |");
        System.out.println(" '-------------------------'");
        String email = scanner.nextLine();
        System.out.println(" ,-------------------------,");
        System.out.println(" |  Ingrese su Contraseña: |");
        System.out.println(" '-------------------------'");
        String password = scanner.nextLine();

        Usuario usuario = authenticateUser(email, password);
        if (usuario != null) {
            redirectUser(usuario);
        } else {
            System.out.println("Credenciales incorrectas. Intente de nuevo.");
        }
    }

    private Usuario authenticateUser(String email, String password) {
        for (Usuario usuario : userDatabase.getUsuarios()) {
            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    private void redirectUser(Usuario usuario) {
        Rol rol = usuario.getIdrol();
        switch (rol.getNombre()) {
            case "Administrador":
                AdminView adminView = new AdminView(userDatabase);
                adminView.showAdminMenu();
                break;
            case "Entrenador":
                EquipoTecView equipoTecView = new EquipoTecView();
                equipoTecView.showEquipoTecMenu();
                break;
            case "Aficionado":
                FanView fanView = new FanView();
                fanView.showFanMenu();
                break;
            case "Árbitro":
                ArbitroView arbitroView = new ArbitroView();
                arbitroView.showArbitroMenu();
                break;
            case "Periodista":
                PeriodistaView periodistaView = new PeriodistaView();
                periodistaView.showPeriodistaMenu();
                break;
            case "Médico":
                MedicoView medicoView = new MedicoView();
                medicoView.showMedicoMenu();
                break;
            default:
                System.out.println("Rol desconocido. No se puede redirigir.");
        }
    }
}

