package trabajo_final.estructura;

import trabajo_final.clases.Entidad;
import trabajo_final.interfaces.PilaInterface;

/**
 *
 * @author Flaven
 */
public class PilaEntidad implements PilaInterface {

    private int MAX = 0;
    private int TOPE = 0;

    private Entidad[] pilaEntidad;

    public PilaEntidad() {
        this.MAX = 10;
        this.TOPE = 0;
        this.pilaEntidad = new Entidad[this.MAX];
    }

    private boolean estaLlena() {
        if (this.TOPE >= this.MAX) {
            this.MAX += 1000;
            Entidad[] temp = new Entidad[this.MAX];
            for (int x = 0; x < this.pilaEntidad.length; x++) {
                temp[x] = this.pilaEntidad[x];
            }
            this.pilaEntidad = temp;
        }
        return this.TOPE >= this.MAX;
    }

    private boolean estaVacia() {
        return this.TOPE <= 0;
    }

    @Override
    public void Apilar(Object objeto) {
        if (this.estaLlena()) {
            System.out.println("Error: La pila ENTIDAD está LLENA.");
            throw new RuntimeException("");
        } else {
            this.pilaEntidad[this.TOPE] = (Entidad) objeto;
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
                System.out.print(pilaEntidad[i] + "-\n");
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

    public Entidad[] getPilaOrden() {
        return pilaEntidad;
    }

    public void setPilaEntidad(Entidad[] pilaEntidad) {
        int topeTemp=0;
        for (Entidad orden : pilaEntidad)
            if (orden != null) 
                topeTemp++;                    
        this.TOPE=topeTemp;
        this.pilaEntidad = pilaEntidad;
    }       
    
    
  
}
