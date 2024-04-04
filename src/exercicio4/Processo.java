package exercicio4;

class Processo {
    private String numero;
    private String dataCriacao;
    private String descricao;

    public Processo(String numero, String dataCriacao, String descricao) {
        this.numero = numero;
        this.dataCriacao = dataCriacao;
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getDescricao() {
        return descricao;
    }
}