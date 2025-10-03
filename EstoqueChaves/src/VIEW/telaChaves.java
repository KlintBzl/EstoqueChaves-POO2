
package VIEW;

import DAO.ChaveDAO;
import DTO.ChaveDTO;

public class telaChaves extends javax.swing.JFrame {

    
    public telaChaves() {
        initComponents();
        ChaveDAO chavear = new ChaveDAO();
        chavear.pesquisaAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumeracao = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtNumeracao = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChaves = new javax.swing.JTable();
        btnAddChave = new javax.swing.JButton();
        btnPesquisarChave = new javax.swing.JButton();
        btnEditarChave = new javax.swing.JButton();
        btnEliminarChave = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de gerenciamento de chaves virgens");
        setResizable(false);

        jLabel1.setText("ID:");

        lblTipo.setText("Tipo:");

        lblNumeracao.setText("Numeração:");

        jLabel2.setText("C:");

        jLabel3.setText("Quantidade:");

        tbChaves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChaves.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChavesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbChaves);
        if (tbChaves.getColumnModel().getColumnCount() > 0) {
            tbChaves.getColumnModel().getColumn(0).setResizable(false);
            tbChaves.getColumnModel().getColumn(1).setResizable(false);
            tbChaves.getColumnModel().getColumn(2).setResizable(false);
            tbChaves.getColumnModel().getColumn(3).setResizable(false);
            tbChaves.getColumnModel().getColumn(4).setResizable(false);
        }

        btnAddChave.setBackground(new java.awt.Color(137, 243, 54));
        btnAddChave.setForeground(new java.awt.Color(0, 127, 255));
        btnAddChave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btnAddChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddChaveActionPerformed(evt);
            }
        });

        btnPesquisarChave.setBackground(new java.awt.Color(255, 247, 0));
        btnPesquisarChave.setForeground(new java.awt.Color(0, 127, 255));
        btnPesquisarChave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurarChave.png"))); // NOI18N
        btnPesquisarChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarChaveActionPerformed(evt);
            }
        });

        btnEditarChave.setBackground(new java.awt.Color(10, 10, 255));
        btnEditarChave.setForeground(new java.awt.Color(0, 0, 255));
        btnEditarChave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        btnEditarChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarChaveActionPerformed(evt);
            }
        });

        btnEliminarChave.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarChave.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarChave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btnEliminarChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarChaveActionPerformed(evt);
            }
        });

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtID)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblNumeracao)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeracao, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddChave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPesquisarChave)
                        .addGap(12, 12, 12)
                        .addComponent(btnEditarChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarChave)
                        .addGap(21, 21, 21))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnLimpar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTipo)))
                            .addComponent(btnAddChave)
                            .addComponent(btnPesquisarChave)
                            .addComponent(btnEditarChave))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumeracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addComponent(lblNumeracao)))
                    .addComponent(btnEliminarChave))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChaveActionPerformed
        
        int id_chaves = Integer.parseInt(txtID.getText());
        String tipo = txtTipo.getText();
        int numeracao = Integer.parseInt(txtNumeracao.getText());
        int C = Integer.parseInt(txtC.getText());
        int quantidade = Integer.parseInt(txtQuantidade.getText());

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        objChaveDTO.setTipo(tipo);
        objChaveDTO.setNumeracao(numeracao);
        objChaveDTO.setC(C);
        objChaveDTO.setQuantidade(quantidade);

        ChaveDAO objChaveDAO = new ChaveDAO();
        objChaveDAO.inserirUsuario(objChaveDTO);
    }//GEN-LAST:event_btnAddChaveActionPerformed

    private void btnPesquisarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarChaveActionPerformed
        int id_chaves = Integer.parseInt(txtID.getText());
        String tipo = txtTipo.getText();
        

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        
        ChaveDAO objChaveDAO = new ChaveDAO();
        objChaveDAO.pesquisar(objChaveDTO);
    }//GEN-LAST:event_btnPesquisarChaveActionPerformed

    private void btnEditarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarChaveActionPerformed
        int id_chaves = Integer.parseInt(txtID.getText());
        String tipo = txtTipo.getText();
        int numeracao = Integer.parseInt(txtNumeracao.getText());
        int C = Integer.parseInt(txtC.getText());
        int quantidade = Integer.parseInt(txtQuantidade.getText());

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        objChaveDTO.setTipo(tipo);
        objChaveDTO.setNumeracao(numeracao);
        objChaveDTO.setC(C);
        objChaveDTO.setQuantidade(quantidade);
        
        ChaveDAO objChaveDAO = new ChaveDAO();
        objChaveDAO.editar(objChaveDTO);
    }//GEN-LAST:event_btnEditarChaveActionPerformed

    private void btnEliminarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarChaveActionPerformed
         int id_chaves = Integer.parseInt(txtID.getText());
        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        
        ChaveDAO objChaveDAO = new ChaveDAO();
        objChaveDAO.deletar(objChaveDTO);
    }//GEN-LAST:event_btnEliminarChaveActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        telaPrincipal principal = new telaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ChaveDAO objChaveDAO = new ChaveDAO();
        objChaveDAO.limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tbChavesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChavesMouseClicked
        int linhaSel = tbChaves.getSelectedRow();
        if(linhaSel != -1 ){
            String id_chaves = tbChaves.getValueAt(linhaSel, 0).toString();
            String tipo = tbChaves.getValueAt(linhaSel, 1).toString();
            String numeracao = tbChaves.getValueAt(linhaSel, 2).toString();
            String C = tbChaves.getValueAt(linhaSel, 3).toString();
            String quantidade = tbChaves.getValueAt(linhaSel, 4).toString();
            
            txtID.setText(id_chaves);
            txtTipo.setText(tipo);
            txtNumeracao.setText(numeracao);
            txtC.setText(C);
            txtQuantidade.setText(quantidade);
        }
    }//GEN-LAST:event_tbChavesMouseClicked

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
            java.util.logging.Logger.getLogger(telaChaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaChaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaChaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaChaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaChaves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddChave;
    private javax.swing.JButton btnEditarChave;
    private javax.swing.JButton btnEliminarChave;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisarChave;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNumeracao;
    private javax.swing.JLabel lblTipo;
    public static javax.swing.JTable tbChaves;
    public static javax.swing.JTextField txtC;
    public static javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtNumeracao;
    public static javax.swing.JTextField txtQuantidade;
    public static javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
