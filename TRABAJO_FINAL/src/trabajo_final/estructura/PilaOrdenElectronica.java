package trabajo_final.estructura;

import java.util.Calendar;
import java.util.Date;
import trabajo_final.clases.OrdenElectronica;
import trabajo_final.interfaces.PilaInterface;

/**
 *
 * @author Flaven
 */
public class PilaOrdenElectronica implements PilaInterface {

    private int MAX = 0;
    private int TOPE = 0;

    private OrdenElectronica[] pilaOrden;

    public PilaOrdenElectronica() {
        this.MAX = 10;
        this.TOPE = 0;
        this.pilaOrden = new OrdenElectronica[this.MAX];
    }

    private boolean estaLlena() {
        if (this.TOPE >= this.MAX) {
            this.MAX += 1000;
            OrdenElectronica[] temp = new OrdenElectronica[this.MAX];
            for (int x = 0; x < this.pilaOrden.length; x++) {
                temp[x] = this.pilaOrden[x];
            }
            this.pilaOrden = temp;
        }
        return this.TOPE >= this.MAX;
    }

    private boolean estaVacia() {
        return this.TOPE <= 0;
    }

    @Override
    public void Apilar(Object objeto) {
        if (this.estaLlena()) {
            System.out.println("Error: La pila ORDEN ELECTRONICA está LLENA.");
            throw new RuntimeException("");
        } else {
            this.pilaOrden[this.TOPE] = (OrdenElectronica) objeto;
            if (this.TOPE <= this.MAX) {
                this.TOPE++;
            }
        }
    }

    @Override
    public void Desapilar() {
        if (this.estaVacia()) {
            System.out.println("Error: La pila está VACIA.");
        } else {
            //OrdenElectronica orden=pilaOrden[this.TOPE-1];
            if (this.TOPE >= 0) {
                TOPE--;
            }
        }
    }

    @Override
    public void ImprimirPila() {
        if (this.estaVacia()) {
            System.out.println("Error: La Pila está VACIA.");
        } else {
            System.out.println("\n------------");
            for (int i = TOPE - 1; i >= 0; i--) {
                System.out.print(pilaOrden[i] + "-\n");
            }
            System.out.println("\n------------\n");
        }
    }

    public int getMAX() {
        return MAX;
    }

    public void setMAX(int MAX) {
        this.MAX = MAX;
    }

    public int getTOPE() {
        return TOPE;
    }

    public void setTOPE(int TOPE) {
        this.TOPE = TOPE;
    }

    public OrdenElectronica[] getPilaOrden() {
        return pilaOrden;
    }

    public void setPilaOrden(OrdenElectronica[] pilaOrden) {
        int topeTemp=0;
        for (OrdenElectronica orden : pilaOrden)
            if (orden != null) 
                topeTemp++;                    
        this.TOPE=topeTemp;
        this.pilaOrden = pilaOrden;
    }       
    
    // BÚSQUEDA SECUENCIAL    
    public PilaOrdenElectronica buscarPorRucEntidad(String rucEntidad){
        PilaOrdenElectronica encontrados= new PilaOrdenElectronica();
        encontrados.setMAX(10);  
        encontrados.setTOPE(0);  
        for(int x=0;x<this.TOPE;x++){            
            if((rucEntidad.length()>0&&this.pilaOrden[x].getRUC_ENTIDAD().contains(rucEntidad))){
                encontrados.Apilar(pilaOrden[x]);
            }
        }
        return encontrados;    
    }
    
    public PilaOrdenElectronica buscarPorRucProveedor(String rucProveedor){
        PilaOrdenElectronica encontrados= new PilaOrdenElectronica();
        encontrados.setMAX(10);  
        encontrados.setTOPE(0);  
        for(int x=0;x<this.TOPE;x++){            
            if((!"".equals(rucProveedor)&&this.pilaOrden[x].getRUC_PROVEEDOR().contains(rucProveedor))){
                encontrados.Apilar(pilaOrden[x]);
            }
        }
        return encontrados;    
    }
    
    public PilaOrdenElectronica buscarPorFecha(Date fecha){
        Calendar cal = Calendar.getInstance();
        Calendar calFecha = Calendar.getInstance();
        calFecha.setTime(fecha);
        calFecha.set(Calendar.HOUR_OF_DAY, 0);
        calFecha.set(Calendar.MINUTE, 0);
        calFecha.set(Calendar.SECOND, 0);
        System.out.println(calFecha.getTime());
        
        PilaOrdenElectronica encontrados= new PilaOrdenElectronica();
        encontrados.setMAX(10);  
        encontrados.setTOPE(0);  
        for(int x=0;x<this.TOPE;x++){
            cal.setTime(this.pilaOrden[x].getFECHA_FORMALIZACIÓN());
            cal.set(Calendar.HOUR_OF_DAY, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
                        
            System.out.println("F2: "+cal.getTime());
            
            if(cal.getTime().equals(calFecha.getTime())){
                encontrados.Apilar(pilaOrden[x]);
            }
        }
        return encontrados;    
    }
    
    public PilaOrdenElectronica buscarPorAcuerdo(String acuerdoMarco){
        PilaOrdenElectronica encontrados= new PilaOrdenElectronica();
        encontrados.setMAX(10);  
        encontrados.setTOPE(0);  
        for(int x=0;x<this.TOPE;x++){            
            if(acuerdoMarco.length()>0&&this.pilaOrden[x].getACUERDO_MARCO().contains(acuerdoMarco)){
                encontrados.Apilar(pilaOrden[x]);
            }
        }
        return encontrados;    
    }
    
    public OrdenElectronica[] quitarRepetidos(){
        PilaOrdenElectronica pila = new PilaOrdenElectronica();        
        pila.setPilaOrden(OrdenQuickSortProveedor(pilaOrden,0,getTOPE()-1));
        
        OrdenElectronica[]ordenes;
        if (pila.getTOPE() == 0 || pila.getTOPE()== 1) {
            
        }
        
        OrdenElectronica[] temp = new OrdenElectronica[pila.getTOPE()];
        int n=pila.getTOPE();
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (!pila.getPilaOrden()[i].toString().contains(pila.getPilaOrden()[i + 1].toString())) {
                temp[j++] = pila.getPilaOrden()[i];
            }
        }
 
        temp[j++] = pila.getPilaOrden()[n - 1];
        ordenes= new OrdenElectronica[j];
        for (int i = 0; i < j; i++) {
            ordenes[i]= temp[i];
        }
        return ordenes;
    }
    
    public OrdenElectronica[] OrdenQuickSortProveedor(OrdenElectronica[] orden,int primero, int ultimo){
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
    
    private void swap(OrdenElectronica arreglo[], int primero, int segundo) {
        OrdenElectronica temp = arreglo[primero];
        arreglo[primero] = arreglo[segundo];
        arreglo[segundo] = temp;
    }
  
}
