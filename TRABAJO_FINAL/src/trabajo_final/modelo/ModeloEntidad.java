package trabajo_final.modelo;

import javax.swing.table.AbstractTableModel;
import trabajo_final.util.EntidadNodoInterfaceImpl;
import trabajo_final.util.NodoEntidad;

/**
 *
 * @author Flaven
 */
public class ModeloEntidad extends AbstractTableModel {

    private NodoEntidad nodo= new NodoEntidad(null);
    EntidadNodoInterfaceImpl objNodo = new EntidadNodoInterfaceImpl();

    public ModeloEntidad(NodoEntidad nodo) {
        super();
        this.nodo = nodo;
        objNodo.setCabecera(nodo);
    }

    @Override
    public int getRowCount() {
        NodoEntidad iterador = nodo;
        int contador = 0;
        while (iterador != null) {
            if (iterador.getNodo() != null) {
                contador++;
            }
        }        
        return contador;
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return objNodo.buscarPorPosicion(rowIndex).getNodo().getCnombre();
        }
        return null;
    }

    public NodoEntidad getNodo() {
        return nodo;
    }

    public void setNodo(NodoEntidad nodo) {
        this.nodo = nodo;
    }

}
