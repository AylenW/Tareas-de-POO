public class PruebaFecha {
    public static void main(String [] args){
        Fecha f1= new Fecha(2, 24, 2002);
        f1.mostrarFecha();
        f1.setAnho(2026);
        f1.setDia(7);
        f1.setMes(8);
        f1.mostrarFecha();
    }
}
