package Commande;

public class TurnOn_tv implements commande_iterface{
    private Tv tv;

    public TurnOn_tv(Tv tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.turnOn();
    }

    @Override
    public void undo() {
        this.tv.turnOff();
    }
}
