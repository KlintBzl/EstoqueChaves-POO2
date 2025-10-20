package DAO;

import DAO.ConexaoDAO;
import DTO.UsuarioDTO;
import VIEW.telaPrincipal;
import VIEW.telaUsuarios;
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int i;

    public void logar(UsuarioDTO objusuarioDTO) {
        String sql = "select * from tb_usuarios where login = ? and senha = ?";
        conexao = ConexaoDAO.conector();

        try {
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, objusuarioDTO.getLogin());
            pst.setString(2, objusuarioDTO.getSenha());
            rs = pst.executeQuery();

            if (rs.next()) {

                String perfil = rs.getString(5);

                if (perfil.equals("admin")) {
                    telaPrincipal principal = new telaPrincipal();
                    principal.setVisible(true);
                    ImageIcon iconeAzul = new ImageIcon("src/icones/seguroSegurado.png");
                    telaPrincipal.lblImg.setIcon(iconeAzul);
                    telaPrincipal.lblPerfil.setText("Administrador");
                    telaPrincipal.lblPerfil.setForeground(Color.blue);
                    telaPrincipal.lblFuncao.setText("Edite e adicione...");
                    telaPrincipal.MenuPQV.setEnabled(false);
                    telaPrincipal.menupqvejo.setEnabled(false);
                    conexao.close();
                    i = i + 1;
                } else {
                    telaPrincipal principal = new telaPrincipal();
                    principal.setVisible(true);
                    telaPrincipal.MenuUsuarios.setEnabled(false);
                    telaPrincipal.MenuUsuarios1.setEnabled(false);
                    telaPrincipal.MenuChavesGer.setEnabled(false);
                    telaPrincipal.MenuChaves1.setEnabled(false);
                    telaPrincipal.MenuHistorico.setEnabled(false);
                    telaPrincipal.MenuHistoricoGer.setEnabled(false);
                    conexao.close(); 
                    i = i + 2;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha invalidos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "** tela Login ***" + e);
        }
    }

    public void inserirUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into tb_usuarios (id_usuario, usuario, login, senha, perfil)"
                + " values (?, ?, ?, ?, ?)";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getID());
            pst.setString(2, objUsuarioDTO.getNome());
            pst.setString(3, objUsuarioDTO.getLogin());
            pst.setString(4, objUsuarioDTO.getSenha());
            pst.setString(5, objUsuarioDTO.getPerfil());
            int add  = pst.executeUpdate();
            if (add > 0) {
                pesquisaAuto();
                pst.close();
                limparCampos();
                JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso! ");
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, " Método Inserir " + e);
        }
    }

    public void pesquisar(UsuarioDTO objUsuarioDTO) {
        String sql = "select * from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getID());
            rs = pst.executeQuery();
            if (rs.next()) {
                telaUsuarios.txtnome.setText(rs.getString(2));
                telaUsuarios.txtlogin.setText(rs.getString(3));
                telaUsuarios.txtsenha.setText(rs.getString(4));
                telaUsuarios.cboperfil.setSelectedItem(rs.getString(5));
                conexao.close();
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado!");
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar" + e);
        }
    }

    public void pesquisaAuto() {
        String sql = "select * from tb_usuarios";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) telaUsuarios.tbUsuarios.getModel();
            model.setNumRows(0);

            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String nome = rs.getString("usuario");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                String perfil = rs.getString("perfil");
                model.addRow(new Object[]{id, nome, login, senha, perfil});
            }
            conexao.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método Pesquisar Automático " + e);
        }
    }

    //Método editar
    public void editar(UsuarioDTO objUsuarioDTO) {
        String sql = "update tb_usuarios set usuario = ?, login = ?, senha = ?, perfil = ? where id_usuario = ?";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(5, objUsuarioDTO.getID());
            pst.setString(4, objUsuarioDTO.getPerfil());
            pst.setString(3, objUsuarioDTO.getSenha());
            pst.setString(2, objUsuarioDTO.getLogin());
            pst.setString(1, objUsuarioDTO.getNome());
            int add = pst.executeUpdate();
            if (add > 0) {
                JOptionPane.showMessageDialog(null, "Usuário editado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método editar " + e);
        }
    }

    //Método deletar
    public void deletar(UsuarioDTO objUsuarioDTO) {
        String sql = "delete from tb_usuarios where id_usuario = ?";
        conexao = ConexaoDAO.conector();

        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objUsuarioDTO.getID());
            int del = pst.executeUpdate();
            if (del > 0) {
                JOptionPane.showMessageDialog(null, " Usuário deletado com sucesso!");
                pesquisaAuto();
                conexao.close();
                limparCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, " Método deletar " + e);
        }
    }

    public void limparCampos() {
        telaUsuarios.txtid.setText(null);
        telaUsuarios.txtlogin.setText(null);
        telaUsuarios.txtnome.setText(null);
        telaUsuarios.txtsenha.setText(null);
        telaUsuarios.cboperfil.setSelectedItem(1);
    }

}
