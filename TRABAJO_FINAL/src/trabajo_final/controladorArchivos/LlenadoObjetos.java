package trabajo_final.controladorArchivos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import trabajo_final.clases.DtoAcuerdoMarco;
import trabajo_final.clases.DtoFecha;
import trabajo_final.clases.Entidad;
import trabajo_final.clases.OrdenElectronica;
import trabajo_final.clases.Proveedor;
import trabajo_final.clases.Usuario;
import trabajo_final.datos.Archivos;
import trabajo_final.datos.Datos;
import trabajo_final.estructura.Pila;
import trabajo_final.estructura.PilaOrdenElectronica;
import trabajo_final.estructura.PilaUsuario;
import trabajo_final.util.EntidadNodoInterfaceImpl;

/**
 *
 * @author Flaven
 */
public class LlenadoObjetos {
        
    private LectorArchivos lector= new LectorArchivos();
    private SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        
    private EntidadNodoInterfaceImpl objNodo= new EntidadNodoInterfaceImpl();
    private Datos objDatos;
    
    private PilaUsuario pilaUsuario= new PilaUsuario();
    private PilaOrdenElectronica pilaOrdenElectronica= new PilaOrdenElectronica();
            
    public LlenadoObjetos(){
        llenarUsuarios();
        llenarGeneral();
        llenadoEntidades();
        llenadoProveedores();
        
        llenadoFechas();
        llenadoAcuerdoMarco();
        
//        if(Datos.getPilaOrdenElectronica() ==null){
//            leerUsuarios();
//            leerArchivosEstadisticos();
//            llenarEntidades();     
//            
//        }
    }
    
    public void llenarUsuarios(){                
        StringBuilder db =lector.LeerArchivo(Archivos.rutaUsuarios);        
        int tamaño=0;
        for(String cadena :db.toString().split("\n")){
            if(!cadena.isEmpty()){
                tamaño++;                
                Usuario usuario= new Usuario(cadena.split(";")[0],cadena.split(";")[1],cadena.split(";")[2],cadena.split(";")[3]);
                pilaUsuario.Apilar(usuario);
            }
        }       
        objDatos.setUsuarios(pilaUsuario.getPilaUsuario()); 
    }
    
    private void llenarGeneral(){
        // LECTURA Y LLENADO DE ARCHIVOS ESTADISTICOS EN STRINGBUILDER
        //String []rutas={Archivos.rutaBienes1,Archivos.rutaBienes2,Archivos.rutaBienes3};
        //String []rutas={Archivos.rutaBienes1,Archivos.ruta//Bienes2};//,Archivos.rutaBienes3};
        String []rutas={Archivos.rutaBienes1};//,Archivos.rutaBienes3};
        StringBuilder sb=new StringBuilder();
        
        System.out.println("Leyendo archivos");        
        int origen=0;
        for(String ruta:rutas){            
            int cabecera=0;
            for(String cadena :lector.LeerArchivo(ruta).toString().split("\n")){
                if(cabecera!=0){
                    sb.append(cadena+";"+origen+"\n");                    
                }else{
                    origen++;
                }
                cabecera++;
            }            
        }        
                        
        for(String cadena:sb.toString().split("\n")){
            try{
                switch(Integer.valueOf(cadena.split(";")[19])){
                    case 1:
                        formatter= new SimpleDateFormat("dd/MM/yyyy hh:mm");                       
                        break;
                    case 2:
                    case 3:
                        formatter= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                        break;
                    default:break;
                }
                Date FECHA_PROCESO=formatter.parse(cadena.split(";")[0]);
                Date FECHA_FORMALIZACIÓN=formatter.parse(cadena.split(";")[10]);
                Date FECHA_ULTIMO_ESTADO=formatter.parse(cadena.split(";")[11]);
                String RUC_PROVEEDOR=cadena.split(";")[1];
                String PROVEEDOR=cadena.split(";")[2];
                String RUC_ENTIDAD=cadena.split(";")[3];
                String ENTIDAD=cadena.split(";")[4];
                String TIPO_PROCEDIMIENTO=cadena.split(";")[5];
                String ORDEN_ELECTRÓNICA=cadena.split(";")[6];
                String ORDEN_ELECTRONICA_GENERADA=cadena.split(";")[7];
                String ESTADO_ORDEN_ELECTRONICA=cadena.split(";")[8];
                String DOCUMENTO_ESTADO_OCAM=cadena.split(";")[9];
                double SUB_TOTAL=Double.valueOf(cadena.split(";")[12]);
                double IGV=Double.valueOf(cadena.split(";")[13]);
                double TOTAL=Double.valueOf(cadena.split(";")[14]);
                String ORDEN_DIGITALIZADA=cadena.split(";")[15];
                String DESCRIPCION_ESTADO=cadena.split(";")[16];
                String DESCRIPCION_CESION_DERECHOS=cadena.split(";")[17];
                String ACUERDO_MARCO=cadena.split(";")[18];
                OrdenElectronica ordenElectronica =new OrdenElectronica(FECHA_PROCESO,  RUC_PROVEEDOR,  PROVEEDOR,  RUC_ENTIDAD,  ENTIDAD,  TIPO_PROCEDIMIENTO,  ORDEN_ELECTRÓNICA,  ORDEN_ELECTRONICA_GENERADA,  ESTADO_ORDEN_ELECTRONICA,  DOCUMENTO_ESTADO_OCAM,  FECHA_FORMALIZACIÓN,  FECHA_ULTIMO_ESTADO,  SUB_TOTAL,  IGV,  TOTAL,  ORDEN_DIGITALIZADA,  DESCRIPCION_ESTADO,  DESCRIPCION_CESION_DERECHOS,  ACUERDO_MARCO);                
//                System.out.println(ordenElectronica.toString());
                pilaOrdenElectronica.Apilar(ordenElectronica);                                                
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }         
        Datos.setPilaOrdenElectronica(pilaOrdenElectronica.getPilaOrden());
        System.out.println("Creacion de objetos terminada");
               
        pilaOrdenElectronica.setPilaOrden(OrdenQuickSortEntidad(pilaOrdenElectronica.getPilaOrden(),0,pilaOrdenElectronica.getTOPE()-1));                
        System.out.println("######DATOS ORDENADOS######");
        //pilaOrdenElectronica.ImprimirPila();
        Datos.setPilaOrdenElectronica(pilaOrdenElectronica.getPilaOrden());
        Datos.setOrdenFiltrada(pilaOrdenElectronica.getPilaOrden());
    }
    
    private OrdenElectronica[] OrdenQuickSortEntidad(OrdenElectronica[] orden,int primero, int ultimo ){
        if (ultimo - primero < 1) {
            return orden;
        }
        OrdenElectronica pivote = orden[ultimo];        
        int indice = primero - 1;

        for (int i = primero; i < ultimo; i++) {
            if (orden[i].getENTIDAD().compareTo(pivote.getENTIDAD())<0) {
                swap(orden, ++indice, i);
            }
        }
        swap(orden, indice + 1, ultimo);
        OrdenQuickSortEntidad(orden, primero, indice);
        OrdenQuickSortEntidad(orden, indice + 2, ultimo);
        return orden;
    }
    
    private OrdenElectronica[] OrdenQuickSortProveedor(OrdenElectronica[] orden,int primero, int ultimo ){
        if (ultimo - primero < 1) {
            return orden;
        }
        OrdenElectronica pivote = orden[ultimo];        
        int indice = primero - 1;

        for (int i = primero; i < ultimo; i++) {
            if (orden[i].getPROVEEDOR().compareTo(pivote.getPROVEEDOR())<0) {
                swap(orden, ++indice, i);
            }
        }
        swap(orden, indice + 1, ultimo);
        OrdenQuickSortProveedor(orden, primero, indice);
        OrdenQuickSortProveedor(orden, indice + 2, ultimo);
        return orden;
    }
    
    private OrdenElectronica[] OrdenQuickSortFechas(OrdenElectronica[] orden,int primero, int ultimo ){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        if (ultimo - primero < 1) {
            return orden;
        }
        OrdenElectronica pivote = orden[ultimo];        
        int indice = primero - 1;

        for (int i = primero; i < ultimo; i++) {
            if (format.format(orden[i].getFECHA_FORMALIZACIÓN()).compareTo(format.format(pivote.getFECHA_FORMALIZACIÓN()))<0) {
                swap(orden, ++indice, i);
            }
        }
        swap(orden, indice + 1, ultimo);
        OrdenQuickSortFechas(orden, primero, indice);
        OrdenQuickSortFechas(orden, indice + 2, ultimo);
        return orden;
    }
    
    private OrdenElectronica[] OrdenQuickSortAcuerdos(OrdenElectronica[] orden,int primero, int ultimo ){
        if (ultimo - primero < 1) {
            return orden;
        }
        OrdenElectronica pivote = orden[ultimo];        
        int indice = primero - 1;

        for (int i = primero; i < ultimo; i++) {
            if (orden[i].getACUERDO_MARCO().compareTo(pivote.getACUERDO_MARCO())<0) {
                swap(orden, ++indice, i);
            }
        }
        swap(orden, indice + 1, ultimo);
        OrdenQuickSortAcuerdos(orden, primero, indice);
        OrdenQuickSortAcuerdos(orden, indice + 2, ultimo);
        return orden;
    }
    
    public void swap(OrdenElectronica arreglo[], int primero, int segundo) {
        OrdenElectronica temp = arreglo[primero];
        arreglo[primero] = arreglo[segundo];
        arreglo[segundo] = temp;
    }      
    
    private void llenadoEntidades(){
        PilaOrdenElectronica pila = new PilaOrdenElectronica();        
        pila.setPilaOrden(OrdenQuickSortEntidad(pilaOrdenElectronica.getPilaOrden(),0,pilaOrdenElectronica.getTOPE()-1));        
        Entidad[]entidades;
        if (pila.getTOPE() == 0 || pila.getTOPE()== 1) {
            
        }
        
        OrdenElectronica[] temp = new OrdenElectronica[pila.getTOPE()];
        int n=pila.getTOPE();
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (!pila.getPilaOrden()[i].getRUC_ENTIDAD().contains(pila.getPilaOrden()[i + 1].getRUC_ENTIDAD())) {
                temp[j++] = pila.getPilaOrden()[i];
            }
        }
 
        temp[j++] = pila.getPilaOrden()[n - 1];
        entidades= new Entidad[j];
        for (int i = 0; i < j; i++) {
            entidades[i]= new Entidad(temp[i].getENTIDAD(), temp[i].getRUC_ENTIDAD());            
        }
        
        Datos.setPilaEntidad(entidades);
    }
    
    private void llenadoProveedores(){
        PilaOrdenElectronica pila = new PilaOrdenElectronica();        
        pila.setPilaOrden(OrdenQuickSortProveedor(pilaOrdenElectronica.getPilaOrden(),0,pilaOrdenElectronica.getTOPE()-1));        
        Proveedor[]proveedores;
        if (pila.getTOPE() == 0 || pila.getTOPE()== 1) {
            
        }
        
        OrdenElectronica[] temp = new OrdenElectronica[pila.getTOPE()];
        int n=pila.getTOPE();
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (!pila.getPilaOrden()[i].getRUC_PROVEEDOR().contains(pila.getPilaOrden()[i + 1].getRUC_PROVEEDOR())) {
                temp[j++] = pila.getPilaOrden()[i];
            }
        }
 
        temp[j++] = pila.getPilaOrden()[n - 1];
        proveedores= new Proveedor[j];
        for (int i = 0; i < j; i++) {
            proveedores[i]= new Proveedor(temp[i].getPROVEEDOR(), temp[i].getRUC_PROVEEDOR());            
        }
        
        Datos.setPilaProveedor(proveedores);
    }
    
    private void llenadoFechas(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal1= Calendar.getInstance();
        Calendar cal2= Calendar.getInstance();
        
        
        
        PilaOrdenElectronica pila = new PilaOrdenElectronica();        
        pila.setPilaOrden(OrdenQuickSortFechas(pilaOrdenElectronica.getPilaOrden(),0,pilaOrdenElectronica.getTOPE()-1));        
        DtoFecha[]fechas;
        if (pila.getTOPE() == 0 || pila.getTOPE()== 1) {            
        }
        
        OrdenElectronica[] temp = new OrdenElectronica[pila.getTOPE()];
        int n=pila.getTOPE();
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
//            cal1.setTime(pila.getPilaOrden()[i].getFECHA_FORMALIZACIÓN());
//            cal1.set(Calendar.HOUR_OF_DAY, 0);
//            cal1.set(Calendar.MINUTE, 0);
//            cal1.set(Calendar.SECOND, 0);
//
//            cal2.setTime(pila.getPilaOrden()[i + 1].getFECHA_FORMALIZACIÓN());
//            cal2.set(Calendar.HOUR_OF_DAY, 0);
//            cal2.set(Calendar.MINUTE, 0);
//            cal2.set(Calendar.SECOND, 0);
            
//            if (!cal1.equals(cal2)) {
//                temp[j++] = pila.getPilaOrden()[i];
//            }
            if (!format.format(pila.getPilaOrden()[i].getFECHA_FORMALIZACIÓN()).equals(format.format(pila.getPilaOrden()[i+1].getFECHA_FORMALIZACIÓN()))) {
                temp[j++] = pila.getPilaOrden()[i];
            }
        }
 
        temp[j++] = pila.getPilaOrden()[n - 1];
        fechas= new DtoFecha[j];
        for (int i = 0; i < j; i++) {
            fechas[i]= new DtoFecha(format.format(temp[i].getFECHA_FORMALIZACIÓN()));
        }
        
        Datos.setPilaFechas(fechas);
    }
    
    private void llenadoAcuerdoMarco(){
        PilaOrdenElectronica pila = new PilaOrdenElectronica();        
        pila.setPilaOrden(OrdenQuickSortAcuerdos(pilaOrdenElectronica.getPilaOrden(),0,pilaOrdenElectronica.getTOPE()-1));        
        DtoAcuerdoMarco[]acuerdos;
        if (pila.getTOPE() == 0 || pila.getTOPE()== 1) {
            
        }
        
        OrdenElectronica[] temp = new OrdenElectronica[pila.getTOPE()];
        int n=pila.getTOPE();
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (!pila.getPilaOrden()[i].getACUERDO_MARCO().contains(pila.getPilaOrden()[i + 1].getACUERDO_MARCO())) {
                temp[j++] = pila.getPilaOrden()[i];
            }
        }
 
        temp[j++] = pila.getPilaOrden()[n - 1];
        acuerdos= new DtoAcuerdoMarco[j];
        for (int i = 0; i < j; i++) {
            acuerdos[i]= new DtoAcuerdoMarco(temp[i].getACUERDO_MARCO());
        }
        
        Datos.setPilaAcuerdoMarco(acuerdos);
    }
    
//    private void llenadoEntidades(){
//        objNodo= new EntidadNodoInterfaceImpl();
//        // LLENADO ENTIDADES
//        objNodo.insertarInicio(new NodoEntidad(new Entidad(0, general[0].getRUC_PROVEEDOR(), general[0].getPROVEEDOR().trim(), TipoEntidad.PROVEEDOR)));        
//        objNodo.insertarFinal(new NodoEntidad(new Entidad(0, general[0].getRUC_ENTIDAD(), general[0].getENTIDAD().trim(), TipoEntidad.ENTIDAD)));                
//        for(int x=1;x<general.length-1;x++){
//            objNodo.insertarFinal(new NodoEntidad(new Entidad(0, general[x].getRUC_PROVEEDOR(), general[x].getPROVEEDOR().trim(), TipoEntidad.PROVEEDOR)));                        
//            objNodo.insertarFinal(new NodoEntidad(new Entidad(0, general[x].getRUC_ENTIDAD(), general[x].getENTIDAD().trim(), TipoEntidad.ENTIDAD)));            
//        }
//        NodoEntidad EntidadesGeneral=objNodo.getCabecera();
//                
//        objNodo= new EntidadNodoInterfaceImpl();
//        NodoEntidad temporalInicio=new NodoEntidad(EntidadesGeneral.getNodo(),null);
//        objNodo.insertarInicio(temporalInicio);        
//        
//        // ORDEN
//        NodoEntidad iterador=EntidadesGeneral;        
//        while(iterador!=null){
//            if (iterador.getNodo() != null) {
//                Entidad entidad=iterador.getNodo();
//                objNodo.insertaOrden(entidad);
//            }
//            iterador=iterador.getSiguiente();
//        }                                
//        // QUITAR DUPLICADOS
//        NodoEntidad nodo=objNodo.sinDuplicados(objNodo.getCabecera());
//        objNodo= new EntidadNodoInterfaceImpl();
//        objNodo.setCabecera(nodo);        
//        System.out.println(objNodo.imprimirLista());
//        objDatos.nodoEntidad=nodo;
//        System.out.println("fin");
//    }
         
}
