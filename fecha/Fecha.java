/*Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int), un día (tipoint) y un año
(tipoint). Su clase debe tener un constructor que inicialice las tres variables de instancia, y debe asumir que los
valores que se proporcionan son correctos. Proporcione un método establecer y un método obtener para cada
variable de instancia. Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras
diagonales (/). Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase
Fecha estableciendo inicialmente la fecha en “24/02/2012”, luego invocar el método mostrarFecha y
posteriormente utilizando los métodos de acceso establecer la fecha actual. Sobre escribir el método toString().*/

public class Fecha {
    private int mes;
    private int dia;
    private int anho;

    public Fecha(int mes, int dia, int anho){
        this.mes= mes;
        this.dia= dia;
        this.anho= anho;
    }

    public int getMes(){
        return mes;
    }
    public int getDia(){
        return dia;
    }
    public int getAnho(){
        return anho;
    }

    public void setMes(int mes){
        this.mes= mes;
    }
    public void setDia(int dia){
        this.dia= dia;
    }
    public void setAnho(int anho){
        this.anho= anho;
    }

    public void mostrarFecha(){
        System.out.println(dia+"/"+mes+"/"+anho);
    }
}
