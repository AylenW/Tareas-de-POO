public class PruebaFactura{
    public static void main(String [] args){
        //public Factura (String nroPieza, String tipoFactura, String descripcion, int cantArtCompra, double precioPorArticulo)
        Factura fact1= new Factura("A2", "contado", "Alambre", 2, 200);
        Factura fact2= new Factura("C1", "credito", "Cable nro. 1", -2, 500);

        System.out.println(fact1);
        System.out.println(fact2);
    }
}