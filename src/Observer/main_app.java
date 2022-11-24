package Observer;

public class main_app {
    public static void main(String[] args) {
        student std1 = new student("yassine");
        student std2 = new student("khalid");
        student std3 = new student("bella");
        student std4 = new student("khadija");
        student std5 = new student("yasser");
        student std6 = new student("na3ima");

        course java = new course("java course");
        course C = new course("c course");
        course python = new course("python course");

        System.out.println("\njava courese");
        java.subscribe_course(std1);
        java.subscribe_course(std2);
        java.subscribe_course(std3);
        java.subscribe_course(std5);
//        java.setAvailable(true);
        java.unsubscribe_course(std5);
        java.setAvailable(false);
        System.out.println("\nC courese");
        C.subscribe_course(std4);
        C.subscribe_course(std6);
        C.setAvailable(false);
        System.out.println("\npython courese");
        python.subscribe_course(std2);
        python.subscribe_course(std5);
        python.subscribe_course(std4);
        python.setAvailable(true);
    }
}
