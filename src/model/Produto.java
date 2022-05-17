package model;

public class Produto {
    
    private String nome_produto;
    private int cod_barras;
    private double preco;
    private int cod_estoque;
    private int cod_categoria;
    
    public Produto(String nome_produto, int cod_barras, double preco, int cod_estoque, int cod_categoria){
        this.nome_produto = nome_produto;
        this.preco = preco;
        this.cod_barras = cod_barras;
        this.cod_estoque = cod_estoque;
        this.cod_categoria = cod_categoria;
    }
    
    public Produto(){}

    @Override
    public String toString() {
        return "Produto{" + "nome_produto=" + nome_produto + ", cod_barras=" + cod_barras + ", preco=" + preco + ", cod_estoque=" + cod_estoque + ", cod_categoria=" + cod_categoria + '}';
    }


    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCod_estoque() {
        return cod_estoque;
    }

    public void setCod_estoque(int cod_estoque) {
        this.cod_estoque = cod_estoque;
    }

    public int getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(int cod_categoria) {
        this.cod_categoria = cod_categoria;
    }
    
    
    
    
   
   
    
}
