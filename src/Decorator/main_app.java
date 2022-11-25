package Decorator;

public class main_app {
    public static void main(String[] args) {
        System.out.println("1st Sandwich");
        sandwich basic_sandwich = new basic_sandwich();
        System.out.println("Description : "+basic_sandwich.getDesc());
        System.out.printf("Cost : %.2f",basic_sandwich.getCost());
        System.out.println("\n2nd Sandwich");
        sandwich sand = new tomato(new Salt(basic_sandwich));
        System.out.println("Description : "+sand.getDesc());
        System.out.printf("Cost : %.2f",sand.getCost());
        System.out.println("\n3rd Sandwich");
        sandwich sand2 = new onion(new tomato(new Salt(basic_sandwich)));
        System.out.println("Description : "+sand2.getDesc());
        System.out.printf("Cost : %.2f",sand2.getCost());
    }
}
