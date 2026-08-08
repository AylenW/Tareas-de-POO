/*Cree una clase llamada Empleado, que incluya cinco variables de instancia: un primer nombre (tipo String), un
apellido paterno (tipo String), un número de documento (tipo String), tipo de documento (tipo String) y un salario
mensual (double). Su clase debe tener un constructor que inicialice todas las variables de instancia. Proporcione
un método establecer y un método obtener para cada variable de instancia. Si el salario mensual no es positivo,
no establezca su valor. Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las
capacidades de la clase Empleado. Cree dos objetos Empleado y muestre el salario anual de cada objeto. Después,
proporcione a cada Empleado un aumento del 8% y muestre el salario anual de cada Empleado otra vez. Sobre
escribir el método toString().*/

public class Empleado{
    private String nombre;
    private String apellido;
    private String nroDocumento;
    private String tipoDocumento;
    private double salarioMensual;

    public Empleado(String nombre, String apellido, String nroDocumento, String tipoDocumento, double salarioMensual){
        this.nombre= nombre;
        this.apellido= apellido;
        this.nroDocumento= nroDocumento;
        this.tipoDocumento= tipoDocumento;
        setSalarioMensual(salarioMensual);
    }

    public String getNombre(){
        return nombre;}
    public String getApellido(){
        return apellido;
    }
    public String getNroDocumento(){
        return nroDocumento;
    }
    public String getTipoDocumento(){
        return tipoDocumento;
    }
    public double getSalarioMensual(){
        return salarioMensual;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public void setNroDocumento(String nroDocumento){
        this.nroDocumento= nroDocumento;
    }
    public void setTipoDocumento(String tipoDocumento){
        this.tipoDocumento=  tipoDocumento;
    }
    public void setSalarioMensual(double salarioMensual){
        if(salarioMensual>0){
            this.salarioMensual= salarioMensual;
        }
    }
    public void aumentarSalario(double porcentaje){
        salarioMensual= salarioMensual + (porcentaje/100)*salarioMensual;
    }


    @Override
    public String toString(){
        return "\n-Nombre: " + nombre+ "\n-Apellido: "+ apellido+ "\n-Tipo de Documento: "+ tipoDocumento+ "\n-Documento: "+ nroDocumento +"\n-Salario Mensual: " + salarioMensual+"\n=================================================";
    }
}