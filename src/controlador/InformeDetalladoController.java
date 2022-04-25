/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import modelo.EstudianteCurso;

/**
 *
 * @author Sebastian Rosero
 */
public class InformeDetalladoController {
    
    CursoController controlCurso = new CursoController();
    NotasController controladorNota = new NotasController();
    



//este metodo carga los cursos y notas  que tiene asignado el estudiante en sesión en una tabla
    public String[][] CargarTabla() throws IOException {
        
        ArrayList<EstudianteCurso> listaCursos = controlCurso.cursoEstudiante();
        
        String[][] listaTable = new String[listaCursos.size()][6];
        
        for (int i = 0; i < listaCursos.size(); i++) {
            
            listaTable[i][0] = listaCursos.get(i).getCurso().getMateria().getNombre();
            listaTable[i][1] = "" + listaCursos.get(i).getNotas().get(0);
            listaTable[i][2] = "" + listaCursos.get(i).getNotas().get(1);
            listaTable[i][3] = "" + listaCursos.get(i).getNotas().get(2);
            listaTable[i][4] = controladorNota.CalcularNota(listaCursos.get(i).getNotas());
            listaTable[i][5] = controladorNota.DescripcionNota(Double.parseDouble(controladorNota.CalcularNota(listaCursos.get(i).getNotas())));
            
        }
        return listaTable;
        
    }


    
}
