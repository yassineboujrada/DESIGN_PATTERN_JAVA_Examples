package Proxy;

import java.util.Arrays;
import java.util.List;

public class internetProxy implements ISP{

    private List<String> blockedSite = Arrays.asList("facebook","porno","twitter");

    @Override
    public String serverSite(String url) {
        logSite(url);
        if(blockedSite.contains(url)){
            return "this site is blocked";
        }
        return new Etisolot().serverSite(url);
    }

    public void logSite(String url){
        System.out.printf("[%d] %s",System.currentTimeMillis(),url);
    }
}
