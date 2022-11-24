package Factory;

public class sandwich_factory {
    public static final int CHEESE_BURGER = 1;
    public static final int CHIKEN_BURGER = 2;

    public static sandwich create_sandwich(int sandwich_id){
        switch (sandwich_id){
            case CHEESE_BURGER:
                return new Cheese_burger();
            case CHIKEN_BURGER:
                return new Chiken_burger();
            default:
                return null;
        }
    }
}
