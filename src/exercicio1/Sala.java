package exercicio1;

public class Sala {

    private int identificacao;
    private int capacidadeMaxima;

    public Sala(int identificacao, int capacidadeMaxima) {
        this.identificacao = identificacao;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    @Override
    public String toString() {
        return "\n   Identificacao = " + this.identificacao + "\n   Capacidade máxima = " + this.capacidadeMaxima;
    }
}
