
package practica1;

public class Practica1 {
    public static void main(String[] args) {
        //Alumno alu1= new Alumno();
        Alumno alu2= new Alumno(5, "Maria", "Benitez");
    
    System.out.println("El id del alumno alu2 es: " + alu2.getid());
    System.out.println("El nombre es: " + alu2.getnombre());
    System.out.println("El apellido es: " + alu2.getapellido());
    
    }
}
