package modelo;

import controlador.UsuarioController;
import java.util.ArrayList;

public class Estudiante extends Usuario {

    

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String identificacion, String usuario, String contrasena) {
        super(nombre, apellido, identificacion, usuario, contrasena);
    }



    public boolean iniciarSesion(ArrayList<Estudiante> lista, String user, String pass) {
        boolean sesion = false;
        for (Estudiante e : lista) {
            if (e.usuario.equals(user) && e.contrasena.equals(pass)) {
                UsuarioController.estudianteSesion = e;
                sesion = true;
            }
        }

        return sesion;
    }
@Override
public String toString(){

return this.identificacion+"-"+this.nombre+" "+this.apellido;

}

}
