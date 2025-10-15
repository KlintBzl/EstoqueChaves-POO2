
package VIEW;

import DAO.ChaveUsadaDAO;
import DTO.ChaveDTO;

public class telaChavesUsadas extends javax.swing.JFrame {

    public telaChavesUsadas() {
        initComponents();
        ChaveUsadaDAO chavear = new ChaveUsadaDAO();
        chavear.pesquisaAuto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChavesUsadas = new javax.swing.JTable();
        btnAddChave = new javax.swing.JButton();
        btnPesquisarChave = new javax.swing.JButton();
        btnEditarChave = new javax.swing.JButton();
        btnEliminarChave = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumeracao = new javax.swing.JLabel();
        txtIDUsadas = new javax.swing.JTextField();
        txtNumeracaoUsadas = new javax.swing.JTextField();
        txtCUsadas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQuantidadeUsadas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        cboTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de gerenciamento de chaves usadas");
        setResizable(false);

        jLabel3.setText("Quantidade:");

        tbChavesUsadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Tipo", "Numeração", "C", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbChavesUsadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChavesUsadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbChavesUsadas);

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

        jLabel1.setText("ID:");

        lblTipo.setText("Tipo:");

        lblNumeracao.setText("Numeração:");

        jLabel2.setText("C:");

        jLabel4.setText("Marca:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yale", "Gorje", "Tetra" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIDUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMarca)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNumeracao)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumeracaoUsadas, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(txtQuantidadeUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(btnEditarChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarChave)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
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
                                        .addComponent(txtIDUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnLimpar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTipo)
                                    .addComponent(jLabel4)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAddChave)
                            .addComponent(btnPesquisarChave)
                            .addComponent(btnEditarChave))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeracaoUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidadeUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtCUsadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
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

    private void tbChavesUsadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChavesUsadasMouseClicked

    }//GEN-LAST:event_tbChavesUsadasMouseClicked

    private void btnAddChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddChaveActionPerformed

        int id_chaves = Integer.parseInt(txtIDUsadas.getText());
        String tipo = cboTipo.getSelectedItem().toString();
        String marca = txtMarca.getText();
        int numeracao = Integer.parseInt(txtNumeracaoUsadas.getText());
        int C = Integer.parseInt(txtCUsadas.getText());
        int quantidade = Integer.parseInt(txtQuantidadeUsadas.getText());

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        objChaveDTO.setMarca(marca);
        objChaveDTO.setTipo(tipo);
        objChaveDTO.setNumeracao(numeracao);
        objChaveDTO.setC(C);
        objChaveDTO.setQuantidade(quantidade);

        ChaveUsadaDAO objChaveDAO = new ChaveUsadaDAO();
        objChaveDAO.inserirChave(objChaveDTO);
    }//GEN-LAST:event_btnAddChaveActionPerformed

    private void btnPesquisarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarChaveActionPerformed
        int numeracao = Integer.parseInt(txtNumeracaoUsadas.getText());

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setNumeracao(numeracao);

        ChaveUsadaDAO objChaveDAO = new ChaveUsadaDAO();
        objChaveDAO.pesquisar(objChaveDTO);
    }//GEN-LAST:event_btnPesquisarChaveActionPerformed

    private void btnEditarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarChaveActionPerformed
        int id_chaves = Integer.parseInt(txtIDUsadas.getText());
        String tipo = cboTipo.getSelectedItem().toString();
        String marca = txtMarca.getText();
        int numeracao = Integer.parseInt(txtNumeracaoUsadas.getText());
        int C = Integer.parseInt(txtCUsadas.getText());
        int quantidade = Integer.parseInt(txtQuantidadeUsadas.getText());

        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);
        objChaveDTO.setTipo(tipo);
        objChaveDTO.setMarca(marca);
        objChaveDTO.setNumeracao(numeracao);
        objChaveDTO.setC(C);
        objChaveDTO.setQuantidade(quantidade);

        ChaveUsadaDAO objChaveDAO = new ChaveUsadaDAO();
        objChaveDAO.editar(objChaveDTO);
    }//GEN-LAST:event_btnEditarChaveActionPerformed

    private void btnEliminarChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarChaveActionPerformed
        int id_chaves = Integer.parseInt(txtIDUsadas.getText());
        ChaveDTO objChaveDTO = new ChaveDTO();
        objChaveDTO.setId(id_chaves);

        ChaveUsadaDAO objChaveDAO = new ChaveUsadaDAO();
        objChaveDAO.deletar(objChaveDTO);
    }//GEN-LAST:event_btnEliminarChaveActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        telaPrincipal principal = new telaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ChaveUsadaDAO objChaveDAO = new ChaveUsadaDAO();
        objChaveDAO.limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(telaChavesUsadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaChavesUsadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaChavesUsadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaChavesUsadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaChavesUsadas().setVisible(true);
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
    public static javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNumeracao;
    private javax.swing.JLabel lblTipo;
    public static javax.swing.JTable tbChavesUsadas;
    public static javax.swing.JTextField txtCUsadas;
    public static javax.swing.JTextField txtIDUsadas;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtNumeracaoUsadas;
    public static javax.swing.JTextField txtQuantidadeUsadas;
    // End of variables declaration//GEN-END:variables
}
