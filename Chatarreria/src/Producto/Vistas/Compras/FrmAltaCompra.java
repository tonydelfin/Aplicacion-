/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.Vistas.Compras;

import Producto.CapaNegocio.Clientes.Cliente;
import Producto.CapaNegocio.Clientes.DAOCliente;
import Producto.CapaNegocio.Compras.Compra;
import Producto.CapaNegocio.Compras.DAOCompras;
import Producto.Vistas.Refacciones.*;
import Producto.CapaNegocio.Productos.DAOProductos;
import Producto.CapaNegocio.Productos.producto;
import Producto.Vistas.Clientes.FrmAltaCliente;
import Producto.Vistas.Clientes.FrmAltaClienteTrampa;
import java.awt.Color;
import java.awt.Event;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge
 */
public class FrmAltaCompra extends javax.swing.JFrame {

    /**
     * Creates new form FrmConsultaRefacciones
     */
    
    private Compra compra;
    private Boolean altacompra;
    private Cliente c;
    public FrmAltaCompra() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        InputMap map11 = this.txtKilos.getInputMap(JTextField.WHEN_FOCUSED);
        map11.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        InputMap map12 = this.fecha.getInputMap(JTextField.WHEN_FOCUSED);
        map12.put(KeyStroke.getKeyStroke(KeyEvent.VK_V, Event.CTRL_MASK),"null");
        altacompra= true;
        
    }
       
   

    
    
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRefacciones = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        etiqueta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtKilos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EtiquetaNombre = new javax.swing.JLabel();
        EtiquetaKR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        EtiquetaIdProducto = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EtiquetaDescripcion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        EtiquetaIdCliente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        EtiquetaPrecio = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        EtiquetaTotalaPagar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        EtiquetaAmaterno = new javax.swing.JLabel();
        EtiquetaApaterno = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        etiquetaResta = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        EtiquetaTelefono = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBusquedaCliente = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Compra");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblRefacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripción", "Precio"
            }
        ));
        tblRefacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblRefaccionesMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblRefacciones);

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

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdCliente", "Nombre", "Apellido Paterno", "Apellido Materno", "Teléfono", "Kilos Robados"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblClientesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClientesMouseReleased(evt);
            }
        });
        tblClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClientesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        jLabel2.setText("Fecha de la Compra: ");

        jLabel3.setText("Kilos del Vendedor");

        txtKilos.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtKilosComponentAdded(evt);
            }
        });
        txtKilos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKilosActionPerformed(evt);
            }
        });
        txtKilos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKilosKeyTyped(evt);
            }
        });

        jLabel4.setText("Total");

        jLabel5.setText("Nombre");

        jLabel7.setText("Kilos Robados");

        jLabel8.setText("Descripción");

        jLabel9.setText("Precio");

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_norm.png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setDefaultCapable(false);
        btnGuardar.setFocusPainted(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_press.png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botones_smoke (mejorados)/Guardar/save_roll.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel10.setText("Id Cliente");

        jLabel11.setText("Id Producto");

        fecha.setMaxSelectableDate(new java.util.Date(1654668115000L));

        jLabel12.setText("Apellido Paterno ");

        jLabel13.setText("Apellido Materno ");

        jLabel14.setText("Adeudo:");

        jLabel15.setText("Teléfono");

        jLabel16.setText("Buscar Cliente");

        txtBusquedaCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtBusquedaCliente.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtBusquedaClienteCaretUpdate(evt);
            }
        });
        txtBusquedaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EtiquetaIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EtiquetaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(367, 367, 367)
                                .addComponent(etiqueta)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EtiquetaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(EtiquetaIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(EtiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel13)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel15)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel7))
                                    .addComponent(EtiquetaApaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EtiquetaAmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKilos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EtiquetaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EtiquetaKR, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaResta, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCancelar)
                                    .addComponent(EtiquetaTotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBusquedaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EtiquetaIdCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiquetaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EtiquetaApaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(EtiquetaTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EtiquetaAmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaKR, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(etiquetaResta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(EtiquetaTotalaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar)
                    .addComponent(btnGuardar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel modelo1 = (DefaultTableModel) this.tblClientes.getModel();
        for(int i = 0;i< modelo1.getRowCount();){
            modelo1.removeRow(i);
        }
        DAOCliente daoCliente = new DAOCliente();
        Iterator itCliente = daoCliente.obtenerClientes();
        while(itCliente.hasNext()){
            Cliente c = (Cliente) itCliente.next();
            String sCliente = c.obtenerIdCliente()+"-"+ c.obtenerNombre()+"-"+ c.obtenerApPaterno()+"-"+c.obtenerApMaterno()+"-"+c.obtenerTelefono()+"-"+c.getKilosRobados();
            String[] arrCliente = sCliente.split("-");
            modelo1.addRow(arrCliente);
        }
        this.tblClientes.setModel(modelo1);
        
        
        DefaultTableModel modelo = (DefaultTableModel) this.tblRefacciones.getModel();
        for(int i=0;i <modelo.getRowCount();){
            modelo.removeRow(i);
        }
        DAOProductos daoRefacciones = new DAOProductos();
        Iterator itRefaccion =  daoRefacciones.obtenerProducto();
        while(itRefaccion.hasNext()){
            producto r = (producto) itRefaccion.next();
            String sRef = r.obtenerIdproducto()+"-"+r.obtenerDescripcion()+"-"+r.obtenerPrecio();
            String[] arrRefacciones = sRef.split("-");
            modelo.addRow(arrRefacciones);
        }
        this.tblRefacciones.setModel(modelo);
    }//GEN-LAST:event_formWindowActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtKilosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKilosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKilosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(this.altacompra == true){
            if((this.fecha.getDate() != null) && (this.txtKilos.getText().length() >0) ){
                
                
                
                Compra c = new Compra();
                
                
                Double aKilosRobados =Double.parseDouble( this.EtiquetaKR.getText());
                Double aKilosCliente = Double.parseDouble(this.txtKilos.getText());
                Double aPrecioProducto = Double.parseDouble(this.EtiquetaPrecio.getText());
                Double resta = aKilosCliente - aKilosRobados;
                
                if(aKilosRobados >0){
                    
                    this.EtiquetaTotalaPagar.setText(String.valueOf(resta * aPrecioProducto));

                    
                    
                }else{
                    this.EtiquetaTotalaPagar.setText(String.valueOf(aKilosCliente * aPrecioProducto));
                }
                c.setIdCompra(0);
                
                String fechaC;
                java.util.Date date=  new java.util.Date();
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                
                fechaC = f.format(fecha.getDate());
                
                
             
                c.setFecha(fechaC);
                c.setIdCliente(Long.parseLong(this.EtiquetaIdCliente.getText()));
                c.setIdProducto(Long.parseLong(this.EtiquetaIdProducto.getText()));
                c.setKilosC(Double.parseDouble(this.txtKilos.getText()));
                c.setTotal(Double.parseDouble(this.EtiquetaTotalaPagar.getText()));                  
                
                
                
                if(aKilosCliente <aKilosRobados){
                    JOptionPane.showMessageDialog(null, "El cliente debe un total de: "+ aKilosRobados, "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Por favor Introduzca otros valores", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.tblClientes.setColumnSelectionAllowed(false);
                    this.tblClientes.setRowSelectionAllowed(false);
                    this.tblRefacciones.setColumnSelectionAllowed(false);
                    this.tblRefacciones.setRowSelectionAllowed(false);
                    
                    
                    

                }
                
                else{
                    Cliente cc = new Cliente();
                    Double bKilosRobados =Double.parseDouble( this.EtiquetaKR .getText());
                    Double bKilosCliente = Double.parseDouble(this.txtKilos.getText());

                    Double bresta = bKilosRobados- bKilosCliente ;
                    
                    




                    if (bresta <0) {
                        this.etiquetaResta.setText("0.0");


                    }else{
                        this.etiquetaResta.setText((bresta).toString());
                        
                    }


                    cc.ponerIdCliente(Long.parseLong(this.EtiquetaIdCliente.getText()));
                    cc.ponerNombreCliente(this.EtiquetaNombre.getText());
                    cc.ponerApPaterno(this.EtiquetaApaterno.getText());
                    cc.ponerApMaterno(this.EtiquetaAmaterno.getText());
                    cc.ponerTelefono(this.EtiquetaTelefono.getText());
                    

                    if(bresta <0){
                        cc.setKilosRobados((0.0));
                    }
                    else{
                        setForeground(Color.RED);
                        cc.setKilosRobados(Double.parseDouble(this.etiquetaResta.getText()));
                        
                    }

                    DAOCliente daoCliente= new DAOCliente();
                    Integer resultado = daoCliente.actualizarCliente(cc);
                    if(resultado ==1){
                        JOptionPane.showMessageDialog(null, "Registro Actualizado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "Error al Actualizar", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    this.setVisible(false);


                    DAOCompras daoCompra = new DAOCompras();
                    Integer resp = daoCompra.ageregarCompra(c);
                    if(resp ==1){
                        JOptionPane.showMessageDialog(null, "La Compra se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Ocurrio un Error", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    this.setVisible(false);
                    }
                
                

                
            }
            else{
                    JOptionPane.showMessageDialog(null, "Los datos estan Incorrectos, intente otra vez", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
                
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClientesKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientesKeyPressed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked

    }//GEN-LAST:event_tblClientesMouseClicked

    private void tblClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMousePressed
        if(this.tblClientes.isRowSelected(this.tblClientes.getSelectedRow())){
        Integer fila = this.tblClientes.getSelectedRow();
        
        
        String sIdeCliente = (String)this.tblClientes.getModel().getValueAt(fila, 0);
        String sNombre = (String)this.tblClientes.getModel().getValueAt(fila, 1);
        
        String sAPPatenro = (String)this.tblClientes.getModel().getValueAt(fila, 2);
        String sAPMaterno = (String)this.tblClientes.getModel().getValueAt(fila, 3);
        String sTelefono = (String)this.tblClientes.getModel().getValueAt(fila, 4);
  
        String sKilosRobados =(String)this.tblClientes.getModel().getValueAt(fila, 5);

        this.EtiquetaIdCliente.setText(sIdeCliente);
        this.EtiquetaNombre.setText(sNombre);
        this.EtiquetaKR.setText(sKilosRobados);
        this.EtiquetaApaterno.setText(sAPPatenro);
        this.EtiquetaAmaterno.setText(sAPMaterno);
        this.EtiquetaTelefono.setText(sTelefono);
       
        

        
        }else
        {
            JOptionPane.showMessageDialog(null, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tblClientesMousePressed

    private void tblClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblClientesMouseReleased

    private void tblRefaccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRefaccionesMousePressed
        if (this.tblRefacciones.isRowSelected(this.tblRefacciones.getSelectedRow())) {
        Integer Fila2 = this.tblRefacciones.getSelectedRow();
        String sIdeProducto = (String)this.tblRefacciones.getModel().getValueAt(Fila2, 0);
        String sDescipcion = (String)this.tblRefacciones.getModel().getValueAt(Fila2, 1);
        String iPrecio =(String)this.tblRefacciones.getModel().getValueAt(Fila2, 2);

        this.EtiquetaIdProducto.setText(sIdeProducto);
        this.EtiquetaDescripcion.setText(sDescipcion);
        this.EtiquetaPrecio.setText(iPrecio);
        

        
        }else
        {
            JOptionPane.showMessageDialog(null, "No hay filas seleccionadas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_tblRefaccionesMousePressed

    private void txtKilosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtKilosComponentAdded
        
    }//GEN-LAST:event_txtKilosComponentAdded

    private void txtBusquedaClienteCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtBusquedaClienteCaretUpdate
        String valor = this.txtBusquedaCliente.getText();
        if (valor.isEmpty()) {
            this.tblClientes.clearSelection();
        }
        else{
            for (int i = 0; i < this.tblClientes.getRowCount(); i++) {
                if (this.tblClientes.getValueAt(i, 1).equals(valor)) {
                    
                    this.tblClientes.changeSelection(i, 1, false, false);
                }
            }
        }
    }//GEN-LAST:event_txtBusquedaClienteCaretUpdate

    private void txtBusquedaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaClienteKeyTyped
       
        char letra = evt.getKeyChar();
        if((letra < 'a' || letra > 'z') && (letra < 'A' || letra > 'Z') && (letra != 32) && (letra != '\u00f1') && (letra != '\u00d1')
        && (letra != '\u002E') && (letra != 'á') && (letra != 'é') && (letra != 'í') && (letra != 'ó') && (letra != 'ú') && 
        (letra != 'Á') && (letra != 'É') && (letra != 'Í') && (letra != 'Ó') && (letra != 'Ú') && (letra != 8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if(this.txtBusquedaCliente.getText().length() >= 30){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        char txtBusquedaCliente=  evt.getKeyChar();
        if(Character.isDigit(txtBusquedaCliente)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Letras");
        }
    }//GEN-LAST:event_txtBusquedaClienteKeyTyped

    private void txtKilosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKilosKeyTyped
        char txtKilos=  evt.getKeyChar();
        if (txtKilos < '0' || txtKilos >'9') {
            evt.consume();
        }
        if(Character.isLetter(txtKilos)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane,"Ingrese solo Números");
        }
        if (this.txtKilos.getText().length() >=10) {
           evt.consume();
        }
    }//GEN-LAST:event_txtKilosKeyTyped

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
            java.util.logging.Logger.getLogger(FrmAltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAltaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAltaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EtiquetaAmaterno;
    private javax.swing.JLabel EtiquetaApaterno;
    private javax.swing.JLabel EtiquetaDescripcion;
    private javax.swing.JLabel EtiquetaIdCliente;
    private javax.swing.JLabel EtiquetaIdProducto;
    private javax.swing.JLabel EtiquetaKR;
    private javax.swing.JLabel EtiquetaNombre;
    private javax.swing.JLabel EtiquetaPrecio;
    private javax.swing.JLabel EtiquetaTelefono;
    private javax.swing.JLabel EtiquetaTotalaPagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel etiqueta;
    private javax.swing.JLabel etiquetaResta;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblRefacciones;
    private javax.swing.JTextField txtBusquedaCliente;
    private javax.swing.JTextField txtKilos;
    // End of variables declaration//GEN-END:variables
}
