package exercicio1;

public class Filme {

    private String titulo;
    private int duracao;

    public Filme(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "\n   Titulo = " + titulo + "\n   Duracao = " + duracao;
    }

}
