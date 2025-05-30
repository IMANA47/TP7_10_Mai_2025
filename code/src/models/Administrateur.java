package models;

public class Administrateur extends Utilisateur {
    public Administrateur(String nom, String email) {
        super(nom, email);
    }

    public void gererFlotte() {
        boolean nom = false;
        System.out.println(nom + " gère la flotte.");
    }
}
