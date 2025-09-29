
package VIEW;

import javax.swing.JOptionPane;

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChavesCadastradas1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BarraDeMenuPrincipal = new javax.swing.JMenuBar();
        MenuGer = new javax.swing.JMenu();
        menutitulocadastrar = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuChaves = new javax.swing.JMenu();
        MenuVirgem = new javax.swing.JMenuItem();
        MenuUsada = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MenuHistoricar = new javax.swing.JMenuItem();
        SeparadorDeOpcao = new javax.swing.JPopupMenu.Separator();
        MenuAjudar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuSobrir = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuOpicoes = new javax.swing.JMenuItem();
        MenuCadastrar = new javax.swing.JMenu();
        MenuUsuarios1 = new javax.swing.JMenuItem();
        MenuChaves1 = new javax.swing.JMenu();
        MenuVirgem1 = new javax.swing.JMenuItem();
        MenuUsada1 = new javax.swing.JMenuItem();
        MenuHistorico = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();
        MenuOpções = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        tbChavesCadastradas1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbChavesCadastradas1);
        if (tbChavesCadastradas1.getColumnModel().getColumnCount() > 0) {
            tbChavesCadastradas1.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCadastradas1.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCadastradas1.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCadastradas1.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCadastradas1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setText("Chaves Usadas em estoque");

        jLabel3.setText("Histórico de entradas e saídas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Data", "Historico", "Entradas", "Saídas", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
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
        MenuUsada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsadaActionPerformed(evt);
            }
        });
        MenuChaves.add(MenuUsada);

        MenuGer.add(MenuChaves);
        MenuGer.add(jSeparator3);

        MenuHistoricar.setText("Histórico");
        MenuGer.add(MenuHistoricar);
        MenuGer.add(SeparadorDeOpcao);

        MenuAjudar.setText("Ajuda");
        MenuGer.add(MenuAjudar);
        MenuGer.add(jSeparator1);

        MenuSobrir.setText("Sobre");
        MenuGer.add(MenuSobrir);
        MenuGer.add(jSeparator2);

        MenuOpicoes.setText("Opções");
        MenuGer.add(MenuOpicoes);

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

        MenuVirgem1.setText("Virgem");
        MenuVirgem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVirgem1ActionPerformed(evt);
            }
        });
        MenuChaves1.add(MenuVirgem1);

        MenuUsada1.setText("Usada");
        MenuUsada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsada1ActionPerformed(evt);
            }
        });
        MenuChaves1.add(MenuUsada1);

        MenuCadastrar.add(MenuChaves1);

        BarraDeMenuPrincipal.add(MenuCadastrar);

        MenuHistorico.setText("Histórico");
        BarraDeMenuPrincipal.add(MenuHistorico);

        MenuAjuda.setText("Ajuda");

        MenuSobre.setText("Sobre");
        MenuAjuda.add(MenuSobre);

        BarraDeMenuPrincipal.add(MenuAjuda);

        MenuOpções.setText("Opções");

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        MenuOpções.add(MenuSair);

        BarraDeMenuPrincipal.add(MenuOpções);

        setJMenuBar(BarraDeMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(214, 214, 214))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnvoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel3)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvoltar)
                .addGap(21, 21, 21))
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
        telaUsuarios usuarios = new telaUsuarios();
        usuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuUsuarios1ActionPerformed

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
        telaChaves chave = new telaChaves();
        chave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVirgemActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair","Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(sair);
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuVirgem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVirgem1ActionPerformed
        telaChaves chave = new telaChaves();
        chave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVirgem1ActionPerformed

    private void MenuUsadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsadaActionPerformed
        telaChavesUsadas chave = new telaChavesUsadas();
        chave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuUsadaActionPerformed

    private void MenuUsada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsada1ActionPerformed
        telaChavesUsadas chave = new telaChavesUsadas();
        chave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuUsada1ActionPerformed





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
    public static javax.swing.JMenu MenuChaves1;
    public static javax.swing.JMenu MenuGer;
    private javax.swing.JMenuItem MenuHistoricar;
    private javax.swing.JMenu MenuHistorico;
    private javax.swing.JMenuItem MenuOpicoes;
    private javax.swing.JMenu MenuOpções;
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuSobre;
    private javax.swing.JMenuItem MenuSobrir;
    public static javax.swing.JMenuItem MenuUsada;
    private javax.swing.JMenuItem MenuUsada1;
    public static javax.swing.JMenuItem MenuUsuarios;
    public static javax.swing.JMenuItem MenuUsuarios1;
    public static javax.swing.JMenuItem MenuVirgem;
    private javax.swing.JMenuItem MenuVirgem1;
    private javax.swing.JPopupMenu.Separator SeparadorDeOpcao;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JMenuItem menutitulocadastrar;
    public static javax.swing.JTable tbChavesCadastradas;
    public static javax.swing.JTable tbChavesCadastradas1;
    // End of variables declaration//GEN-END:variables
}
