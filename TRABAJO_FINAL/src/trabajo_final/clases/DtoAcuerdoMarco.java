package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class DtoAcuerdoMarco {
    private String cacuerdo;
    private Boolean bfiltro;
    
    public DtoAcuerdoMarco(String acuerdo){
        this.cacuerdo=acuerdo;
        this.bfiltro=false;
    }

    public String getCacuerdo() {
        return cacuerdo;
    }

    public void setCacuerdo(String cacuerdo) {
        this.cacuerdo = cacuerdo;
    }

    public Boolean getBfiltro() {
        return bfiltro;
    }

    public void setBfiltro(Boolean bfiltro) {
        this.bfiltro = bfiltro;
    }
    
}
