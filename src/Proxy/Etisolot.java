package Proxy;

public class Etisolot implements ISP{

    private int browsspeed =10;
    @Override
    public String serverSite(String url) {
        return String.format("https://%s.com",url);
    }

    public int getBrowsspeed() {
        return browsspeed;
    }

    public void setBrowsspeed(int browsspeed) {
        this.browsspeed = browsspeed;
    }
}
