package Strategie;

import java.util.Scanner;

public class main_app {
    public static void main(String[] args) throws Exception {
        Strategie strat = new ToujoursMemeCoup();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nom du joueur: ");
        String nom = sc.nextLine();
        System.out.println("Le joueur " + nom + " a joué " + strat.detreminerCoup());

        Strategie strat2 = new ToujoursMemeCoup();
        System.out.println("Entrez le nom du joueur: ");
        String nom2 = sc.nextLine();
        System.out.println("Le joueur " + nom2 + " a joué " + strat2.detreminerCoup());

        // how many times do you want to play?
        System.out.println("Combien de fois voulez-vous jouer?");
        int nbre = sc.nextInt();
        sc.close();
        Partie partie = new Partie(nbre, nom, nom2, strat, strat2);
        partie.afficher();
        partie.lancePartie();

    }
}
