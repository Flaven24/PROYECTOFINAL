package trabajo_final.lectorArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import trabajo_final.clases.DtoOrdenElectronica;
import trabajo_final.clases.Entidad;
import trabajo_final.clases.TipoEntidad;
import trabajo_final.clases.Usuario;
import trabajo_final.datos.Archivos;
import trabajo_final.datos.Datos;
import trabajo_final.util.Nodo;
import trabajo_final.util.NodoInterfaceImpl;

/**
 *
 * @author TI_PROMEFAR
 */
public class LectorArchivos {
    private static DtoOrdenElectronica[] general;
    private SimpleDateFormat formatter= new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
    
    private NodoInterfaceImpl objNodo= new NodoInterfaceImpl();
    private Datos objDatos;    
    
    public LectorArchivos(){       
        if(general==null){
            leerArchivosEstadisticos();
            llenarEntidades();
            System.out.println("FIN");
        }
    }
    
    public Usuario[] leerUsuarios(){                
        StringBuilder db =LeerArchivo(Archivos.rutaUsuarios);
        System.out.println(db.toString().trim());
        int tamaño=0;
        for(String cadena :db.toString().split("\n")){
            if(!cadena.isEmpty()){
                tamaño++;            
            }
        }        
        
        Usuario[]usuarios = new Usuario[tamaño];
        int indice=0;
        for(String cadena :db.toString().split("\n")){
            if(!cadena.isEmpty()){
                Usuario usuario = new Usuario(Integer.valueOf(cadena.split(";")[0]),cadena.split(";")[1],cadena.split(";")[2],Integer.valueOf(cadena.split(";")[3]));
                usuarios[indice]=usuario;
                indice++;            
            }
        }
        return usuarios;
    }
    
    private void leerArchivosEstadisticos(){
        // LECTURA Y LLENADO DE ARCHIVOS ESTADISTICOS EN STRINGBUILDER
        String []rutas={Archivos.rutaBienes1,Archivos.rutaBienes2};//,Archivos.rutaBienes3};
        StringBuilder sb=new StringBuilder();
        
        System.out.println("Leyendo archivos");
        int tamaño=0;
        int origen=0;
        for(String ruta:rutas){            
            int cabecera=0;
            for(String cadena :LeerArchivo(ruta).toString().split("\n")){
                if(cabecera!=0){
                    sb.append(cadena+";"+origen+"\n");
                    tamaño++;
                }else{
                    origen++;
                }
                cabecera++;
            }            
        }
        general=new DtoOrdenElectronica[tamaño];
        int contador=0;
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
                DtoOrdenElectronica dto =new DtoOrdenElectronica(FECHA_PROCESO,  RUC_PROVEEDOR,  PROVEEDOR,  RUC_ENTIDAD,  ENTIDAD,  TIPO_PROCEDIMIENTO,  ORDEN_ELECTRÓNICA,  ORDEN_ELECTRONICA_GENERADA,  ESTADO_ORDEN_ELECTRONICA,  DOCUMENTO_ESTADO_OCAM,  FECHA_FORMALIZACIÓN,  FECHA_ULTIMO_ESTADO,  SUB_TOTAL,  IGV,  TOTAL,  ORDEN_DIGITALIZADA,  DESCRIPCION_ESTADO,  DESCRIPCION_CESION_DERECHOS,  ACUERDO_MARCO);                
                general[contador]=dto;
                contador++;
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        for(DtoOrdenElectronica dto:general){
            //System.out.println(dto.toString());
        }
        
        System.out.println("Creacion de objetos terminada");                    
    }
        
    private void llenarEntidades(){
        objNodo= new NodoInterfaceImpl();
        System.out.println("LLENANDO ENTIDADES");
        objNodo.insertarInicio(new Nodo(new Entidad(0, general[0].getRUC_ENTIDAD(), general[0].getENTIDAD(), TipoEntidad.ENTIDAD)));        
        objNodo.insertarFinal(new Nodo(new Entidad(0, general[0].getRUC_PROVEEDOR(), general[0].getPROVEEDOR(), TipoEntidad.PROVEEDOR)));
        for(int x=1;x<general.length-1;x++){
            objNodo.insertarFinal(new Nodo(new Entidad(0, general[x].getRUC_PROVEEDOR(), general[x].getPROVEEDOR(), TipoEntidad.PROVEEDOR)));                        
            objNodo.insertarFinal(new Nodo(new Entidad(0, general[x+1].getRUC_PROVEEDOR(), general[x].getPROVEEDOR(), TipoEntidad.PROVEEDOR)));            
            x++;            
        }
        Nodo EntidadesGeneral=objNodo.getNodo();                
        
        objNodo= new NodoInterfaceImpl();
        Nodo iterador=EntidadesGeneral;
        
        
        Nodo temporalInicio=new Nodo((Entidad)EntidadesGeneral.getNodo(),null);
        //temporalInicio.setSiguiente(null);
        objNodo.insertarInicio(temporalInicio);
        
        
        
        while(iterador!=null){
            if (iterador.getNodo() != null) {
                Entidad entidad=(Entidad)iterador.getNodo();
                objNodo.insertaOrden(entidad);
            }
            iterador=iterador.getSiguiente();
        }
        
        Nodo nodo =objNodo.sinDuplicados(EntidadesGeneral);
        System.out.println("S/DUPL");
        while(nodo!=null){
            if (nodo.getNodo() != null) {
                Entidad entidad=(Entidad)nodo.getNodo();
                System.out.println(entidad);
            }
            nodo=nodo.getSiguiente();
        }
        
    }

    // CONTROLADORES
    public StringBuilder LeerArchivo(String ruta){
         BufferedReader archivoEntrada = null;
        try{
            StringBuilder lector = new StringBuilder();
            existeArchivo(ruta);
            archivoEntrada= new BufferedReader(new FileReader(new File (ruta)));
            
            String linea =null;
            while((linea=archivoEntrada.readLine())!=null){
                lector.append(linea+"\n");
            }
            archivoEntrada.close();
            return lector;
        }catch(IOException ex){
            System.out.println("Error "+ex.getMessage());
            return null;
        }finally{
            try{
                if(archivoEntrada!=null)
                    archivoEntrada.close();
           }catch(Exception ex2){
               ex2.printStackTrace();
                System.out.println("Error "+ex2.getMessage());
           }
        }
    }
    
    public void EscribirArchivo(StringBuilder texto,String ruta){
        BufferedWriter archivoSalida = null;
        try{
            archivoSalida= new BufferedWriter(new FileWriter(new File(ruta)));
            archivoSalida.append(texto.toString());
            archivoSalida.close();
        }catch(IOException ex){
            System.out.println("Error "+ex.getMessage());
        }finally{
            try{
                if(archivoSalida!=null)
                    archivoSalida.close();
           }catch(Exception ex2){
               ex2.printStackTrace();
                System.out.println("Error "+ex2.getMessage());
           }
        }
    }
    
    public void existeArchivo(String ruta){
        try{
            File file = new File(ruta);
            if(!file.exists())
                file.createNewFile();        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

}
