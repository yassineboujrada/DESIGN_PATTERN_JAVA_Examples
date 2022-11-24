package Observer;

public interface subject {
    void subscribe_course(observer_interface obs);
    void unsubscribe_course(observer_interface obs);
    void notify_all_subscribes();
}
