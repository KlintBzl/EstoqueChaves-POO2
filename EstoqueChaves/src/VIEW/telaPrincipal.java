
package VIEW;

import DAO.ChaveDAO;
import DAO.ChaveUsadaDAO;
import DAO.HistoricoDAO;
import static VIEW.telaChaves.*;
import static VIEW.telaChavesUsadas.*;
import static VIEW.telaHistorico.*;
import javax.swing.JOptionPane;

public class telaPrincipal extends javax.swing.JFrame {

    public telaPrincipal() {
        initComponents();
        HistoricoDAO historicotb = new HistoricoDAO();
        historicotb.tabelarH();
        ChaveDAO chaveV = new ChaveDAO();
        chaveV.TabelarV();
        ChaveUsadaDAO chaveU = new ChaveUsadaDAO();
        chaveU.TabelarU();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChavesCVirgens = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChavesCUsadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHistoricoEeS = new javax.swing.JTable();
        BarraDeMenuPrincipal = new javax.swing.JMenuBar();
        MenuGer = new javax.swing.JMenu();
        MenuCadastrarGer = new javax.swing.JMenu();
        MenuUsuarios = new javax.swing.JMenuItem();
        MenuHistoricoGer = new javax.swing.JMenuItem();
        MenuChavesGer = new javax.swing.JMenu();
        MenuVirgemCGer = new javax.swing.JMenuItem();
        MenuUsadaCGer = new javax.swing.JMenuItem();
        SeparadorDeOpcao = new javax.swing.JPopupMenu.Separator();
        MenuAjudaGer = new javax.swing.JMenu();
        MenuSobreGer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuOpcoesGer = new javax.swing.JMenu();
        MenuSairGer = new javax.swing.JMenuItem();
        MenuCadastrar = new javax.swing.JMenu();
        MenuUsuarios1 = new javax.swing.JMenuItem();
        MenuHistorico = new javax.swing.JMenuItem();
        MenuChaves1 = new javax.swing.JMenu();
        MenuVirgem1 = new javax.swing.JMenuItem();
        MenuUsada1 = new javax.swing.JMenuItem();
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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Chaves Virgens em estoque");

        tbChavesCVirgens.setModel(new javax.swing.table.DefaultTableModel(
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
        tbChavesCVirgens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChavesCVirgensMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChavesCVirgens);
        if (tbChavesCVirgens.getColumnModel().getColumnCount() > 0) {
            tbChavesCVirgens.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(4).setResizable(false);
        }

        tbChavesCUsadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tbChavesCUsadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChavesCUsadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbChavesCUsadas);
        if (tbChavesCUsadas.getColumnModel().getColumnCount() > 0) {
            tbChavesCUsadas.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Chaves Usadas em estoque");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Histórico de entradas e saídas");

        tbHistoricoEeS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
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
                "ID", "Data", "Historico", "Entradas", "Saídas", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHistoricoEeS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHistoricoEeSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbHistoricoEeS);
        if (tbHistoricoEeS.getColumnModel().getColumnCount() > 0) {
            tbHistoricoEeS.getColumnModel().getColumn(0).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(1).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(2).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(3).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(4).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(5).setResizable(false);
        }

        MenuGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configuraçãozinha.png"))); // NOI18N
        MenuGer.setText("Gerenciar");
        MenuGer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuGerMouseClicked(evt);
            }
        });

        MenuCadastrarGer.setText("Cadastrar");

        MenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pessoinha.png"))); // NOI18N
        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuariosActionPerformed(evt);
            }
        });
        MenuCadastrarGer.add(MenuUsuarios);

        MenuHistoricoGer.setText("Históricos");
        MenuHistoricoGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoricoGerActionPerformed(evt);
            }
        });
        MenuCadastrarGer.add(MenuHistoricoGer);

        MenuChavesGer.setText("Chaves");

        MenuVirgemCGer.setText("Virgem");
        MenuVirgemCGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVirgemCGerActionPerformed(evt);
            }
        });
        MenuChavesGer.add(MenuVirgemCGer);

        MenuUsadaCGer.setText("Usada");
        MenuUsadaCGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsadaCGerActionPerformed(evt);
            }
        });
        MenuChavesGer.add(MenuUsadaCGer);

        MenuCadastrarGer.add(MenuChavesGer);

        MenuGer.add(MenuCadastrarGer);
        MenuGer.add(SeparadorDeOpcao);

        MenuAjudaGer.setText("Ajuda");

        MenuSobreGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/infinho.png"))); // NOI18N
        MenuSobreGer.setText("Sobre");
        MenuSobreGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreGerActionPerformed(evt);
            }
        });
        MenuAjudaGer.add(MenuSobreGer);

        MenuGer.add(MenuAjudaGer);
        MenuGer.add(jSeparator1);
        MenuGer.add(jSeparator2);

        MenuOpcoesGer.setText("Opções");

        MenuSairGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/saidinha.png"))); // NOI18N
        MenuSairGer.setText("Sair");
        MenuSairGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairGerActionPerformed(evt);
            }
        });
        MenuOpcoesGer.add(MenuSairGer);

        MenuGer.add(MenuOpcoesGer);

        BarraDeMenuPrincipal.add(MenuGer);

        MenuCadastrar.setText("Cadastrar");

        MenuUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pessoinha.png"))); // NOI18N
        MenuUsuarios1.setText("Usuarios");
        MenuUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarios1ActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuUsuarios1);

        MenuHistorico.setText("Históricos");
        MenuHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoricoActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuHistorico);

        MenuChaves1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chavinha.png"))); // NOI18N
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

        MenuAjuda.setText("Ajuda");

        MenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/infinho.png"))); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuSobre);

        BarraDeMenuPrincipal.add(MenuAjuda);

        MenuOpções.setText("Opções");

        MenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/saidinha.png"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnvoltar)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        telaLogin login = new telaLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnvoltarActionPerformed

    private void MenuUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuarios1ActionPerformed
        telaUsuarios usuarios = new telaUsuarios();
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuUsuarios1ActionPerformed

    private void MenuGerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuGerMouseClicked

    }//GEN-LAST:event_MenuGerMouseClicked

    private void MenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsuariosActionPerformed
        telaUsuarios usuarios = new telaUsuarios();
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuUsuariosActionPerformed

    private void MenuVirgemCGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVirgemCGerActionPerformed
        telaChaves chave = new telaChaves();
        chave.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuVirgemCGerActionPerformed

    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair","Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(sair);
        }
    }//GEN-LAST:event_MenuSairActionPerformed

    private void MenuVirgem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVirgem1ActionPerformed
        telaChaves chave = new telaChaves();
        chave.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuVirgem1ActionPerformed

    private void MenuUsadaCGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsadaCGerActionPerformed
        telaChavesUsadas chave = new telaChavesUsadas();
        chave.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuUsadaCGerActionPerformed

    private void MenuUsada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUsada1ActionPerformed
        telaChavesUsadas chave = new telaChavesUsadas();
        chave.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuUsada1ActionPerformed

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        telaInformacoes info = new telaInformacoes();
        info.setVisible(true);
        this.dispose();    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuSairGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairGerActionPerformed
        int sair = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair","Atenção",JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(sair);
        }
    }//GEN-LAST:event_MenuSairGerActionPerformed

    private void MenuSobreGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreGerActionPerformed
        telaInformacoes info = new telaInformacoes();
        info.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuSobreGerActionPerformed

    private void MenuHistoricoGerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoricoGerActionPerformed
        telaHistorico historico = new telaHistorico();
        historico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuHistoricoGerActionPerformed

    private void MenuHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoricoActionPerformed
        telaHistorico historico = new telaHistorico();
        historico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuHistoricoActionPerformed

    private void tbChavesCVirgensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChavesCVirgensMouseClicked
        int linhaSel = tbChavesCVirgens.getSelectedRow();
        if(linhaSel != -1 ){
            String id_chaves = tbChavesCVirgens.getValueAt(linhaSel, 0).toString();
            String tipo = tbChavesCVirgens.getValueAt(linhaSel, 1).toString();
            String numeracao = tbChavesCVirgens.getValueAt(linhaSel, 2).toString();
            String C = tbChavesCVirgens.getValueAt(linhaSel, 3).toString();
            String quantidade = tbChavesCVirgens.getValueAt(linhaSel, 4).toString();
            
            txtID.setText(id_chaves);
            txtTipo.setText(tipo);
            txtNumeracao.setText(numeracao);
            txtC.setText(C);
            txtQuantidade.setText(quantidade);
        }
    }//GEN-LAST:event_tbChavesCVirgensMouseClicked

    private void tbHistoricoEeSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHistoricoEeSMouseClicked
        int linhaSel = tbHistoricoEeS.getSelectedRow();
            if(linhaSel != -1 ){
            String id = tbHistoricoEeS.getValueAt(linhaSel, 0).toString();
            String data = tbHistoricoEeS.getValueAt(linhaSel, 1).toString();
            String historico = tbHistoricoEeS.getValueAt(linhaSel, 2).toString();
            String entrada = tbHistoricoEeS.getValueAt(linhaSel, 3).toString();
            String saida = tbHistoricoEeS.getValueAt(linhaSel, 4).toString();
            String total = tbHistoricoEeS.getValueAt(linhaSel, 5).toString();
            
            txtid.setText(id);
            txtdata.setText(data);
            txthistorico.setText(historico);
            txtentrada.setText(entrada);
            txtsaida.setText(saida);
            txttotal.setText(total);
        }
    }//GEN-LAST:event_tbHistoricoEeSMouseClicked

    private void tbChavesCUsadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChavesCUsadasMouseClicked
        int linhaSel = tbChavesCUsadas.getSelectedRow();
        if(linhaSel != -1 ){
            String id_chaves = tbChavesCUsadas.getValueAt(linhaSel, 0).toString();
            String tipo = tbChavesCUsadas.getValueAt(linhaSel, 1).toString();
            String numeracao = tbChavesCUsadas.getValueAt(linhaSel, 2).toString();
            String C = tbChavesCUsadas.getValueAt(linhaSel, 3).toString();
            String quantidade = tbChavesCUsadas.getValueAt(linhaSel, 4).toString();

            txtIDUsadas.setText(id_chaves);
            txtTipoUsadas.setText(tipo);
            txtNumeracaoUsadas.setText(numeracao);
            txtCUsadas.setText(C);
            txtQuantidadeUsadas.setText(quantidade);
        }
    }//GEN-LAST:event_tbChavesCUsadasMouseClicked

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
    public static javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuAjudaGer;
    public static javax.swing.JMenu MenuCadastrar;
    public static javax.swing.JMenu MenuCadastrarGer;
    public static javax.swing.JMenu MenuChaves1;
    public static javax.swing.JMenu MenuChavesGer;
    public static javax.swing.JMenu MenuGer;
    public static javax.swing.JMenuItem MenuHistorico;
    public static javax.swing.JMenuItem MenuHistoricoGer;
    private javax.swing.JMenu MenuOpcoesGer;
    public static javax.swing.JMenu MenuOpções;
    public static javax.swing.JMenuItem MenuSair;
    private javax.swing.JMenuItem MenuSairGer;
    public static javax.swing.JMenuItem MenuSobre;
    private javax.swing.JMenuItem MenuSobreGer;
    private javax.swing.JMenuItem MenuUsada1;
    public static javax.swing.JMenuItem MenuUsadaCGer;
    public static javax.swing.JMenuItem MenuUsuarios;
    public static javax.swing.JMenuItem MenuUsuarios1;
    private javax.swing.JMenuItem MenuVirgem1;
    public static javax.swing.JMenuItem MenuVirgemCGer;
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
    public static javax.swing.JTable tbChavesCUsadas;
    public static javax.swing.JTable tbChavesCVirgens;
    public static javax.swing.JTable tbHistoricoEeS;
    // End of variables declaration//GEN-END:variables
}
