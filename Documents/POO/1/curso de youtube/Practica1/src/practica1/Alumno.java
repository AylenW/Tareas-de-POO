package practica1;
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno(int id, String nombre, String apellido) {
        this.id= id;
        this.nombre= nombre;
        this.apellido= apellido;
    }

    public String getapellido() {
        return apellido;
    }
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getid(){
        return id;
    }
    
    public void setid(int id){
        this.id= id;
    }
    
    public String getnombre(){
        return nombre;
    }
    

    public void setnombre(String nombre){
        this.nombre= nombre;
    }
    
    
    //metodo
    public void mostrarNombre(){
        System.out.println("Mi nombre es");
    }
}
 
