package Adapter;

public class client {
    public static void main(String[] args) {
        System.out.println("Car : ");
        vehicle car = new Car();
        playWithCar(car);
        System.out.println("\nbycicle : ");
        vehicle bicicle = new bycicle_adapter(new bycicle());
        playWithCar(bicicle);
    }
    private static void playWithCar(vehicle veh){
        veh.accelearate();
        veh.Soundage();
        veh.pushBreak();
    }

}
