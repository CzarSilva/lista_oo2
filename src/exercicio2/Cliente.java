package exercicio2;

public class Cliente {

    private String nome;
    private String dataNascimento;
    private String cpf;
    private String telefone;
    private Endereco endereco;
    
    public Cliente(String nome, String dataNascimento, String cpf, String telefone, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
