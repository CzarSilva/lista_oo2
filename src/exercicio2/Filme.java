package exercicio2;

public class Filme {

    private String titulo;
    private int duracao;
    private double preco;
    private String diaLocação;
    private String diaPrevistoDevolução;
    private String diaDevolução;
    private String cliente;
    private double valorTotal;

    final private double VALOR_MULTA = 2.0;

    public Filme(String titulo, int duracao, double preco) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    public String getDiaLocação() {
        return diaLocação;
    }

    public String getDiaPrevistoDevolução() {
        return diaPrevistoDevolução;
    }

    public String getDiaDevolução() {
        return diaDevolução;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double getVALOR_MULTA() {
        return VALOR_MULTA;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDiaLocação(String diaLocação) {
        this.diaLocação = diaLocação;
    }

    public void setDiaPrevistoDevolução(String diaPrevistoDevolução) {
        this.diaPrevistoDevolução = diaPrevistoDevolução;
    }

    public void setDiaDevolução(String diaDevolução) {
        this.diaDevolução = diaDevolução;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
