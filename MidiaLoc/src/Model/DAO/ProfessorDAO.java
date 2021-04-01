/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import conection.ConnectionFactory;
import Model.Bean.Professores;
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
public class ProfessorDAO {
    public void create(Professores p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO professores (nome,disciplina)VALUES(?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDisciplina());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Professores> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Professores> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM professores");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Professores professor = new Professores();

                professor.setCod(rs.getInt("cod"));
                professor.setNome(rs.getString("nome"));
                professor.setDisciplina(rs.getString("disciplina"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    public List<Professores> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Professores> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM professores WHERE nome LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Professores professor = new Professores();

                professor.setCod(rs.getInt("cod"));
                professor.setNome(rs.getString("nome"));
                professor.setDisciplina(rs.getString("disciplina"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    
    public void update(Professores p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE professores SET nome = ?,disciplina = ? WHERE cod = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDisciplina());
            stmt.setInt(3, p.getCod());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Professores p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM professores WHERE cod = ?");
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
