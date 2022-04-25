/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.EstudianteCurso;
import modelo.Validacion;
import modelo.persistencia.Archivo;

public class NotasController {
    
    Validacion validar = new Validacion();
    Archivo archivo = new Archivo();

//este metodo retorna las notas del estudiante seleccionado 
    public ArrayList<Double> notaEstudiante(String curso, String estudiante) throws IOException {
        for (EstudianteCurso e : archivo.cargarEstudianteCurso()) {
            if (e.getEstudiante().getIdentificacion().equals(estudiante) && e.getCurso().getCodigo().equals(curso)) {
                return e.getNotas();
            }
        }
        return null;
    }

//este metodo recibe las notas y se las envia al metodo que valida el rango 
    public boolean validacionNotas(String nota1, String nota2, String nota3) {
        
        boolean validacionPrimerNota = validar.validacionRangoNotas(nota1);
        boolean validacionSegundaNota = validar.validacionRangoNotas(nota2);
        boolean validacionTercerNota = validar.validacionRangoNotas(nota3);
        if (validacionPrimerNota && validacionSegundaNota && validacionTercerNota) {
            return true;
        }
        return false;
    }

//este metodo vacia los campos en la vista de notas
    public void camposVacios(JTextField nota1, JTextField nota2, JTextField nota3, JLabel promedio) {
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
        promedio.setText("");
    }

//este metodo recibe el estudiante, el curso, las notas y las actualiza en el archivo 
    public void actualizarNota(String curso, String estudiante, String nota1, String nota2, String nota3) throws IOException {
        
        ArrayList<EstudianteCurso> listaCursos = archivo.cargarEstudianteCurso();
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(Double.parseDouble(nota1));
        notas.add(Double.parseDouble(nota2));
        notas.add(Double.parseDouble(nota3));
        
        for (EstudianteCurso e : listaCursos) {
            
            if (e.getCurso().getCodigo().equals(curso) && e.getEstudiante().getIdentificacion().equals(estudiante)) {
                e.setNotas(notas);
            }
            
        }
        archivo.guardarEstudianteCurso(listaCursos);
        
    }
//este metodo calcula la nota final 

    public String CalcularNota(ArrayList<Double> notas) {
        String formato = "#.###";
        DecimalFormat decimalFormat = new DecimalFormat(formato);
        return decimalFormat.format((notas.get(0) + notas.get(1) + notas.get(2)) / 3);
    }

//este metodo le da una descripcion a la nota
    public String DescripcionNota(Double nota) {
        if (nota >= 3.0) {
            return "Materia aprobada";
        } else {
            return "Materia Reprobada";
        }
    }
//este metodo valida que la nota sea numerica 

    public boolean VerificarDouble(String notaUno, String notaDos, String notaTres) {
        try {
            double nota1 = Double.parseDouble(notaUno);
            double nota2 = Double.parseDouble(notaDos);
            double nota3 = Double.parseDouble(notaTres);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
