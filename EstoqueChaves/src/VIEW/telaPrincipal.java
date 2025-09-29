
package VIEW;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChavesCadastradas = new javax.swing.JTable();
        BarraDeMenuPrincipal = new javax.swing.JMenuBar();
        MenuGer = new javax.swing.JMenu();
        menutitulocadastrar = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuChaves = new javax.swing.JMenu();
        MenuVirgem = new javax.swing.JMenuItem();
        MenuUsada = new javax.swing.JMenuItem();
        SeparadorDeOpcao = new javax.swing.JPopupMenu.Separator();
        MenuAjudar = new javax.swing.JMenuItem();
        MenuCadastrar = new javax.swing.JMenu();
        MenuUsuarios1 = new javax.swing.JMenuItem();
        MenuChaves1 = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenu();
        MenuOpções = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        jLabel1.setText("Chaves Virgens em estoque");

        tbChavesCadastradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo", "Numeração", "C", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbChavesCadastradas);
        if (tbChavesCadastradas.getColumnModel().getColumnCount() > 0) {
            tbChavesCadastradas.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCadastradas.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCadastradas.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCadastradas.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCadastradas.getColumnModel().getColumn(4).setResizable(false);
        }

        MenuGer.setText("Gerenciar");
        MenuGer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuGerMouseClicked(evt);
            }
        });

        menutitulocadastrar.setText("Cadastrar");
        menutitulocadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutitulocadastrarActionPerformed(evt);
            }
        });
        MenuGer.add(menutitulocadastrar);

        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuariosActionPerformed(evt);
            }
        });
        MenuGer.add(MenuUsuarios);

        MenuChaves.setText("Chaves");

        MenuVirgem.setText("Virgem");
        MenuVirgem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVirgemActionPerformed(evt);
            }
        });
        MenuChaves.add(MenuVirgem);

        MenuUsada.setText("Usada");
        MenuChaves.add(MenuUsada);

        MenuGer.add(MenuChaves);
        MenuGer.add(SeparadorDeOpcao);

        MenuAjudar.setText("Ajuda");
        MenuGer.add(MenuAjudar);

        BarraDeMenuPrincipal.add(MenuGer);

        MenuCadastrar.setText("Cadastrar");

        MenuUsuarios1.setText("Usuarios");
        MenuUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarios1ActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuUsuarios1);

        MenuChaves1.setText("Chaves");
        MenuChaves1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuChaves1MouseClicked(evt);
            }
        });
        MenuChaves1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuChaves1ActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuChaves1);

        BarraDeMenuPrincipal.add(MenuCadastrar);

        MenuAjuda.setText("Ajuda");
        BarraDeMenuPrincipal.add(MenuAjuda);

        MenuSobre.setText("Sobre");
        BarraDeMenuPrincipal.add(MenuSobre);

        MenuOpções.setText("Opções");
        BarraDeMenuPrincipal.add(MenuOpções);

        setJMenuBar(BarraDeMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnvoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnvoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        this.dispose();
        telaLogin login = new telaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void MenuUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuUsuarios1ActionPerformed

    private void MenuChaves1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuChaves1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuChaves1MouseClicked

    private void MenuChaves1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuChaves1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuChaves1ActionPerformed

    private void MenuGerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuGerMouseClicked

    }//GEN-LAST:event_MenuGerMouseClicked

    private void MenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuariosActionPerformed
        telaUsuarios usuarios = new telaUsuarios();
        usuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuUsuariosActionPerformed

    private void menutitulocadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutitulocadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menutitulocadastrarActionPerformed

    private void MenuVirgemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVirgemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuVirgemActionPerformed





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
    private javax.swing.JMenuBar BarraDeMenuPrincipal;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenuItem MenuAjudar;
    private javax.swing.JMenu MenuCadastrar;
    public static javax.swing.JMenu MenuChaves;
    public static javax.swing.JMenuItem MenuChaves1;
    public static javax.swing.JMenu MenuGer;
    private javax.swing.JMenu MenuOpções;
    private javax.swing.JMenu MenuSobre;
    public static javax.swing.JMenuItem MenuUsada;
    public static javax.swing.JMenuItem MenuUsuarios;
    public static javax.swing.JMenuItem MenuUsuarios1;
    public static javax.swing.JMenuItem MenuVirgem;
    private javax.swing.JPopupMenu.Separator SeparadorDeOpcao;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JMenuItem menutitulocadastrar;
    public static javax.swing.JTable tbChavesCadastradas;
    // End of variables declaration//GEN-END:variables
}
