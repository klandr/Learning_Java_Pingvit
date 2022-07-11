package hw12.task_1;

import java.util.ArrayList;
import java.util.Date;

public class Store {
    public static void main(String[] args) {
        Date date = new Date();
        String chicken = new String("Kura");
        String milk = new String("Mleko");
        String eggs = new String("Jajko");

        ArrayList<String> storeList = new ArrayList<>();
        storeList.add((chicken)+" "+date);
        storeList.add((milk)+" "+date);
        storeList.add((eggs)+" "+date);
        System.out.println(storeList);
    }
}
