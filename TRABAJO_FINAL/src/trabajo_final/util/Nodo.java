package trabajo_final.util;

/**
 *
 * @author Acer
 */
public class Nodo {

    private Object nodo;
    private Nodo siguiente;

    public Nodo(Object obj) {
        this.nodo = obj;
        this.siguiente = null;
    }

    public Nodo(Object obj, Nodo siguiente) {
        this.nodo = obj;
        this.siguiente = siguiente;
    }

    public Object getNodo() {
        return nodo;
    }

    public void setNodo(Object nodo) {
        this.nodo = nodo;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return nodo.toString();
    }
            
}
