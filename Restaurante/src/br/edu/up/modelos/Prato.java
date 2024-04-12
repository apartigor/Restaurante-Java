package br.edu.up.modelos;

//O Prato É UM Item
public class Prato extends Item {

    // Prato TEM UM
    private ChefeCozinha chefeCozinha;
    private Ingrediente[] ingredientes;

    public Prato() {
    }

    public Prato(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Prato(ChefeCozinha chefeCozinha) {
        this.chefeCozinha = chefeCozinha;
    }

    public Prato(ChefeCozinha chefeCozinha, Ingrediente[] ingredientes) {
        this.chefeCozinha = chefeCozinha;
        this.ingredientes = ingredientes;
    }

    public ChefeCozinha getChefeCozinha() {
        return chefeCozinha;
    }

    public void setChefeCozinha(ChefeCozinha chefeCozinha) {
        this.chefeCozinha = chefeCozinha;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

}
