package model;

public class PessoaFisica extends Pessoa{
    
    private int codPFisica;
    private String cpf;
    private String rg;

    public int getCodPFisica() {
        return codPFisica;
    }

    public void setCodPFisica(int codPFisica) {
        this.codPFisica = codPFisica;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" + "codPFisica=" + codPFisica + ", cpf=" + cpf + ", rg=" + rg + '}';
    }
    
    
    
    
}
