/*Implementar la clase Hora. Cada objeto de esta clase representa una hora específica del día, almacenando las
horas, minutos y segundos como enteros. Se ha de incluir un constructor, métodos de acceso, un método
adelantar (int h, int m, int s) para adelantar la hora actual de un objeto existente, un método reiniciar (int h, int
m, int s) que reinicializa la hora actual de un objeto existente y un método imprimir(). Escriba una aplicación de
prueba llamada PruebaHora que permita establecer como hora inicial “17:30:00” y luego de invocar al método
imprimir pueda reiniciar a “20:30:00”. Sobre escribir el método toString(). */

public class Hora {
    private int h;
    private int m;
    private int s;

    public Hora(int h, int m, int s){
        this.h= h;
        this.m= m;
        this.s= s;
    }
    
    public int getH(){
        return h;
    }
    public int getM(){
        return m;
    }
    public int getS(){
        return s;
    }
    public void setH(int h){
        this.h= h;
    }
    public void setM(int m){
        this.m= m;
    }
    public void setS(int s){
        this.s= s;
    }

    public void adelantar(int h, int m, int s){
        this.h= h;
        this.m= m;
        this.s= s;
    }
    public void reiniciar(){
        this.h= 0;
        this.m= 0;
        this.s= 0;
    }

    public void imprimir(){
        System.out.printf("%d:%d:%d\n", this.h, this.m, this.s);
    }
}