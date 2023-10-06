      package ClassAtributos;

public class Curso 
{
    //Se guardara el nombre y codigo del Curso
    private String Nombre;
    private String Codigo;
    private String Creditos;
    
    //Se crea un array del tipo Estudiante
    private Estudiantes[] Estudiante;
    //Se crea un  array del tipo Profesor
    private Profesores[] Profesores;
    
    //Se crea un constructor vacio y uno con 3 atributos
    
    
    public Curso() 
    {
        this.Estudiante = new Estudiantes[30];
        this.Profesores = new Profesores[2];
    }

    
    public Curso( String codigo,String Creditos,String nombre) 
    { 
        this.Codigo = codigo;
        this.Creditos = Creditos; 
        this.Nombre = nombre;
        this.Estudiante = new Estudiantes[30];
        this.Profesores = new Profesores[2]; 
    }
    //Se crea los metodos Set
    public void setNombre(String Nombre) 
    {this.Nombre = Nombre;}

    public void setCodigo(String Codigo)
    {this.Codigo = Codigo;}

    public void setCreditos(String Creditos) 
    {this.Creditos = Creditos;}

    public void setEstudiante(Estudiantes[] estudiante) 
    {this.Estudiante = estudiante;}

    public void setProfesores(Profesores[] profesores)
    {this.Profesores = profesores;}
    
    
    //Se crea los metodos Get
    public String getNombre() 
    {return Nombre;}

    public String getCodigo()
    {return Codigo;}

    public String getCreditos() 
    {return Creditos;}

    public Estudiantes[] getEstudiante() 
    {return Estudiante;}

    public Profesores[] getProfesores()
    {return Profesores;}
    
    public String Texto() 
    {   return "Nombre: " +this.Nombre + " │ Nc: " +
        this.Creditos + " │ Codigo: " + this.Codigo;}
    
    //Metodos agregar profesor eliminar y actualizar profesor
    public void agregarProfesor(Profesores profesor)
    {   for (int i = 0; i < 2  ; i++) 
        {   if (this.Profesores[i] == null) 
            {   this.Profesores[i] = profesor;
                return;}
        }
    }
    public void eliminarProfesor(int indice) {
        if (indice < 0 || indice >= 2) 
        {   return;}//si esta fuera del indice
        if (Profesores[indice] == null)
        {   return;}//si esta vacio
        Profesores[indice] = null;
    }
    public void actualizarNombreProfesor(int index, String nuevoNombre) 
    {
        if (Profesores != null && index >= 0 && index < 2) {
            Profesores[index].setNombre(nuevoNombre);
        }
    }
    
    //Metodos agregar Estudiantes eliminar y actualizar Estudiantes

    public void agregarEstudiante(Estudiantes estudiante) 
    {   
        for (int i = 0; i < 30; i++)
        {   
            if (this.Estudiante[i] == null)
            {
                this.Estudiante[i] = estudiante;
                break;
            }
        }
    }
    public void eliminarEstudiante(int indice) {
        if (indice < 0 || indice >= 30 ) 
        {   return;}//si esta fuera del indice
        if (Estudiante[indice] == null)
        {   return;}//si esta vacio
        Estudiante[indice] = null;
    }
   
    public void actualizarNombreEstudiante(int index, String nuevoNombre,
            String nuevocodigo) 
    {
        if (Estudiante != null && index >= 0 && index < 2) {
            Estudiante[index].setNombre(nuevoNombre);
            Estudiante[index].setCodigo(nuevocodigo);
        }
    }


          
}    
    
