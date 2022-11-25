package Adapter;

public class Car implements vehicle{
    @Override
    public void accelearate() {
        System.out.println("car start moving");
    }

    @Override
    public void pushBreak() {
        System.out.println("car Stopped");
    }

    @Override
    public void Soundage() {
        System.out.println("biiib");
    }
}
