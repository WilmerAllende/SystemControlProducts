/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

//import Classes.AbstractJasper;
//import Classes.PrintTest;
//import Classes.clsFunciones;
//import Classes.clsIngresos;
//import Classes.clsProducto;
//import Classes.clsVenta;
//import Classes.n2t;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfContentByte;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author KELLY TG
 */


public class frmRegistrarCompra extends javax.swing.JInternalFrame {
//    clsIngresos Ingresos = new clsIngresos();
//    clsFunciones funciones = new clsFunciones();
//    n2t convertirdec = new n2t();
//    int id= funciones.getIDUsaurio();
//    int idCliente;
//    clsProducto producto = new clsProducto();
//    clsVenta venta = new clsVenta();
//    DefaultTableModel modelo;
//    String titulos[]={"ID","NOMBRE","MARCA","STOCK","PRECIO","CANTIDAD","TOTAL","OPERACION"};
//    DefaultTableModel DatosTabla;  
//    String ultimo = funciones.UltimoRegistro("id", "venta");
//    AbstractJasper reports = new AbstractJasper(); 
//   PrintTest Print = new PrintTest();
    public frmRegistrarCompra() {
        initComponents();
        grupoBotones.add(rdbBoleto);
        grupoBotones.add(rdbFactura);
        //rdbFactura.setSelected(true);
        txtfecha.setEnabled(false);
//        txtfecha.setText(funciones.cargarFecha());
//        txtIDVenta.setText(ultimo);
//       DesactivarrBotones();
//        
//        
//         DatosTabla = new DefaultTableModel(null,titulos){
//            @Override 
//            public  boolean isCellEditable ( int row ,  int column )  { 
//                return  false ; 
//            } 
//        };
//          dlgventas.setModel(DatosTabla);
//          //ULTILIZAR UN BOTON POR MEDIO DE UNA TECLA ---- VK= ALT  -- + M 
//          BtnRegistrarP7.setMnemonic(KeyEvent.VK_M);
    }
//    
//    public void InicializarTabla(PdfPTable ptable){
//         
//        float[] medidaCeldas = {2f,15f, 2f, 2f};         
//            
//        ptable.setSpacingAfter(5);
//        
//        try {
//            ptable.setWidths(medidaCeldas);
//            
//        } catch (DocumentException ex) {
//            Logger.getLogger(Kardex.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//         
//        
//    }
//    public void MostrarTablaPDF(PdfPTable ptable){
//          int fila = DatosTabla.getRowCount();
//          String idc,nombre,marca,stock;
//          for (int i = 0; i < fila; i++) {
//                
//              idc=(String) dlgventas.getValueAt(i,5);
//               nombre=(String) dlgventas.getValueAt(i,1);
//                marca=(String) dlgventas.getValueAt(i,4);
//                stock=(String) dlgventas.getValueAt(i,6);
//                
//                 ptable.addCell(idc);
//                   ptable.addCell(nombre);
//                    ptable.addCell(marca);
//                    ptable.addCell(stock);
//                   
//          }
//      }
//    
//    public boolean validarVenta(){
//        int fila= DatosTabla.getRowCount();
//        if(fila < 0) return false;
//        else if (txtcontado.getText().equals("")) return false;
//        else if(txtcredito.getText().equals("")) return false;
//        return true;
//    }
//    
//    private void RealizarCuenta(){
//        float precio;
//        float cantidad;
//        String precioS,cantidadS;
//        float producto,subtotal=0,IGV,total;
//        
//        for (int i = 0; i < DatosTabla.getRowCount(); i++) {
//            precioS=(String) dlgventas.getValueAt(i, 4);
//            cantidadS=(String) dlgventas.getValueAt(i, 5);
//            
//            precio=Float.parseFloat(precioS);
//            cantidad=Float.parseFloat(cantidadS);
//            
//            producto= precio*cantidad;
//           
//            dlgventas.setValueAt(String.valueOf(producto), i, 6);
//            
//            subtotal+=producto;
//        }
//        IGV=(18*subtotal)/100;
//        total= subtotal + IGV;
//        txtSubtotal.setText(String.valueOf(subtotal));
//        txtIGV.setText(String.valueOf(IGV));
//        txttotal.setText(String.valueOf(total));
//        txttotalPago.setText(String.valueOf(total));
//    }
//    
//    private void VerificarRepeticionProductos(){     
//        String idS,idS2; 
//        int cont=0;
//        for (int i = 0; i < DatosTabla.getRowCount(); i++) {
//            
//            idS=(String) dlgventas.getValueAt(i, 0);
//             
//             for (int j = ( i + 1 ) ; j < ( DatosTabla.getRowCount() ); j++) {
//                idS2=(String) dlgventas.getValueAt(j, 0);
//                if(idS.equals(idS2)){
//                    DefaultTableModel dtm = (DefaultTableModel) dlgventas.getModel(); //TableProducto es el nombre de mi tabla ;) 
//                    dtm.removeRow(j); 
//                    JOptionPane.showMessageDialog(this, "Producto ya a sido agregado a la lista","Repeticion!",JOptionPane.ERROR_MESSAGE);
//                        //return false;                 
//                }
//            }
//
//        }
//       // return true;
//    }
//    
//    private void verificarStock(String idProducto){
//        int inCant = DatosTabla.getRowCount();
//        float stock,suma=0,cantidadF = 0;
//        int dato;
//        String id,cantidadS;
//        
//           
//            stock= venta.BuscarStock(Integer.parseInt(idProducto));
//            dato=(int) stock;
//            
//            for (int j = 0; j < inCant; j++) {
//                id=(String) dlgventas.getValueAt(j, 0);
//                
//                if(idProducto == null ? id == null : idProducto.equals(id)){
//                    cantidadS=(String) dlgventas.getValueAt(j, 5);
//                    cantidadF=Float.parseFloat(cantidadS);
//                    suma+= cantidadF;
//                    if(suma>dato){
//                        JOptionPane.showMessageDialog(this, "Stock: " + dato + " \nInsuficente: "  + suma ,"Error!",JOptionPane.ERROR_MESSAGE);
//                        dlgventas.setValueAt("INCORRECTO", j, 7);
//                        dlgventas.setValueAt("0", j, 5);
//                        //dlgventas.setValueAt(ponerImagen, j, 6);
//                    }
//                    else{
//                        dlgventas.setValueAt("CORRECTO", j, 7);
//                    }
//                        
//                }
//            }
//            
//        
//    }
//    
//    public boolean VerificarProductos(){
//        boolean verificar = true;
//        String operacion;
//              
//        for (int i = 0; i < DatosTabla.getRowCount()  ; i++) {
//            operacion=(String) dlgventas.getValueAt(i, 7);
//             if(operacion.equals("INCORRECTO") || operacion.equals("")){
//                 return false;
//             }
//         }
//        return true;
//    }
//    
//    public void VaciarTabla(){
//        int Filas=DatosTabla.getRowCount();
//        for (int i = 0; i < Filas; i++) {
//            DatosTabla.removeRow(0);
//        }
//      }
    
    public void LimpiarCampos(){
        txtDNI.setText("");
        txtCliente.setText("");
        txtIGV.setText("");
        txtIDVenta.setText("");
        txtSubtotal.setText("");
        txtdireccion.setText("");
        txtfecha.setText("");
        txttotal.setText("");
        TxtCodigoProducto.setText("");
//        txttotalPago.setText("");
//        txtcontado.setText("");
//        txtcredito.setText("");
//        checkcontado.setSelected(false);
//        checkcredito.setSelected(false);
        rdbBoleto.setSelected(false);
        rdbFactura.setSelected(false);
         grupoBotones.clearSelection();
    }
    
    public void ActivarBotones(){
        btnAgregar.setEnabled(true);
        btnBuscar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGrabar.setEnabled(true);
        btnModificarC.setEnabled(true);
        btnModificarP.setEnabled(true);
        rdbBoleto.setEnabled(true);
        rdbFactura.setEnabled(true);
         btnNuevo.setEnabled(true);
    }
    
    public void DesactivarrBotones(){
        btnAgregar.setEnabled(false);
        btnBuscar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGrabar.setEnabled(false);
        btnModificarC.setEnabled(false);
        btnModificarP.setEnabled(false);
        rdbBoleto.setEnabled(false);
        rdbFactura.setEnabled(false);
   //     btnComprobante.setEnabled(false);
        btnNuevo.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dlgventas = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificarC = new javax.swing.JButton();
        btnModificarP = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JFormattedTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        BtnRegistrarP5 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        BtnRegistrarP7 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        TxtCodigoProducto = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        TxtCodigo13 = new javax.swing.JTextField();
        txtIDVenta = new javax.swing.JTextField();
        rdbBoleto = new javax.swing.JRadioButton();
        rdbFactura = new javax.swing.JRadioButton();
        lblRUC = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(0, 25, 66));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtSubtotal.setEnabled(false);
        txtSubtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubtotalActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel21.setText("Codigo de Producto:");

        btnGrabar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setBorder(null);
        btnGrabar.setBorderPainted(false);
        btnGrabar.setContentAreaFilled(false);
        btnGrabar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGrabar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrabar.setIconTextGap(-3);
        btnGrabar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGrabar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        dlgventas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dlgventas);

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setText("AGREGAR PRODUCTO");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setIconTextGap(-3);
        btnAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificarC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarC.setText("MODIFICAR CANTIDAD");
        btnModificarC.setBorder(null);
        btnModificarC.setBorderPainted(false);
        btnModificarC.setContentAreaFilled(false);
        btnModificarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarC.setIconTextGap(-3);
        btnModificarC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificarC.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCActionPerformed(evt);
            }
        });

        btnModificarP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificarP.setText("MODIFICAR P.UNIT");
        btnModificarP.setBorder(null);
        btnModificarP.setBorderPainted(false);
        btnModificarP.setContentAreaFilled(false);
        btnModificarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModificarP.setIconTextGap(-3);
        btnModificarP.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnModificarP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModificarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel24.setText("Fecha:");

        txtfecha.setText("jFormattedTextField1");
        txtfecha.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel25.setText("Documento de Identidad:");

        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtCliente.setEnabled(false);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel26.setText("Cliente:");

        BtnRegistrarP5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarP5.setText("Buscar");
        BtnRegistrarP5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnRegistrarP5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnRegistrarP5.setIconTextGap(-3);
        BtnRegistrarP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarP5ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel27.setText("Direccion:");

        txtdireccion.setEnabled(false);
        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setIconTextGap(-3);
        btnEliminar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        BtnRegistrarP7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarP7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Exit.png"))); // NOI18N
        BtnRegistrarP7.setText("SALIR");
        BtnRegistrarP7.setBorder(null);
        BtnRegistrarP7.setBorderPainted(false);
        BtnRegistrarP7.setContentAreaFilled(false);
        BtnRegistrarP7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarP7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegistrarP7.setIconTextGap(-3);
        BtnRegistrarP7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtnRegistrarP7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnRegistrarP7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarP7ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel28.setText("SUB-TOTAL:");

        TxtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoProductoActionPerformed(evt);
            }
        });

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

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setText("BUSCAR PRODUCTO");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.setIconTextGap(-3);
        btnBuscar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 25, 66));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Matura MT Script Capitals", 1, 22)); // NOI18N
        jLabel3.setText("Ferreteria Representaciones  ");

        jLabel31.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel31.setText("F & F Srl");

        jLabel32.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel32.setText("Dirección: Posope Alto - Patapo");

        jPanel4.setBackground(new java.awt.Color(0, 25, 66));
        jPanel4.setPreferredSize(new java.awt.Dimension(10, 143));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        jLabel33.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel33.setText("RUC: 20480454996");

        jLabel34.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel34.setText("VENTA");

        jLabel35.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel35.setText("-");

        TxtCodigo13.setText("   001");
        TxtCodigo13.setEnabled(false);
        TxtCodigo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigo13ActionPerformed(evt);
            }
        });

        txtIDVenta.setEnabled(false);
        txtIDVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDVentaActionPerformed(evt);
            }
        });

        rdbBoleto.setText("Boleta");
        rdbBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbBoletoActionPerformed(evt);
            }
        });

        rdbFactura.setText("Factura");
        rdbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbFacturaActionPerformed(evt);
            }
        });

        lblRUC.setText(".");

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 137, Short.MAX_VALUE)
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(230, 230, 230)
                                        .addComponent(jLabel24)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnAgregar))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(86, 86, 86)
                                            .addComponent(jLabel29)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel30)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(btnModificarC)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnModificarP)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnBuscar)
                                            .addGap(19, 19, 19)
                                            .addComponent(btnEliminar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGrabar)
                                            .addGap(18, 18, 18)
                                            .addComponent(BtnRegistrarP7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rdbFactura)
                                    .addComponent(rdbBoleto))
                                .addGap(246, 246, 246))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(BtnRegistrarP5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel31))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel32)))
                        .addGap(50, 50, 50)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel34))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(TxtCodigo13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(lblRUC))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCodigo13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnRegistrarP5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(TxtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAgregar))
                    .addComponent(btnNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificarP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnRegistrarP7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificarC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(txtIGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdbBoleto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdbFactura)
                        .addGap(2, 2, 2))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSubtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubtotalActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
//        if(TxtCodigoProducto.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Ingrese el id del producto","Error!",JOptionPane.ERROR_MESSAGE);
//        }
//        else{
//        String consulta[] = producto.MostrarProductoEstado(Integer.parseInt(TxtCodigoProducto.getText()));
//        if(consulta[1].equals("1")){
//            
//                //JOptionPane.showMessageDialog(this,consulta[0]);
//                String Fila[]={consulta[2],consulta[3],consulta[4],consulta[7],consulta[8],"1","","CORRECTO"};
//                DatosTabla.addRow(Fila);
//                VerificarRepeticionProductos();
//                //id= Integer.parseInt(consulta[2]);
//                btnGrabar.setEnabled(true);
//                RealizarCuenta();
//                TxtCodigoProducto.setText("");
//                //verificarStock(consulta[2]);
//                
//                }else{
//
//                if(consulta[1].equals("2")){
//                   JOptionPane.showMessageDialog(this,consulta[0]);
//                   
//                   //LimparCampos();
//
//                }
//                else{
//                    JOptionPane.showMessageDialog(this,consulta[0]);
//                }
//                }
//        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void TxtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoProductoActionPerformed

    private void txtIGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIGVActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        frmbuscarProducto Pro=new frmbuscarProducto();
        frmPrincipal.bpnPrinicipal.add(Pro);
        Pro.toFront();
        Pro.setVisible(true);
//        RealizarCuenta();
//     
//        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void TxtCodigo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigo13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigo13ActionPerformed

    private void txtIDVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDVentaActionPerformed

    private void BtnRegistrarP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarP5ActionPerformed
        // TODO add your handling code here:
//        String consulta[]= venta.MostrarCliente(txtDNI.getText());
//        if(consulta[1].equals("1")){
//            JOptionPane.showMessageDialog(this,consulta[0]);
//            if(consulta[3]!=null)
//            txtCliente.setText(consulta[3] + " " + consulta[4] + " " + consulta[5] );
//            else{
//                txtCliente.setText(txtDNI.getText());
//                lblRUC.setText(txtDNI.getText());
//            }
//                
//            txtdireccion.setText(consulta[6]);
//           idCliente =Integer.parseInt(consulta[2]);
//           ActivarBotones();
//        }
//        else{
//            
//        if(consulta[1].equals("2")){
//           JOptionPane.showMessageDialog(this,consulta[0]);
//           //LimparCampos();
//
//        }
//        else{
//            JOptionPane.showMessageDialog(this,consulta[0]);
//        }
//        }
    }//GEN-LAST:event_BtnRegistrarP5ActionPerformed
  void limpiarTabla(){
                while (dlgventas.getRowCount()!=0){
                        ((DefaultTableModel)dlgventas.getModel()).removeRow(0);
                }
        }
    private void btnModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCActionPerformed
        // TODO add your handling code here:
      
//        int nFila= dlgventas.getSelectedRow();
//        int counter =0;
//        if(nFila>=0){
//            String cant=null;
//            
//            cant = JOptionPane.showInputDialog("Cantidad");
//            if(cant != null){
//              float cantidad= Float.parseFloat(cant);
//            
//              String cantS= String.valueOf(cantidad);
//              dlgventas.setValueAt(cantS, nFila, 5);
//              //dlgventas.setValueAt(ponerImagen, nFila, 6);
//              verificarStock((String) dlgventas.getValueAt(nFila, 0));
//              RealizarCuenta();
//            }
//            
//        }
//         
    }//GEN-LAST:event_btnModificarCActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
         int nFila= dlgventas.getSelectedRow();
        int counter =0;
        if(nFila>=0){
            
             DefaultTableModel dtm = (DefaultTableModel) dlgventas.getModel(); //TableProducto es el nombre de mi tabla ;) 
             dtm.removeRow(dlgventas.getSelectedRow()); 
   //          RealizarCuenta();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPActionPerformed
        // TODO add your handling code here
        int nFila= dlgventas.getSelectedRow();
        int counter =0;
        if(nFila>=0){
            String cant=null;
            
            cant = JOptionPane.showInputDialog("Precio Unitario");
            if(cant != null){
                    float cantidad= Float.parseFloat(cant);
                        String cantS= String.valueOf(cantidad);
                      dlgventas.setValueAt(cantS, nFila, 4);
                      String cantidadS=(String) dlgventas.getValueAt(nFila, 5);

                      if((cantidadS).equals("")){
                          JOptionPane.showConfirmDialog(this, "Vacio cantidad");
                      }
                      else{
     //                 RealizarCuenta();
                      }
            }
        }
    }//GEN-LAST:event_btnModificarPActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
//       if(validarVenta()){ 
//      if(VerificarProductos()){
//          int optipoDoc;
//          if(rdbBoleto.isSelected()){
//              optipoDoc=1;
//          }else optipoDoc=2;
//          String precioletra = RetornarNumero();
//               String msj[]=venta.RegistrarVenta(txtDNI.getText(),optipoDoc, Float.parseFloat(txttotal.getText()), 
//                                                Float.parseFloat(txtSubtotal.getText()),Float.parseFloat(txtIGV.getText()),
//                1, id, idCliente,Float.parseFloat(txtcontado.getText()),Float.parseFloat(txtcredito.getText()),precioletra);
//          
//          DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = new Date(System.currentTimeMillis ());
//        String fecha= dateFormat.format(date);
//          Ingresos.RegistrarIngresos(fecha, "Venta realizada el :  " + fecha, Float.parseFloat(txtcontado.getText()));
//         String ultimoagregado = funciones.UltimoRegistroAGregado("id", "venta");
//         int ult= Integer.parseInt(ultimoagregado);
//         venta.RegistrarComprobante(txtDNI.getText(), txtCliente.getText(), txtdireccion.getText(), ult, 
//                  Float.parseFloat(txttotal.getText()),Float.parseFloat(txtSubtotal.getText()),Float.parseFloat(txtIGV.getText()), 1, optipoDoc);
//       
//          if(msj[1].equals("1")){
//            
//            String idProducot,cantidad,precioP;
//            int idPro;
//            float canti,precio;
//            
//            //ult = ult-1;
//            //TxtCodigo.setText(ultimo);
//           
//            //LimparCampos();
//            //DesactivarCampos();
//            for (int i = 0; i < dlgventas.getRowCount(); i++) {
//                
//                  idProducot=(String) dlgventas.getValueAt(i, 0);
//                  cantidad=(String) dlgventas.getValueAt(i, 5);
//                  
//                  precioP = (String) dlgventas.getValueAt(i, 4);
//                  precio=Float.parseFloat(precioP);
//                  
//                  idPro=Integer.parseInt(idProducot);
//                  canti=Float.parseFloat(cantidad);    
//                  
//                  venta.RegistrarDetalleVenta(ult, idPro,  canti, precio);
//                  
//                  float stock = venta.BuscarStock(idPro);
//                  float nuevostock = stock - canti;
//                  venta.ModificarStockProducto(idPro,nuevostock);  
//  
//           }
//            
//             JOptionPane.showMessageDialog(this,msj[0]);
//             
//             DesactivarrBotones();
//             btnComprobante.setEnabled(true);
//             btnNuevo.setEnabled(true);
//             txtfecha.setText(funciones.cargarFecha());
//            
//            
//       }else
//       {
//           JOptionPane.showMessageDialog(this,msj[0]);
//       }
//        
//        
//      }else{
//          JOptionPane.showMessageDialog(this,"ERROR AL REGISTRAR LA VENTA \nVerifique correctamente el stock de cada producto","Error!",JOptionPane.ERROR_MESSAGE);
//      }
//       }else{
//          JOptionPane.showMessageDialog(this,"ERROR AL REGISTRAR LA VENTA \nLlene todos los campos correctamente","Error!",JOptionPane.ERROR_MESSAGE);
//      }
//        
//        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void rdbBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbBoletoActionPerformed
        // TODO add your handling code here:
        if(txtSubtotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Sin cantidad");
        }else{
        if(rdbBoleto.isSelected()){
        //    checkcontado.setEnabled(true);
          //  checkcredito.setEnabled(true);
            float subtotal,igv,total;
            subtotal =Float.parseFloat(txtSubtotal.getText());
            igv=0;
            total= subtotal + igv;
            txtSubtotal.setText(String.valueOf(subtotal));
            txtIGV.setText(String.valueOf(igv));
            txttotal.setText(String.valueOf(total));
            //txttotalPago.setText(String.valueOf(total));
        }
        }
    }//GEN-LAST:event_rdbBoletoActionPerformed

    private void rdbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbFacturaActionPerformed
        // TODO add your handling code here:
        if(txtSubtotal.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Sin cantidad");
        }else{
        if(rdbFactura.isSelected()){
            //checkcontado.setEnabled(true);
           // checkcredito.setEnabled(true);
            float subtotal,igv,total;
            subtotal =Float.parseFloat(txtSubtotal.getText());
            igv=(18*subtotal)/100;
            total= subtotal + igv;
            txtSubtotal.setText(String.valueOf(subtotal));
            txtIGV.setText(String.valueOf(igv));
            txttotal.setText(String.valueOf(total));
        //    txttotalPago.setText(String.valueOf(total));
        }
        }
    }//GEN-LAST:event_rdbFacturaActionPerformed
//    public String RetornarNumero(){
//        
//        int num[] = new int[2];
//        String resultadofinal;
//        String numero=(String)txttotal.getText();
//        int entero,decimal;
//               
//                numero = numero.replace(".", "/");
//                String totalDiv[] = numero.split("/");
//                String resultado= convertirdec.DecimalesEnero(Integer.parseInt(totalDiv[0]), Integer.parseInt(totalDiv[1]));
//                
//                resultadofinal= resultado + " con " + totalDiv[1] + "/100";
//        return resultadofinal;
//                
//    }
    
//    public void PosicionDatoPDF(PdfWriter writer,int x,int y, TextField text){
//        PdfContentByte cb;
//        cb= writer.getDirectContent();
//        cb.setTextMatrix(x,y);
//        cb.showText("" + text);
//    }
    public void Limite(final JTextField a,final int lim){
        a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               if(a.getText().length()==lim){
                   getToolkit().beep();
                   e.consume();
               }
           }         
        });
    }
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
//        VaciarTabla();
//             LimpiarCampos();
//             DesactivarrBotones();
//        ultimo = funciones.UltimoRegistro("id", "venta");
//             txtIDVenta.setText(ultimo);
//             txtfecha.setText(funciones.cargarFecha());
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void BtnRegistrarP7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarP7ActionPerformed
        // TODO add your handling code here:
       
       this.dispose();
    }//GEN-LAST:event_BtnRegistrarP7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        ifrAgregarClienteVenta Pro=new ifrAgregarClienteVenta();
//        FrmPrincipal.bpnPrinicipal.add(Pro);
//        Pro.toFront();
//        Pro.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrarP5;
    private javax.swing.JButton BtnRegistrarP7;
    private javax.swing.JTextField TxtCodigo13;
    public static javax.swing.JTextField TxtCodigoProducto;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificarC;
    private javax.swing.JButton btnModificarP;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTable dlgventas;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRUC;
    private javax.swing.JRadioButton rdbBoleto;
    private javax.swing.JRadioButton rdbFactura;
    private javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtIDVenta;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JFormattedTextField txtfecha;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

 
}
