package models;

public class Conducteur extends Utilisateur {
    public Conducteur(String nom, String email) {
        super(nom, email);
    }

    public void recevoirPaiement(double montant) {
        boolean nom = false;
        System.out.println(nom + " a reçu " + montant + "€");
    }
}
