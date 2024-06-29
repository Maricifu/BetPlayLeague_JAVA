package com.betplay.usersView;

import java.util.*;
import com.betplay.model.entity.Permiso;
import com.betplay.model.entity.Rol;
import com.betplay.model.entity.Usuario;

public class UserDatabase {
    private Hashtable<String, Usuario> usuarios;
    private List<Rol> roles;
    private List<Permiso> permisos;

    public UserDatabase() {
        this.usuarios = new Hashtable<>();
        this.roles = new ArrayList<>();
        this.permisos = new ArrayList<>();
        initializeRolesAndPermisos();
    }

    private void initializeRolesAndPermisos() {
        // Inicializar roles y permisos de ejemplo
        Permiso permiso1 = new Permiso("1", "Gestionar equipos");
        Permiso permiso2 = new Permiso("2", "Gestionar jugadores");
        Permiso permiso3 = new Permiso("3", "Programar partidos");

        this.permisos.add(permiso1);
        this.permisos.add(permiso2);
        this.permisos.add(permiso3);

        List<Permiso> permisosAdmin = Arrays.asList(permiso1, permiso2, permiso3);
        Rol rolAdmin = new Rol("1", "Administrador", permisosAdmin);

        List<Permiso> permisosEntrenador = Arrays.asList(permiso1, permiso2);
        Rol rolEntrenador = new Rol("2", "Entrenador", permisosEntrenador);

        this.roles.add(rolAdmin);
        this.roles.add(rolEntrenador);
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

    public List<Rol> getRoles() {
        return roles;
    }

    public List<Permiso> getPermisos() {
        return permisos;
    }

    public Collection<Usuario> getUsuarios() {
        return usuarios.values();
    }
}

