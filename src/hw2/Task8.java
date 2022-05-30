package hw2;

public class Task8 {
    public static void main(String[] args) {
        int q = 0;
        int w = 0;
        float e = 0;
        for (int i = 0;i<=9;i++){
            e = i % 2;
            if (e == 1) {
                q = q + i;
            }
            else {
                w = w + i;
            }
        }
        System.out.println("summ of pairs = " + w);
        System.out.println("summ of pairs = " + q);
        System.out.println("summ of pairs or not pairs = " + (q+w));
    }
}
