package exercicio3;

public class Prato {

    private int numero;
    private String nome;
    private String descricao;
    private double preco;
    private TipoPrato tipoPrato;
    
    public Prato(int numero, String nome, String descricao, double preco, TipoPrato tipoPrato) {
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tipoPrato = tipoPrato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoPrato getTipoPrato() {
        return tipoPrato;
    }

    public void setTipoPrato(TipoPrato tipoPrato) {
        this.tipoPrato = tipoPrato;
    }
}
