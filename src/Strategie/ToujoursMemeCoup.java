package Strategie;

public class ToujoursMemeCoup implements Strategie{

    private Coup leCoup;

    @Override
    public Coup detreminerCoup() {
        return leCoup;
    }
    
}
