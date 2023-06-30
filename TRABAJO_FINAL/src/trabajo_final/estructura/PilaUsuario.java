package trabajo_final.estructura;

import trabajo_final.clases.Usuario;
import trabajo_final.interfaces.PilaInterface;

/**
 *
 * @author Flaven
 */
public class PilaUsuario implements PilaInterface {

    private int MAX;
    private int TOPE;

    private Usuario[] pilaUsuario;

    public PilaUsuario() {
        this.MAX = 100;
        this.TOPE = 0;
        this.pilaUsuario = new Usuario[this.MAX];
    }

    private boolean estaLlena() {
        return this.TOPE >= this.MAX;
    }

    private boolean estaVacia() {
        return this.TOPE <= 0;
    }

    @Override
    public void Apilar(Object objeto) {
        if (this.estaLlena()) {
            System.out.println("Error: La pila USUARIO está LLENA.");
        } else {
            this.pilaUsuario[this.TOPE] = (Usuario) objeto;
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
                System.out.print(pilaUsuario[i].getCusuario()+"-"+pilaUsuario[i].getCcontrasena() + "\n");
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

    public Usuario[] getPilaUsuario() {
        return pilaUsuario;
    }

    public void setPilaUsuario(Usuario[] pilaUsuario) {
        this.pilaUsuario = pilaUsuario;
    }

}
