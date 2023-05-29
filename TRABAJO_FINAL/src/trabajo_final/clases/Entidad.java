package trabajo_final.clases;

/**
 *
 * @author Acer
 */
public class Entidad {
    private int identidad;
    private String cruc;
    private String cnombre;
    private TipoEntidad idtipo;

    public Entidad(int identidad, String cruc, String cnombre, TipoEntidad idtipo) {
        this.identidad = identidad;
        this.cruc = cruc;
        this.cnombre = cnombre;
        this.idtipo = idtipo;
    }
    
    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public String getCruc() {
        return cruc;
    }

    public void setCruc(String cruc) {
        this.cruc = cruc;
    }

    public String getCnombre() {
        return cnombre;
    }

    public void setCnombre(String cnombre) {
        this.cnombre = cnombre;
    }

    public TipoEntidad getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(TipoEntidad idtipo) {
        this.idtipo = idtipo;
    }
    
    @Override
    public String toString(){
        return cnombre+";"+cruc;
    }
     
}
