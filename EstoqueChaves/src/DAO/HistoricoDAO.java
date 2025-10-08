package DAO;

import DAO.ConexaoDAO;
import DTO.HistoricoDTO;
import VIEW.telaHistorico;
import VIEW.telaPrincipal;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;



public class HistoricoDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;


    public void inserirHistorico(HistoricoDTO objHistoricoDTO) {
        String sql = "insert into tb_historicos (id_historico, data, historico, entrada, saida)"
                + " values (?, ?, ?, ?, ?)";
        conexao = ConexaoDAO.conector();
        
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objHistoricoDTO.getId());
            pst.setString(2, objHistoricoDTO.getData());
            pst.setString(3, objHistoricoDTO.getHistorico());
            pst.setDouble(4, objHistoricoDTO.getEntrada());
            pst.setDouble(5, objHistoricoDTO.getSaida());
            int add  = pst.executeUpdate();
            if (add > 0) {
                pesquisaAuto();
                pst.close();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Histórico inserido com sucesso! ");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Método Inserir " + e);
        }
    }

    public void pesquisar(HistoricoDTO objHistoricoDTO) {
        String sql = "select * from tb_historicos where id_historico = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objHistoricoDTO.getId());
            rs = pst.executeQuery();
            if (rs.next()) {
                telaHistorico.txtid.setText(rs.getString(2));
                telaHistorico.txtdata.setText(rs.getString(3));
                telaHistorico.txthistorico.setText(rs.getString(4));
                telaHistorico.txtentrada.setText(rs.getString(5));
                telaHistorico.txtsaida.setText(rs.getString(5));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Histórico não cadastrado!");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from tb_historicos";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) telaHistorico.tbHistorico.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_historico");
                String data = rs.getString("data");
                String historico = rs.getString("historico");
                double entrada = rs.getDouble("entrada");
                double saida = rs.getDouble("saida");
                double total = rs.getDouble("total");
                model.addRow(new Object[]{id, data, historico, entrada, saida, total});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }

    //Método editar
    public void editar(HistoricoDTO objHistoricoDTO) {
        
        String sql = "update tb_historicos set data = ?, historico = ?, entrada = ?, saida = ?, total = ?  where id_historico = ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objHistoricoDTO.getData());    
            pst.setString(2, objHistoricoDTO.getHistorico()); 
            pst.setDouble(3, objHistoricoDTO.getEntrada());    
            pst.setDouble(4, objHistoricoDTO.getSaida());  
            if(telaHistorico.txtentrada.getText().equals(0)){
            pst.setDouble(5, objHistoricoDTO.getSaida() - objHistoricoDTO.getTotal());
            }else if(telaHistorico.txtsaida.getText().equals(0)){
            pst.setDouble(5, objHistoricoDTO.getEntrada() + objHistoricoDTO.getTotal());
            }
            pst.setInt(6, objHistoricoDTO.getId());
            
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            // ARRUMAR URGENTE
            
            int add = pst.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Histórico editado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar " + e);
        }
    }

    //Método deletar
    public void deletar(HistoricoDTO objHistoricoDTO) {
        String sql = "delete from tb_historicos where id_historico = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objHistoricoDTO.getId());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Histórico deletado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }

    public void limparCampos() {
        telaHistorico.txtid.setText(null);
        telaHistorico.txtdata.setText(null);
        telaHistorico.txthistorico.setText(null);
        telaHistorico.txtentrada.setText(null);
        telaHistorico.txtsaida.setText(null);
    }

    public void tabelarH() {
        String sql = "select * from tb_historicos";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) telaPrincipal.tbHistoricoEeS.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_historico");
                String data = rs.getString("data");
                String historico = rs.getString("historico");
                double entrada = rs.getDouble("entrada");
                double saida = rs.getDouble("saida");
                double total = rs.getDouble("total");
                model.addRow(new Object[]{id, data, historico, entrada, saida, total});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }
}