package Decorator;

public class onion extends sandich_decorator{

    public onion(Decorator.sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost(){
        return super.getCost()+10;
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", onion";
    }
}
