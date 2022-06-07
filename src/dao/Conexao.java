package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private static Connection con;
    
    public static Connection AbrirConexao(){       
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = ("jdbc:mysql://localhost/sistema_farmacia");
            con = DriverManager.getConnection(url, "root", "");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return con;
    }
    
    public static Connection getCon(){
        return con;
    }
    
    public static void fecharConexao() throws SQLException{
        con.close();
    }

}
