package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class DtoFecha {
    
    private String cfecha;
    private Boolean bfiltro;
    
    public DtoFecha(String cfecha){
        this.cfecha=cfecha;
        bfiltro=false;
    }

    public String getCfecha() {
        return cfecha;
    }

    public void setCfecha(String cfecha) {
        this.cfecha = cfecha;
    }

    public Boolean getBfiltro() {
        return bfiltro;
    }

    public void setBfiltro(Boolean bfiltro) {
        this.bfiltro = bfiltro;
    }
    
    
}
