/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Curso;
import modelo.Estudiante;
import modelo.EstudianteCurso;
import modelo.persistencia.Archivo;

/**
 *
 * @author Sebastian Rosero
 */
public class EstudianteCursoController {

    Archivo archivo = new Archivo();


//este metodo valida que no se asigne un estudiante dos veces al mismo curso
    public int validarAsignacion(ArrayList<EstudianteCurso> lista, Estudiante estudiante, Curso curso) throws IOException {
        int bandera = 1;

        if (lista.isEmpty()) {
            bandera = 1;
        } else {
            for (EstudianteCurso e : lista) {

                if (e.getEstudiante().getIdentificacion().equals(estudiante.getIdentificacion()) && e.getCurso().getCodigo().equals(curso.getCodigo())) {
                    bandera = 0;
                }

            }
        }

        return bandera;
    }

//este metodo crea el objeto estudianteCurso, relacionando el codigo del curso con la identificion del estudiante
//y le pasa el objeto al metodo guardar en el archivo
    public void crearEstudianteCurso(Estudiante estudiante, Curso curso) throws IOException {
        ArrayList<EstudianteCurso> lista = archivo.cargarEstudianteCurso();

        if (validarAsignacion(lista, estudiante, curso) == 1) {
            ArrayList<Double> notas = new ArrayList<>();
            notas.add(0.0);
            notas.add(0.0);
            notas.add(0.0);

            EstudianteCurso estudianteCurso = new EstudianteCurso("" + (lista.size() + 1), estudiante, curso, notas);
            lista.add(estudianteCurso);
            archivo.guardarEstudianteCurso(lista);
            JOptionPane.showMessageDialog(null, "Estudiante Asignado");
        } else {
            JOptionPane.showMessageDialog(null, "Estudiante ya esta en este curso");
        }

    }
}
