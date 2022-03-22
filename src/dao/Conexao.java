package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection AbrirConexao(){
        Connection con = null;            
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost/sistema_farmacia");
            con = DriverManager.getConnection(url, "root","root");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return con;
    }
}
