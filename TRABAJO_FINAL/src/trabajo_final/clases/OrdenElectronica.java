package trabajo_final.clases;

import java.util.Date;

/**
 *
 * @author Flaven
 */
public class OrdenElectronica {

    private Date FECHA_PROCESO;
    private String RUC_PROVEEDOR;
    private String PROVEEDOR;
    private String RUC_ENTIDAD;
    private String ENTIDAD;
    private String TIPO_PROCEDIMIENTO;
    private String ORDEN_ELECTRÓNICA;
    private String ORDEN_ELECTRONICA_GENERADA;
    private String ESTADO_ORDEN_ELECTRONICA;
    private String DOCUMENTO_ESTADO_OCAM;
    private Date FECHA_FORMALIZACIÓN;
    private Date FECHA_ULTIMO_ESTADO;
    private double SUB_TOTAL;
    private double IGV;
    private double TOTAL;
    private String ORDEN_DIGITALIZADA;
    private String DESCRIPCION_ESTADO;
    private String DESCRIPCION_CESION_DERECHOS;
    private String ACUERDO_MARCO;

    public OrdenElectronica(){}
    
    public OrdenElectronica(Date FECHA_PROCESO, String RUC_PROVEEDOR, String PROVEEDOR, String RUC_ENTIDAD, String ENTIDAD, String TIPO_PROCEDIMIENTO, String ORDEN_ELECTRÓNICA, String ORDEN_ELECTRONICA_GENERADA, String ESTADO_ORDEN_ELECTRONICA, String DOCUMENTO_ESTADO_OCAM, Date FECHA_FORMALIZACIÓN, Date FECHA_ULTIMO_ESTADO, double SUB_TOTAL, double IGV, double TOTAL, String ORDEN_DIGITALIZADA, String DESCRIPCION_ESTADO, String DESCRIPCION_CESION_DERECHOS, String ACUERDO_MARCO) {
        this.FECHA_PROCESO = FECHA_PROCESO;
        this.RUC_PROVEEDOR = RUC_PROVEEDOR;
        this.PROVEEDOR = PROVEEDOR;
        this.RUC_ENTIDAD = RUC_ENTIDAD;
        this.ENTIDAD = ENTIDAD;
        this.TIPO_PROCEDIMIENTO = TIPO_PROCEDIMIENTO;
        this.ORDEN_ELECTRÓNICA = ORDEN_ELECTRÓNICA;
        this.ORDEN_ELECTRONICA_GENERADA = ORDEN_ELECTRONICA_GENERADA;
        this.ESTADO_ORDEN_ELECTRONICA = ESTADO_ORDEN_ELECTRONICA;
        this.DOCUMENTO_ESTADO_OCAM = DOCUMENTO_ESTADO_OCAM;
        this.FECHA_FORMALIZACIÓN = FECHA_FORMALIZACIÓN;
        this.FECHA_ULTIMO_ESTADO = FECHA_ULTIMO_ESTADO;
        this.SUB_TOTAL = SUB_TOTAL;
        this.IGV = IGV;
        this.TOTAL = TOTAL;
        this.ORDEN_DIGITALIZADA = ORDEN_DIGITALIZADA;
        this.DESCRIPCION_ESTADO = DESCRIPCION_ESTADO;
        this.DESCRIPCION_CESION_DERECHOS = DESCRIPCION_CESION_DERECHOS;
        this.ACUERDO_MARCO = ACUERDO_MARCO;
    }

    public Date getFECHA_PROCESO() {
        return FECHA_PROCESO;
    }

    public void setFECHA_PROCESO(Date FECHA_PROCESO) {
        this.FECHA_PROCESO = FECHA_PROCESO;
    }

    public String getRUC_PROVEEDOR() {
        return RUC_PROVEEDOR;
    }

    public void setRUC_PROVEEDOR(String RUC_PROVEEDOR) {
        this.RUC_PROVEEDOR = RUC_PROVEEDOR;
    }

    public String getPROVEEDOR() {
        return PROVEEDOR;
    }

    public void setPROVEEDOR(String PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }

    public String getRUC_ENTIDAD() {
        return RUC_ENTIDAD;
    }

    public void setRUC_ENTIDAD(String RUC_ENTIDAD) {
        this.RUC_ENTIDAD = RUC_ENTIDAD;
    }

    public String getENTIDAD() {
        return ENTIDAD;
    }

    public void setENTIDAD(String ENTIDAD) {
        this.ENTIDAD = ENTIDAD;
    }

    public String getTIPO_PROCEDIMIENTO() {
        return TIPO_PROCEDIMIENTO;
    }

    public void setTIPO_PROCEDIMIENTO(String TIPO_PROCEDIMIENTO) {
        this.TIPO_PROCEDIMIENTO = TIPO_PROCEDIMIENTO;
    }

    public String getORDEN_ELECTRÓNICA() {
        return ORDEN_ELECTRÓNICA;
    }

    public void setORDEN_ELECTRÓNICA(String ORDEN_ELECTRÓNICA) {
        this.ORDEN_ELECTRÓNICA = ORDEN_ELECTRÓNICA;
    }

    public String getORDEN_ELECTRONICA_GENERADA() {
        return ORDEN_ELECTRONICA_GENERADA;
    }

    public void setORDEN_ELECTRONICA_GENERADA(String ORDEN_ELECTRONICA_GENERADA) {
        this.ORDEN_ELECTRONICA_GENERADA = ORDEN_ELECTRONICA_GENERADA;
    }

    public String getESTADO_ORDEN_ELECTRONICA() {
        return ESTADO_ORDEN_ELECTRONICA;
    }

    public void setESTADO_ORDEN_ELECTRONICA(String ESTADO_ORDEN_ELECTRONICA) {
        this.ESTADO_ORDEN_ELECTRONICA = ESTADO_ORDEN_ELECTRONICA;
    }

    public String getDOCUMENTO_ESTADO_OCAM() {
        return DOCUMENTO_ESTADO_OCAM;
    }

    public void setDOCUMENTO_ESTADO_OCAM(String DOCUMENTO_ESTADO_OCAM) {
        this.DOCUMENTO_ESTADO_OCAM = DOCUMENTO_ESTADO_OCAM;
    }

    public Date getFECHA_FORMALIZACIÓN() {
        return FECHA_FORMALIZACIÓN;
    }

    public void setFECHA_FORMALIZACIÓN(Date FECHA_FORMALIZACIÓN) {
        this.FECHA_FORMALIZACIÓN = FECHA_FORMALIZACIÓN;
    }

    public Date getFECHA_ULTIMO_ESTADO() {
        return FECHA_ULTIMO_ESTADO;
    }

    public void setFECHA_ULTIMO_ESTADO(Date FECHA_ULTIMO_ESTADO) {
        this.FECHA_ULTIMO_ESTADO = FECHA_ULTIMO_ESTADO;
    }

    public double getSUB_TOTAL() {
        return SUB_TOTAL;
    }

    public void setSUB_TOTAL(double SUB_TOTAL) {
        this.SUB_TOTAL = SUB_TOTAL;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(double TOTAL) {
        this.TOTAL = TOTAL;
    }

    public String getORDEN_DIGITALIZADA() {
        return ORDEN_DIGITALIZADA;
    }

    public void setORDEN_DIGITALIZADA(String ORDEN_DIGITALIZADA) {
        this.ORDEN_DIGITALIZADA = ORDEN_DIGITALIZADA;
    }

    public String getDESCRIPCION_ESTADO() {
        return DESCRIPCION_ESTADO;
    }

    public void setDESCRIPCION_ESTADO(String DESCRIPCION_ESTADO) {
        this.DESCRIPCION_ESTADO = DESCRIPCION_ESTADO;
    }

    public String getDESCRIPCION_CESION_DERECHOS() {
        return DESCRIPCION_CESION_DERECHOS;
    }

    public void setDESCRIPCION_CESION_DERECHOS(String DESCRIPCION_CESION_DERECHOS) {
        this.DESCRIPCION_CESION_DERECHOS = DESCRIPCION_CESION_DERECHOS;
    }

    public String getACUERDO_MARCO() {
        return ACUERDO_MARCO;
    }

    public void setACUERDO_MARCO(String ACUERDO_MARCO) {
        this.ACUERDO_MARCO = ACUERDO_MARCO;
    }

    @Override
    public String toString() {
        return FECHA_PROCESO + ";" + RUC_PROVEEDOR + ";" + PROVEEDOR + ";" + RUC_ENTIDAD + ";" + ENTIDAD + ";" + TIPO_PROCEDIMIENTO + ";" + ORDEN_ELECTRÓNICA + ";" + ORDEN_ELECTRONICA_GENERADA + ";" + ESTADO_ORDEN_ELECTRONICA + ";" + DOCUMENTO_ESTADO_OCAM + ";" + FECHA_FORMALIZACIÓN + ";" + FECHA_ULTIMO_ESTADO + ";" + SUB_TOTAL + ";" + IGV + ";" + TOTAL + ";" + ORDEN_DIGITALIZADA + ";" + DESCRIPCION_ESTADO + ";" + DESCRIPCION_CESION_DERECHOS + ";" + ACUERDO_MARCO;
    }
}
