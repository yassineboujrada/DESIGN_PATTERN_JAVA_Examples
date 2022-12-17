package Strategie;

public class CoupCyclique implements Strategie {

    private Coup coupPrecedent;
    
    @Override
    public Coup detreminerCoup() {
        if (coupPrecedent == null) {
            coupPrecedent = Coup.PIERRE;
            return Coup.PIERRE;
        }
        switch (coupPrecedent) {
            case PIERRE:
                coupPrecedent = Coup.FEUILLE;
                return Coup.FEUILLE;
            case FEUILLE:
                coupPrecedent = Coup.CISEAUX;
                return Coup.CISEAUX;
            case CISEAUX:
                coupPrecedent = Coup.PIERRE;
                return Coup.PIERRE;
            default:
                return null;
        }
    }
   
}
