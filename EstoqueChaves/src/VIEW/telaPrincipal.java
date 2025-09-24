
package VIEW;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
        
        lblUsuarioPrincipal.setSize(50, 600);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnvoltar = new javax.swing.JButton();
        btnlistar = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        lblUsuarioPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuUsuarios = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuChaves = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        btnlistar.setBackground(new java.awt.Color(255, 245, 0));
        btnlistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/listar.png"))); // NOI18N

        btnadd.setBackground(new java.awt.Color(0, 127, 255));
        btnadd.setForeground(new java.awt.Color(0, 127, 255));
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        lblUsuarioPrincipal.setText("Usuário");

        MenuUsuarios.setText("Gerenciar");
        MenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsuariosMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Usuarios");
        MenuUsuarios.add(jMenuItem1);

        MenuChaves.setText("Chaves");
        MenuChaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuChavesMouseClicked(evt);
            }
        });
        MenuUsuarios.add(MenuChaves);

        jMenuBar1.add(MenuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnvoltar)
                        .addContainerGap(481, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(33, 33, 33)
                        .addComponent(btnlistar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUsuarioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlistar)
                            .addComponent(btnadd)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsuarioPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                .addComponent(btnvoltar)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        this.dispose();
        telaLogin login = new telaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed

<<<<<<< HEAD
=======

>>>>>>> f04e1b1b2ca78a791d991374314b77badc09d62f
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnaddActionPerformed

    private void MenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsuariosMouseClicked
        
    }//GEN-LAST:event_MenuUsuariosMouseClicked

    private void MenuChavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuChavesMouseClicked
        
    }//GEN-LAST:event_MenuChavesMouseClicked


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
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuChaves;
    private javax.swing.JMenu MenuUsuarios;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnlistar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JLabel lblUsuarioPrincipal;
    // End of variables declaration//GEN-END:variables
}
