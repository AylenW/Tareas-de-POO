public class Factura {
    private String nroPieza;
    private String tipoFactura;
    private String descripcion;
    private int cantArtCompra;
    private double precioPorArticulo;

    public Factura (String nroPieza, String tipoFactura, String descripcion, int cantArtCompra, double precioPorArticulo){
        this.nroPieza= nroPieza;
        this.tipoFactura= tipoFactura;
        this.descripcion= descripcion;
        setCantArtCompra(cantArtCompra);
        setPrecioPorArticulo(precioPorArticulo);
        /* 
        this.cantArtCompra= cantArtCompra;
        this.precioPorArticulo= precioPorArticulo;
        */
    }

    public String getNroPieza(){
        return nroPieza;
    }
    public String getTipoFactura(){
        return tipoFactura; 
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getCantArtCompra(){
        return cantArtCompra;
    }
    public double getPrecioPorArticulo(){
        return precioPorArticulo;
    }


    public void setNroPieza(String nroPieza){
        this.nroPieza= nroPieza;
    }
    public void setTipoFactura(String tipoFactura){
        this.tipoFactura= tipoFactura;
    }
    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }
    public void setCantArtCompra(int cantArtCompra){
        if (cantArtCompra < 0){
            this.cantArtCompra= 0;
        }else{
        this.cantArtCompra= cantArtCompra;}
    }
    public void setPrecioPorArticulo(double precioPorArticulo){
        if (precioPorArticulo < 0){
            this.precioPorArticulo= 0;
        }else{
        this.precioPorArticulo= precioPorArticulo;}
    }

    public double obtenerMontoFactura(int cantArtCompra, double precioPorArticulo){
        return cantArtCompra*precioPorArticulo;
    }

    @Override
    public String toString(){
        return "Factura: \n-Nro. Pieza: " + nroPieza + "\n-Tipo de Factura: " + tipoFactura + "\n-Descripcion: " + descripcion + "\n-Cantidad: " + cantArtCompra + 
        "\n-Precio por articulo: " + precioPorArticulo + "\n-Monto total: " + obtenerMontoFactura(cantArtCompra, precioPorArticulo) + "\n_________________________________";
        }
}
