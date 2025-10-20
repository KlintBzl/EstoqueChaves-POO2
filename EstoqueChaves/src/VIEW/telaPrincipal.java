
package VIEW;

import DAO.ChaveDAO;
import DAO.ChaveUsadaDAO;
import DAO.HistoricoDAO;
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChavesCVirgens = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChavesCUsadas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHistoricoEeS = new javax.swing.JTable();
        lblImg = new javax.swing.JLabel();
        lblPerfil = new javax.swing.JLabel();
        lblFuncao = new javax.swing.JLabel();
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
        menupqvejo = new javax.swing.JMenuItem();
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
        MenuPQV = new javax.swing.JMenuItem();
        MenuOpções = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");
        setResizable(false);

        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        btnvoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

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
        jScrollPane1.setViewportView(tbChavesCVirgens);
        if (tbChavesCVirgens.getColumnModel().getColumnCount() > 0) {
            tbChavesCVirgens.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCVirgens.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Chaves Virgens em estoque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbChavesCUsadas.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Marca", "Tipo", "Numeração", "C", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbChavesCUsadas);
        if (tbChavesCUsadas.getColumnModel().getColumnCount() > 0) {
            tbChavesCUsadas.getColumnModel().getColumn(0).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(1).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(2).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(3).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(4).setResizable(false);
            tbChavesCUsadas.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Chaves Usadas em estoque");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

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
        jScrollPane3.setViewportView(tbHistoricoEeS);
        if (tbHistoricoEeS.getColumnModel().getColumnCount() > 0) {
            tbHistoricoEeS.getColumnModel().getColumn(0).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(1).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(2).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(3).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(4).setResizable(false);
            tbHistoricoEeS.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/seguro.png"))); // NOI18N
        lblImg.setText("dfhg");

        lblPerfil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPerfil.setText("Usuário");

        lblFuncao.setText("Apenas veja...");

        MenuGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configuraçãozinha.png"))); // NOI18N
        MenuGer.setText("Gerenciar");

        MenuCadastrarGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addzinho.png"))); // NOI18N
        MenuCadastrarGer.setText("Cadastrar");

        MenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pessoinha.png"))); // NOI18N
        MenuUsuarios.setText("Usuarios");
        MenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuariosActionPerformed(evt);
            }
        });
        MenuCadastrarGer.add(MenuUsuarios);

        MenuHistoricoGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/historicozinho.png"))); // NOI18N
        MenuHistoricoGer.setText("Históricos");
        MenuHistoricoGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoricoGerActionPerformed(evt);
            }
        });
        MenuCadastrarGer.add(MenuHistoricoGer);

        MenuChavesGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/chavinha.png"))); // NOI18N
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

        MenuAjudaGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajudinha.png"))); // NOI18N
        MenuAjudaGer.setText("Ajuda");

        MenuSobreGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/infinho.png"))); // NOI18N
        MenuSobreGer.setText("Sobre");
        MenuSobreGer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreGerActionPerformed(evt);
            }
        });
        MenuAjudaGer.add(MenuSobreGer);

        menupqvejo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/porquezinho.png"))); // NOI18N
        menupqvejo.setText("Por que apenas vejo?");
        menupqvejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menupqvejoActionPerformed(evt);
            }
        });
        MenuAjudaGer.add(menupqvejo);

        MenuGer.add(MenuAjudaGer);
        MenuGer.add(jSeparator1);
        MenuGer.add(jSeparator2);

        MenuOpcoesGer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/opcoezinhas.png"))); // NOI18N
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

        MenuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addzinho.png"))); // NOI18N
        MenuCadastrar.setText("Cadastrar");

        MenuUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pessoinha.png"))); // NOI18N
        MenuUsuarios1.setText("Usuarios");
        MenuUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUsuarios1ActionPerformed(evt);
            }
        });
        MenuCadastrar.add(MenuUsuarios1);

        MenuHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/historicozinho.png"))); // NOI18N
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

        MenuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/ajudinha.png"))); // NOI18N
        MenuAjuda.setText("Ajuda");

        MenuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/infinho.png"))); // NOI18N
        MenuSobre.setText("Sobre");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuSobre);

        MenuPQV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/porquezinho.png"))); // NOI18N
        MenuPQV.setText("Por que apenas vejo?");
        MenuPQV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPQVActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuPQV);

        BarraDeMenuPrincipal.add(MenuAjuda);

        MenuOpções.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/opcoezinhas.png"))); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnvoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPerfil)
                                .addGap(11, 11, 11))
                            .addComponent(lblFuncao, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblImg)
                        .addComponent(btnvoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFuncao)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void MenuPQVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPQVActionPerformed
        telaPorque pq = new telaPorque();
        pq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MenuPQVActionPerformed

    private void menupqvejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menupqvejoActionPerformed
        telaPorque pq = new telaPorque();
        pq.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menupqvejoActionPerformed

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
    public static javax.swing.JMenuItem MenuPQV;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    public static javax.swing.JLabel lblFuncao;
    public static javax.swing.JLabel lblImg;
    public static javax.swing.JLabel lblPerfil;
    public static javax.swing.JMenuItem menupqvejo;
    public static javax.swing.JTable tbChavesCUsadas;
    public static javax.swing.JTable tbChavesCVirgens;
    public static javax.swing.JTable tbHistoricoEeS;
    // End of variables declaration//GEN-END:variables
}
