package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private int numero;
    private List<Prato> pratos;
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.pratos = new ArrayList<Prato>();
        this.cliente = cliente;
    }

    public void adicionarEntrada(Prato prato){
        pratos.add(prato);
    }

    public void adicionarPrincipal(Prato prato){
        pratos.add(prato);
    }

    public void adicionarSobremesa(Prato prato){
        pratos.add(prato);
    }

    public void fecharConta(){
        System.out.println("Pratos condumiudos:");

        double total = 0.0;

        for(Prato prato : this.pratos){
            total += prato.getPreco();
            System.out.println(" - " + prato.getNome() + " = R$" + prato.getPreco() + "0");
        }

        total += (total*0.1);
        System.out.println("Valor total = R$" + total + "0");
    }
    
}
