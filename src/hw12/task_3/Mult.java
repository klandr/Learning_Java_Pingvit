package hw12.task_3;
import java.util.function.BinaryOperator;
//Task 3
//��������� ��������� BinaryOperator �������� ������-���������, ������� �� �������� ���� ����� ����� �� ������
public class Mult {
    public static void main(String[] args) {
        BinaryOperator <Integer> multipler = (x,y) -> (x*y);
        System.out.println(multipler.apply(2,2));
    }
}
