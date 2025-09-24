
package DAO;

import DAO.ConexaoDAO;
import DTO.UsuarioDTO;

import VIEW.telaPrincipal;
import java.awt.*;
import java.sql.*;
import javax.swing.*;

public class UsuarioDAO {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

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
                                      
                } else {
                    telaPrincipal principal = new telaPrincipal();
                    principal.setVisible(true);
                    

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha invalidos");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "** tela Login ***" + e);
        }
    }
}
