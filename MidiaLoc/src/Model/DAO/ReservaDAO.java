/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import conection.ConnectionFactory;
import Model.Bean.Reservas;
import Panels.CambiaPanel;
import View.ADM.Tela_Reservas;
import com.mysql.jdbc.Util;
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
public class ReservaDAO {
    //========== INSERÇÃO DOS DADOS NO BANCO ==========
    
    public void create(Reservas p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        
        //List<String> x = new ArrayList<String>();
        
        try {
            stmt = con.prepareStatement("INSERT INTO reservas (equipamento,professor,ambiente,turma,dia) VALUES (?,?,?,?,?)");
            stmt.setString(1, p.getEquipamento());
            stmt.setString(2, p.getProfessor());
            stmt.setString(3, p.getAmbiente());
            stmt.setString(4, p.getTurma());
            stmt.setString(5, p.getDia());

            stmt.executeUpdate();
            
           // x.add( p.getProfessor());

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    public List<Reservas> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Reservas> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM reservas");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Reservas professor = new Reservas();

                professor.setCod(rs.getInt("cod"));
                professor.setEquipamento(rs.getString("equipamento"));
                professor.setProfessor(rs.getString("professor"));
                professor.setAmbiente(rs.getString("ambiente"));
                professor.setTurma(rs.getString("turma"));
                professor.setDia(rs.getString("dia"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    public List<Reservas> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Reservas> professores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM reservas WHERE professor LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Reservas professor = new Reservas();

                professor.setCod(rs.getInt("cod"));
                professor.setEquipamento(rs.getString("equipamento"));
                professor.setProfessor(rs.getString("professor"));
                professor.setAmbiente(rs.getString("ambiente"));
                professor.setTurma(rs.getString("turma"));
                professor.setDia(rs.getString("dia"));
                professores.add(professor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return professores;

    }
    
    public void update(Reservas p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE reservas SET equipamento = ?, professor = ?, ambiente = ?, turma = ?, dia = ? WHERE cod = ?");
           
        
            stmt.setString(1, p.getEquipamento());
            stmt.setString(2, p.getProfessor());
            stmt.setString(3, p.getAmbiente());
            stmt.setString(4, p.getTurma());
            stmt.setString(5, p.getDia());
            stmt.setInt(6, p.getCod());
             
            

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Reservas p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM reservas WHERE cod = ?");
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
