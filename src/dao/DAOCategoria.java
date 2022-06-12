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
import model.Categoria;

/**
 *
 * @author admin
 */
public class DAOCategoria implements DAO<Categoria> {

    @Override
    public boolean inserir(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria consultarItem(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> consultarAll() {
        ArrayList<Categoria> categorias = new ArrayList<>();
        
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM categoria");
            ResultSet response = stmt.executeQuery();
            while(response.next()){
                Categoria categoria = new Categoria();
                categoria.setCod_categoria(response.getInt("cod_categoria"));
                categoria.setNome_categoria(response.getString("nome_categoria"));
                categorias.add(categoria);
                System.out.println(categoria);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return categorias;
    }

    @Override
    public boolean atualizar(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Categoria t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
