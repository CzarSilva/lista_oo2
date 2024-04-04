package exercicio4;

public class UniversidadeTeste {
    public static void main(String[] args) {
        Universidade universidade = new Universidade();

        Disciplina disciplina1 = new Disciplina("001", "Matemática", "Ementa de Matemática", 60);
        Professor professor1 = new Professor("P001", "João", "01/01/2020", 3000.00, "Doutor", disciplina1);
        universidade.adicionarProfessor(professor1);

        Processo processo1 = new Processo("001", "01/01/2022", "Descrição do Processo 1");
        TecnicoAdministrativo tecnico1 = new TecnicoAdministrativo("T001", "Maria", "01/01/2020", 2000.00, 500.00, processo1);
        universidade.adicionarTecnicoAdministrativo(tecnico1);

        universidade.relatorioProfessores();
        universidade.relatorioTecnicosAdministrativos();
    }
}
