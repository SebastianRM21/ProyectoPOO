/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import modelo.Estudiante;
import modelo.EstudianteCurso;
import modelo.Validacion;
import modelo.persistencia.Archivo;

/**
 *
 * @author Sebastian Rosero
 */
public class EstudianteController {

    Archivo archivo = new Archivo();
    CursoController controladorCursos = new CursoController();
    Validacion validaciones = new Validacion();

//este metodo recibe un objeto de tipo estudiante y se lo pasa al metodo guardar estudiante en el archivo
    public void guardarEstudiante(Estudiante estudiante) throws IOException {
        ArrayList<Estudiante> listaEstudiantes = archivo.cargarEstudiante();
        listaEstudiantes.add(estudiante);
        archivo.guardarEstudiante(listaEstudiantes);

    }

//este metodo elimina temporalmente un estudiante
    public void eliminarEstudiante(Estudiante estudiante) throws IOException {
        ArrayList<Estudiante> listaEstudiantes = archivo.cargarEstudiante();

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getIdentificacion().equals(estudiante.getIdentificacion())) {
                listaEstudiantes.remove(i);
            }
        }

        archivo.guardarEstudiante(listaEstudiantes);

    }

//este metodo me trae la lista de los estudiantes que estan en el archivo y los pone en una tabla
    public String[][] CargarTabla() throws IOException {

        ArrayList<Estudiante> estudiantes = archivo.cargarEstudiante();

        String[][] listaTable = new String[estudiantes.size()][3];

        for (int i = 0; i < estudiantes.size(); i++) {

            listaTable[i][0] = estudiantes.get(i).getIdentificacion();
            listaTable[i][1] = estudiantes.get(i).getNombre();
            listaTable[i][2] = estudiantes.get(i).getApellido();

        }
        return listaTable;

    }

//este metodo trae una lista de todos los estudiantes del archivo y los pone en una lista(Jcombobox)
    public JComboBox listaEstudiante(JComboBox listaEstudiantes) throws IOException {

        for (Estudiante e : archivo.cargarEstudiante()) {
            listaEstudiantes.addItem(e);

        }

        return listaEstudiantes;
    }

//este metodo recibe el codigo de un curso y me trae los estudiantes que esten asignados a ese curso
    public JComboBox listaEstudianteCurso(JComboBox listaEstudiante, String Codigo) throws IOException {
        listaEstudiante.setModel(new DefaultComboBoxModel());
        for (EstudianteCurso e : archivo.cargarEstudianteCurso()) {
            if (e.getCurso().getCodigo().equals(Codigo)) {
                listaEstudiante.addItem(e.getEstudiante());
            }
        }

        return listaEstudiante;
    }

//este campo valida que los campos de la vista crear estudiante no esten vacios 
    public boolean camposVacios(String nombre, String apellido, String id, String user, String password) {

        if (nombre.equals("")) {
            return true;
        }
        if (apellido.equals("")) {
            return true;
        }
        if (id.equals("")) {
            return true;
        }
        if (user.equals("")) {
            return true;
        }
        if (password.equals("")) {
            return true;
        }
        return false;

    }

//valida que la identificacion tenga diez digitos 
    public boolean verificadorIdIgualDiez(String datos) {

        if (datos.length() == 10) {
            return true;
        }
        return false;
    }

//este metodo recibe los parametros de nombre y apellido y se los pasa al metodo que valida que no esten repetidos 
    public boolean verificadorEstRepetido(String nombre, String apellido) throws IOException {
        boolean verificarEst = validaciones.verifcacionEstudianteRepetido(archivo.cargarEstudiante(), nombre, apellido);
        return verificarEst;
    }
//este metodo recibe el parametro de identificacion  y se lo pasa al metodo que valida que no este repetido 

    public boolean verificadorEstIdRepetido(String id) throws IOException {
        boolean verificarEstIdRepetido = validaciones.verifcacionEstudianteIdRepetido(archivo.cargarEstudiante(), id);
        return verificarEstIdRepetido;
    }

//este metodo recibe el parametro nombre usuario y se lo pasa al metodo que valida que no este repetido 
    public boolean verificadorEstUserRepetido(String nombre) throws IOException {
        boolean verificarEstUserRepetido = validaciones.verifcacionEstudianteUserRepetido(archivo.cargarEstudiante(), nombre);
        return verificarEstUserRepetido;
    }

//este metodo limpia los campos de la vista crear estudiante
    public void limpiarCamposTexto(JTextField nombre, JTextField Segundonombre, JTextField apellido, JTextField Segundoapellido, JTextField id, JTextField user, JTextField password) {
        nombre.setText("");
        Segundonombre.setText("");
        apellido.setText("");
        Segundoapellido.setText("");
        id.setText("");
        user.setText("");
        password.setText("");

    }

//este metodo valida que la contraseña sea mayor o igual a 7 caracteres 
    public boolean verificarTamanoContrasena(int tamanio) {
        if (tamanio <= 7) {
            return false;
        }
        return true;
    }

//este metodo concatena los nombres y apellidos para guardar en el archivo 
    public String concatenarVerificarDatosPersonales(String primerDato, String segundoDato) {
        String nuevaCadena;
        if (!segundoDato.equals("")) {
            nuevaCadena = primerDato + " " + segundoDato;
            return nuevaCadena.toUpperCase();
        } else {
            nuevaCadena = primerDato;
            return nuevaCadena.toUpperCase();
        }
    }
}
