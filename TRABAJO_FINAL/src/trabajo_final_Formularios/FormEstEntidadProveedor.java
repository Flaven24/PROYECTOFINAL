package trabajo_final_Formularios;

import javax.swing.table.DefaultTableModel;
import trabajo_final.clases.DtoEntidadProveedor;
import trabajo_final.clases.Entidad;
import trabajo_final.clases.OrdenElectronica;
import trabajo_final.clases.Proveedor;
import trabajo_final.datos.Datos;
import trabajo_final.estructura.Pila;
import trabajo_final.estructura.PilaEntidad;
import trabajo_final.estructura.PilaOrdenElectronica;
import trabajo_final_Formularios.filtro.FormFiltro;

/**
 *
 * @author Flaven
 */
public class FormEstEntidadProveedor extends javax.swing.JFrame {

    private static FormEstEntidadProveedor form;
    
    private static PilaEntidad pilaEntidadFiltro= new PilaEntidad();
    private static Pila pilaProveedorFiltro= new Pila();
    /**
     * Creates new form FormPrincipal
     */
    private FormEstEntidadProveedor() {
        initComponents();
    }
    
    public static FormEstEntidadProveedor crearVentana() {
        if (form == null) {
            form = new FormEstEntidadProveedor();            
        }
        form.setVisible(true);
        return form;
    }

    public static PilaEntidad getPilaEntidadFiltro() {
        return pilaEntidadFiltro;
    }

    public static void setPilaEntidadFiltro(PilaEntidad pilaEntidadFiltro) {
        FormEstEntidadProveedor.pilaEntidadFiltro = pilaEntidadFiltro;
    }

    public static Pila getPilaProveedorFiltro() {
        return pilaProveedorFiltro;
    }

    public static void setPilaProveedorFiltro(Pila pilaProveedorFiltro) {
        FormEstEntidadProveedor.pilaProveedorFiltro = pilaProveedorFiltro;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BG = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBusqueda = new javax.swing.JTable();
        btnEntidad = new javax.swing.JButton();
        btnProveedor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnExportarCSV = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel2.setText("Ministerio de Economia y Finanzas");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel5.setText("Filtros");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 60));

        tblBusqueda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ENTIDAD - PROVEEDOR", "COMPRA ORDINARIA", "GRAN COMPRA", "TOTAL GENERAL"
            }
        ));
        jScrollPane2.setViewportView(tblBusqueda);
        if (tblBusqueda.getColumnModel().getColumnCount() > 0) {
            tblBusqueda.getColumnModel().getColumn(0).setPreferredWidth(250);
        }

        BG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 830, 420));

        btnEntidad.setText("Entidad");
        btnEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntidadActionPerformed(evt);
            }
        });
        BG.add(btnEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 125, -1));

        btnProveedor.setText("Proveedor");
        btnProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedorActionPerformed(evt);
            }
        });
        BG.add(btnProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 125, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setText("Listado de Compras");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        btnExportarCSV.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExportarCSV.setText("Exportar CSV");
        BG.add(btnExportarCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 120, 50));

        btnExportarPDF.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExportarPDF.setText("Exportar PDF");
        BG.add(btnExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 410, 120, 50));

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });
        BG.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 260, 120, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        BG.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        PilaOrdenElectronica pila = new PilaOrdenElectronica();
        pila.setPilaOrden(Datos.getPilaOrdenElectronica());                                
        DefaultTableModel model = new DefaultTableModel();
        tblBusqueda.setModel(model);        
        model.addColumn("ENTIDAD - PROVEEDOR");
        model.addColumn("PROVEEDOR");
        model.addColumn("COMPRA ORDINARIA");
        model.addColumn("GRAN COMPRA");
        model.addColumn("TOTAL GENERAL");
        
        PilaOrdenElectronica pilaTemp = new PilaOrdenElectronica();
        
        for(OrdenElectronica orden:Datos.getPilaOrdenElectronica()){
            for(Entidad entidad: pilaEntidadFiltro.getPilaOrden()){
                if(orden!=null&&entidad!=null&&orden.getRUC_ENTIDAD().contains(entidad.getCruc())){
                    pilaTemp.Apilar(orden);
                }
            }
        }
        
        pilaTemp.setPilaOrden(pilaTemp.OrdenQuickSortProveedor(pilaTemp.getPilaOrden(), 0, pilaTemp.getTOPE()-1));
        
        //pilaTemp.setPilaOrden(pila.buscarPorRucEntidad(RucProveedor).getPilaOrden());
        
        Pila pilaEstadistica = new Pila();
        Entidad entidadAux= new Entidad();
        for(Entidad entidad: pilaEntidadFiltro.getPilaOrden()){
//            if(entidadAux.getCruc()!=null){
//                if(entidadAux.getCruc().contains(entidad.getCruc())){
//                    System.out.println("si"+entidadAux.getCnombre());
//                }else{
//                    System.out.println("no: "+entidadAux.getCnombre());
//                }
//            }
            for(int x=0;x<pilaTemp.getTOPE();x++){
                if(entidad!=null){                    
                    entidadAux=entidad;
                    DtoEntidadProveedor dtoEntidadProveedor= new DtoEntidadProveedor();
                    dtoEntidadProveedor.setEntidad(entidad);
                    dtoEntidadProveedor.setProveedor(new Proveedor(pilaTemp.getPilaOrden()[x].getPROVEEDOR(),pilaTemp.getPilaOrden()[x].getRUC_PROVEEDOR()));
                   
                    if(pilaTemp.getPilaOrden()[x].getTIPO_PROCEDIMIENTO().contains("Compra ordinaria")){
                        dtoEntidadProveedor.setCompraOrdinaria(pilaTemp.getPilaOrden()[x].getTOTAL());                        
                        dtoEntidadProveedor.setGranCompra(0);
                    }else{
                        dtoEntidadProveedor.setCompraOrdinaria(0);                        
                        dtoEntidadProveedor.setGranCompra(pilaTemp.getPilaOrden()[x].getTOTAL());
                    }                        
                    //TOTAL
                    dtoEntidadProveedor.setTotal(pilaTemp.getPilaOrden()[x].getTOTAL());
                    pilaEstadistica.Apilar(dtoEntidadProveedor);
                }
            }
        }
        for(int x=0;x<pilaEstadistica.getTOPE();x++){
            DtoEntidadProveedor dtoEntidadProveedor= (DtoEntidadProveedor)pilaEstadistica.getPila()[x];
            model.addRow(new Object[]{dtoEntidadProveedor.getEntidad().getCnombre(),dtoEntidadProveedor.getProveedor().getCnombre(),
                dtoEntidadProveedor.getCompraOrdinaria(),dtoEntidadProveedor.getGranCompra(),dtoEntidadProveedor.getTotal()});
        }                                        
        tblBusqueda.setModel(model);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        PilaOrdenElectronica pila = new PilaOrdenElectronica();
        pila.setPilaOrden(Datos.getPilaOrdenElectronica());                                
        DefaultTableModel model = new DefaultTableModel();
        tblBusqueda.setModel(model);        
        model.addColumn("ENTIDAD - PROVEEDOR");
        model.addColumn("PROVEEDOR");
        model.addColumn("COMPRA ORDINARIA");
        model.addColumn("GRAN COMPRA");
        model.addColumn("TOTAL GENERAL");
        pilaEntidadFiltro= new PilaEntidad();
        pilaProveedorFiltro= new Pila();
        tblBusqueda.setModel(model);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntidadActionPerformed
        FormFiltro.crearVentana(4);
    }//GEN-LAST:event_btnEntidadActionPerformed

    private void btnProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedorActionPerformed
        FormFiltro.crearVentana(5);
    }//GEN-LAST:event_btnProveedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEstEntidadProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEstEntidadProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEstEntidadProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEstEntidadProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEstEntidadProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnEntidad;
    private javax.swing.JButton btnExportarCSV;
    private javax.swing.JButton btnExportarPDF;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProveedor;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblBusqueda;
    // End of variables declaration//GEN-END:variables
}
