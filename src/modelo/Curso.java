package modelo;



public class Curso {

    private String codigo;
    private String nombre;
    private Materia materia;
   

    public Curso() {

    }

    public Curso(String codigo, String nombre, Materia materia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materia = materia;
        

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }



    @Override
    public String toString() {
        return this.codigo+"-"+this.nombre;
    }

}
