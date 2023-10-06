    package ClassAtributos;

import java.util.List;

public class Estudiantes 
{
    //Atributos del Estudiante y la ref List del Cursos
    private String Codigo;
    private String Nombre;
    private List<Curso> Cursos;
    
    public Estudiantes() {}
    
    public Estudiantes(String codigo, String nombre, List<Curso> cursos) {
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Cursos = cursos;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public List<Curso> getCursos() {
        return Cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.Cursos = cursos;
    }
    
    public String Texto()
    {return "Nombre: "+this.Nombre+" Codigo: "+this.Codigo ;}
      
    
    
    
    
    
    
    
    
}