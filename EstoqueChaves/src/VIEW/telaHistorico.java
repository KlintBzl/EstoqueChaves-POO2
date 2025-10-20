
package VIEW;

import DAO.HistoricoDAO;
import DTO.HistoricoDTO;
import javax.swing.JOptionPane;

public class telaHistorico extends javax.swing.JFrame {

    
    public telaHistorico() {
        initComponents();
        HistoricoDAO historicar = new HistoricoDAO();
        historicar.pesquisaAuto();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtdata = new javax.swing.JTextField();
        txthistorico = new javax.swing.JTextField();
        txtentrada = new javax.swing.JTextField();
        txtsaida = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnPesquisar1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        brnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHistorico = new javax.swing.JTable();
        btnlimpar = new javax.swing.JButton();

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

        jLabel6.setText("Saída");

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
        jScrollPane1.setViewportView(tbHistorico);

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtsaida, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtentrada)))
                    .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(brnVoltar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnlimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txthistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnPesquisar1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(brnVoltar)
                            .addComponent(btnEditar))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        int id_historico = Integer.parseInt(txtid.getText());
        String data = txtdata.getText();
        String historico = txthistorico.getText();
        double entrada = Double.parseDouble(txtentrada.getText());
        double saida = Double.parseDouble(txtsaida.getText());
        
            
        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        
        objHistoricoDTO.setId(id_historico);
        objHistoricoDTO.setData(data);
        objHistoricoDTO.setHistorico(historico);
        objHistoricoDTO.setEntrada(entrada);
        objHistoricoDTO.setSaida(saida);
        double total = objHistoricoDTO.getTotal();
            total += objHistoricoDTO.getEntrada();
            total -= objHistoricoDTO.getSaida();
        objHistoricoDTO.setTotal(total);
        
        
        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.inserirHistorico(objHistoricoDTO);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        int id_historico = Integer.parseInt(txtid.getText());
        
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

        HistoricoDTO objHistoricoDTO = new HistoricoDTO();
        
        objHistoricoDTO.setId(id_historico);
        objHistoricoDTO.setData(data);
        objHistoricoDTO.setHistorico(historico);
        objHistoricoDTO.setEntrada(entrada);
        objHistoricoDTO.setSaida(saida);
        double total = objHistoricoDTO.getTotal();
            total -= objHistoricoDTO.getSaida();
            total += objHistoricoDTO.getEntrada();
        objHistoricoDTO.setTotal(total);
        
        HistoricoDAO objHistoricoDAO = new HistoricoDAO();
        objHistoricoDAO.editar(objHistoricoDTO);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void brnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnVoltarActionPerformed
        telaPrincipal principal = new telaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_brnVoltarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        HistoricoDAO historicar = new HistoricoDAO();
        historicar.limparCampos();
    }//GEN-LAST:event_btnlimparActionPerformed

    
    public static void main(String args[]) {
        
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
    private javax.swing.JButton btnlimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbHistorico;
    public static javax.swing.JTextField txtdata;
    public static javax.swing.JTextField txtentrada;
    public static javax.swing.JTextField txthistorico;
    public static javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtsaida;
    // End of variables declaration//GEN-END:variables
}
