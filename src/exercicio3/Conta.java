package exercicio3;

import java.util.List;

public class Conta {

    private int numero;
    private List<Prato> pratos;
    private Cliente cliente;

    public Conta(int numero, List<Prato> pratos, Cliente cliente) {
        this.numero = numero;
        this.pratos = pratos;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
