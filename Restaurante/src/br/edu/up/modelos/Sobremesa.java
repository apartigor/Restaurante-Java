package br.edu.up.modelos;

//A Sobremesa É UM Item
public class Sobremesa extends Item {

    // Sobrememsa TEM UM
    private Ingrediente[] ingredientes;

    public Sobremesa() {
    }

    public Sobremesa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

}
