/*EJERCICIO 2 – Tipo Abstracto de Dato, Generic e Iteradores
Compile y pruebe la clase ListaEnlazadaSimple (que está disponible en el aula virtual dentro del conjunto de soluciones de la
clase anterior) y complete lo que se pide. Puede probar ListaEnlazadaSimple en jshell (abajo un ejemplo)
Implemente:
A. Que ahora los elementos sean comparables (debe implementar la interface Comparable)
B. Que la lista se encuentre ordenada de manera ascendente (debe modificar el método agregar)
C. Actualmente la operación remover elimina el primer elemento. Haga que reciba un parámetro y elimine todos los
elementos que coincidan con el parámetro dado retornando la cantidad de eliminados.
D. Una clase denominada UsoListaEnlazadaSimple que utilice ListaEnlazadaSimple, acepte algunos datos de la línea de
comandos y los liste. Estos datos deben ser tratados como cadenas.
E. Hacer que funcione la siguiente expresión de Java (implica uso de java.util.iterator ) (ver la breve descripción de cómo
utilizar el Iterador del API de java al final de este documento). Esta implementación realizar
ListaEnlazadaSimple<Integer> lista = new ListaEnlazadaSimple<Integer>();
..
for (int i : lista )
System.out.println(i); /* Imprime cada elemento de lista de acuerdo a la secuencia*/
import java.util.Iterator;
import java.util.NoSuchElementException;
//public interface  
public class ListaEnlazadaSimple<T extends Comparable<T>> implements Iterable<T>, Comparable<ListaEnlazadaSimple<T>>{
    private class Nodo{
        private T dato;
        private Nodo next;
        Nodo (T d){
            this.dato = d;
            this.next = null;
        }
        public T getDato() {
            return this.dato;
        }
        public Nodo getNext() {
            return this.next;
        }
        public void setNext( Nodo n)
        {
            if ( n != this )
                this.next = n;
            else
                throw new IllegalArgumentException ("No se puede apuntar a si mismo!!");
        }
    }
    //------------------------------------
    private Nodo cabeza;
    private int tamano=0;
    ListaEnlazadaSimple() {
        cabeza = null;
    }
    void agregar (T d)
    {
        Nodo nuevo= new Nodo(d);
        if (cabeza == null || d.compareTo(cabeza.getDato()) <= 0){
            nuevo.setNext(cabeza);
            cabeza= nuevo;
        }else{
            Nodo actual= cabeza;
            while(actual.getNext() != null && actual.getNext().getDato().compareTo(d) <= 0){
                actual= actual.getNext();
            }
            nuevo.setNext(actual.getNext());
            actual.setNext(nuevo);
        }
        tamano++;  
    }

    int remover(T d){
        int contador= 0;
        Nodo actual= cabeza;
        Nodo anterior= null;
        while (actual != null){
            if(actual.getDato().compareTo(d) == 0){
                if (anterior == null){
                    cabeza= actual.getNext();
                }else{
                    anterior.setNext(actual.getNext());
                }
                contador++;
                tamano--;
                actual= actual.getNext();
            }else{
                anterior= actual;
                actual= actual.getNext();
            }
        }
        return contador;
    }

    void imprimir(){
        Nodo actual= this.cabeza;
        while (actual != null){
            System.out.println(actual.getDato());
            System.out.println(" ");
            actual= actual.getNext();
        }
        System.out.println();
    }

    public int size(){
        return tamano;
    }
    @Override
    public int compareTo(ListaEnlazadaSimple<T> otra){
        return Integer.compare(this.tamano, otra.tamano);
    }


@Override
    public Iterator<T> iterator(){
        return new Iterator<T>(){
            private Nodo actual= cabeza;

            @Override
            public boolean hasNext(){
                return actual != null;
            }

            @Override 
            public T next(){
                if (!hasNext()){
                    throw new NoSuchElementException();
                }
                T dato= actual.getDato();
                actual= actual.getNext();
                return dato;
            }
        };
    }
    /* 
    public static void main(String [] args){
        ListaEnlazadaSimple<Object> lista= new ListaEnlazadaSimple<>();
        lista.agregar("Hola");
        lista.agregar(1);
        lista.imprimir();
    }*/
}


