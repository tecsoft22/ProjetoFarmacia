package sistemafarmacia;

import control.AuthView;
import view.TelaPrincipal;
import dao.Conexao;
import java.sql.SQLException;
import java.sql.Connection;
import dao.DAOUsuario;
import java.util.ArrayList;
import model.Usuario;
import view.Login;

public class SistemaFarmacia {
    public static void main(String[] args) throws SQLException {
//        TelaPrincipal tela;
//        tela = new TelaPrincipal();
//        tela.setVisible(true);
//        
//        System.out.println("hgsadas");
//        
//        Conexao c = new Conexao();
//        System.out.println(c);
//        
//        DAOUsuario d = new DAOUsuario();
//    
//        ArrayList<Usuario> usuarios = d.consultarUsuarios();
//        if(!usuarios.isEmpty()){
//            for(Usuario p : usuarios){
//                System.out.println(p.getEmail());
//            }
//        }
//                                   

        Login tela = new Login();

         tela.setVisible(true);
         
        
    } 
}