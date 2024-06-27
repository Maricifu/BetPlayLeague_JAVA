package entity;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String password;
    private int idrol;
    public Usuario() {
    }
    public Usuario(int id, String nombre, String email, String password, int idrol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.idrol = idrol;
    }

    
//     id : Identificador único del usuario.
// nombre : Nombre del usuario.
// email : Correo electrónico del usuario.
// password : Contraseña del usuario.
// rol : Rol del usuario (por ejemplo, administrador, entrenador, etc.).
}
