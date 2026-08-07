public class Factura{
	String nroPieza;
	String tipoFactura;
	String descriPieza;
	int cantidadArticulo;
	double precioArticulo;
	
	Factura(String nroPieza, String tipoFactura, String descriPieza, int cantidadArticulo, double precioArticulo){
		this.nroPieza= nroPieza;
		this.tipoFactura= tipoFactura;
		this.descriPieza= descriPieza;
		this.cantidadArticulo= cantidadArticulo;
		this.precioArticulo= precioArticulo;
        this.ObtenerMontoFactura= ObtenerMontoFactura;
	}
 
   /* public void ObtenerMontoFactura(int cantidadArticulo, double precioArticulo){
        double monto;
        monto= cantidadArticulo * precioArticulo;
        return monto;
    }*/

}