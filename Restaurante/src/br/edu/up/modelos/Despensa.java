package br.edu.up.modelos;

public class Despensa {

    // Despensa TEM UM
    private Gerente gerente;
    private Ingrediente[] ingredientes;

    public Despensa() {
    }

    public Despensa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Despensa(Gerente gerente) {
        this.gerente = gerente;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

}
