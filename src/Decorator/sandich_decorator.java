package Decorator;

public abstract class sandich_decorator implements sandwich{
    private sandwich sandwich;

    public sandich_decorator(sandwich sandwich){
        this.sandwich = sandwich;
    }

    @Override
    public String getDesc(){
        return this.sandwich.getDesc();
    }

    @Override
    public double getCost(){
        return this.sandwich.getCost();
    }
}
