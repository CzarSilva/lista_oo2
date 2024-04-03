package exercicio1;

public class CinemaTeste {
    public static void main(String[] args) {
        
        Sessao sessao1 = new Sessao("26/03/2024", "18:00", new Sala(1001, 100), new Filme("Se beber não case", 120));

        sessao1.venderIngressos(10);
        sessao1.venderIngressos(91);
        sessao1.venderIngressos(20);
        sessao1.gerarRelatorio();

    }
}
