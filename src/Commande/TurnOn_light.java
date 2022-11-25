package Commande;

public class TurnOn_light implements commande_iterface{
    private light light;

    public TurnOn_light(light light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOn();
    }

    @Override
    public void undo() {
        this.light.turnOff();
    }
}
