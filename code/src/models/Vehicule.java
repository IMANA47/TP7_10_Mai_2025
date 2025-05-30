package models;

public class Vehicule {
    private String marque;
    private String numero;

    public Vehicule(String marque, String numero) {
        this.marque = marque;
        this.numero = numero;
    }

    public void afficher() {
        System.out.println("Véhicule: " + marque + " (" + numero + ")");
    }
}