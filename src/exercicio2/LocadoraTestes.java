package exercicio2;

public class LocadoraTestes {

    public static void main(String[] args) {

        Locadora locadora = new Locadora();

        locadora.cadastrarCliente(new Cliente("Cliente 1", "01/12/2020", "61267978090", "(11) 90000-0000", new Endereco("Rua dos Bobos", 0, "Vila dos burros", "00000-000", "Ponta grossa", "Paraná")));
        locadora.cadastrarCliente(new Cliente("Cliente 2", "01/12/2020", "24714705059", "(11) 90000-0000", new Endereco("Rua dos Bobos", 1, "Vila dos burros", "00000-000", "Ponta grossa", "Paraná")));
        locadora.cadastrarCliente(new Cliente("Cliente 3", "01/12/2020", "35764535042", "(11) 90000-0000", new Endereco("Rua dos Bobos", 2, "Vila dos burros", "00000-000", "Ponta grossa", "Paraná")));
        locadora.cadastrarCliente(new Cliente("Cliente 4", "01/12/2020", "78480928018", "(11) 90000-0000", new Endereco("Rua dos Bobos", 3, "Vila dos burros", "00000-000", "Ponta grossa", "Paraná")));
        locadora.cadastrarCliente(new Cliente("Cliente 5", "01/12/2020", "82252363002", "(11) 90000-0000", new Endereco("Rua dos Bobos", 4, "Vila dos burros", "00000-000", "Ponta grossa", "Paraná")));
        
        locadora.cadastrarFilme(new Filme("Filme 1", 200, 30.0));
        locadora.cadastrarFilme(new Filme("Filme 2", 200, 30.0));
        locadora.cadastrarFilme(new Filme("Filme 3", 200, 30.0));
        locadora.cadastrarFilme(new Filme("Filme 4", 200, 30.0));
        locadora.cadastrarFilme(new Filme("Filme 5", 200, 30.0));
        
        locadora.locarFilme("82252363002", "Filme 1", 2);
        locadora.devolverFilme("Filme 1", 8);

    }
}
