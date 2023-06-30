package trabajo_final.datos;

import trabajo_final.clases.DtoAcuerdoMarco;
import trabajo_final.clases.DtoFecha;
import trabajo_final.clases.Entidad;
import trabajo_final.clases.OrdenElectronica;
import trabajo_final.clases.Proveedor;
import trabajo_final.clases.Usuario;

/**
 *
 * @author Flaven
 */
public class Datos {

    private static Usuario []usuarios= new Usuario[0];
    private static OrdenElectronica []pilaOrdenElectronica= new OrdenElectronica[0];
    
    // FILTRO
    private static Entidad []pilaEntidad= new Entidad[0];
    private static Proveedor []pilaProveedor= new Proveedor[0];
    private static DtoFecha []pilaFechas= new DtoFecha[0];
    private static DtoAcuerdoMarco []pilaAcuerdoMarco= new DtoAcuerdoMarco[0];
    // FILTRO
    
    private static OrdenElectronica[] ordenFiltrada= new OrdenElectronica[0];

    public static Usuario[] getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(Usuario[] usuarios) {
        Datos.usuarios = usuarios;
    }

    public static OrdenElectronica[] getPilaOrdenElectronica() {
        return pilaOrdenElectronica;
    }

    public static void setPilaOrdenElectronica(OrdenElectronica[] pilaOrdenElectronica) {
        Datos.pilaOrdenElectronica = pilaOrdenElectronica;
    }

    public static Entidad[] getPilaEntidad() {
        return pilaEntidad;
    }

    public static void setPilaEntidad(Entidad[] pilaEntidad) {
        Datos.pilaEntidad = pilaEntidad;
    }

    public static Proveedor[] getPilaProveedor() {
        return pilaProveedor;
    }

    public static void setPilaProveedor(Proveedor[] pilaProveedor) {
        Datos.pilaProveedor = pilaProveedor;
    }

    public static OrdenElectronica[] getOrdenFiltrada() {
        return ordenFiltrada;
    }

    public static void setOrdenFiltrada(OrdenElectronica[] ordenFiltrada) {
        Datos.ordenFiltrada = ordenFiltrada;
    }

    public static DtoFecha[] getPilaFechas() {
        return pilaFechas;
    }

    public static void setPilaFechas(DtoFecha[] pilaFechas) {
        Datos.pilaFechas = pilaFechas;
    }

    public static DtoAcuerdoMarco[] getPilaAcuerdoMarco() {
        return pilaAcuerdoMarco;
    }

    public static void setPilaAcuerdoMarco(DtoAcuerdoMarco[] pilaAcuerdoMarco) {
        Datos.pilaAcuerdoMarco = pilaAcuerdoMarco;
    }
        
}
