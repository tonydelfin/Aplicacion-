/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Clientes;

import Producto.CapaNegocio.Compras.FrmConsultaCompras;
import Producto.Vistas.Clientes.FrmAltaCliente;
import Producto.Vistas.Clientes.FrmConsultaClientes;
import Producto.Vistas.Compras.FrmAltaCompra;
import Producto.Vistas.Refacciones.FrmAltaRefacciones;
import Producto.Vistas.Refacciones.FrmConsultaRefacciones;
import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lbllogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarCompra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConsultaBDP = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsultaBDC = new javax.swing.JButton();
        btnConsultaBDCompra = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/city.png"))); // NOI18N
        lbllogo.setText("jLabel1");
        jPanel1.add(lbllogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 340, 190));

        btnAgregarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_norm.png"))); // NOI18N
        btnAgregarCompra.setBorder(null);
        btnAgregarCompra.setBorderPainted(false);
        btnAgregarCompra.setContentAreaFilled(false);
        btnAgregarCompra.setFocusPainted(false);
        btnAgregarCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_press.png"))); // NOI18N
        btnAgregarCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_roll.png"))); // NOI18N
        btnAgregarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Agregar Compra");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 130, 30));

        btnAgregarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_norm.png"))); // NOI18N
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.setBorderPainted(false);
        btnAgregarCliente.setContentAreaFilled(false);
        btnAgregarCliente.setFocusPainted(false);
        btnAgregarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_press.png"))); // NOI18N
        btnAgregarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_roll.png"))); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_norm.png"))); // NOI18N
        btnAgregarProducto.setBorder(null);
        btnAgregarProducto.setBorderPainted(false);
        btnAgregarProducto.setContentAreaFilled(false);
        btnAgregarProducto.setFocusPainted(false);
        btnAgregarProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_press.png"))); // NOI18N
        btnAgregarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/añadir/add_roll.png"))); // NOI18N
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agregar Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 120, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Agregar Producto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 130, 30));

        btnConsultaBDP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_norm.png"))); // NOI18N
        btnConsultaBDP.setBorder(null);
        btnConsultaBDP.setBorderPainted(false);
        btnConsultaBDP.setContentAreaFilled(false);
        btnConsultaBDP.setFocusPainted(false);
        btnConsultaBDP.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_press.png"))); // NOI18N
        btnConsultaBDP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDP.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaBDPActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaBDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 540, -1));

        btnConsultaBDC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_norm.png"))); // NOI18N
        btnConsultaBDC.setBorder(null);
        btnConsultaBDC.setBorderPainted(false);
        btnConsultaBDC.setContentAreaFilled(false);
        btnConsultaBDC.setFocusPainted(false);
        btnConsultaBDC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_press.png"))); // NOI18N
        btnConsultaBDC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDC.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaBDCActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaBDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        btnConsultaBDCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_norm.png"))); // NOI18N
        btnConsultaBDCompra.setBorder(null);
        btnConsultaBDCompra.setBorderPainted(false);
        btnConsultaBDCompra.setContentAreaFilled(false);
        btnConsultaBDCompra.setFocusPainted(false);
        btnConsultaBDCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_press.png"))); // NOI18N
        btnConsultaBDCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDCompra.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Comprobar/comprobar_roll.png"))); // NOI18N
        btnConsultaBDCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaBDCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultaBDCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 540, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Salir/salir_norm.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Salir/salir_press.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Salir/salir_roll.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        FrmAltaCliente altaCliente = new FrmAltaCliente();
        altaCliente.setLocationRelativeTo(null);
        altaCliente.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        altaCliente.setVisible(true);
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnConsultaBDCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaBDCompraActionPerformed
        FrmConsultaCompras frmcompra = new FrmConsultaCompras();
        frmcompra.setLocationRelativeTo(null);
        frmcompra.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmcompra.setVisible(true);
    }//GEN-LAST:event_btnConsultaBDCompraActionPerformed

    private void btnAgregarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCompraActionPerformed
       FrmAltaCompra frmAltac = new FrmAltaCompra();
        frmAltac.setLocationRelativeTo(null);
        frmAltac.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmAltac.setVisible(true);
    }//GEN-LAST:event_btnAgregarCompraActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        FrmAltaRefacciones pord = new FrmAltaRefacciones();
        pord.setLocationRelativeTo(null);
        pord.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        pord.setVisible(true);
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnConsultaBDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaBDCActionPerformed
        FrmConsultaClientes pord = new FrmConsultaClientes();
        pord.setLocationRelativeTo(null);
        pord.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        pord.setVisible(true);  
    }//GEN-LAST:event_btnConsultaBDCActionPerformed

    private void btnConsultaBDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaBDPActionPerformed
        FrmConsultaRefacciones frmref = new FrmConsultaRefacciones();
        frmref.setLocationRelativeTo(null);
        frmref.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frmref.setVisible(true);
    }//GEN-LAST:event_btnConsultaBDPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCompra;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnConsultaBDC;
    private javax.swing.JButton btnConsultaBDCompra;
    private javax.swing.JButton btnConsultaBDP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbllogo;
    // End of variables declaration//GEN-END:variables
}
