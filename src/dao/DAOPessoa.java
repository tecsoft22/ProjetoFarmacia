/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;

/**
 *
 * @author aluno
 */
public class DAOPessoa implements DAO<Pessoa>{

    @Override
    public boolean inserir(Pessoa t) {
        //To change body of generated methods, choose Tools | Templates.      
        try {
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO pessoa (nome) VALUES (?)");
            stmt.setString(1, t.getNome());
            stmt.execute();
            Conexao.fecharConexao();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return false;
    }

    @Override
    public Pessoa consultarItem(Pessoa t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Pessoa> consultarAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    @Override
    public boolean atualizar(Pessoa t) {
         boolean updated = false;
       
        try {
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();  
            PreparedStatement stmt = con.prepareStatement("UPDATE pessoa SET nome = ? WHERE cod_pessoa = ?");
            stmt.setString(1, t.getNome());
            stmt.setDouble(2, t.getCodPessoa());
            if(stmt.executeUpdate() != 1){
            } else {
                updated = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            Conexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return updated;
    }

    @Override
    public boolean excluir(Pessoa t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

//    @Override
    public static Pessoa consultarUltimo() {
        Pessoa pessoa = null;
        try {
            Conexao.AbrirConexao();
            String sql = "SELECT MAX(cod_pessoa) as id, nome FROM pessoa;";
            PreparedStatement ps = Conexao.getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                pessoa = new Pessoa();
                pessoa.setNome(rs.getString("nome"));
                pessoa.setCodPessoa(rs.getInt("id"));
            }       
            Conexao.fecharConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pessoa;
    }
    
    public static void main(String[] args) {
        Pessoa p = DAOPessoa.consultarUltimo();
        System.out.println(p);
    }
}
