package exercicio4;

class TecnicoAdministrativo extends Funcionario {
    private double adicionalNoturno;
    private Processo processo;

    public TecnicoAdministrativo(String registro, String nome, String dataAdmissao, double salarioBase, double adicionalNoturno, Processo processo) {
        super(registro, nome, dataAdmissao, salarioBase);
        this.adicionalNoturno = adicionalNoturno;
        this.processo = processo;
    }

    public double getSalarioTotal() {
        return getSalarioBase() + adicionalNoturno;
    }

    public Processo getProcesso() {
        return processo;
    }
}