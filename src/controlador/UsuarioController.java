package controlador;

import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.Estudiante;
import modelo.Profesor;

import modelo.persistencia.Archivo;

public class UsuarioController {

    public static Profesor profeSesion;
    public static Estudiante estudianteSesion;
    Archivo datos = new Archivo();
    Profesor profesor = new Profesor();
    Estudiante estudiante = new Estudiante();


//este metodo recibe las crecdenciales del login y las envia el metodo iniciar sesión
//y retorna el rol dependiendo en que lista se encuentre(Estudiante/ profesor) 
    public int inicioSesion(String user, String pass) throws IOException {

        if (profesor.iniciarSesion(datos.cargarProfesores(), user, pass)) {
            return 0;
        }
        if (estudiante.iniciarSesion(datos.cargarEstudiante(), user, pass)) {
            return 1;
        }
        return 2;
    }


//valida que los campos no esten vacios 
    public boolean validarCamposUsuario(JTextField user, JPasswordField pass) {
        return !(user.getText().equals("") || pass.getText().equals(""));
    }
//limpia los campos de la vista login
    public void limpiarCampos(JTextField user, JPasswordField pass) {

        user.setText("");
        pass.setText("");

    }
//limpia las advertencias 
    public void limpiarLabels(JLabel user, JLabel pass) {

        user.setText("");
        pass.setText("");

    }

}
