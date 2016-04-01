/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Classes.ClsConexion;
//import Classes.clsFunciones;
//import Classes.clsVenta;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author KELLY TG
 */
public class frmDetalleVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form DetalleVenta
     */
   // clsFunciones funciones = new clsFunciones();
    //clsVenta venta= new clsVenta();
        String titulos[]={"Nro VENTA","DNI O RUC ","NOMBRE O RAZON SOCIAL","FECHA","SUBTOTAL","IGV","TOTAL"};
     private TableRowSorter trsfiltro;
    DefaultTableModel DatosTabla;
    public frmDetalleVenta() {
        initComponents();
        DatosTabla = new DefaultTableModel(null,titulos){
            @Override 
            public  boolean isCellEditable ( int row ,  int column )  { 
                return  false ; 
            } 
        };
         GrupoBotones.add(rdbNombre);
         GrupoBotones.add(rdbfecha);
         GrupoBotones.add(rdbVenta);
        tblListado.setModel(DatosTabla);
//        MostrarTablaIngres();
        RealizarCuenta();
    }
    
    public void filtro() {
    //Obtenemos el valor del JTextField para el filtro
    String filtro = TxtCodigo1.getText();
    // Identificamos cual es el JRadioButton seleccionado para filtrar el
    // resultado de acuerdo a los datos de la columna elegida
     if (rdbNombre.isSelected()) {
        int columna = 1;
        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    } else if (rdbfecha.isSelected()) {
        int columna = 3;
        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    }else if (rdbVenta.isSelected()) {
        int columna = 0;
        trsfiltro.setRowFilter(RowFilter.regexFilter(filtro, columna));
    }
}
//     public boolean validarDateFecha(){
//        if(dateFechaDesde.getDate()==null) return false;
//        else if(dateFechaHasta.getDate()==null) return false;
//        else return true;
//    }
     public void VaciarTabla(){
        int Filas=DatosTabla.getRowCount();
        for (int i = 0; i < Filas; i++) {
            DatosTabla.removeRow(0);
        }
      }
     
     private void RealizarCuenta(){
        String IGVS,SUBTOTALS,TOTALS;
        float subtotal,IGV,total;
        float Ssubtotal=0,SIGV=0,Stotal=0;
        for (int i = 0; i < DatosTabla.getRowCount(); i++) {
            
            SUBTOTALS=(String) tblListado.getValueAt(i, 4);
            IGVS=(String) tblListado.getValueAt(i, 5);
            TOTALS=(String) tblListado.getValueAt(i, 6);
            
            
            IGV=Float.parseFloat(IGVS);
            subtotal=Float.parseFloat(SUBTOTALS);
            total=Float.parseFloat(TOTALS);
            
            SIGV+=IGV;
            Ssubtotal+=subtotal;
            Stotal+=total;
        }
        txtsubtotal.setText(String.valueOf(Ssubtotal));
        txtIGV.setText(String.valueOf(SIGV));
        txttotal.setText(String.valueOf(Stotal));

    }
    
//     private  void MostrarTablaIngres(){
//        Connection cn;
//        Statement sentencia;
//        ResultSet reg;
//        String SQL;
//        String msj;
//
//        
//        try {
//            SQL="SELECT  venta.id AS id,venta.dni AS dni,venta.fecha AS fecha, venta.Credito AS Credito," + 
//                    "venta.subTotal AS subTotal,venta.igv AS igv,venta.total AS total," + 
//                    "cliente.apellidoPaterno AS apepat,cliente.apellidoMaterno AS apemat,cliente.nombres AS nombres,cliente.razonSocial AS razonSocial" +
//                    " FROM venta INNER JOIN cliente ON venta.dni=cliente.dni" +
//                    "  ORDER BY venta.fecha DESC " ;
//           
//            cn = ClsConexion.getConexion();
//            sentencia = cn.createStatement();
//            reg=sentencia.executeQuery(SQL);
//            //VERIFICAR SI HA DEVUELTO REGISTROS
//              while(reg.next()){
//                  String nombre;
//                  if(reg.getString("apepat") == null) nombre=reg.getString("razonSocial") ;
//                  else  nombre=reg.getString("apepat") + " " + reg.getString("apemat") + " " + reg.getString("nombres");                                     
//                 
//                  String Fila[]= {
//                                        reg.getString("id"),
//                                        reg.getString("dni"),
//                                        nombre,
//                                        reg.getString("fecha"),
//                                        reg.getString("subTotal"),
//                                        reg.getString("igv"),
//                                        reg.getString("total")
//                                         };
//                  DatosTabla.addRow(Fila);
//              }
//        } catch (Exception e) {
//            
//            msj = e.getMessage().toString();
//            JOptionPane.showMessageDialog(this, msj);
//            
//        }
//        
//        
//
//    }

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
        txtsubtotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnMostraarP = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        rdbNombre = new javax.swing.JRadioButton();
        rdbfecha = new javax.swing.JRadioButton();
        rdbVenta = new javax.swing.JRadioButton();
        TxtCodigo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Detalle Venta");

        jPanel1.setBackground(new java.awt.Color(0, 25, 66));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtsubtotal.setEnabled(false);
        txtsubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsubtotalActionPerformed(evt);
            }
        });

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblListado);

        jLabel24.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel24.setText("FECHA");

        jLabel28.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel28.setText("SUB-TOTAL:");

        txtIGV.setEnabled(false);
        txtIGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIGVActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel29.setText("IGV:");

        jLabel30.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel30.setText("TOTAL:");

        txttotal.setEnabled(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel25.setText("Desde:");

        jLabel26.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel26.setText("Hasta:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostraarP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMostraarP.setText("MOSTRAR PRODUCTOS");
        btnMostraarP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMostraarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostraarPActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel18.setText("Filtrar resultados por : ");

        rdbNombre.setText("DOCUMENTO CLIENTE ");

        rdbfecha.setText("FECHA");

        rdbVenta.setText("Nro VENTA");

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

        jLabel17.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel17.setText("Producto:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(455, 455, 455)
                        .addComponent(btnMostraarP, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(rdbVenta)
                        .addGap(27, 27, 27)
                        .addComponent(rdbNombre)
                        .addGap(18, 18, 18)
                        .addComponent(rdbfecha))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel25)
                        .addGap(185, 185, 185)
                        .addComponent(jLabel26)
                        .addGap(209, 209, 209)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(rdbNombre)
                    .addComponent(rdbfecha)
                    .addComponent(rdbVenta))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(TxtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostraarP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsubtotalActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed
 
    private void btnMostraarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostraarPActionPerformed
        // TODO add your handling code here:
//        int nFila= tblListado.getSelectedRow();
//        if(nFila>=0){
//            String precioS;
//            int idcomprobante,idventa;
//            precioS=(String) tblListado.getValueAt(nFila, 0);        
//            idcomprobante=Integer.parseInt(precioS);
//            //idventa=venta.BuscarIDVenta(idcomprobante);
//            funciones.setmiIDventa(idcomprobante);
//            
//            ProductosComprobante Pro=new ProductosComprobante();
//        FrmPrincipal.bpnPrinicipal.add(Pro);
//        Pro.toFront();
//        Pro.setVisible(true);
//  
//        }
    }//GEN-LAST:event_btnMostraarPActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
//        if(validarDateFecha()){
//        Connection cn;
//        Statement sentencia;
//        ResultSet reg;
//        String SQL;
//        String msj;
//        VaciarTabla();
//        String fecha = new SimpleDateFormat("yyyy/MM/dd").format(dateFechaDesde.getDate());
//        String fecha2 = new SimpleDateFormat("yyyy/MM/dd").format(dateFechaHasta.getDate());
//        try {
//            SQL="SELECT  venta.id AS id,venta.dni AS dni,venta.fecha AS fecha, venta.Credito AS Credito," + 
//                    "venta.subTotal AS subTotal,venta.igv AS igv,venta.total AS total," + 
//                    "cliente.apellidoPaterno AS apepat,cliente.apellidoMaterno AS apemat,cliente.nombres AS nombres,cliente.razonSocial AS razonSocial" +
//                    " FROM venta INNER JOIN cliente ON venta.dni=cliente.dni" +
//                    " where fecha>='" + fecha+ "' AND fecha<'" + fecha2 + "' + interval 1 day ORDER BY fecha DESC" ;
//           
//            cn = ClsConexion.getConexion();
//            sentencia = cn.createStatement();
//            reg=sentencia.executeQuery(SQL);
//            //VERIFICAR SI HA DEVUELTO REGISTROS
//              while(reg.next()){
//                  String nombre;
//                  if(reg.getString("apepat") == null) nombre=reg.getString("razonSocial") ;
//                  else  nombre=reg.getString("apepat") + " " + reg.getString("apemat") + " " + reg.getString("nombres");                                     
//                 
//                  String Fila[]= {
//                                        reg.getString("id"),
//                                        reg.getString("dni"),
//                                        nombre,
//                                        reg.getString("fecha"),
//                                        reg.getString("subTotal"),
//                                        reg.getString("igv"),
//                                        reg.getString("total")
//                                         };
//                  DatosTabla.addRow(Fila);
//              }
//               RealizarCuenta();
//        } catch (Exception e) {
//            
//            msj = e.getMessage().toString();
//            JOptionPane.showMessageDialog(this, msj);
//            
//        }
//        
//        
//        } else JOptionPane.showMessageDialog(this, "Ingrese la fecha");
    }//GEN-LAST:event_btnBuscarActionPerformed

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
                                public void keyTyped(final KeyEvent e) {
                    // Llamamos al método encargado de realizar el filtro
                    filtro();
                }
            });
            // Inicializamos el objeto trsfiltro de la clase TableRowSorter con
            // el modelo de la tabla, que para nuestro caso es tabladatos
            trsfiltro = new TableRowSorter(DatosTabla);
            // Añadimos al Jtable el filtro trsfiltro
            tblListado.setRowSorter(trsfiltro);
        }
    }//GEN-LAST:event_TxtCodigo1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JTextField TxtCodigo1;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostraarP;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbNombre;
    private javax.swing.JRadioButton rdbVenta;
    private javax.swing.JRadioButton rdbfecha;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtsubtotal;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
