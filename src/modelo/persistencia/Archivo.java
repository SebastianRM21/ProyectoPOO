package modelo.persistencia;

import controlador.ArchivoController;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.EstudianteCurso;
import modelo.Materia;
import modelo.Profesor;

public class Archivo {

    private String linea;
    private String[] particion;

    public Archivo() {
    }

//Metodo que permite leer el archivo, recibe el nombre del archivo
    public BufferedReader archivoCarga(String nombre) throws FileNotFoundException {
        File archivo = new File(nombre);
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        return br;
    }

//Metodo que permite escribir en el archivo, recibe el nombre del archivo
    public BufferedWriter archivoEscritura(String nombre) throws IOException {

        FileWriter fw = new FileWriter(nombre);
        BufferedWriter bw = new BufferedWriter(fw);

        return bw;

    }

//Metodo que trae una lista de profesores de los archivos
    public ArrayList<Profesor> cargarProfesores() throws FileNotFoundException, IOException {
        ArchivoController archivoController = new ArchivoController();
        BufferedReader br = archivoCarga("Profesor");
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        linea = br.readLine();
        while (linea != null) {
            particion = linea.split("-");
            //este metodo arma un objeto de tipo profesor con cada linea que hay en el archivo
            listaProfesores.add(archivoController.crearProfesor(particion));
            linea = br.readLine();
        }

        br.close();

        return listaProfesores;
    }

//Metodo que trae una lista de estudiantes de los archivos
    public ArrayList<Estudiante> cargarEstudiante() throws FileNotFoundException, IOException {
        ArchivoController archivoController = new ArchivoController();
        BufferedReader br = archivoCarga("Estudiante");
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        linea = br.readLine();
        while (linea != null) {
            particion = linea.split("-");
//este metodo arma un objeto de tipo estudiante con cada linea que hay en el archivo
            listaEstudiantes.add(archivoController.crearEstudiante(particion));
            linea = br.readLine();
        }
        br.close();
        return listaEstudiantes;
    }

//Metodo que trae una lista de materias de los archivos
    public ArrayList<Materia> cargarMateria() throws FileNotFoundException, IOException {
        BufferedReader br = archivoCarga("Materia");
        ArrayList<Materia> materias = new ArrayList<>();
        linea = br.readLine();
        while (linea != null) {
            particion = linea.split("-");
            Materia materia = new Materia(particion[0], particion[1]);
            materias.add(materia);
            linea = br.readLine();
        }

        br.close();

        return materias;

    }

//Metodo que trae una lista de cursos de los archivos
    public ArrayList<Curso> cargarCursos() throws FileNotFoundException, IOException {
        ArchivoController archivoController = new ArchivoController();
        BufferedReader br = archivoCarga("Curso");
        ArrayList<Curso> cursos = new ArrayList<>();
        linea = br.readLine();
        while (linea != null) {
            particion = linea.split("-");
//este metodo arma un objeto de tipo curso con cada linea que hay en el archivo
            cursos.add(archivoController.craerCurso(particion));
            linea = br.readLine();
        }
        br.close();
        return cursos;
    }

//Este metodo recibe una lista de estudiantes y la guarda en el archivo
    public void guardarEstudiante(ArrayList<Estudiante> listaEstudiantes) throws IOException {

        BufferedWriter bw = archivoEscritura("Estudiante");

        for (Estudiante estudiante : listaEstudiantes) {
            bw.write(estudiante.getNombre() + "-" + estudiante.getApellido() + "-" + estudiante.getIdentificacion() + "-" + estudiante.getUsuario() + "-" + estudiante.getContrasena() + "\r\n");
            bw.flush();
        }

        bw.close();

    }

//este metodo carga una lista que relaciona el id de los estudiantes con el codigo de los cursos
//es decir trae una lista de estudiantes con sus respectivos cursos
    public ArrayList<EstudianteCurso> cargarEstudianteCurso() throws FileNotFoundException, IOException {
        BufferedReader br = archivoCarga("EstudianteCurso");
        ArrayList<EstudianteCurso> estudianteCursos = new ArrayList<>();
        ArchivoController archivoController = new ArchivoController();
        linea = br.readLine();
        while (linea != null) {
            particion = linea.split("-");
//este metodo arma el objeto de tipo EstudianteCurso con cada linea del archivo
            estudianteCursos.add(archivoController.armarEstudianteCurso(particion));
            linea = br.readLine();
        }

        br.close();
        return estudianteCursos;
    }

//este metodo recibe una lista de EstudianteCurso y la escribe en el archivo
    public void guardarEstudianteCurso(ArrayList<EstudianteCurso> listaEstudianteC) throws IOException {

        BufferedWriter bw = archivoEscritura("EstudianteCurso");
        for (EstudianteCurso estudianteCurso : listaEstudianteC) {
            bw.write(estudianteCurso.getCodigo() + "-" + estudianteCurso.getEstudiante().getIdentificacion() + "-" + estudianteCurso.getCurso().getCodigo() + "-" + estudianteCurso.getNotas().get(0) + "-" + estudianteCurso.getNotas().get(1) + "-" + estudianteCurso.getNotas().get(2) + "\r\n");
            bw.flush();
        }

        bw.close();
    }

}
