/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.Vistas.Clientes;

import Producto.CapaNegocio.Clientes.Cliente;
import Producto.CapaNegocio.Clientes.DAOCliente;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class FrmConsultaClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsultaClientes
     */
    public FrmConsultaClientes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catálogo Clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nombre", "Apellido Paterno", "Apellido Materno", "Teléfono", "Kilos Robados"
            }
        ));
        jScrollPane1.setViewportView(tblClientes);

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Actualizar/upd_norm.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setDefaultCapable(false);
        btnActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Actualizar/upd_press.png"))); // NOI18N
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Actualizar/upd_roll.png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Eliminar/eliminar_norm.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setDefaultCapable(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Eliminar/eliminar_press.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Eliminar/eliminar_roll.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_norm.png"))); // NOI18N
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setDefaultCapable(false);
        btnCancelar.setFocusPainted(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_press.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Cancelar/canc_roll.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnActualizar)
                .addGap(109, 109, 109)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
        for(int i = 0;i< modelo.getRowCount();){
            modelo.removeRow(i);
        }
        DAOCliente daoCliente = new DAOCliente();
        Iterator itCliente = daoCliente.obtenerClientes();
        while(itCliente.hasNext()){
            Cliente c = (Cliente) itCliente.next();
            String sCliente = c.obtenerIdCliente()+"-"+c.obtenerNombre()+"-"+c.obtenerApPaterno()+"-"+c.obtenerApMaterno()+"-"+c.obtenerTelefono()+"-"+c.getKilosRobados();
            String[] arrCliente = sCliente.split("-");
            modelo.addRow(arrCliente);
        }
        this.tblClientes.setModel(modelo);
    }//GEN-LAST:event_formWindowActivated

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.tblClientes.isRowSelected(this.tblClientes.getSelectedRow())){
            Integer fila = this.tblClientes.getSelectedRow();
            String sID = (String)this.tblClientes.getModel().getValueAt(fila, 0);
            
            DAOCliente daoCliente =  new DAOCliente();
            Cliente c = daoCliente.obtenerClientePorId(Integer.parseInt(sID));
            FrmAltaClienteTrampa actualizacionClientes = new FrmAltaClienteTrampa(c);
            actualizacionClientes.setVisible(true);
        }else
        {
            JOptionPane.showMessageDialog(null, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(this.tblClientes.isRowSelected(this.tblClientes.getSelectedRow())){
            Integer fila = this.tblClientes.getSelectedRow();
            String sID = (String)this.tblClientes.getModel().getValueAt(fila, 0);
            DAOCliente daoCliente =  new DAOCliente();
            Integer res = daoCliente.eliminarPorId(Integer.parseInt(sID));
            if(res == 1){
                JOptionPane.showMessageDialog(null, "Se ha elimindado los datos", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                DefaultTableModel tableModel = (DefaultTableModel) this.tblClientes.getModel();
                tableModel.removeRow(fila);
            }
            else{
                JOptionPane.showMessageDialog(null, "Se produjo un ERROR", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
