package Proxy;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<String> site = Arrays.asList("facebook","porno","twitter","youtube");
        ISP internet = new internetProxy();

        for(String i:site){
            System.out.println(internet.serverSite(i));
        }
    }
}
