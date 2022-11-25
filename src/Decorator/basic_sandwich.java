package Decorator;

public class basic_sandwich implements sandwich{
    @Override
    public double getCost() {
        return 10;
    }

    @Override
    public String getDesc() {
        return "bread";
    }
}
