package trabajo_final_Formularios;

/**
 *
 * @author Gutierrez Medina Anthony Kent  <U18100033@utp.edu.pe>
 */
public class FormBusqueda extends javax.swing.JFrame {

    static void crearVentana() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Creates new form FormPrincipal
     */
    public FormBusqueda() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnEstado = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnRUCEntidad = new javax.swing.JButton();
        btnEntidad = new javax.swing.JButton();
        btnRucProveedor = new javax.swing.JButton();
        btnFormalizacion = new javax.swing.JButton();
        btnAcuerdo = new javax.swing.JButton();
        btnProcedimiento = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnExportarCSV = new javax.swing.JButton();
        btnExportarPDF = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel2.setText("Ministerio de Economia y Finanzas");
        BG.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel5.setText("Filtros");
        BG.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(null);
        BG.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, -1));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 170, -1));

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 60));

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel8.setText("RUC Proveedor");
        BG.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(null);
        BG.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, -1));
        BG.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel9.setText("Fecha Formalización");
        BG.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 140, 30));

        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("dd/mm/yyyy");
        jTextField3.setBorder(null);
        BG.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 180, -1));
        BG.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 170, -1));

        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setBorder(null);
        BG.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 180, -1));
        BG.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 170, -1));

        btnEstado.setText("Estado Orden");
        BG.add(btnEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 125, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel7.setText("Acuerdo Marco");
        BG.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUC PROV.", "RUC ENT.", "TIPO PROC.", "ORDEN ELEC.", "ESTADO ORDEN", "SUBTOTAL", "IGV", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        BG.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 620, 360));

        jLabel10.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        jLabel10.setText("RUC Entidad");
        BG.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnRUCEntidad.setText("RUC Entidad");
        BG.add(btnRUCEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 125, -1));

        btnEntidad.setText("Entidad");
        BG.add(btnEntidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 125, -1));

        btnRucProveedor.setText("RUC Proveedor");
        BG.add(btnRucProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 125, -1));

        btnFormalizacion.setText("Formalización");
        BG.add(btnFormalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 125, -1));

        btnAcuerdo.setText("Acuerdo Marco");
        BG.add(btnAcuerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 125, -1));

        btnProcedimiento.setText("Tipo Procedimiento");
        BG.add(btnProcedimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, 125, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setText("Listado de Compras");
        BG.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        BG.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, -1));

        btnExportarCSV.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExportarCSV.setText("Exportar CSV");
        BG.add(btnExportarCSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 120, 50));

        btnExportarPDF.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExportarPDF.setText("Exportar PDF");
        BG.add(btnExportarPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FormBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton btnAcuerdo;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEntidad;
    private javax.swing.JButton btnEstado;
    private javax.swing.JButton btnExportarCSV;
    private javax.swing.JButton btnExportarPDF;
    private javax.swing.JButton btnFormalizacion;
    private javax.swing.JButton btnProcedimiento;
    private javax.swing.JButton btnRUCEntidad;
    private javax.swing.JButton btnRucProveedor;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
