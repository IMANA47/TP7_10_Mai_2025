package services;

import models.Utilisateur;

public class MessagerieService {
    public void envoyerMessage(Utilisateur emetteur, Utilisateur destinataire, String message) {
        emetteur.envoyerMessage(destinataire, message);
    }
}