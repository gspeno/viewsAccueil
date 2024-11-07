package controller;

import views.FAccueilView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccueilController {
    private FAccueilView view;

    public AccueilController(FAccueilView view) {
        this.view = view;
        initController();
    }

    private void initController() {
        view.addQuitterListener(e -> quitterApplication());
        view.addArticlesListener(e -> afficherArticles());
        view.addClientsListener(e -> afficherClients());
        view.addCommandesListener(e -> afficherCommandes());
    }

    private void quitterApplication() {
        System.exit(0);
    }

    private void afficherArticles() {
        // Logique pour afficher la vue des articles
        System.out.println("Affichage des articles");
    }

    private void afficherClients() {
        // Logique pour afficher la vue des clients
        System.out.println("Affichage des clients");
    }

    private void afficherCommandes() {
        // Logique pour afficher la vue des commandes
        System.out.println("Affichage des commandes");
    }
}
