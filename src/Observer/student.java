package Observer;

public class student implements observer_interface{
    private String name;

    public student(String name){
        this.name=name;
    }

    @Override
    public void update_ele(String msg) {
        System.out.println(this.name+" have new notification "+msg);
    }
}
