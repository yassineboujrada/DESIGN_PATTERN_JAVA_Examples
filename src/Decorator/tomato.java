package Decorator;

public class tomato extends sandich_decorator{

    public tomato(Decorator.sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost(){
        return super.getCost()+10;
    }

    @Override
    public String getDesc(){
        return super.getDesc()+", tomato";
    }
}
