/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JTextField;
import modelo.Estudiante;

/**
 *
 * @author Sebastian Rosero
 */
public class EditarController {

//este metodo recibe los campos y los actualiza con la info del objeto estudiante seleccionado
    public void llenarCampos(JTextField nombre, JTextField nombre2, JTextField apellido, JTextField apellido2, JTextField id, JTextField usuario, JTextField pass, Estudiante estudiante) {

        String[] nombres = estudiante.getNombre().split(" ");
        String[] apellidos = estudiante.getApellido().split(" ");

        if (nombres.length == 2) {
            nombre.setText(nombres[0]);
            nombre2.setText(nombres[1]);
        } else {
            nombre.setText(nombres[0]);
        }
        if (apellidos.length == 2) {
            apellido.setText(apellidos[0]);
            apellido2.setText(apellidos[1]);
        } else {
            apellido.setText(apellidos[0]);
        }

        id.setText(estudiante.getIdentificacion());
        usuario.setText(estudiante.getUsuario());
        pass.setText(estudiante.getContrasena());

    }

}
