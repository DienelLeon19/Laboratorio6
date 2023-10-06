package ClassAtributos;

import java.util.List;

public class Profesores{

    private String Nombre;
    private List<Curso> Curso;
    
    public Profesores() {}
    public Profesores(String Nombre, List<Curso> Curso) 
    {   this.Nombre = Nombre;
        this.Curso = Curso;}
    
    public String getNombre()
    {return Nombre;}
    public List<Curso> getCurso()
    {return Curso;}

    public void setNombre(String nombre)
    {this.Nombre = nombre;}
    public void setCurso(List<Curso> Curso) 
    {this.Curso = Curso;}
    
    public String Texto()
    {return "Nombre: "+this.Nombre ;}
       
}
