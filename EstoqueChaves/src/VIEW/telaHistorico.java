
package VIEW;

import DAO.HistoricoDAO;
import DTO.HistoricoDTO;
import javax.swing.JOptionPane;

public class telaHistorico extends javax.swing.JFrame {

    public telaHistorico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        txthistorico = new javax.swing.JTextField();
        txtentrada = new javax.swing.JTextField();
        txtsaida = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnPesquisar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        brnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistorico = new javax.swing.JTable();

        btnPesquisar.setBackground(new java.awt.Color(255, 245, 0));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de gerenciamento de histórico");
        setResizable(false);

        jLabel1.setText("ID");

        jLabel2.setText("Data");

        jLabel3.setText("Histórico");

        jLabel4.setText("Entrada");

        jLabel5.setText("Total");

        jLabel6.setText("Saída");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        txthistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthistoricoActionPerformed(evt);
            }
        });

        txtentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtentradaActionPerformed(evt);
            }
        });

        txtsaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaidaActionPerformed(evt);
            }
        });

        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(0, 127, 255));
        btnAdd.setForeground(new java.awt.Color(0, 127, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnPesquisar1.setBackground(new java.awt.Color(255, 245, 0));
        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/procurar.png"))); // NOI18N
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar1ActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(0, 100, 0));
        btnEditar.setForeground(new java.awt.Color(0, 100, 0));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        brnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/voltar.png"))); // NOI18N
        brnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnVoltarActionPerformed(evt);
            }
        });

        tbHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Histórico", "Entrada", "Saída", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHistorico);
        if (tbHistorico.getColumnModel().getColumnCount() > 0) {
            tbHistorico.getColumnModel().getColumn(0).setResizable(false);
            tbHistorico.getColumnModel().getColumn(1).setResizable(false);
            tbHistorico.getColumnModel().getColumn(2).setResizable(false);
            tbHistorico.getColumnModel().getColumn(3).setResizable(false);
            tbHistorico.getColumnModel().getColumn(4).setResizable(false);
            tbHistorico.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtdata)
                            .addComponent(txthistorico, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtsaida, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtentrada, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotal, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar1)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(brnVoltar)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txthistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisar1))
                    .addComponent(brnVoltar, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtentradaActionPerformed

    private void txthistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthistoricoActionPerformed

    private void txtsaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsaidaActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtentrada.getText().equals("")){
        String Data = txtdata.getText();
        String Historico = txthistorico.getText();
        Double Saida = Double.parseDouble(txtsaida.getText());
        Double Total =- Saida;
        
        if(Total > 0){
        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        objHistoricoDTO.setData(Data);
        objHistoricoDTO.setHistorico(Historico);
        objHistoricoDTO.setSaida(Saida);
        objHistoricoDTO.setTotal(Total);
        
        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.inserirHistorico(objHistoricoDTO);
        }else{
            int verificar = JOptionPane.showConfirmDialog(null, "Opa! Tem certeza que colocou o valor certo?"
                    + " Você está tirando um número de dinheiro maio que o total!", "ERRO!", JOptionPane.YES_NO_OPTION);
                    if(verificar == JOptionPane.YES_OPTION){
                        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
                        objHistoricoDTO.setData(Data);
                        objHistoricoDTO.setHistorico(Historico);
                        objHistoricoDTO.setSaida(Saida);
                        objHistoricoDTO.setTotal(Total);
        
                        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
                        objHistoricoDAO.inserirHistorico(objHistoricoDTO);

                    }
        }
        
        }else if(txtsaida.getText().equals("")){
        String Data = txtdata.getText();
        String Historico = txthistorico.getText();
        Double Entrada = Double.parseDouble(txtentrada.getText());
        Double Total =+ Entrada;
        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        objHistoricoDTO.setData(Data);
        objHistoricoDTO.setHistorico(Historico);
        objHistoricoDTO.setEntrada(Entrada);
        objHistoricoDTO.setTotal(Total);

        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.inserirHistorico(objHistoricoDTO);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        int id_historico = Integer.parseInt(txtid.getText());
        String data = txtdata.getText();
        

        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        objHistoricoDTO.setId(id_historico);
        
        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.pesquisar(objHistoricoDTO);
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int id_historico = Integer.parseInt(txtid.getText());
        String data = txtdata.getText();
        String historico = txthistorico.getText();
        double entrada = Double.parseDouble(txtentrada.getText());
        double saida = Double.parseDouble(txtsaida.getText());
        double total = Double.parseDouble(txttotal.getText());

        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        objHistoricoDTO.setId(id_historico);
        objHistoricoDTO.setData(data);
        objHistoricoDTO.setHistorico(historico);
        objHistoricoDTO.setEntrada(entrada);
        objHistoricoDTO.setSaida(saida);
        objHistoricoDTO.setTotal(total);
        
        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.editar(objHistoricoDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void brnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnVoltarActionPerformed
        telaPrincipal principal = new telaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brnVoltarActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void tbHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHistoricoMouseClicked
        int linhaSel = tbHistorico.getSelectedRow();
            if(linhaSel != -1 ){
            String id = tbHistorico.getValueAt(linhaSel, 0).toString();
            String data = tbHistorico.getValueAt(linhaSel, 1).toString();
            String historico = tbHistorico.getValueAt(linhaSel, 2).toString();
            String entrada = tbHistorico.getValueAt(linhaSel, 3).toString();
            String saida = tbHistorico.getValueAt(linhaSel, 4).toString();
            String total = tbHistorico.getValueAt(linhaSel, 5).toString();
            
            txtid.setText(id);
            txtdata.setText(data);
            txthistorico.setText(historico);
            txtentrada.setText(entrada);
            txtsaida.setText(saida);
            txttotal.setText(total);
        }    }//GEN-LAST:event_tbHistoricoMouseClicked

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
            java.util.logging.Logger.getLogger(telaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnVoltar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbHistorico;
    public static javax.swing.JTextField txtdata;
    public static javax.swing.JTextField txtentrada;
    public static javax.swing.JTextField txthistorico;
    public static javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtsaida;
    public static javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
