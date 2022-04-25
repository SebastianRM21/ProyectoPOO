/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;


public class EstudianteCurso {

private String codigo;
private Estudiante estudiante;
private Curso curso;
private ArrayList<Double> notas;

    public EstudianteCurso(String codigo, Estudiante estusiante, Curso curso, ArrayList<Double> notas) {
        this.codigo = codigo;
        this.estudiante = estusiante;
        this.curso = curso;
        this.notas = notas;
    }

    public EstudianteCurso() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }


    
}
