package hw2;

public class Task6 {
    public static void main(String[] args) {
        float z;
        for (int i = 1; i <= 100; i++) {
            z = i % 2;
            if (z == 0) {
                System.out.println(i);
            }
        }
    }
}
