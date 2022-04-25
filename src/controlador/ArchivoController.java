/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import modelo.Curso;
import modelo.Estudiante;
import modelo.EstudianteCurso;
import modelo.Materia;
import modelo.Profesor;
import modelo.persistencia.Archivo;

/**
 *
 * @author Sebastian Rosero
 */
public class ArchivoController {

    Archivo archivo = new Archivo();

//este metodo recibe un arreglo con cada linea del archivo partida por el caracter "-"
//y crea un objeto de tipo profesor con sus atributos necesarios
    public Profesor crearProfesor(String[] particion) throws IOException {
        ArrayList<Materia> materias = new ArrayList<>();
        for (int i = 6; i < particion.length; i++) {
//este metodo crea objetos de tipo materia dependiendo del codigo que haya en el archivo 
            materias.add(materiaProfesor(particion[i]));
        }
        Profesor profesor = new Profesor(particion[0], particion[1], particion[2], particion[3], particion[4], particion[5], materias);
        return profesor;
    }
//este metodo recibe el codigo de una materia y me retorna el objeto completo de dicha materia 

    public Materia materiaProfesor(String codigo) throws IOException {

        for (Materia m : archivo.cargarMateria()) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;

    }

//este metodo recibe un arreglo con cada linea del archivo partida por el caracter "-"
//y arma los objetos de tipo curso
    public Curso craerCurso(String[] particion) throws IOException {

        Curso curso = new Curso(particion[0], particion[1], materiaCurso(particion[2]));

        return curso;
    }

//este metodo recibe el codigo de una materia y me retorna el objeto completo
    public Materia materiaCurso(String codigo) throws IOException {

        for (Materia m : archivo.cargarMateria()) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;

    }

//este metodo recibe un arreglo con cada linea del archivo partida por el caracter "-"
//y crea un objeto de tipo estudiante con sus atributos necesarios
    public Estudiante crearEstudiante(String[] particion) {

        Estudiante estudiante = new Estudiante(particion[0], particion[1], particion[2], particion[3], particion[4]);
        return estudiante;
    }

//este metodo recibe un arreglo con cada linea del archivo partida por el caracter "-"
//y crea un objeto de tipo EstudianteCurso con sus atributos necesarios
    public EstudianteCurso armarEstudianteCurso(String[] particion) throws IOException {

        ArrayList<Double> notas = new ArrayList<>();
        notas.add(Double.parseDouble(particion[3]));
        notas.add(Double.parseDouble(particion[4]));
        notas.add(Double.parseDouble(particion[5]));
        EstudianteCurso estudianteCurso = new EstudianteCurso(particion[0], buscarEstudiante(particion[1]), buscarCurso(particion[2]), notas);
        return estudianteCurso;

    }
//este metodo recibe la identificacion de un estudiante, la busca en la lista de estudiantes y me retorna el objeto completo 
    public Estudiante buscarEstudiante(String id) throws IOException {
        ArrayList<Estudiante> estudiantes = archivo.cargarEstudiante();
        for (Estudiante e : estudiantes) {
            if (e.getIdentificacion().equals(id)) {
                return e;
            }
        }
        return null;
    }

//este metodo recibe el codigo de un curso, la busca en la lista de cursos y me retorna el objeto completo 
    public Curso buscarCurso(String codigo) throws IOException {
        ArrayList<Curso> cursos = archivo.cargarCursos();
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

}
