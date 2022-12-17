package Strategie;

public enum Coup {
    PIERRE, FEUILLE, CISEAUX;

    public static Coup fromString(String s) {
        if (s.equals("PIERRE")) {
            return PIERRE;
        } else if (s.equals("FEUILLE")) {
            return FEUILLE;
        } else if (s.equals("CISEAUX")) {
            return CISEAUX;
        } else {
            return null;
        }
    }
    
    public static boolean isValide(String s) {
        return s.equals("PIERRE") || s.equals("FEUILLE") || s.equals("CISEAUX");
    }

    
}
