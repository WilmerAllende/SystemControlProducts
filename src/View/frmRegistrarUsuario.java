/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import Classes.ClsConexion;
//import Classes.clsFunciones;
//
//import Classes.clsUsuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
//import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author KELLY TG
 * 
 */
public class frmRegistrarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarUsuario
     */
    int compras=0,ventas=0,caja=0,almacen=0,informes=0,mantenimiento=0,administracion=0;
//    clsFunciones funciones = new clsFunciones();
//    clsUsuario AccesoUsuario = new clsUsuario();
//    
   // int ultimo= Integer.parseInt(funciones.UltimoRegistro("id", "usuario"));
    public frmRegistrarUsuario() {
        initComponents();
        SoloNumeros(TxtDNI);
        SoloNumeros(TxtTelefono);
        SoloLetras(TxtApellidoMat);
        SoloLetras(TxtApellidoPat);
        NumerosLetrasEspacio(TxtNombre);
        NumerosLetrasEspacio(TxtDireccion);
        Limite(TxtDNI,8);
        Desactivarcampos();
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
     public void NumerosLetrasEspacio(JTextField a){
        a.addKeyListener(new KeyAdapter() {
           public void keyTyped(KeyEvent e){
               char c=e.getKeyChar();
               if(!Character.isDigit(c) && !Character.isLetter(c) && c!=32){
                   getToolkit().beep();
                   e.consume();
               }
           }
                   
        });
    }
   
     public void Activarcampos(){
         TxtApellidoPat.setEnabled(true);
         TxtApellidoMat.setEnabled(true);
         TxtDireccion.setEnabled(true);
         TxtEmail.setEnabled(true);
         TxtNombre.setEnabled(true);
         TxtTelefono.setEnabled(true);
         Txtcontrasena.setEnabled(true);
         BtnRegistrarP.setEnabled(true);
         
         checkcompras.setEnabled(true);
         checkventas.setEnabled(true);
         checkcaja.setEnabled(true);
         checkalmacen.setEnabled(true);
         checkinformes.setEnabled(true);
         checkMan.setEnabled(true);
         checkAdministracion.setEnabled(true);
     }
      public void Desactivarcampos(){
         TxtApellidoPat.setEnabled(false);
         TxtApellidoMat.setEnabled(false);
         TxtDireccion.setEnabled(false);
         TxtEmail.setEnabled(false);
         TxtNombre.setEnabled(false);
         TxtTelefono.setEnabled(false);
         Txtcontrasena.setEnabled(false);
         BtnRegistrarP.setEnabled(false);
         
         checkcompras.setEnabled(false);
         checkventas.setEnabled(false);
         checkcaja.setEnabled(false);
         checkalmacen.setEnabled(false);
         checkinformes.setEnabled(false);
         checkMan.setEnabled(false);
         checkAdministracion.setEnabled(false);
     }
       public void LimparCampos(){
        TxtDNI.setText("");
        TxtApellidoMat.setText("");
        TxtApellidoPat.setText("");
        TxtDireccion.setText("");
        TxtEmail.setText("");
        TxtNombre.setText("");
        TxtTelefono.setText("");
        Txtcontrasena.setText("");
        
        checkcompras.setSelected(false);
         checkventas.setSelected(false);
         checkcaja.setSelected(false);
         checkalmacen.setSelected(false);
         checkinformes.setSelected(false);
         checkMan.setSelected(false);
         checkAdministracion.setSelected(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtDNI = new javax.swing.JTextField();
        TxtApellidoPat = new javax.swing.JTextField();
        TxtApellidoMat = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtDireccion = new javax.swing.JTextField();
        TxtTelefono = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        BtnRegistrarP = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        BTNbUSCAR = new javax.swing.JButton();
        Txtcontrasena = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        checkcompras = new javax.swing.JCheckBox();
        checkventas = new javax.swing.JCheckBox();
        checkcaja = new javax.swing.JCheckBox();
        checkalmacen = new javax.swing.JCheckBox();
        checkinformes = new javax.swing.JCheckBox();
        checkMan = new javax.swing.JCheckBox();
        checkAdministracion = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Usuario");

        jPanel1.setBackground(new java.awt.Color(0, 25, 66));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel4.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel5.setText("Apellido Paterno:");

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel6.setText("Apellido Materno:");

        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel9.setText("Nombres:");

        jLabel10.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel10.setText("E-mail:");

        BtnRegistrarP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnRegistrarP.setText("REGISTRAR");
        BtnRegistrarP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BtnRegistrarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistrarP.setIconTextGap(-3);
        BtnRegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistrarPActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel11.setText("Password:");

        BTNbUSCAR.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNbUSCAR.setText("BUSCAR");
        BTNbUSCAR.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        BTNbUSCAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNbUSCAR.setIconTextGap(-3);
        BTNbUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNbUSCARActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel12.setText("(*)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDireccion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BTNbUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtApellidoMat, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                            .addComponent(TxtNombre))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(Txtcontrasena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addContainerGap(293, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12)
                                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(TxtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BTNbUSCAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(TxtApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Txtcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addComponent(BtnRegistrarP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Imprint MT Shadow", 1, 14)); // NOI18N
        jLabel13.setText("ACCESOS");

        checkcompras.setText("Compras");
        checkcompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcomprasActionPerformed(evt);
            }
        });

        checkventas.setText("Ventas");
        checkventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkventasActionPerformed(evt);
            }
        });

        checkcaja.setText("Caja");
        checkcaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcajaActionPerformed(evt);
            }
        });

        checkalmacen.setText("Almacen");
        checkalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkalmacenActionPerformed(evt);
            }
        });

        checkinformes.setText("Informes");
        checkinformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinformesActionPerformed(evt);
            }
        });

        checkMan.setText("Mantenimiento");
        checkMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkManActionPerformed(evt);
            }
        });

        checkAdministracion.setText("Administracion");
        checkAdministracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAdministracionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkMan)
                    .addComponent(checkventas)
                    .addComponent(checkcompras)
                    .addComponent(checkcaja)
                    .addComponent(checkalmacen)
                    .addComponent(checkinformes)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13)))
                .addGap(53, 53, 53))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkAdministracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(checkcompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkcaja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkalmacen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkinformes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkMan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkAdministracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void BtnRegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistrarPActionPerformed
        // TODO add your handling code here:
//         Connection cn;
//       Statement sentencia;
//       String SQL;
//       
//       String textoSinEncriptar=Txtcontrasena.getText(); 
//        String textoEncriptadoConSHA=DigestUtils.sha1Hex(textoSinEncriptar); 
////System.out.println("Texto Encriptado con SHA : "+textoEncriptadoConSHA);
//
//       //INSERT INTO usuario (dni,apellidoPaterno,apellidoMaterno,nombres,direccion,telefono,email,password)
////VALUES('16658513','Perez','Dias','Juan','Lomas','986734526','luis@hotmail','123456')
//        try {
//            
//           
//            
//            SQL="INSERT INTO usuario (dni,apellidoPaterno,apellidoMaterno,nombres,direccion,telefono,email,password,estado)" + 
//                    "VALUES('" + TxtDNI.getText() + "','" + TxtApellidoPat.getText() + "','" + TxtApellidoMat.getText() +
//                    "','" + TxtNombre.getText() + "','" + TxtDireccion.getText() + "','" + TxtTelefono.getText() +
//                    "','" + TxtEmail.getText() + "','" + textoEncriptadoConSHA + "',1)";
//        
//       
//        cn=ClsConexion.getConexion();//Obtener conexion
//        sentencia=cn.createStatement();//crear objeto para la sentencia SQL
//        sentencia.executeUpdate(SQL);//INSERT, UPDATE o DELETE
//        cn.close();//cerrar Conexion
//        
//        
//         AccesoUsuario.RegistrarAccesos(compras, ventas,caja,almacen,informes,mantenimiento,administracion,ultimo);
//        JOptionPane.showMessageDialog(this,"Usuario Registrado con Exito");
//        LimparCampos();
//        Desactivarcampos();
//        } catch (Exception e) {
//        JOptionPane.showMessageDialog(this,e.getMessage().toString());
//        }
    }//GEN-LAST:event_BtnRegistrarPActionPerformed

    private void BTNbUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNbUSCARActionPerformed
        // TODO add your handling code here:
//        String consulta[]=AccesoUsuario.BuscarUsuario(TxtDNI.getText());
//        if(TxtDNI.getText().equals("")){
//            JOptionPane.showMessageDialog(this,"Llene el campo del DNI");
//        }
//            else{
//
//
//            if(consulta[1].equals("1")){
//                JOptionPane.showMessageDialog(this,consulta[0]);
//
//            }
//                else{
//
//                    if(consulta[1].equals("2")){
//                       JOptionPane.showMessageDialog(this,consulta[0]);
//                       Activarcampos();
//
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(this,consulta[0]);
//                    }
//                }
//            }
    }//GEN-LAST:event_BTNbUSCARActionPerformed

    private void checkcomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcomprasActionPerformed
        // TODO add your handling code here:
        if(checkcompras.isSelected()) compras=1;
        else if(!checkcompras.isSelected()) compras=0;
    }//GEN-LAST:event_checkcomprasActionPerformed

    private void checkventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkventasActionPerformed
        // TODO add your handling code here:
        if(checkventas.isSelected()) ventas=1;
        else if(!checkventas.isSelected()) ventas=0;
    }//GEN-LAST:event_checkventasActionPerformed

    private void checkcajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcajaActionPerformed
        // TODO add your handling code here:
         if(checkcaja.isSelected()) caja=1;
        else if(!checkcaja.isSelected()) caja=0;
    }//GEN-LAST:event_checkcajaActionPerformed

    private void checkalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkalmacenActionPerformed
        // TODO add your handling code here:
        if(checkalmacen.isSelected()) almacen=1;
        else if(!checkalmacen.isSelected()) almacen=0;
    }//GEN-LAST:event_checkalmacenActionPerformed

    private void checkinformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinformesActionPerformed
        // TODO add your handling code here:
        if(checkinformes.isSelected()) informes=1;
        else if(!checkinformes.isSelected()) informes=0;
    }//GEN-LAST:event_checkinformesActionPerformed

    private void checkManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkManActionPerformed
        // TODO add your handling code here:
        if(checkMan.isSelected()) mantenimiento=1;
        else if(!checkMan.isSelected()) mantenimiento=0;
    }//GEN-LAST:event_checkManActionPerformed

    private void checkAdministracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAdministracionActionPerformed
        // TODO add your handling code here:
        if(checkAdministracion.isSelected()) administracion=1;
        else if(!checkAdministracion.isSelected()) administracion=0;
    }//GEN-LAST:event_checkAdministracionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNbUSCAR;
    private javax.swing.JButton BtnRegistrarP;
    private javax.swing.JTextField TxtApellidoMat;
    private javax.swing.JTextField TxtApellidoPat;
    private javax.swing.JTextField TxtDNI;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JPasswordField Txtcontrasena;
    private javax.swing.JCheckBox checkAdministracion;
    private javax.swing.JCheckBox checkMan;
    private javax.swing.JCheckBox checkalmacen;
    private javax.swing.JCheckBox checkcaja;
    private javax.swing.JCheckBox checkcompras;
    private javax.swing.JCheckBox checkinformes;
    private javax.swing.JCheckBox checkventas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

//    void setLocationRelativeTo(probarConexion aThis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
