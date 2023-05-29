package trabajo_final.util;

/**
 *
 * @author Acer
 */
public class NodoInterfaceImpl implements NodoInterface {

    Nodo cabecera;

    public NodoInterfaceImpl() {
        cabecera = new Nodo(null);
    }

    private boolean estaVacia() {
        if (this.cabecera.getNodo() == null) {
            return true;
        } else {
            return false;
        }
    }

    private Nodo buscarUltimoNodo() {
        Nodo iterador = this.cabecera;
        while (iterador.getSiguiente() != null) {
            iterador = iterador.getSiguiente();
        }
        return iterador;
    }

    @Override
    public void insertarFinal(Nodo nuevoNodo) {
        Nodo iterador = this.cabecera;
        if (estaVacia()) {
            //this.cabecera.setNodo(nuevoNodo);
            this.cabecera.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(null);
        } else {
            while (iterador.getSiguiente() != null) {
                iterador = iterador.getSiguiente();
            }

            iterador.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(null);
        }

    }

    @Override
    public void insertarInicio(Nodo nuevoNodo) {
        if (estaVacia()) {
            this.cabecera = nuevoNodo;
            nuevoNodo.setSiguiente(null);
        } else {
            nuevoNodo.setSiguiente(this.cabecera);
            this.cabecera = nuevoNodo;
        }
    }

    @Override
    public String retirarInicio() {
        // PENDIENTE
        Nodo iterador = this.cabecera;
        Nodo nodoEliminar = null;
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

    @Override
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

    @Override
    public String imprimirLista() {
        String cadena = "";
        Nodo iterador = this.cabecera;

        while (iterador != null) {
            if (iterador.getNodo() != null) {
                cadena += iterador.toString() + "=>\n";
            }
            iterador = iterador.getSiguiente();
        }
        return cadena;
    }

    public void insertaOrden(Object nuevoDato) {
        Nodo nuevo = new Nodo(nuevoDato);
        if (this.cabecera == null) {
            this.cabecera = nuevo;
        } else if (nuevoDato.toString().compareTo(this.cabecera.getNodo().toString()) < 0) {
            nuevo.setSiguiente(this.cabecera);
            this.cabecera = nuevo;          
        } else {
            Nodo anterior, iterador;
            anterior = iterador = this.cabecera;
            // ubica la posicion donde se va a ingresar el nuevo nodo
            while ((iterador.getSiguiente() != null) && (nuevoDato.toString().compareTo(iterador.getNodo().toString())) > 0) {
                anterior = iterador;
                iterador = iterador.getSiguiente();
            }
            if ((nuevoDato.toString().compareTo(iterador.getNodo().toString())) > 0) {
                anterior = iterador;
            }
            nuevo.setSiguiente(anterior.getSiguiente());
            anterior.setSiguiente(nuevo);
        }
    }

    public Nodo sinDuplicados(Nodo nodo) {
        Nodo iterador = nodo;

        while (iterador.getSiguiente()!= null) {
//            Nodo nuevoNodo=iterador;
//            while(nuevoNodo.getSiguiente()!=null){
//                if(iterador.getNodo()==nuevoNodo.getSiguiente().getNodo()){
//                    nuevoNodo.setSiguiente(nuevoNodo.getSiguiente().getSiguiente());
//                    System.out.println(iterador.toString());
//                }else{
//                    nuevoNodo=nuevoNodo.getSiguiente();
//                }
//            }
//            iterador=iterador.getSiguiente();

            //System.out.println(iterador.getNodo()+"------"+iterador.getSiguiente().getNodo());

            if (iterador.getNodo().equals(iterador.getSiguiente().getNodo())) {
                Nodo siguiente = iterador.getSiguiente().getSiguiente();
                iterador.setSiguiente(siguiente);

            } else {
                iterador = iterador.getSiguiente();
            }
        }
        return nodo;
    }

    public Nodo getNodo() {
        return this.cabecera;
    }

}
