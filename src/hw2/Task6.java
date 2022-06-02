package hw2;

//+-
public class Task6 {
    public static void main(String[] args) {
        float z; //остаток от деления - это целое число
        for (int i = 2; i <= 100; i++) {
            z = i % 2; //можно написать без использования переменной 
            if (z == 0) {
                System.out.println(i);
            }
        }
    }
}
