/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import javax.swing.DefaultListModel;

/**
 *
 * @author Sebastian Rosero
 */
public class MenuController {

    CursoController controladorMateria = new CursoController();


//este metodo lista las materias del profesor en sesión 
    public DefaultListModel listaMaterias() {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < UsuarioController.profeSesion.getMaterias().size(); i++) {
            modelo.addElement(UsuarioController.profeSesion.getMaterias().get(i).getNombre());
        }
        return modelo;
    }

//este metodo lista los cursos del profesor en sesión 
    public DefaultListModel listaCursos() throws IOException {
        DefaultListModel modelo = new DefaultListModel();
        for (int i = 0; i < controladorMateria.CursoProfesor().size(); i++) {
            modelo.addElement(controladorMateria.CursoProfesor().get(i).getNombre());
        }
        return modelo;
    }

}
