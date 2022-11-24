package Signleton;

public class Program_sign {
    public static void main(String[] args) {
        singleton s1 = singleton.getInstance();
        s1.printer_val();
        singleton s2 = singleton.getInstance();
        s2.printer_val();
    }
}
