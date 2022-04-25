package modelo;

import controlador.UsuarioController;
import java.util.ArrayList;

public class Profesor extends Usuario {

    private String codigo;
    private ArrayList<Materia> materias;

    public Profesor() {
        super();
    }

    public Profesor(String nombre, String apellido, String identificacion, String usuario, String contrasena,
            String codigo, ArrayList<Materia> materias) {
        super(nombre, apellido, identificacion, usuario, contrasena);
        this.codigo = codigo;
        this.materias = materias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

 
    public boolean iniciarSesion(ArrayList<Profesor> lista, String user, String pass) {
        boolean sesion = false;
        for (Profesor p : lista) {
            if (p.usuario.equals(user) && p.contrasena.equals(pass)) {
                sesion = true;
                UsuarioController.profeSesion = p;
            }
        }

        return sesion;
    }

}
