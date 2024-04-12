package br.edu.up.modelos;

public class Pedido {

    // Pedido TEM UM
    private Cliente cliente;
    private Garcom garcom;
    private Item[] itens;

    public Pedido() {
    }

    public Pedido(Cliente cliente, Garcom garcom, Item[] itens) {
        this.cliente = cliente;
        this.garcom = garcom;
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Garcom getGarcom() {
        return garcom;
    }

    public void setGarcom(Garcom garcom) {
        this.garcom = garcom;
    }

    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }


    
}

