package trabajo_final.modelo;

import javax.swing.table.AbstractTableModel;
import trabajo_final.clases.OrdenElectronica;

/**
 *
 * @author Flaven
 */
public class ModeloEntidadRuc extends AbstractTableModel {

    private OrdenElectronica[] dtos = new OrdenElectronica[0];

    public ModeloEntidadRuc(OrdenElectronica[] dtos) {
        super();
        this.dtos = dtos;
    }

    @Override
    public int getRowCount() {
        return dtos.length;
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return dtos[rowIndex].getRUC_PROVEEDOR();
        } else if (columnIndex == 1) {
            return dtos[rowIndex].getRUC_ENTIDAD();
        } else if (columnIndex == 2) {
            return dtos[rowIndex].getTIPO_PROCEDIMIENTO();
        } else if (columnIndex == 3) {
            return dtos[rowIndex].getORDEN_ELECTRÓNICA();
        } else if (columnIndex == 4) {
            return dtos[rowIndex].getRUC_PROVEEDOR();
        } else if (columnIndex == 5) {
            return dtos[rowIndex].getESTADO_ORDEN_ELECTRONICA();
        } else if (columnIndex == 6) {
            return dtos[rowIndex].getSUB_TOTAL();
        } else if (columnIndex == 7) {
            return dtos[rowIndex].getIGV();
        } else if (columnIndex == 8) {
            return dtos[rowIndex].getTOTAL();
        }

        return null;
    }

    public OrdenElectronica[] getDtos() {
        return dtos;
    }

    public void setDtos(OrdenElectronica[] dtos) {
        this.dtos = dtos;
    }

}
