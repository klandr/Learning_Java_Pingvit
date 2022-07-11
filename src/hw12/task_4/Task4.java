package hw12.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//Task 4
//Создать класс User, сделать конструктор с 1 параметром, например, имя.
//Создать функциональный интерфейс, с методом, который бы создавал юзера.
// Написать лямбда-выражение и создать юзера
public class Task4 {
    public static void main(String[] args) {
        Map<String,Integer> users = new HashMap<>();
        //users.put("Den",4);
        System.out.println(users);
        Consumer<String> usrLambda = x -> new HashMap<>() ;
       // Consumer<Integer> usrLambda = x -> users.put("Jeck",44) ;
        usrLambda.equals("Jeck");
        System.out.println(usrLambda);
        System.out.println(users);
    }
}
