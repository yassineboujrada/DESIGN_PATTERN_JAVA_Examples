package Observer;
import java.util.ArrayList;
import java.util.List;

public class course implements subject{
    private String name;
    private String available;
    private List<observer_interface> observerList;

    public course(String name){
        this.name=name;
        observerList = new ArrayList<>();
    }

    @Override
    public void subscribe_course(observer_interface obs) {
        observerList.add(obs);
    }

    @Override
    public void unsubscribe_course(observer_interface obs) {
        observerList.remove(obs);
    }

    @Override
    public void notify_all_subscribes() {
        for(observer_interface i : observerList){
            i.update_ele(available);
        }
    }

    public void setAvailable(boolean availablity){
        this.available = this.name + (availablity ? " is available" : " is not available");
        notify_all_subscribes();
    }
}
