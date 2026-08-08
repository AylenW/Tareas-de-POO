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
