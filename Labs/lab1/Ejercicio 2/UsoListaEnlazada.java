import java.util.Iterator;
public class UsoListaEnlazada {
    public static void main(String [] args){
        ListaEnlazadaSimple<Integer> lista= new ListaEnlazadaSimple<Integer>();
        lista.agregar(1);
        lista.agregar(4);
        lista.agregar(6);
        lista.agregar(3);

        for (int i: lista){
            System.out.println(i);
        }
    }
}
