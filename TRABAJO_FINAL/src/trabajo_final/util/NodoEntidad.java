package trabajo_final.util;

import trabajo_final.clases.Entidad;

/**
 *
 * @author Flaven
 */
public class NodoEntidad extends Nodo{

    private Entidad nodo;
    private NodoEntidad siguiente;      

    public NodoEntidad(Entidad obj) {
        super(obj);
        this.nodo = obj;
        this.siguiente = null;
    }

    public NodoEntidad(Entidad obj, NodoEntidad siguiente) {
        super(obj, siguiente);
        this.nodo = obj;
        this.siguiente = siguiente;
    }

    public Entidad getNodo() {
        return nodo;
    }

    public void setNodo(Entidad nodo) {
        this.nodo = nodo;
    }

    public NodoEntidad getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEntidad siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return nodo.toString();
    }
    
    
    
}
