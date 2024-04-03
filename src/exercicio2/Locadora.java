package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<Cliente> clientes;
    private List<Filme> filmes;

    public Locadora() {
        this.clientes = new ArrayList<Cliente>();
        this.filmes = new ArrayList<Filme>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void locarFilme(String cpfCliente, String titulo, Integer dia) {
        Cliente cliente = buscarCliente(cpfCliente);

        if (cliente == null) {
            System.err.println("Cliente não encontrado");
            return;
        }

        Filme filme = buscarFilme(titulo);

        if (filme == null) {
            System.err.println("Filme não encontrado");
            return;
        }

        if (filme != null || !filme.getDiaLocação().isEmpty()) {
            System.err.println("Filme não disponivel");
        }

        filme.setDiaLocação(Integer.toString(dia));
        filme.setDiaDevolução(Integer.toString(dia + 3));
        filme.setValorTotal(filme.getPreco());
        filme.setCliente(cliente.getNome());

        System.err.println("Filme alugado com sucesso!");
    }

    public void devolverFilme(String titulo, Integer dia) {
        Filme filme = buscarFilme(titulo);

        if (filme == null) {
            System.err.println("Filme não encontrado");
            return;
        }

        if (filme.getDiaLocação().isEmpty()) {
            System.err.println("Filme não está alugado");
        }

        var dias = Integer.parseInt(filme.getDiaDevolução()) - Integer.parseInt(filme.getDiaLocação());

        if (dias > 0) {
            System.err
                    .println("O filme está atrasado! O total é R$ " + (filme.getPreco() + filme.getVALOR_MULTA() * dias));
        } else {
            System.err.println("O total é R$ " + filme.getPreco());
        }

        filme.setDiaLocação("");
        filme.setDiaDevolução("");
        filme.setCliente("");
        filme.setDiaLocação("");
        filme.setValorTotal(0);
    }

    private Cliente buscarCliente(String cpfCliente) {
        for (Cliente cliente : this.clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpfCliente)) {
                return cliente;
            }
        }
        return null;
    }

    private Filme buscarFilme(String titulo) {
        for (Filme filme : this.filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }
}
