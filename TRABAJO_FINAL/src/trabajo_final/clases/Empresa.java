package trabajo_final.clases;

/**
 *
 * @author Flaven
 */
public class Empresa {

    private String cnombre;
    private String cruc;

    public Empresa(){}
    
    public Empresa(String cnombre, String cruc) {
        this.cnombre = cnombre;
        this.cruc = cruc;
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

}
