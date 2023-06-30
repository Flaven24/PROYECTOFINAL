package trabajo_final.clases;

/**
 *
 * @author Flaven
 */
public class DtoEntidadProveedor {
    private Entidad entidad;    
    private Proveedor proveedor;
    private double compraOrdinaria;
    private double granCompra;
    private double total;

    public Entidad getEntidad() {
        return entidad;
    }

    public void setEntidad(Entidad entidad) {
        this.entidad = entidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public double getCompraOrdinaria() {
        return compraOrdinaria;
    }

    public void setCompraOrdinaria(double compraOrdinaria) {
        this.compraOrdinaria = compraOrdinaria;
    }

    public double getGranCompra() {
        return granCompra;
    }

    public void setGranCompra(double granCompra) {
        this.granCompra = granCompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
    
}
