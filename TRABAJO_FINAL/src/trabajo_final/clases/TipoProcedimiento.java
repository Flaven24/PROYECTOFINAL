package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class TipoProcedimiento {
    private int idtipo;
    private String cnomtipo;

    public TipoProcedimiento(int idtipo, String cnomtipo) {
        this.idtipo = idtipo;
        this.cnomtipo = cnomtipo;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getCnomtipo() {
        return cnomtipo;
    }

    public void setCnomtipo(String cnomtipo) {
        this.cnomtipo = cnomtipo;
    }
    
}
