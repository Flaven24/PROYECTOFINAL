package trabajo_final.util;

/**
 *
 * @author Acer
 */
public interface NodoInterface {
    public void insertarFinal(Nodo nuevoNodo);
    public void insertarInicio(Nodo nuevoNodo);
    public Object retirarInicio();
    public Object retirarFinal();
//    public void insertarDentro(Nodo nuevoNodo);
//    public void retirarDentro(Nodo nuevoNodo);
    public String imprimirLista();
//    public Object buscar(int valor);
    
}
