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
import model.PessoaFisica;


/**
 *
 * @author aluno
 */
public class DAOPessoaFisica implements DAO<PessoaFisica>{

    @Override
    public boolean inserir(PessoaFisica t) {
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            String sql = "INSERT INTO pessoa_fisica (cpf, rg, cod_pessoa) VALUES (?, ?, ?)" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,  t.getCpf());
            stmt.setString(2, t.getRg());
            //PEGA O ÚLTIMO REGISTRO INSERIDO NO BANCO DE DADOS *PESSOA*
            int codigo = DAOPessoa.consultarUltimo().getCodPessoa();
            stmt.setInt(3, codigo);
            stmt.execute();
            Conexao.fecharConexao();
            
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;

    }

    @Override
    public ArrayList<PessoaFisica> consultarItem(PessoaFisica t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<PessoaFisica> consultarAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean atualizar(PessoaFisica t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean excluir(PessoaFisica t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static PessoaFisica consultarUltimo() {
        PessoaFisica pessoaF = null; 
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon() ;
            String sql = "SELECT MAX(cod_p_fisica) as id, cpf, rg, cod_pessoa FROM pessoa_fisica" ;
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                pessoaF = new PessoaFisica();
                pessoaF.setCpf(res.getString("cpf"));
                pessoaF.setRg(res.getString("rg"));
                pessoaF.setCodPFisica(res.getInt("id"));
                pessoaF.setCodPessoa(res.getInt("cod_pessoa"));
            }
            Conexao.fecharConexao();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return pessoaF;
    }
    
     public static void main(String[] args) {
        PessoaFisica p = DAOPessoaFisica.consultarUltimo();
        System.out.println(p);
    }
    
}
