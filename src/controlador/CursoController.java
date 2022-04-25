/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import modelo.Curso;
import modelo.Estudiante;
import modelo.EstudianteCurso;
import modelo.Materia;
import modelo.persistencia.Archivo;

/**
 *
 * @author Sebastian Rosero
 */
public class CursoController {

    Archivo archivo = new Archivo();


//este metodo retorna una lista de los cursos del profesor que esta en sesión 
    public ArrayList<Curso> CursoProfesor() throws IOException {
        ArrayList<Curso> cursos = new ArrayList<>();

        for (Curso c : archivo.cargarCursos()) {
            for (Materia m : UsuarioController.profeSesion.getMaterias()) {
                if (c.getMateria().getCodigo().equals(m.getCodigo())) {
                    cursos.add(c);
                }
            }
        }

        return cursos;

    }


//este metodo lista los cursos del profesor en sesión en una lista(Jcombobox)
    public JComboBox listarCursos(JComboBox listaCurso) throws IOException {

        for (Curso c : CursoProfesor()) {
            listaCurso.addItem(c);
        }

        return listaCurso;
    }


//este metodo retorna una lista de los cursos del estudiante que esta en sesión 
    public ArrayList<EstudianteCurso> cursoEstudiante() throws IOException {
        ArrayList<EstudianteCurso> listaCursos = new ArrayList<>();

        for (EstudianteCurso e : archivo.cargarEstudianteCurso()) {
            if (e.getEstudiante().getIdentificacion().equals(UsuarioController.estudianteSesion.getIdentificacion())) {
                listaCursos.add(e);
            }
        }

        return listaCursos;

    }
}
