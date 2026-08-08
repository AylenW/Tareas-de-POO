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