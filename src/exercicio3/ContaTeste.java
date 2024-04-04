package exercicio3;

public class ContaTeste {
    public static void main(String[] args) {
        
        Conta conta = new Conta(1, new Cliente("Mindanda dedão", "10781155916"));

        conta.adicionarEntrada(new Prato(1, "Steack Trata", "Carce crua temperada", 50.0, TipoPrato.ENTRADA));
        conta.adicionarEntrada(new Prato(2, "Bife Welligton", "Filé minho enroaldo em uma cama de cogumelos coberto com uma massa folhada", 100.0, TipoPrato.PRINCIPAL));
        conta.adicionarEntrada(new Prato(3, "Creme Broulè", "Creme de confetiro com açucar maçaricado", 30.0, TipoPrato.SOBREMESA));

        conta.fecharConta();
    }
}
