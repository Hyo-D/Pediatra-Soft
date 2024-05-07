package Interfaces;

import Conexionsql.Conexion;
import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ifrmCatalogo extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();

    public ifrmCatalogo() {
        initComponents();
        modelo = (DefaultTableModel) tblPacientes.getModel();
        Listar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPacientes = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnExpandir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Catalogo Pacientes");

        tblPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Nombre Completo", "NombreMadre", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPacientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblPacientes);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnExpandir.setText("Expandir Registro");
        btnExpandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpandirActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });

        jLabel1.setText("Nombre del paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExpandir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExpandir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        frmMDF mdf = new frmMDF();
        int Row = tblPacientes.getSelectedRow();

        if (Row != -1) {
            mdf.fillTxt(Integer.parseInt(tblPacientes.getValueAt(Row, 0).toString()));
            mdf.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione un registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Listar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Listar();
        }
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void btnExpandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpandirActionPerformed
        frmDetalles det = new frmDetalles();

        int Row = tblPacientes.getSelectedRow();

        if (Row != -1) {
            det.fillTxt(Integer.parseInt(tblPacientes.getValueAt(Row, 0).toString()));
            det.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this,"Seleccione un registro", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExpandirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void Listar() {
        String Nombre = txtFiltro.getText();

        try {
            CallableStatement statement = Conexion.getConexion().prepareCall("{call Consultorio.spPacientes(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
            statement.setInt(1, 1);
            statement.setInt(2, -1);
            statement.setString(3, Nombre);
            statement.setString(4, "");
            statement.setString(5, "");
            statement.setString(6, "");
            statement.setString(7, "");
            statement.setString(8, "");
            statement.setString(9, "");
            statement.setString(10, "");
            statement.setString(11, "");
            statement.setString(12, "");
            statement.setString(13, "");
            statement.setString(14, "");
            statement.setString(15, "");
            statement.setString(16, "");
            statement.setString(17, "");

            ResultSet resultado = statement.executeQuery();

            modelo.setRowCount(0);
            while (resultado.next()) {

                modelo.addRow(new Object[]{resultado.getString(1), resultado.getString(2), resultado.getString(3), resultado.getString(4)});
            }
        } catch (SQLException ex) {
            System.out.println("Error " + ex.toString());
        }
    }

    public void Eliminar() {

        int Row = tblPacientes.getSelectedRow();
        if (Row != -1) {
            try {
                CallableStatement statement = Conexion.getConexion().prepareCall("{call Consultorio.spPacientes(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                statement.setInt(1, 5);
                statement.setInt(2, Integer.parseInt(tblPacientes.getValueAt(Row, 0).toString()));
                statement.setString(3, "");
                statement.setString(4, "");
                statement.setString(5, "");
                statement.setString(6, "");
                statement.setString(7, "");
                statement.setString(8, "");
                statement.setString(9, "");
                statement.setString(10, "");
                statement.setString(11, "");
                statement.setString(12, "");
                statement.setString(13, "");
                statement.setString(14, "");
                statement.setString(15, "");
                statement.setString(16, "");
                statement.setString(17, "");

                int opt = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar el registro?", "Advertencia", JOptionPane.YES_NO_OPTION);

                if (opt == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(this, "Registro borrado satisfactoriamente", "Eliminar", JOptionPane.OK_OPTION);
                    ResultSet resultado = statement.executeQuery();
                } else {

                }

            } catch (SQLException ex) {
                System.out.println("Error " + ex.toString());
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExpandir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPacientes;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
