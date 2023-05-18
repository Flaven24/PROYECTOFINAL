package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class EstadoOrden {
    private int idestado;
    private String cnomestado;

    public EstadoOrden(int idestado, String cnomestado) {
        this.idestado = idestado;
        this.cnomestado = cnomestado;
    }

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getCnomestado() {
        return cnomestado;
    }

    public void setCnomestado(String cnomestado) {
        this.cnomestado = cnomestado;
    }    
            
}
