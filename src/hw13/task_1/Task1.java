package hw13.task_1;
//Task 1. (filter)
//Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов
import java.util.List;
public class Task1 {
    public static void main(String[] args) {
        List<Line> myLines = List.of(
                new Line(1, "jhf"),
                new Line(2, "jhfjh"),
                new Line(3, "jhfjhdfk"),
                new Line(4, "jhfjhdfkjdf"));
        List<Line> filtredMyLines = myLines.stream()
                .filter(line -> line.words().length() > 5)
                .toList();
        System.out.println(filtredMyLines);
    }
}
