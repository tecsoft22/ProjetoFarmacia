/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produto;

/**
 *
 * @author admin
 */
public class DAOProduto implements DAO<Produto> {

    @Override
    public boolean inserir(Produto t) {  
        //To change body of generated methods, choose Tools | Templates.      
        try {
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("INSERT INTO produto (nome_produto, cod_barras, preco, cod_estoque, cod_categoria) VALUES (?, ?, ?, ?, ?)");
            stmt.setString(1, t.getNome_produto());
            Conexao.fecharConexao();
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }

    @Override
    public Produto consultar(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto atualizar(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
