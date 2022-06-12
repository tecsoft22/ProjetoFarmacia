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
import model.Cliente;
import model.Pessoa;
import model.PessoaFisica;

/**
 *
 * @author admin
 */
public class DAOCliente implements  DAO<Cliente> {

    @Override
    public boolean inserir(Cliente t) {
        //To change body of generated methods, choose Tools | Templates.      
        try {
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            String sql = "INSERT INTO cliente (cod_pessoa_fisica) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);           
             //PEGA O ÚLTIMO REGISTRO INSERIDO NO BANCO DE DADOS *PESSOA_FISICA*
            int codigo = DAOPessoaFisica.consultarUltimo().getCodPFisica();
            stmt.setInt(1, codigo);
            stmt.execute();
            Conexao.fecharConexao();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DAOProduto.class.getName()).log(Level.SEVERE, null, ex);
        }       
        return false;
    }

    @Override
    public Cliente consultarItem(Cliente t) {
        Cliente cliente = new Cliente();
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("SELECT pessoa.cod_pessoa ,cliente.cod_cliente, pessoa_fisica.cod_p_fisica ,pessoa.nome, pessoa_fisica.cpf, pessoa_fisica.rg FROM cliente join pessoa_fisica on cliente.cod_pessoa_fisica = pessoa_fisica.cod_p_fisica join pessoa on pessoa_fisica.cod_pessoa = pessoa.cod_pessoa WHERE cod_cliente ="+t.getCod_cliente());
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                cliente.setCodPessoa(res.getInt("pessoa.cod_pessoa"));
                cliente.setCod_cliente(res.getInt("cliente.cod_cliente"));
                cliente.setCodPFisica(res.getInt("pessoa_fisica.cod_p_fisica"));
                cliente.setNome(res.getString("pessoa.nome"));
                cliente.setCpf(res.getString("pessoa_fisica.cpf"));
                cliente.setRg(res.getString("pessoa_fisica.rg"));
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return cliente;
        
    }

    @Override
    public ArrayList<Cliente> consultarAll() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try{
            Conexao.AbrirConexao();
            Connection con = Conexao.getCon();
            PreparedStatement stmt = con.prepareStatement("SELECT pessoa.cod_pessoa ,cliente.cod_cliente, pessoa_fisica.cod_p_fisica ,pessoa.nome, pessoa_fisica.cpf, pessoa_fisica.rg FROM cliente join pessoa_fisica on cliente.cod_pessoa_fisica = pessoa_fisica.cod_p_fisica join pessoa on pessoa_fisica.cod_pessoa = pessoa.cod_pessoa");
            ResultSet res = stmt.executeQuery();
            while(res.next()){
                Cliente cliente = new Cliente();
                cliente.setCodPessoa(res.getInt("pessoa.cod_pessoa"));
                cliente.setCod_cliente(res.getInt("cliente.cod_cliente"));
                cliente.setCodPFisica(res.getInt("pessoa_fisica.cod_p_fisica"));
                cliente.setNome(res.getString("pessoa.nome"));
                cliente.setCpf(res.getString("pessoa_fisica.cpf"));
                cliente.setRg(res.getString("pessoa_fisica.rg"));
                clientes.add(cliente);
                System.out.println(cliente);
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return clientes;
    }

    @Override
    public boolean atualizar(Cliente t) {
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(t.getNome());
            pessoa.setCodPessoa(t.getCodPessoa());
            //
            PessoaFisica pessoaF = new PessoaFisica();
            pessoaF.setCodPFisica(t.getCodPFisica());
            pessoaF.setCpf(t.getCpf());
            pessoaF.setRg(t.getRg());
            //
            DAOPessoaFisica pf = new DAOPessoaFisica();
            pf.atualizar(pessoaF);
            DAOPessoa p = new DAOPessoa();
            p.atualizar(pessoa);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    @Override
    public boolean excluir(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public static void main(String[] args){
        
        //INSERINDO CLIENTE AQUI!!
//        
//        String nome = "Renê";
//        String cpf = "78999665987";
//        String rg = "20098854440";
//        //PESSOA
//        DAOPessoa p = new DAOPessoa();
//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome(nome);
//        p.inserir(pessoa);
//        //PESSOAFISICA
//        DAOPessoaFisica pf = new DAOPessoaFisica();
//        PessoaFisica pessoaF = new PessoaFisica();
//        pessoaF.setCpf(cpf);
//        pessoaF.setRg(rg);
//        pf.inserir(pessoaF);
//        //CLIENTE
//        DAOCliente cliente = new DAOCliente();
//        Cliente cl = new Cliente();
//        cliente.inserir(cl);;

   
        
    }
    
}
