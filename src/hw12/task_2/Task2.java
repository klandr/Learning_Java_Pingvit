package hw12.task_2;
import java.util.function.Function;
//Task 2
//�������� ������� �������� ����� � ������ � ����������� �������� �������. ��������, 5 -> 5 ������.
public class Task2 {
    public static void main(String[] args) {
        Function<Integer, String> transfotm = i -> String.valueOf(i);
        System.out.println(transfotm.apply(67)+"$");
    }
}


