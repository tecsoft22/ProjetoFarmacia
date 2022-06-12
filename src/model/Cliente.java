package model;

public class Cliente extends PessoaFisica{
    private int cod_cliente;
    private int cod_pessoa_fisica;

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public int getCod_pessoa_fisica() {
        return cod_pessoa_fisica;
    }

    public void setCod_pessoa_fisica(int cod_pessoa_fisica) {
        this.cod_pessoa_fisica = cod_pessoa_fisica;
    }
    
    
}
