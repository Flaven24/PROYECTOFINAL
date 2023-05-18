package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class TipoEntidad {
    private int idtipo;
    private String cdescripcion;

    public TipoEntidad(int idtipo, String cdescripcion) {
        this.idtipo = idtipo;
        this.cdescripcion = cdescripcion;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getCdescripcion() {
        return cdescripcion;
    }

    public void setCdescripcion(String cdescripcion) {
        this.cdescripcion = cdescripcion;
    }
    
}
