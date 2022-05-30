package hw2;

public class Task5 {
    public static void main(String[] args) {
        double q = 2.54;
        double w = 0;
        for (int i = 1; i <= 20; i++) {
            w = q * i;
            System.out.println(i + " inches = " + w + " cm");
        }
    }
}
