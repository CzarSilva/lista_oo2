package exercicio4;

class Professor extends Funcionario {

    private String titulacao;
    private double gratificacaoTitulacao;
    private Disciplina disciplina;

    public Professor(String registro, String nome, String dataAdmissao, double salarioBase, String titulacao, Disciplina disciplina) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.titulacao = titulacao;
        this.disciplina = disciplina;
        
        if (titulacao.equals("Mestre")) {
            this.gratificacaoTitulacao = 1000.00;
        } else if (titulacao.equals("Doutor")) {
            this.gratificacaoTitulacao = 2000.00;
        } else {
            this.gratificacaoTitulacao = 0.00;
        }
    }

    public double getSalarioTotal() {
        return getSalarioBase() + gratificacaoTitulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
}