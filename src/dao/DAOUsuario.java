/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Usuario;
/**
 *
 * @author admin
 */
public class DAOUsuario {
    
    private final Connection con;
    
    public DAOUsuario(){
        this.con=Conexao.AbrirConexao();
    }
    
    
     public ArrayList consultarUsuarios() throws SQLException{
        ArrayList<Usuario> usuarios = new ArrayList();
        try{
            PreparedStatement stmt = this.con.prepareStatement("SELECT * FROM usuario");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                String email = res.getString("email");
                String senha = res.getString("senha");
                Usuario p = new Usuario(email, senha);
                usuarios.add(p);    
            }
            System.out.println(stmt);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
    
    
}

