package hw12.task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

//Task 4
//������� ����� User, ������� ����������� � 1 ����������, ��������, ���.
//������� �������������� ���������, � �������, ������� �� �������� �����.
// �������� ������-��������� � ������� �����
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
