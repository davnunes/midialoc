/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import conection.ConnectionFactory;
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
 * @author Aluno 22
 */
public class EquipamentoDAO {
    
    //========== INSERÇÃO DOS DADOS NO BANCO ==========
    public void create(Equipamentos p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO equipamentos (nome, marca, modelo, cor, status) VALUES (?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getMarca());
            stmt.setString(3, p.getModelo());
            stmt.setString(4, p.getCor());
            stmt.setString(5, p.getStatus());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Equipamento cadastrado com sucesso!", "MídiaLoc informa...",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar equipamento!"+ex, "MídiaLoc informa...",JOptionPane.INFORMATION_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
       
    }
    
    //========== LEITURA DOS DADOS DO BANCO ==========
    public List<Equipamentos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Equipamentos> equips = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM equipamentos ORDER BY nome");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Equipamentos equip = new Equipamentos();
                equip.setCod(rs.getInt("cod"));
                equip.setNome(rs.getString("nome"));
                equip.setMarca(rs.getString("marca"));
                equip.setModelo(rs.getString("modelo"));
                equip.setCor(rs.getString("cor"));
                equip.setStatus(rs.getString("status"));
                equips.add(equip);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return equips;
    }
    //========== LEITURA DOS DADOS DO BANCO ==========
    public List<Equipamentos> readCondicao(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Equipamentos> equipas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM equipamentos WHERE status = 'Disponível'");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Equipamentos equip = new Equipamentos();
                equip.setCod(rs.getInt("cod"));
                equip.setNome(rs.getString("nome"));
                equip.setMarca(rs.getString("marca"));
                equip.setModelo(rs.getString("modelo"));
                equip.setCor(rs.getString("cor"));
                equip.setStatus(rs.getString("status"));
                equipas.add(equip);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return equipas;
    }
    //+++++++++++ Exibe somente se o stutus estiver disónível +++++++++++++++++++++++++
    public List<Equipamentos> search(String pesquisa){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Equipamentos> equips = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM equipamentos WHERE nome LIKE ? OR cod = ?");
            stmt.setString(1, pesquisa+"%");
            stmt.setString(2, pesquisa);
           
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Equipamentos equip = new Equipamentos();
                equip.setCod(rs.getInt("cod"));
                equip.setNome(rs.getString("nome"));
                equip.setMarca(rs.getString("marca"));
                equip.setModelo(rs.getString("modelo"));
                equip.setCor(rs.getString("cor"));
                equip.setStatus(rs.getString("status"));
                equips.add(equip);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(EquipamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return equips;
    }
    
    //+++++++++++++++++++++++ Atualizar o status ao ser alugado ++++++++++++++++++++++
    public void update(Equipamentos p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE equipamentos SET status = ? WHERE nome = ?");
            stmt.setString(1, p.getStatus());
            stmt.setString(2, p.getNome());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
    //========== EXCLUSÃO DOS DADOS DO BANCO ==========
    public void delete(Equipamentos p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("DELETE FROM equipamentos WHERE cod = ?");
            stmt.setInt(1, p.getCod());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Equipamento excluído com sucesso!", "MídiaLoc informa...",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao excluir equipamento!"+ex, "MídiaLoc informa...",JOptionPane.INFORMATION_MESSAGE);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
       
    }
}
