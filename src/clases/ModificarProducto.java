/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import conectar_bd.Conexion_consulta;
import static conectar_bd.Conexion_consulta.resultado;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author ACER
 */
public class ModificarProducto extends javax.swing.JFrame {

    /**
     * Creates new form ModifiacrProducto
     */
    String categoriaProducto, numCantidadStock, numCantidadVenta;
    String valorCantidadStock_bd, valorCantidadVenta_bd, txtPrecio_unidad;
    Integer valorCantidadStock, valorCantidadVenta, resultadoStock, resultadoVenta, resultado, numberCantidadStock = 0, numberCantidadVenta = 0;
    Integer Precio_unidad = 0;
    Integer cantidadStockDB, cantidadVentaDB;
    ResultSet rs;
    public ModificarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        LlenarComboBoxProducto();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        referencia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCategoriaProducto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidadStock = new javax.swing.JSpinner();
        cantidadVenta = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        precioUnidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtValorStock_bd = new javax.swing.JLabel();
        txtValorVenta_bd = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setTitle("Modificar producto");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("Modificar Producto");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Referencia:");

        referencia.setBackground(new java.awt.Color(255, 255, 255));
        referencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        referencia.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Categoria:");

        jCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCategoriaProductoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Proveedor:");

        proveedor.setBackground(new java.awt.Color(255, 255, 255));
        proveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        proveedor.setForeground(new java.awt.Color(0, 0, 0));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre del producto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cantidad stock:");

        cantidadStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadStock.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadStockStateChanged(evt);
            }
        });

        cantidadVenta.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadVentaStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad venta:");

        precioUnidad.setBackground(new java.awt.Color(255, 255, 255));
        precioUnidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        precioUnidad.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio unidad:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total:  $");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setText("0");

        jButton2.setBackground(new java.awt.Color(0, 153, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Actualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtValorStock_bd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValorStock_bd.setForeground(new java.awt.Color(0, 0, 0));
        txtValorStock_bd.setText("0");

        txtValorVenta_bd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtValorVenta_bd.setForeground(new java.awt.Color(0, 0, 0));
        txtValorVenta_bd.setText("0");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCategoriaProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(proveedor)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorStock_bd))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(precioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtValorVenta_bd, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(precioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cantidadVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorVenta_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantidadStock, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorStock_bd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed
    
    private void LlenarComboBoxProducto(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT nombre_categoria FROM categorias");

                rs = pst.executeQuery();
                jCategoriaProducto.addItem("Lista grupos..");

                if(true){  
                    while(rs.next()){
                        System.out.println(rs.getString("nombre_categoria")); // MOSTRAR EL PRODUCTO
                        jCategoriaProducto.addItem(rs.getString("nombre_categoria"));
                    }
                } else {
                        JOptionPane.showMessageDialog(null, "No existe este producto");
                }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // Buscar producto        
            // nombre.setEnabled(false);
            // nombre.setEditable(false);
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_inventario", "root", "");
                PreparedStatement pst = cn.prepareStatement("SELECT * FROM salida WHERE referencia_salida = ?");
                pst.setString(1, referencia.getText()); 

                rs = pst.executeQuery();
            //valorCantidadStock_bd = rs.getString(rs.getString("cantidad_stock"));
            //valorCantidadVenta_bd = rs.getString(rs.getString("cantidad_salida"));
            
                if(rs.next()){
                    // referencia.setText(rs.getString("referencia_salida"));
                    jCategoriaProducto.setSelectedItem(rs.getString("sacategoria"));
                    proveedor.setText(rs.getString("salida_proveedor"));
                    nombre.setText(rs.getString("saproducto"));
                    valorCantidadStock_bd = rs.getString("cantidad_stock");
                    valorCantidadVenta_bd = rs.getString("cantidad_salida");
                    // enfecha = rs.getString("safecha");

                    txtPrecio_unidad = rs.getString("saprecio_unitario");
                    txtTotal.setText(rs.getString("satotal"));

                    txtValorStock_bd.setText(valorCantidadStock_bd);
                    txtValorVenta_bd.setText(valorCantidadVenta_bd);
                    precioUnidad.setText(txtPrecio_unidad);

                    cantidadStockDB = Integer.parseInt(valorCantidadStock_bd);
                    cantidadVentaDB = Integer.parseInt(valorCantidadVenta_bd);

                 /*   SpinnerNumberModel nmStock = new SpinnerNumberModel();
                    nmStock.setMinimum(0);
                    nmStock.setMaximum(cantidadVentaDB);
                    cantidadStock.setModel(nmStock);*/
                    
                    
                    SpinnerNumberModel nmVenta = new SpinnerNumberModel();
                    nmVenta.setMinimum(0);
                    nmVenta.setMaximum(cantidadStockDB);
                    cantidadVenta.setModel(nmVenta);
                    

                } else {
                    JOptionPane.showMessageDialog(null, "No existe este producto");
                }
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } 
           
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /*
    private void buscar() throws SQLException{
      // String ref = referencia.getText();
       Salida r = Conexion_consulta.buscarProducto(referencia.getText()); 
      Conexion_consulta sa = new Conexion_consulta();
       try{
          if(rs){
              
          }
       }catch(Exception ex){
           
       }
        nombre.setText(rs.getString("saproducto"));
    
    }
    */
    
    
    private void jCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCategoriaProductoActionPerformed
        // TODO add your handling code here:
       categoriaProducto = jCategoriaProducto.getSelectedItem().toString().trim();
    }//GEN-LAST:event_jCategoriaProductoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int dialog = JOptionPane.OK_CANCEL_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Deseas Modificar Este Producto?", "Modificar Producto", dialog);
        if(result == 0){
         try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_inventario", "root", "");
             // PreparedStatement pst = cn.prepareStatement("UPDATE salida SET salida_proveedor=? WHERE referencia_salida = ?");
             PreparedStatement pst = cn.prepareStatement("UPDATE salida SET sacategoria=?, salida_proveedor=?, saproducto=?, cantidad_stock=?, cantidad_salida=?, saprecio_unitario=?, satotal=? WHERE referencia_salida = ?");
           // pst.setString(1, "0");
            pst.setString(1, jCategoriaProducto.getSelectedItem().toString().trim());
            pst.setString(2, proveedor.getText().trim());
            pst.setString(3, nombre.getText().trim());
            pst.setString(4, Integer.toString(resultadoStock).toString().trim());
            pst.setString(5, Integer.toString(resultadoVenta).toString().trim());
            pst.setString(6, precioUnidad.getText().trim());
            pst.setString(7, txtTotal.getText().trim());
      
            pst.setString(8, referencia.getText().trim());
                
            int res = pst.executeUpdate();
            if(res > 0){
          
                proveedor.setText("");
                nombre.setText("");
                precioUnidad.setText("");
                JOptionPane.showMessageDialog(null, "Se Modifico Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "SERVIDOR CAIDO");
        }
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cantidadStockStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadStockStateChanged
        numCantidadStock = cantidadStock.getValue().toString();
        
        valorCantidadVenta = Integer.parseInt(valorCantidadVenta_bd);
        Precio_unidad = Integer.parseInt(txtPrecio_unidad);   
        valorCantidadStock = Integer.parseInt(valorCantidadStock_bd);
        numberCantidadStock = Integer.parseInt(numCantidadStock);
 
        resultadoVenta = valorCantidadVenta - numberCantidadStock;
        resultadoStock = valorCantidadStock + numberCantidadStock;
        resultado = numberCantidadStock * Precio_unidad;
        
        if(resultadoVenta == 0){
            txtValorStock_bd.setText(Integer.toString(resultadoStock).toString()); // stock
            txtValorVenta_bd.setText(Integer.toString(resultadoVenta).toString()); // cantidad de venta
            if(numberCantidadStock == 0) txtTotal.setText(txtPrecio_unidad);
        } else {
            txtValorStock_bd.setText(Integer.toString(resultadoStock).toString()); // STOCK
            txtValorVenta_bd.setText(Integer.toString(resultadoVenta).toString()); // cantidad de venta
            if(numberCantidadStock == 0) txtTotal.setText(txtPrecio_unidad); else txtTotal.setText(Integer.toString(resultado).toString()); // EL TOTAL DE LA VENTA
        }
    }//GEN-LAST:event_cantidadStockStateChanged

    private void cantidadVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadVentaStateChanged
        numCantidadVenta = cantidadVenta.getValue().toString();

        valorCantidadVenta = Integer.parseInt(valorCantidadVenta_bd);
        Precio_unidad = Integer.parseInt(txtPrecio_unidad);   
        valorCantidadStock = Integer.parseInt(valorCantidadStock_bd);
        numberCantidadVenta = Integer.parseInt(numCantidadVenta);
 
        resultadoVenta = valorCantidadVenta + numberCantidadVenta;
        resultadoStock = valorCantidadStock - numberCantidadVenta;
        resultado = numberCantidadVenta * Precio_unidad;
        
        if(resultadoStock == 0){
            txtValorStock_bd.setText(Integer.toString(resultadoStock).toString()); // stock
            txtValorVenta_bd.setText(Integer.toString(resultadoVenta).toString()); // cantidad de venta
            if(numberCantidadVenta == 0) txtTotal.setText(txtPrecio_unidad);
        } else {
            txtValorStock_bd.setText(Integer.toString(resultadoStock).toString()); // STOCK
            txtValorVenta_bd.setText(Integer.toString(resultadoVenta).toString()); // cantidad de venta
            if(numberCantidadVenta == 0) txtTotal.setText(txtPrecio_unidad); else txtTotal.setText(Integer.toString(resultado).toString()); // EL TOTAL DE LA VENTA
        }
    }//GEN-LAST:event_cantidadVentaStateChanged

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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner cantidadStock;
    private javax.swing.JSpinner cantidadVenta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCategoriaProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precioUnidad;
    private javax.swing.JTextField proveedor;
    private javax.swing.JTextField referencia;
    private javax.swing.JLabel txtTotal;
    private javax.swing.JLabel txtValorStock_bd;
    private javax.swing.JLabel txtValorVenta_bd;
    // End of variables declaration//GEN-END:variables
}
