package exercicio4;

class Disciplina {
    
    private String codigo;
    private String nome;
    private String ementa;
    private int cargaHoraria;

    public Disciplina(String codigo, String nome, String ementa, int cargaHoraria) {
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}