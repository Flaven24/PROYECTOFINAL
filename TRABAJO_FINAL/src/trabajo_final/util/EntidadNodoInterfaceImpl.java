package trabajo_final.util;

import trabajo_final.clases.Entidad;

/**
 *
 * @author Acer
 */
public class EntidadNodoInterfaceImpl implements NodoInterface {

    NodoEntidad cabecera;

    public EntidadNodoInterfaceImpl() {
        cabecera = new NodoEntidad(null);
    }

    private boolean estaVacia() {
        if (this.cabecera.getNodo() == null) {
            return true;
        } else {
            return false;
        }
    }

    private NodoEntidad buscarUltimoNodo() {
        NodoEntidad iterador = this.cabecera;
        while (iterador.getSiguiente() != null) {
            iterador = iterador.getSiguiente();
        }
        return iterador;
    }

    @Override
    public void insertarFinal(Nodo nuevoNodo) {
        NodoEntidad iterador = this.cabecera;
        if (estaVacia()) {
            //this.cabecera.setNodo(nuevoNodo);
            this.cabecera.setSiguiente((NodoEntidad)nuevoNodo);
            nuevoNodo.setSiguiente(null);
        } else {
            while (iterador.getSiguiente() != null) {
                iterador = iterador.getSiguiente();
            }
            iterador.setSiguiente((NodoEntidad)nuevoNodo);
            nuevoNodo.setSiguiente(null);
        }
    }
    
    @Override
    public void insertarInicio(Nodo nuevoNodo) {
        if (estaVacia()) {
            this.cabecera = (NodoEntidad)nuevoNodo;
            nuevoNodo.setSiguiente(null);
        } else {
            nuevoNodo.setSiguiente(this.cabecera);
            this.cabecera = (NodoEntidad)nuevoNodo;
        }
    }
    
    public String retirarInicio() {       
        NodoEntidad iterador = this.cabecera;
        NodoEntidad nodoEliminar = null;
        if (this.estaVacia()) {
            return null;
        }

        if (iterador.getSiguiente() == null) {// 5 4 3 2 1
            nodoEliminar = iterador;
            this.cabecera.setNodo(null);
        } else {
            nodoEliminar = iterador;
            this.cabecera = iterador.getSiguiente();
            iterador = null;

        }
        return String.valueOf(nodoEliminar.getNodo());
    }

    public String retirarFinal() {
        Nodo iterador = this.cabecera;
        Nodo nodoEliminar = null;

        // SI LA LISTA ESTÁ VACIA
        if (this.estaVacia()) {
            return null;
        }

        // SI SOLO SE TIENE UN ELEMENTO
        if (iterador.getSiguiente() == null) {
            nodoEliminar = iterador;
            this.cabecera.setNodo(null);
        } else {
            // LA LISTA TIENE NODOS
            // AVANZA DE DOS PARA HALLAR EL ULTIMO
            while (iterador.getSiguiente().getSiguiente() != null) {
                iterador = iterador.getSiguiente();
            }

            nodoEliminar = iterador.getSiguiente();
            iterador.setSiguiente(null);
        }
        return String.valueOf(nodoEliminar.getNodo());
    }

    public String imprimirLista() {
        String cadena = "";
        NodoEntidad iterador = this.cabecera;

        while (iterador != null) {
            if (iterador.getNodo() != null) {
                cadena += iterador.toString() + "=>\n";
            }
            iterador = iterador.getSiguiente();
        }
        return cadena;
    }

    public void insertaOrden(Entidad nuevoDato) {
        NodoEntidad nuevo = new NodoEntidad(nuevoDato);
        if (this.cabecera == null) {
            this.cabecera = nuevo;
        } else if (nuevoDato.getCnombre().compareTo(this.cabecera.getNodo().getCnombre()) < 0) {
            nuevo.setSiguiente(this.cabecera);
            this.cabecera = nuevo;          
        } else {
            NodoEntidad anterior, iterador;
            anterior = iterador = this.cabecera;
            // ubica la posicion donde se va a ingresar el nuevo nodo
            while ((iterador.getSiguiente() != null) && (nuevoDato.getCnombre().compareTo(iterador.getNodo().getCnombre())) > 0) {
                anterior = iterador;
                iterador = iterador.getSiguiente();
            }
            if ((nuevoDato.getCnombre().compareTo(iterador.getNodo().getCnombre().toString())) > 0) {
                anterior = iterador;
            }
            nuevo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevo);
        }
    }

    public NodoEntidad sinDuplicados(NodoEntidad nodo) {
        NodoEntidad iterador = nodo;        
        while (iterador.getSiguiente()!= null) {
            if (iterador.getNodo().getCnombre().equals(iterador.getSiguiente().getNodo().getCnombre())) {
                iterador.setSiguiente(iterador.getSiguiente().getSiguiente());
            } else {
                iterador = iterador.getSiguiente();
            }
        }
        return nodo;
    }
    
    public NodoEntidad buscarPorPosicion(int posicion){

        NodoEntidad iterador = this.cabecera;
        int contador=0;
        while (iterador.getSiguiente()!= null) {
            if (iterador.getNodo() != null) {
                if(contador==posicion){
                    return iterador;                                                        
                }
                contador++;
            }
            iterador = iterador.getSiguiente();
            
        }
        return null;
    }

    public NodoEntidad getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoEntidad cabecera) {
        this.cabecera = cabecera;
    }


}
