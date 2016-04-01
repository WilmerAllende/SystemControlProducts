/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
//import Classes.clsRegistros;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author KELLY TG
 */
public class frmModificarProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form ModificarProveedor
     */
    
  //  clsRegistros Registros = new clsRegistros();
    public frmModificarProveedor() {
        initComponents();
         SoloNumeros(txtRUC);
        SoloNumerosGuion(txtcuenta);
        SoloNumeros(TxtTelefono1);
        Limite(txtRUC,12);
        DesactivarCampos();
    }
    public void SoloNumerosGuion(JTextField a){
        a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(!Character.isDigit(c) && c!=45){
                   getToolkit().beep();
                   e.consume();
               }
           }
                   
        });
    }
    
        public void SoloLetras(JTextField a){
        a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if((c<=64 || c>=91) && (c<=96 || c>=123) && c!=32){
                   getToolkit().beep();
                   e.consume();
               }
           }
                   
        });
    }
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
 public void SoloNumeros(JTextField a){
        a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(!Character.isDigit(c)){
                   getToolkit().beep();
                   e.consume();
               }
           }
                   
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtRUC = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtrazon = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TxtDireccion1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TxtTelefono1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TxtEmail1 = new javax.swing.JTextField();
        txtcuenta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        BtnRegistrarP2 = new javax.swing.JButton();
        BtnRegistrarP1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Mantenimiento Proveedor");

        jPanel1.setBackground(new java.awt.Color(0, 25, 66));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel12.setText("RUC:");

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel13.setText("Razón Social: ");

        jLabel18.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel18.setText("Direccion:");

        jLabel19.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel19.setText("Telefono:");

        jLabel20.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel20.setText("E-mail:");

        jLabel14.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel14.setText("N° de Cuenta:");

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel15.setText("Código:");

        TxtCodigo.setEnabled(false);

        BtnRegistrarP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarP2.setText("BUSCAR");
        BtnRegistrarP2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnRegistrarP2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnRegistrarP2.setIconTextGap(-3);
        BtnRegistrarP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarP2ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtEmail1))
                            .addComponent(TxtDireccion1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtrazon, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel15))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnRegistrarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarP1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)))
                .addGap(84, 84, 84))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnRegistrarP2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtrazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(TxtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TxtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(TxtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnRegistrarP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

     public void LimparCampos(){
         TxtCodigo.setText("");
        txtRUC.setText("");
        TxtDireccion1.setText("");
        TxtEmail1.setText("");
        TxtTelefono1.setText("");
        txtcuenta.setText("");
        txtrazon.setText("");
    }
     public void DesactivarCampos(){
         txtrazon.setEnabled(false);
         TxtDireccion1.setEnabled(false);
         TxtTelefono1.setEnabled(false);
         TxtEmail1.setEnabled(false);
         txtcuenta.setEnabled(false);
         BtnRegistrarP1.setEnabled(false);
     }
     public void ActivarCampos(){
         txtrazon.setEnabled(true);
         TxtDireccion1.setEnabled(true);
         TxtTelefono1.setEnabled(true);
         TxtEmail1.setEnabled(true);
         txtcuenta.setEnabled(true);
         BtnRegistrarP1.setEnabled(true);
     }
    private void BtnRegistrarP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarP2ActionPerformed
        // TODO add your handling code here:
//        String consulta[]=Registros.MostrarProveedor(txtRUC.getText());
//        if(consulta[1].equals("1")){
//            JOptionPane.showMessageDialog(this,consulta[0]);
//            TxtCodigo.setText(consulta[2]);
//            txtRUC.setText(consulta[3]);
//            txtrazon.setText(consulta[4]);
//            TxtDireccion1.setText(consulta[5]);
//            TxtTelefono1.setText(consulta[6]);
//            txtcuenta.setText(consulta[7]);
//            TxtEmail1.setText(consulta[8]);
//            ActivarCampos();
//        }
//        else{
//            
//        if(consulta[1].equals("2")){
//           JOptionPane.showMessageDialog(this,consulta[0]);
//           LimparCampos();
//
//        }
//        else{
//            JOptionPane.showMessageDialog(this,consulta[0]);
//        }
//        }
    }//GEN-LAST:event_BtnRegistrarP2ActionPerformed

    private void BtnRegistrarP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarP1ActionPerformed
        // TODO add your handling code here:
//                 String msj[]=Registros.ModificarProveedor(txtRUC.getText(), txtrazon.getText(), TxtDireccion1.getText(),
//                TxtTelefono1.getText(), txtcuenta.getText(), TxtEmail1.getText(),Integer.parseInt(TxtCodigo.getText()));
//            DesactivarCampos();
//            LimparCampos();
//       if(msj[1].equals("1")){
//
//            JOptionPane.showMessageDialog(this,msj[0]);
//            
//       }else
//       {
//           JOptionPane.showMessageDialog(this,msj[0]);
//       }
//        
    }//GEN-LAST:event_BtnRegistrarP1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistrarP1;
    private javax.swing.JButton BtnRegistrarP2;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtDireccion1;
    private javax.swing.JTextField TxtEmail1;
    private javax.swing.JTextField TxtTelefono1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtRUC;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtrazon;
    // End of variables declaration//GEN-END:variables
}
