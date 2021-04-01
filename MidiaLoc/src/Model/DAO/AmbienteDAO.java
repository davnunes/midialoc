/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import conection.ConnectionFactory;
import Model.Bean.Ambientes;
import Model.Bean.Equipamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Samsung
 */
public class AmbienteDAO {
    public void create(Ambientes p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO ambientes (ambiente) VALUES (?)");
            stmt.setString(1, p.getAmbiente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Ambientes> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Ambientes> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM ambientes");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Ambientes professor = new Ambientes();

                professor.setCod(rs.getInt("cod"));
                professor.setAmbiente(rs.getString("ambiente"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    public List<Ambientes> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Ambientes> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM ambientes WHERE ambiente LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Ambientes professor = new Ambientes();

                professor.setCod(rs.getInt("cod"));
                professor.setAmbiente(rs.getString("ambiente"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    
    public void update(Ambientes p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE ambientes SET ambiente = ? WHERE cod = ?");
            stmt.setString(1, p.getAmbiente());
            stmt.setInt(2, p.getCod());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Ambientes p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM ambientes WHERE cod = ?");
            stmt.setInt(1, p.getCod());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
