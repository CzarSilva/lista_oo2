package exercicio4;

import java.util.ArrayList;

class Universidade {
    
    private ArrayList<Professor> professores;
    private ArrayList<TecnicoAdministrativo> tecnicosAdministrativos;

    public Universidade() {
        professores = new ArrayList<>();
        tecnicosAdministrativos = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarTecnicoAdministrativo(TecnicoAdministrativo tecnicoAdministrativo) {
        tecnicosAdministrativos.add(tecnicoAdministrativo);
    }

    public void relatorioProfessores() {
        System.out.println("Relatório de Professores:");
        for (Professor professor : professores) {
            System.out.println("Registro: " + professor.getRegistro());
            System.out.println("Nome: " + professor.getNome());
            System.out.println("Titulação: " + professor.getTitulacao());
            System.out.println("Data de Admissão: " + professor.getDataAdmissao());
            System.out.println("Salário Total: R$ " + professor.getSalarioTotal());
            Disciplina disciplina = professor.getDisciplina();
            System.out.println("Código da Disciplina: " + disciplina.getCodigo());
            System.out.println("Nome da Disciplina: " + disciplina.getNome());
            System.out.println("Ementa: " + disciplina.getEmenta());
            System.out.println("Carga Horária: " + disciplina.getCargaHoraria());
            System.out.println();
        }
    }

    public void relatorioTecnicosAdministrativos() {
        System.out.println("Relatório de Técnicos Administrativos:");
        for (TecnicoAdministrativo tecnicoAdministrativo : tecnicosAdministrativos) {
            System.out.println("Registro: " + tecnicoAdministrativo.getRegistro());
            System.out.println("Nome: " + tecnicoAdministrativo.getNome());
            System.out.println("Data de Admissão: " + tecnicoAdministrativo.getDataAdmissao());
            System.out.println("Salário Total: R$ " + tecnicoAdministrativo.getSalarioTotal());
            Processo processo = tecnicoAdministrativo.getProcesso();
            System.out.println("Número do Processo: " + processo.getNumero());
            System.out.println("Data de Criação: " + processo.getDataCriacao());
            System.out.println("Descrição do Processo: " + processo.getDescricao());
            System.out.println();
        }
    }
}