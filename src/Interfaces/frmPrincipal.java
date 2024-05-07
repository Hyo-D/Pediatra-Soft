package Interfaces;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class frmPrincipal extends javax.swing.JFrame {

    boolean opc = true;

    public frmPrincipal() {
        initComponents();
        Title();
        icono();
    }

    private void icono() {
        URL iconURL = getClass().getResource("/Interfaces/Recursos/healt.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
    }

    private void Title() {
        String hostname = "Unknown";
        try {
            InetAddress addr = InetAddress.getLocalHost();
            hostname = addr.getHostName();
            this.setTitle("Administracion Pediatrica - " + hostname);
        } catch (UnknownHostException ex) {
            this.setTitle("Administracion Pediatrica - Unknown");
        }

    }
    //cambiar el icono
//        URL iconURL = getClass().getResource("/Interfaces/Recursos/healt.png");
//        ImageIcon icon = new ImageIcon(iconURL);
//        this.setIconImage(icon.getImage());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        dskPrincipal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        btnCatalogoPacientes = new javax.swing.JButton();
        btnConsultas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmnuSalir = new javax.swing.JMenu();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dskPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Recursos/Logo.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Recursos/add.png"))); // NOI18N
        btnAñadir.setBorder(null);
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
        });
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnCatalogoPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Recursos/folder.png"))); // NOI18N
        btnCatalogoPacientes.setBorder(null);
        btnCatalogoPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCatalogoPacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCatalogoPacientesMouseExited(evt);
            }
        });
        btnCatalogoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoPacientesActionPerformed(evt);
            }
        });

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Recursos/contrac.png"))); // NOI18N
        btnConsultas.setBorder(null);
        btnConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultasMouseExited(evt);
            }
        });
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCatalogoPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(745, 745, 745))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
            .addComponent(btnCatalogoPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dskPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dskPrincipal.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskPrincipalLayout = new javax.swing.GroupLayout(dskPrincipal);
        dskPrincipal.setLayout(dskPrincipalLayout);
        dskPrincipalLayout.setHorizontalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dskPrincipalLayout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(373, 373, 373))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dskPrincipalLayout.setVerticalGroup(
            dskPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dskPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(255, 255, 255))
        );

        jMenu1.setText("Citas");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Archivo Clinico");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");
        jMenuBar1.add(jMenu3);

        jmnuSalir.setText("Salir");
        jmnuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmnuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmnuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmnuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmnuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmnuSalirMouseClicked

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        ifrmINS INS = new ifrmINS();
        dskPrincipal.add(INS);
        INS.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnCatalogoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoPacientesActionPerformed
        ifrmCatalogo Cat = new ifrmCatalogo();

        dskPrincipal.add(Cat);
        Cat.setVisible(true);
    }//GEN-LAST:event_btnCatalogoPacientesActionPerformed

    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        btnAñadir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
    }//GEN-LAST:event_btnAñadirMouseEntered

    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        btnAñadir.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnAñadirMouseExited

    private void btnCatalogoPacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoPacientesMouseEntered
        btnCatalogoPacientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
    }//GEN-LAST:event_btnCatalogoPacientesMouseEntered

    private void btnCatalogoPacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoPacientesMouseExited
        btnCatalogoPacientes.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnCatalogoPacientesMouseExited

    private void btnConsultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseEntered
        btnConsultas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.black, java.awt.Color.black, null, null));
    }//GEN-LAST:event_btnConsultasMouseEntered

    private void btnConsultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultasMouseExited
        btnConsultas.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_btnConsultasMouseExited

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        
        
        
    }//GEN-LAST:event_btnConsultasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnCatalogoPacientes;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JDesktopPane dskPrincipal;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmnuSalir;
    // End of variables declaration//GEN-END:variables
}
