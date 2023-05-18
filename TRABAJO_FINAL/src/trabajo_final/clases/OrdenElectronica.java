package trabajo_final.clases;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class OrdenElectronica {
    private int idorden;
    private Entidad idproveedor;
    private Entidad identidad;
    private TipoProcedimiento idtipo;
    private String celectronica;
    private String celectronicagenerada;
    private String cdocumentoocam;
    private Date dfecform;
    private Date dfecult;
    private double nsubtot;
    private double nigv;
    private double ntotal;
    private String cordendigitalizada;
    private String cdescripcionestrado;
    private String cdescripcioncesion;
    private String cacuerdo;

    public OrdenElectronica(int idorden, Entidad idproveedor, Entidad identidad, TipoProcedimiento idtipo, String celectronica, String celectronicagenerada, String cdocumentoocam, Date dfecform, Date dfecult, double nsubtot, double nigv, double ntotal, String cordendigitalizada, String cdescripcionestrado, String cdescripcioncesion, String cacuerdo) {
        this.idorden = idorden;
        this.idproveedor = idproveedor;
        this.identidad = identidad;
        this.idtipo = idtipo;
        this.celectronica = celectronica;
        this.celectronicagenerada = celectronicagenerada;
        this.cdocumentoocam = cdocumentoocam;
        this.dfecform = dfecform;
        this.dfecult = dfecult;
        this.nsubtot = nsubtot;
        this.nigv = nigv;
        this.ntotal = ntotal;
        this.cordendigitalizada = cordendigitalizada;
        this.cdescripcionestrado = cdescripcionestrado;
        this.cdescripcioncesion = cdescripcioncesion;
        this.cacuerdo = cacuerdo;
    }

    public int getIdorden() {
        return idorden;
    }

    public void setIdorden(int idorden) {
        this.idorden = idorden;
    }

    public Entidad getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Entidad idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Entidad getIdentidad() {
        return identidad;
    }

    public void setIdentidad(Entidad identidad) {
        this.identidad = identidad;
    }

    public TipoProcedimiento getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(TipoProcedimiento idtipo) {
        this.idtipo = idtipo;
    }

    public String getCelectronica() {
        return celectronica;
    }

    public void setCelectronica(String celectronica) {
        this.celectronica = celectronica;
    }

    public String getCelectronicagenerada() {
        return celectronicagenerada;
    }

    public void setCelectronicagenerada(String celectronicagenerada) {
        this.celectronicagenerada = celectronicagenerada;
    }

    public String getCdocumentoocam() {
        return cdocumentoocam;
    }

    public void setCdocumentoocam(String cdocumentoocam) {
        this.cdocumentoocam = cdocumentoocam;
    }

    public Date getDfecform() {
        return dfecform;
    }

    public void setDfecform(Date dfecform) {
        this.dfecform = dfecform;
    }

    public Date getDfecult() {
        return dfecult;
    }

    public void setDfecult(Date dfecult) {
        this.dfecult = dfecult;
    }

    public double getNsubtot() {
        return nsubtot;
    }

    public void setNsubtot(double nsubtot) {
        this.nsubtot = nsubtot;
    }

    public double getNigv() {
        return nigv;
    }

    public void setNigv(double nigv) {
        this.nigv = nigv;
    }

    public double getNtotal() {
        return ntotal;
    }

    public void setNtotal(double ntotal) {
        this.ntotal = ntotal;
    }

    public String getCordendigitalizada() {
        return cordendigitalizada;
    }

    public void setCordendigitalizada(String cordendigitalizada) {
        this.cordendigitalizada = cordendigitalizada;
    }

    public String getCdescripcionestrado() {
        return cdescripcionestrado;
    }

    public void setCdescripcionestrado(String cdescripcionestrado) {
        this.cdescripcionestrado = cdescripcionestrado;
    }

    public String getCdescripcioncesion() {
        return cdescripcioncesion;
    }

    public void setCdescripcioncesion(String cdescripcioncesion) {
        this.cdescripcioncesion = cdescripcioncesion;
    }

    public String getCacuerdo() {
        return cacuerdo;
    }

    public void setCacuerdo(String cacuerdo) {
        this.cacuerdo = cacuerdo;
    }
            
}
