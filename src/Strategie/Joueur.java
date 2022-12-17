package Strategie;

public class Joueur {
    public String nom;
    public int score;
    public Strategie saStrategie;

    public Joueur(String nom, Strategie saStrategie) {
        this.nom = nom;
        this.score = 0;
        this.saStrategie = saStrategie;
    }

    public Coup JoueurCoup() {
        return saStrategie.detreminerCoup();
    }
    public void setScore(int score) {
        this.score = score;
    }
    public int getScore() {
        return score;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Strategie getSaStrategie() {
        return saStrategie;
    }
    public void setSaStrategie(Strategie saStrategie) {
        this.saStrategie = saStrategie;
    }
    
}
