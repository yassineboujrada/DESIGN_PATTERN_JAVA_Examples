package Commande;

public class TurnOff_tv implements commande_iterface{
    private Tv tv;

    public TurnOff_tv(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOff();
    }

    @Override
    public void undo() {
        this.tv.turnOn();
    }
}
