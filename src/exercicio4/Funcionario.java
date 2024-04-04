package exercicio4;

abstract class Funcionario {

    private String registro;
    private String nome;
    private String dataAdmissao;
    private double salarioBase;

    public Funcionario(String registro, String nome, String dataAdmissao, double salarioBase) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double getSalarioTotal();
}