package services;
import models.Conducteur;
import models.Utilisateur;

public class PaiementService {
    public void envoyerArgent(Utilisateur emetteur, Utilisateur destinataire, double montant) {
        System.out.println(emetteur.getNom() + " envoie " + montant + " à " + destinataire.getNom());
    }

    public void recevoirArgent(Utilisateur destinataire, double montant) {
        System.out.println(destinataire.getNom() + " a reçu " + montant);
    }

    public void envoyerPaiement(Utilisateur alice, Conducteur bob, double v) {
    }
}
