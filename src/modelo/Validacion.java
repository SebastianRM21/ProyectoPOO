/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Sebastian Rosero
 */
public class Validacion {


//este metodo recibe la lista de estudiantes que estan en el archivo y los compara uno a uno para ver
//si el nombre y el apellido del estudiante que quiere crear estan repetidos
  public boolean verifcacionEstudianteRepetido(ArrayList<Estudiante> lista, String nombre, String apellido) {
        boolean repetido = false;

        for (Estudiante p : lista) {
            if (p.getNombre().equals(nombre) && p.getApellido().equals(apellido)) {
                repetido = true;
            }
        }

        return repetido;
    }

//este metodo recibe la lista de estudiantes que estan en el archivo y los compara uno a uno para ver
//si la identificación del estudiante que quiere crear  está repetido 
    public boolean verifcacionEstudianteIdRepetido(ArrayList<Estudiante> lista, String id) {
        boolean repetido = false;

        for (Estudiante p : lista) {
            if (p.getIdentificacion().equals(id)) {
                repetido = true;
            }
        }

        return repetido;
    }

//este metodo recibe la lista de estudiantes que estan en el archivo y los compara uno a uno para ver
//si el nombre de ususario del estudiante que quiere crear  está repetido 
    public boolean verifcacionEstudianteUserRepetido(ArrayList<Estudiante> lista, String user) {
        boolean repetido = false;

        for (Estudiante p : lista) {
            if (p.getUsuario().equals(user)) {
                repetido = true;
            }
        }

        return repetido;
    }

//este metodo valida que las notas esten dentro del rango permitido
    public boolean validacionRangoNotas(String nota) {
        return Double.parseDouble(nota) >= 0 && Double.parseDouble(nota) <= 5;
    }


    
}
