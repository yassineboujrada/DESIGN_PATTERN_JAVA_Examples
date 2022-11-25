package Decorator;

public class Salt extends sandich_decorator{

    public Salt(Decorator.sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost(){
        return super.getCost()+0.2;
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", salt";
    }
}
