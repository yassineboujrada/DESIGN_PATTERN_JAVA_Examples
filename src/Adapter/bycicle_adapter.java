package Adapter;

public class bycicle_adapter implements vehicle{
    private bycicle cicle;
    public bycicle_adapter(bycicle cicle){
        this.cicle=cicle;
    }
    @Override
    public void accelearate() {
        cicle.pedal();
    }

    @Override
    public void pushBreak() {
        cicle.stop();
    }

    @Override
    public void Soundage() {
        cicle.ring();
    }
}
