/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            int codigo = PessoaFisicaDAO.consultarUltimo().getCodPFisica();
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
    public ArrayList<Cliente> consultarItem(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> consultarAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    public static void main(String[] args){
        
        //INSERINDO CLIENTE AQUI!!
        
        String nome = "Renê";
        String cpf = "78999665987";
        String rg = "20098854440";
        //PESSOA
        DAOPessoa p = new DAOPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        p.inserir(pessoa);
        //PESSOAFISICA
        PessoaFisicaDAO pf = new PessoaFisicaDAO();
        PessoaFisica pessoaF = new PessoaFisica();
        pessoaF.setCpf(cpf);
        pessoaF.setRg(rg);
        pf.inserir(pessoaF);
        //CLIENTE
        DAOCliente cliente = new DAOCliente();
        Cliente cl = new Cliente();
        cliente.inserir(cl);
        
    }
    
}
