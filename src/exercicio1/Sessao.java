package exercicio1;

public class Sessao {

    private String data;
    private String horario;
    private int nIngressos;
    private Sala sala;
    private Filme filme;

    public Sessao(String data, String horario, Sala sala, Filme filme) {
        this.data = data;
        this.horario = horario;
        this.nIngressos = sala.getCapacidadeMaxima();
        this.sala = sala;
        this.filme = filme;
    }

    public void venderIngressos(int quantidade) {
        if (this.nIngressos - quantidade < 0) {
            System.out.println("Quantidade de ingressos indisponível");
        } else {
            this.nIngressos -= quantidade;
            System.out.println("Ingressos vendidos com sucesso");
        }
    }

    public void gerarRelatorio() {
        System.out.println(
                "\nData = " + data + "\nHorario = " + horario + "\nN° Ingressos = " + nIngressos + "\nSala: " + sala
                        + "\nFilme:" + filme + "\n");
    }
}
