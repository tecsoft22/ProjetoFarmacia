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
            stmt.setInt(2, t.getCod_barras());
            stmt.setDouble(3, t.getPreco());
            stmt.setInt(4, t.getCod_estoque());
            stmt.setInt(5, t.getCod_categoria());
            stmt.execute();
            Conexao.fecharConexao();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return false;
    }

    @Override
    public boolean atualizar(Produto t) {
        boolean updated = false;
       
        try {
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();  
            PreparedStatement stmt = con.prepareStatement("UPDATE produto SET nome_produto = ?, preco = ? WHERE cod_produto = ?");
            stmt.setString(1, t.getNome_produto());
            stmt.setDouble(2, t.getPreco());
            stmt.setInt(3, t.getCod_produto());
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
    public boolean excluir(Produto t) {
        Boolean deletado = false;
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("DELETE FROM produto WHERE cod_produto=" + t.getCod_produto());
            if(stmt.executeUpdate() != 1){
            } else {
                deletado = true;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return deletado;
    }

    @Override
    public Produto consultarItem(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> consultarAll() {
        ArrayList<Produto> produtos = new ArrayList<>();
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM produto");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                Produto produto = new Produto();
                produto.setCod_produto(res.getInt("cod_produto"));
                produto.setCod_barras(res.getInt("cod_barras"));
                produto.setCod_categoria(res.getInt("cod_categoria"));
                produto.setCod_estoque(res.getInt("cod_produto"));
                produto.setNome_produto(res.getString("nome_produto"));
                produto.setPreco(res.getDouble("preco"));
                produtos.add(produto);
                System.out.println(produto);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produtos;
    }
    
 }

 
