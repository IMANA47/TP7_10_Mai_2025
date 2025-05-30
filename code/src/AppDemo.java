import models.*;
import services.*;

public class AppDemo {
    public static void main(String[] args) {
        Utilisateur alice = new Utilisateur("Alice", "alice@mail.com");
        Conducteur bob = new Conducteur("Bob", "bob@mail.com");
        Administrateur admin = new Administrateur("Admin", "admin@mail.com");

        Vehicule v1 = new Vehicule("Toyota", "AB123CD");

        // Services
        FlotteService flotteService = new FlotteService();
        flotteService.afficherVehicule(v1);

        PaiementService paiementService = new PaiementService();
        paiementService.envoyerPaiement(alice, bob, 15.0);
        bob.recevoirPaiement(15.0);

        MessagerieService messagerieService = new MessagerieService();
        messagerieService.envoyerMessage(alice, bob, "Bonjour Bob !");
        messagerieService.envoyerMessage(admin, bob, "Mise à jour des trajets !");
    }
}
