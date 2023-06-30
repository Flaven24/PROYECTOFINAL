package trabajo_final.estructura;

/**
 *
 * @author Flaven
 */
public class Pila<T> {

    private int MAX;
    private int TOPE;
    private T[] pila;

    public Pila() {
        this.MAX = 100;
        this.TOPE = 0;
        this.pila = (T[]) new Object[this.MAX];
    }

    private boolean estaLlena() {
         if (this.TOPE >= this.MAX) {
            this.MAX += 1000;
            T[] temp = (T[]) new Object[this.MAX];
            for (int x = 0; x < this.pila.length; x++) {
                temp[x] = this.pila[x];
            }
            this.pila = temp;
        }
        return this.TOPE >= this.MAX;
    }

    private boolean estaVacia() {
        return this.TOPE <= 0;
    }

    public void Apilar(T objeto) {
        if (this.estaLlena()) {
            System.out.println("Error: La pila está LLENA.");
        } else {
            this.pila[this.TOPE] = objeto;
            if (this.TOPE <= this.MAX) {
                this.TOPE++;
            }
        }
    }

    public void Desapilar() {
        if (this.estaVacia()) {
            System.out.println("Error: La pila está VACIA.");
        } else {
            if (this.TOPE >= 0) {
                TOPE--;
            }
        }
    }

    public void ImprimirPila() {
        if (this.estaVacia()) {
            System.out.println("Error: La Pila está VACIA.");
        } else {
            System.out.println("\n------------");
            for (int i = TOPE - 1; i >= 0; i--) {
                System.out.print(pila[i].toString() + "\n");
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

    public T[] getPila() {
        return pila;
    }

    public void setPila(T[] pila) {
        this.pila = pila;
    }
    
    
}
