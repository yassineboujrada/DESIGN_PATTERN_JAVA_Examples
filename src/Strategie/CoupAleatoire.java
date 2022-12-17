package Strategie;

import java.util.ArrayList;
import java.util.Random;

public class CoupAleatoire implements Strategie{

    private Random umberGenerator = new Random();
    private ArrayList<Coup> tousLesCoup = new ArrayList<Coup>();

    public Coup randomElement(ArrayList<Coup> list) {
        int index = umberGenerator.nextInt(list.size());
        return list.get(index);
    }
    public Coup coupAleatoire() {
        return randomElement(tousLesCoup);
    }

    @Override
    public Coup detreminerCoup() {
        tousLesCoup.add(Coup.PIERRE);
        tousLesCoup.add(Coup.FEUILLE);
        tousLesCoup.add(Coup.CISEAUX);
        return coupAleatoire();
    }
}
