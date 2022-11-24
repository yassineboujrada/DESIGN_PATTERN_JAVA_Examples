package Signleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class singleton {
    private Integer[] number = {1,2,3,4,5,6};
    private List<Integer> list =Arrays.asList(number);
    private static singleton instance;

    private singleton(){
        System.out.println("Object has been created");
        Collections.shuffle(list);
    }

    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;

    }

    public void printer_val(){
        for (Integer nbr : list) {
            System.out.print(nbr.toString()+" ");
        }
        System.out.println();
    }
}
