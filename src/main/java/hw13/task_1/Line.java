package hw13.task_1;
//Task 1. (filter)
//Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов

import java.util.List;

public record Line(int id, String words) {
    public static void main(String[] args) {
        List<Line> myLines = List.of();
    }
}
