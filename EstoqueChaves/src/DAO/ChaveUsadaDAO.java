package DAO;

import DAO.ConexaoDAO;
import DTO.ChaveDTO;
import VIEW.telaChaves;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;


/**
 *
 * @author Eder
 */
public class ChaveUsadaDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;


    public void inserirUsuario(ChaveDTO objChaveDTO) {
        String sql = "insert into tb_chaves (id_chaves, tipo, numeracao, C, quantidade)"
                + " values (?, ?, ?, ?, ?)";
        conexao = ConexaoDAO.conector();
        
        
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objChaveDTO.getId());
            pst.setString(2, objChaveDTO.getTipo());
            pst.setInt(3, objChaveDTO.getNumeracao());
            pst.setInt(4, objChaveDTO.getC());
            pst.setInt(5, objChaveDTO.getQuantidade());
            int add  = pst.executeUpdate();
            if (add > 0) {
                pesquisaAuto();
                pst.close();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Chave inserida com sucesso! ");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Método Inserir " + e);
        }
    }

    public void pesquisar(ChaveDTO objChaveDTO) {
        String sql = "select * from tb_chaves where id_chaves = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objChaveDTO.getId());
            rs = pst.executeQuery();
            if (rs.next()) {
                telaChaves.txtTipo.setText(rs.getString(2));
                telaChaves.txtNumeracao.setText(rs.getString(3));
                telaChaves.txtC.setText(rs.getString(4));
                telaChaves.txtQuantidade.setText(rs.getString(5));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Chave não cadastrada!");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from tb_chaves";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) telaChaves.tbChaves.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_chaves");
                String tipo = rs.getString("tipo");
                int numeracao = rs.getInt("numeracao");
                int C = rs.getInt("C");
                int quantidade = rs.getInt("quantidade");
                model.addRow(new Object[]{id, tipo, numeracao, C, quantidade});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }

    //Método editar
    public void editar(ChaveDTO objChaveDTO) {
        String sql = "update tb_chaves set tipo = ?, numeracao = ?, C = ?, quantidade = ? where id_chaves = ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objChaveDTO.getId());
            pst.setString(4, objChaveDTO.getTipo());
            pst.setInt(3, objChaveDTO.getNumeracao());
            pst.setInt(2, objChaveDTO.getC());
            pst.setInt(1, objChaveDTO.getQuantidade());
            int add = pst.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Chave editada com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar " + e);
        }
    }

    //Método deletar
    public void deletar(ChaveDTO objChaveDTO) {
        String sql = "delete from tb_chaves where id_chaves = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objChaveDTO.getId());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Chave deletada com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }

    public void limparCampos() {
        telaChaves.txtID.setText(null);
        telaChaves.txtTipo.setText(null);
        telaChaves.txtNumeracao.setText(null);
        telaChaves.txtC.setText(null);
        telaChaves.txtQuantidade.setText(null);
    }

}