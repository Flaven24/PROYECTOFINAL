package trabajo_final.clases;

/**
 *
 * @author Flaven
 */
public class Proveedor extends Empresa {

    private String cnombre;
    private String cruc;
    private Boolean bfiltro;

    public Proveedor(String cnombre, String cruc) {
        super(cnombre, cruc);
        this.cnombre = cnombre;
        this.cruc = cruc;
        this.bfiltro=false;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public String getCruc() {
        return cruc;
    }

    public void setCruc(String cruc) {
        this.cruc = cruc;
    }

    public Boolean getBfiltro() {
        return bfiltro;
    }

    public void setBfiltro(Boolean bfiltro) {
        this.bfiltro = bfiltro;
    }    

}
