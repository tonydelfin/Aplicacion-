    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.Vistas.Clientes;

import Producto.CapaNegocio.Clientes.Cliente;
import Producto.CapaNegocio.Clientes.DAOCliente;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Jorge
 */
public class FrmAltaCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private Boolean altaCliente;
    /**
     * Creates new form FrmAltaCliente
     */
    public FrmAltaCliente() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        InputMap map2 = this.txtNombre.getInputMap(JTextField.WHEN_FOCUSED);
        map2.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        InputMap map3 = this.txtApPaterno.getInputMap(JTextField.WHEN_FOCUSED);
        map3.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        InputMap map4 = this.txtApMaterno.getInputMap(JTextField.WHEN_FOCUSED);
        map4.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        InputMap map5 = this.txtTel.getInputMap(JTextField.WHEN_FOCUSED);
        map5.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        





        altaCliente= true;
    }
    public void VlidacionCaracteres(java.awt.event.KeyEvent Evento){
        if (Evento.getKeyChar() >=33 && Evento.getKeyChar() <=64
            || Evento.getKeyChar() >=91 && Evento.getKeyChar()<=94
            || Evento.getKeyChar() >= 123 && Evento.getKeyChar()<= 208
            || Evento.getKeyChar() >= 210 && Evento.getKeyChar()<=240
            || Evento.getKeyChar() >=242 && Evento.getKeyChar()<=255)  {
            
            Evento.consume();
            JOptionPane.showMessageDialog(null, "Error solo Letras", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
    }

    public void habilitarBoton(){
        if(this.txtNombre.getText().isEmpty()
            || this.txtApPaterno.getText().isEmpty()
            || this.txtApPaterno.getText().isEmpty()
            || this.txtTel.getText().isEmpty()){
            this.btbGuardar.setEnabled(false);
        }
        else{
            this.btbGuardar.setEnabled(true);
        }
    }
    private int validar(){
        int con =0;
        for (int i = 0; i < this.txtTel.getText().length(); i++) {
            if (this.txtTel.getText().charAt(i) >= '0' && this.txtTel.getText().charAt(i) <='0') {
                con ++;
            }
        }
        return con;
    }
    
    public FrmAltaCliente(Cliente c){
        initComponents();
        this.cliente =c;
        this.lblSigId.setText(c.obtenerIdCliente()+"");
        this.txtNombre.setText(c.obtenerNombre());
        this.txtApPaterno.setText(c.obtenerApPaterno());
        this.txtApMaterno.setText(c.obtenerApMaterno());
        this.txtTel.setText(c.obtenerTelefono());
        altaCliente = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApPaterno = new javax.swing.JLabel();
        lblAPnaterno = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblSigId = new javax.swing.JLabel();
        btbGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Cliente"));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("Nombre");

        lblApPaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblApPaterno.setText("Apellido Paterno ");

        lblAPnaterno.setForeground(new java.awt.Color(0, 0, 0));
        lblAPnaterno.setText("Apellido Materno ");

        lblTel.setForeground(new java.awt.Color(0, 0, 0));
        lblTel.setText("Teléfono ");

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setText(" ");
        txtNombre.setName("Ingrese"); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApPaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApPaternoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApPaternoKeyTyped(evt);
            }
        });

        txtApMaterno.setBackground(new java.awt.Color(255, 255, 255));
        txtApMaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApMaternoActionPerformed(evt);
            }
        });
        txtApMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApMaternoKeyTyped(evt);
            }
        });

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtTelComponentAdded(evt);
            }
        });
        txtTel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelFocusLost(evt);
            }
        });
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApPaterno)
                            .addComponent(lblAPnaterno)
                            .addComponent(lblTel)
                            .addComponent(lblNombre))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(txtApPaterno)
                            .addComponent(txtApMaterno)
                            .addComponent(txtTel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblSigId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblSigId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApPaterno)
                    .addComponent(txtApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAPnaterno)
                    .addComponent(txtApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_norm.png"))); // NOI18N
        btbGuardar.setBorder(null);
        btbGuardar.setBorderPainted(false);
        btbGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_press.png"))); // NOI18N
        btbGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_roll.png"))); // NOI18N
        btbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_norm.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_press.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_roll.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cliente_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btbGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApMaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApMaternoActionPerformed
        
    }//GEN-LAST:event_txtApMaternoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbGuardarActionPerformed
        if(this.altaCliente == true ){
            if((this.txtNombre.getText().length() >0) && (this.txtApPaterno.getText().length() >0) && (this.txtApMaterno.getText().length()>0) && (this.txtTel.getText().length()>= 10) && 
                     (!(this.txtNombre.getText().trim().isEmpty()) && !(this.txtApPaterno.getText().trim().isEmpty()) && !(this.txtApMaterno.getText().trim().isEmpty())
                    && !(this.txtTel.getText().trim().isEmpty()))){
                Cliente c = new Cliente();
                c.ponerIdCliente(0);
                c.ponerNombreCliente(this.txtNombre.getText().trim());
                c.ponerApPaterno(this.txtApPaterno.getText().trim());
                c.ponerApMaterno(this.txtApMaterno.getText().trim());
                c.ponerTelefono(this.txtTel.getText().trim());
              
                
                DAOCliente daoCliente = new DAOCliente();
                Integer resp = daoCliente.ageregarCliente(c);
                if(resp ==1){
                    JOptionPane.showMessageDialog(null, "El cliente se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Ocurrió un Error", "Error", JOptionPane.ERROR_MESSAGE);
                }
                this.setVisible(false);
            }
            else{
                 if (this.txtTel.getText().length() < 10) {
                    
                    JOptionPane.showMessageDialog(null, "Número de Teléfono no Valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                JOptionPane.showMessageDialog(null, "Los datos están Incorrectos, intente otra vez", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            if((this.txtNombre.getText().length() >0) && (this.txtApPaterno.getText().length() >0) && (this.txtApMaterno.getText().length()>0) && (this.txtTel.getText().length()>=10) && 
                     (!(this.txtNombre.getText().trim().isEmpty()) && !(this.txtApPaterno.getText().trim().isEmpty()) && !(this.txtApMaterno.getText().trim().isEmpty())
                    && !(this.txtTel.getText().trim().isEmpty()))){
            
            
                Cliente c = new Cliente();   
                c.ponerIdCliente(Long.parseLong(this.lblSigId.getText()));
                c.ponerNombreCliente(this.txtNombre.getText().trim());
                c.ponerApPaterno(this.txtApPaterno.getText().trim());
                c.ponerApMaterno(this.txtApMaterno.getText().trim());
                c.ponerTelefono(this.txtTel.getText().trim());
                 DAOCliente daoCliente= new DAOCliente();
                Integer resultado = daoCliente.actualizarCliente(c);
                if(resultado ==1){
                    JOptionPane.showMessageDialog(null, "Registro Actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al Actualizar", "Error", JOptionPane.ERROR_MESSAGE);
                }
                this.setVisible(false);
            }
            else{
                if (this.txtTel.getText().length() < 10) {
                    
                    JOptionPane.showMessageDialog(null, "Número de Teléfono no Valido", "Error", JOptionPane.ERROR_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, "Los datos estan Incorrectos, intente otra vez", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btbGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        char letra = evt.getKeyChar();
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra != 32) && (letra != '\u00f1') && (letra != '\u00d1')
        && (letra != '\u002E') && (letra != 'á') && (letra != 'é') && (letra != 'í') && (letra != 'ó') && (letra != 'ú') && 
        (letra != 'Á') && (letra != 'É') && (letra != 'Í') && (letra != 'Ó') && (letra != 'Ú') && (letra != 8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(this.txtNombre.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char txtNombre=  evt.getKeyChar();
        if(Character.isDigit(txtNombre)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Letras");
        }
        
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoKeyTyped
        
        char letra = evt.getKeyChar();
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra != 32) && (letra != '\u00f1') && (letra != '\u00d1')
        && (letra != '\u002E') && (letra != 'á') && (letra != 'é') && (letra != 'í') && (letra != 'ó') && (letra != 'ú') && 
        (letra != 'Á') && (letra != 'É') && (letra != 'Í') && (letra != 'Ó') && (letra != 'Ú') && (letra != 8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(this.txtApPaterno.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char txtApPaterno=  evt.getKeyChar();
        if(Character.isDigit(txtApPaterno)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Letras");
        }
            
        
    }//GEN-LAST:event_txtApPaternoKeyTyped

    private void txtApMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApMaternoKeyTyped
        
        char letra = evt.getKeyChar();
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra != 32) && (letra != '\u00f1') && (letra != '\u00d1')
        && (letra != '\u002E') && (letra != 'á') && (letra != 'é') && (letra != 'í') && (letra != 'ó') && (letra != 'ú') && 
        (letra != 'Á') && (letra != 'É') && (letra != 'Í') && (letra != 'Ó') && (letra != 'Ú') && (letra != 8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(this.txtApMaterno.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char txtApMaterno=  evt.getKeyChar();
        if(Character.isDigit(txtApMaterno)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Letras");
        }
        
    }//GEN-LAST:event_txtApMaternoKeyTyped

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        
        char txtTel=  evt.getKeyChar();
        if (txtTel < '0' || txtTel >'9') {
            evt.consume();
        }
        if(Character.isLetter(txtTel)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Números");
        }
        if (this.txtTel.getText().length() >=10) {
           evt.consume();
        }
     
        
        
    }//GEN-LAST:event_txtTelKeyTyped

    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyReleased
    }//GEN-LAST:event_txtTelKeyReleased

    private void txtTelComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtTelComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelComponentAdded

    private void txtApPaternoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApPaternoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApPaternoKeyReleased

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtTelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFocusLost

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
            java.util.logging.Logger.getLogger(FrmAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAltaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbGuardar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAPnaterno;
    private javax.swing.JLabel lblApPaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSigId;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
