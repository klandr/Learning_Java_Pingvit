package hw13.task_2;

import hw13.task_1.Line;

import java.util.List;

//Task 2 (max, String::compareTo / Comparator.naturalOrder())
//Есть коллекция строк, нужно найти строку с максимальной длинной.
public class Task2 {
    public static void main(String[] args) {
        List<Line> myLines = List.of(
                new Line(1, "jhf"),
                new Line(2, "jhfjh"),
                new Line(3, "jhfjhdfk"),
                new Line(4, "jhfjhdfkjdf"));
        List<Line> filtredMyLines = myLines.stream()
              //  .filter(line -> line.words().length() > line.words().)
                .toList();
        System.out.println(filtredMyLines);
    }
}
