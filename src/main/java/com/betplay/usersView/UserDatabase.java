package com.betplay.usersView;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.betplay.model.entity.Rol;
import com.betplay.model.entity.Usuario;

public class UserDatabase {
    private Map<String, Usuario> usuarios;
    private List<Rol> roles;

    public UserDatabase() {
        this.usuarios = new HashMap<>();
        // Inicializar roles y permisos si es necesario
    }

    public void initializeDefaultUsers() {

        Rol adminRol = new Rol("1", "Administrador", null); 
        Rol entrenadorRol = new Rol("2", "Entrenador", null);
        Rol aficionadoRol = new Rol("3", "Aficionado", null);
        Rol ArbitroRol = new Rol("4", "Árbitro", null);
        Rol MedicoRol = new Rol("5", "Médico", null);
        Rol PeriodistaRol = new Rol("6", "Periodista", null);


        Usuario admin = new Usuario("1", "Admin", "admin123", "admin123", adminRol);
        Usuario entrenador = new Usuario("2", "Entrenador", "coach123", "coach123", entrenadorRol);
        Usuario aficionado = new Usuario("3", "Aficionado", "fan123", "fan123", aficionadoRol);
        Usuario arbitro = new Usuario("4", "Arbitro", "arbitro123", "arbitro123", ArbitroRol);
        Usuario medico = new Usuario("5", "Médico", "medico123", "medico123", MedicoRol);
        Usuario periodista = new Usuario("6", "Periodista", "periodista123", "periodista123", PeriodistaRol);

        usuarios.put(admin.getId(), admin);
        usuarios.put(entrenador.getId(), entrenador);
        usuarios.put(aficionado.getId(), aficionado);
        usuarios.put(arbitro.getId(),arbitro);
        usuarios.put(medico.getId(),medico);
        usuarios.put(periodista.getId(),periodista);
    }

    public void addUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public Usuario getUsuario(String id) {
        return usuarios.get(id);
    }

    public void removeUsuario(String id) {
        usuarios.remove(id);
    }

    public Collection<Usuario> getUsuarios() {
        return usuarios.values();
    }

    public List<Rol> getRoles() {
        return roles;
    }

}
