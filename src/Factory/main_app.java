package Factory;

public class main_app {
    public static void main(String[] args) {
        sandwich sh = sandwich_factory.create_sandwich(1);
        sh.prepare();
    }
}
