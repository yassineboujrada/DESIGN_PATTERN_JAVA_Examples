package Strategie;

public class Partie {
    private int nbTour;
    private Joueur joueur1,joueur2;

    Partie(int nbTour,String nomJoueur1, String nomJoueur2, Strategie stratJoueur1, Strategie stratJoueur2) {
        this.nbTour = nbTour;
        joueur1 = new Joueur(nomJoueur1, stratJoueur1);
        joueur2 = new Joueur(nomJoueur2, stratJoueur2);
    }

    public void afficher(){
        System.out.println("Joueur 1: " + joueur1.getNom());
        System.out.println("Joueur 2: " + joueur2.getNom());
        System.out.println("Nombre de coups: " + nbTour);
    }
    public boolean jouerTour(int leNomTour){
        System.out.println("--- Tour " + leNomTour + " ---");
        Coup coupJoueur1 = joueur1.JoueurCoup();
        Coup coupJoueur2 = joueur2.JoueurCoup();
        System.out.println("Joueur 1: " + coupJoueur1);
        System.out.println("Joueur 2: " + coupJoueur2);
        compareCoup(coupJoueur1, coupJoueur2);
        return true;
    }
    public void lancePartie(){
        for (int i = 1; i <= nbTour; i++) {
            jouerTour(i);
        }
        System.out.println("Le gagnant est: " + determinerGagnant());
        
    }
    public void compareCoup(Coup coup1, Coup coup2){
        if (coup1 == coup2) {
            System.out.println("Egalité");
        } else if (coup1 == Coup.PIERRE && coup2 == Coup.FEUILLE) {
            System.out.println("Joueur 2 gagne");
            joueur2.setScore(joueur2.getScore() + 1);
        } else if (coup1 == Coup.PIERRE && coup2 == Coup.CISEAUX) {
            System.out.println("Joueur 1 gagne");
            joueur1.setScore(joueur1.getScore() + 1);
        } else if (coup1 == Coup.FEUILLE && coup2 == Coup.PIERRE) {
            System.out.println("Joueur 1 gagne");
            joueur1.setScore(joueur1.getScore() + 1);
        } else if (coup1 == Coup.FEUILLE && coup2 == Coup.CISEAUX) {
            System.out.println("Joueur 2 gagne");
            joueur2.setScore(joueur2.getScore() + 1);
        } else if (coup1 == Coup.CISEAUX && coup2 == Coup.PIERRE) {
            System.out.println("Joueur 2 gagne");
            joueur2.setScore(joueur2.getScore() + 1);
        } else if (coup1 == Coup.CISEAUX && coup2 == Coup.FEUILLE) {
            System.out.println("Joueur 1 gagne");
            joueur1.setScore(joueur1.getScore() + 1);
        }
    }
    public String determinerGagnant(){
        return joueur1.getScore() > joueur2.getScore() ? joueur1.getNom() : joueur2.getNom();
    }
}
