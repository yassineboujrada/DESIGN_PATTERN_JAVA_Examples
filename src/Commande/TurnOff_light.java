package Commande;

public class TurnOff_light implements commande_iterface{
    private light light;

    public TurnOff_light(light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOff();
    }

    @Override
    public void undo() {
        this.light.turnOn();
    }
}
