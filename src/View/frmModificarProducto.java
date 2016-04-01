/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Classes.ClsConexion;
//import Classes.clsFunciones;
//import Classes.clsProducto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author KELLY TG
 */
public class frmModificarProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarProducto
     */
//    clsProducto producto = new clsProducto();
//    clsFunciones funciones = new clsFunciones();
//    DefaultTableModel DatosTabla;
//    int idProducto;
//    private TableRowSorter trsfiltro;
//    String titulos[] ={"ID","NOMBRE","   CATEGORIA  ","INIDAD MEDIDA","MARCA","STOCK-MIN","STOCK-MAX","STOCK","PRECIO"};
    public frmModificarProducto() {
        initComponents();
//        
//        MostrarCategoria();
//       
//        DatosTabla = new DefaultTableModel(null,titulos){
//            @Override 
//            public  boolean isCellEditable ( int row ,  int column )  { 
//                return  false ; 
//            } 
//        };
//        tblProducto.setModel(DatosTabla);
//         MostrarTotalProducto();
//         GrupoBotones.add(rdbID);
//         GrupoBotones.add(rdbNombre);
//         GrupoBotones.add(rdbMarca);
//         btnGrabar.setEnabled(false);
//         DesactivarCampos();
    }
    
    public void ActivarCampos(){
        CmbCategoria.setEnabled(true);
        cmbUnidadMedida.setEnabled(true);
        txtPrecio.setEnabled(true);
        txtStockMaximo.setEditable(true);
        txtStockMinimo.setEnabled(true);
        txtmarca1.setEnabled(true);
        txtnombre.setEnabled(true);
    }
   
    
    public void DesactivarCampos(){
        CmbCategoria.setEnabled(false);
        cmbUnidadMedida.setEnabled(false);
        txtPrecio.setEnabled(false);
        txtStockMaximo.setEditable(false);
        txtStockMinimo.setEnabled(false);
        txtmarca1.setEnabled(false);
        txtnombre.setEnabled(false);
    }
          
    
//    public void filtro() {
//    //Obtenemos el valor del JTextField para el filtro
//    String filtro = TxtCodigo1.getText();
//    // Identificamos cual es el JRadioButton seleccionado para filtrar el
//    // resultado de acuerdo a los datos de la columna elegida
//    if (rdbID.isSelected()) {
//        int columna = 0;
//        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
//    } else if (rdbNombre.isSelected()) {
//        int columna = 1;
//        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
//    } else if (rdbMarca.isSelected()) {
//        int columna = 2;
//        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
//    }
//}
//    
//     public void MostrarCategoria(){
//        Connection cn;
//        Statement sentencia;
//        ResultSet reg;
//        String SQL;
// 
//        
//        try {
//            SQL = "Select * from categoria ";
//            cn = ClsConexion.getConexion();
//            sentencia = cn.createStatement();
//            reg=sentencia.executeQuery(SQL);
//            //VERIFICAR SI HA DEVUELTO REGISTROS
//              while(reg.next()){
//  	    	   CmbCategoria.addItem(reg.getString("nombre"));
//                  
//              }
//              
//            
//            
//        } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, e.getMessage().toString());
//        }
//    }
//     
//      public void MostrarTotalProducto(){
//        Connection cn;
//        Statement sentencia;
//        ResultSet reg;
//        String SQL;
//
//        
//        try {
//            SQL = "Select * from producto ";
//            cn = ClsConexion.getConexion();
//            sentencia = cn.createStatement();
//            reg=sentencia.executeQuery(SQL);
//            //VERIFICAR SI HA DEVUELTO REGISTROS
//              while(reg.next()){
//                  String categoria= producto.MostrarCategoria(Integer.parseInt(reg.getString("idCategoria")));
//                  String Fila[]= {
//                                        reg.getString("id"),
//                                        reg.getString("nombre"),
//                                        categoria,
//                                        reg.getString("unidadMedida"),
//                                        reg.getString("marca"),
//                                        reg.getString("stockMinimo"),
//                                        reg.getString("stockMaximo"),
//                                        reg.getString("stock"),
//                                        reg.getString("precio")};
//                  
//                  DatosTabla.addRow(Fila);
//              }
//
//        } catch (Exception e) {
//           JOptionPane.showMessageDialog(this, e.getMessage().toString());
//
//            
//        }
//    
//    }
//      
//      public void VaciarTabla(){
//        int Filas=DatosTabla.getRowCount();
//        for (int i = 0; i < Filas; i++) {
//            DatosTabla.removeRow(0);
//        }
//      }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        CmbCategoria = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cmbUnidadMedida = new javax.swing.JComboBox();
        jLabel21 = new javax.swing.JLabel();
        txtStockMinimo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtStockMaximo = new javax.swing.JTextField();
        BtnRegistrarP1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtmarca1 = new javax.swing.JTextField();
        rdbMarca = new javax.swing.JRadioButton();
        TxtCodigo1 = new javax.swing.JTextField();
        rdbNombre = new javax.swing.JRadioButton();
        rdbID = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenimeinto Producto");

        jPanel1.setBackground(new java.awt.Color(0, 25, 66));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducto);

        jLabel16.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel16.setText("Categoría:");

        CmbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---  Seleccionar ---" }));
        CmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCategoriaActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel18.setText("Producto:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel19.setText("Marca:");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel20.setText("Und. Medida:");

        cmbUnidadMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--- Seleccionar ---", "Granel", "Kilogramos", "Litro", "Unidad" }));

        jLabel21.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel21.setText("Stock Minimo:");

        txtStockMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockMinimoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel22.setText("Stock Maximo:");

        txtStockMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockMaximoActionPerformed(evt);
            }
        });

        BtnRegistrarP1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarP1.setText("MODIFICAR");
        BtnRegistrarP1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnRegistrarP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnRegistrarP1.setIconTextGap(-3);
        BtnRegistrarP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarP1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel23.setText("Precio");

        txtmarca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmarca1ActionPerformed(evt);
            }
        });

        rdbMarca.setText("Categoria");

        TxtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigo1ActionPerformed(evt);
            }
        });
        TxtCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtCodigo1KeyTyped(evt);
            }
        });

        rdbNombre.setText("NOMBRE");

        rdbID.setText("ID");

        jLabel24.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel24.setText("Filtrar resultados por : ");

        jLabel25.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel25.setText("Producto:");

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setText("Guardar");
        btnGrabar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGrabar.setIconTextGap(-3);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(47, 47, 47)
                                .addComponent(CmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel22))
                                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(txtStockMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cmbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtmarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel23))))
                                    .addComponent(jLabel18))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(BtnRegistrarP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdbID)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbNombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbMarca))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 95, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(rdbID)
                    .addComponent(rdbNombre)
                    .addComponent(rdbMarca))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtmarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cmbUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(txtStockMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(txtStockMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(CmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnRegistrarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbCategoriaActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtStockMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockMinimoActionPerformed

    private void txtStockMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockMaximoActionPerformed

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        // TODO add your handling code here:
        
        int fila= tblProducto.getSelectedRow();
         txtnombre.setText((String) tblProducto.getValueAt(fila,1));
         txtmarca1.setText((String) tblProducto.getValueAt(fila,4));
         txtStockMinimo.setText((String) tblProducto.getValueAt(fila, 5));
         txtStockMaximo.setText((String) tblProducto.getValueAt(fila, 6));
         txtPrecio.setText((String) tblProducto.getValueAt(fila, 8));
         CmbCategoria.setSelectedItem((String) tblProducto.getValueAt(fila,2));
         cmbUnidadMedida.setSelectedItem((String) tblProducto.getValueAt(fila,3));
   //      idProducto= Integer.parseInt((String) tblProducto.getValueAt(fila,0));
    }//GEN-LAST:event_tblProductoMouseClicked

    private void BtnRegistrarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarP1ActionPerformed
        // TODO add your handling code here:
        if(tblProducto.getSelectedRow()>=0){
            ActivarCampos();
            btnGrabar.setEnabled(true);
            
        }
       
    }//GEN-LAST:event_BtnRegistrarP1ActionPerformed

    private void txtmarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmarca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmarca1ActionPerformed

    private void TxtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigo1ActionPerformed

    private void TxtCodigo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCodigo1KeyTyped
        // TODO add your handling code here:
        // Comprobamos que el ButtonGroup que nosotros llamamos bGfiltar tenga
        // seleccionado alguno de los tres JRadioButtons que le hemos agregado
        if (GrupoBotones.getSelection()==null) {
            // Si ninguno de los JRadioButtons está seleccionado, evitamos que se
            // escriba algo dentro del JTextField y mostramos un mensaje de error
            evt.consume();
            JOptionPane.showMessageDialog(this, "Debe seleccionar una opción del filtro", "Menaje de Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Añadimos al JTextField un KeyListener con un KeyAdapter. De esta
            // forma es como si dieramos enter cada vez que digitamos una techa
            TxtCodigo1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(final KeyEvent e) {
                    // Llamamos al método encargado de realizar el filtro
     //               filtro();
                }
            });
            // Inicializamos el objeto trsfiltro de la clase TableRowSorter con
            // el modelo de la tabla, que para nuestro caso es tabladatos
       //     trsfiltro = new TableRowSorter(DatosTabla);
            // Añadimos al Jtable el filtro trsfiltro
         //   tblProducto.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_TxtCodigo1KeyTyped

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
//         producto.ModificarProducto(CmbCategoria.getSelectedIndex(),txtnombre.getText(),txtmarca1.getText(), 
//                                cmbUnidadMedida.getSelectedItem().toString(), Integer.parseInt(txtStockMinimo.getText()),
//                                Integer.parseInt(txtStockMaximo.getText()), Float.valueOf(txtPrecio.getText()), idProducto);
//        VaciarTabla();
//        MostrarTotalProducto();
        btnGrabar.setEnabled(false);
        DesactivarCampos();
    }//GEN-LAST:event_btnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrarP1;
    private javax.swing.JComboBox CmbCategoria;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JTextField TxtCodigo1;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbUnidadMedida;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbID;
    private javax.swing.JRadioButton rdbMarca;
    private javax.swing.JRadioButton rdbNombre;
    private javax.swing.JTable tblProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStockMaximo;
    private javax.swing.JTextField txtStockMinimo;
    private javax.swing.JTextField txtmarca1;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
