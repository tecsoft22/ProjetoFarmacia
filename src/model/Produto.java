package model;

public class Produto {
    
    private String nome_produto;
    private String cod_barras;
    private double preco;
    private String cod_estoque;
    private String cod_categoria;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCod_estoque() {
        return cod_estoque;
    }

    public void setCod_estoque(String cod_estoque) {
        this.cod_estoque = cod_estoque;
    }

    public String getCod_categoria() {
        return cod_categoria;
    }

    public void setCod_categoria(String cod_categoria) {
        this.cod_categoria = cod_categoria;
    }
    
    
   
   
    
}
