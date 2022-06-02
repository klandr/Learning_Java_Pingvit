package hw2;

//+-
public class Task8 {
    public static void main(String[] args) {
        int q = 0; //название переменной должно что-то значить 
        int w = 0;
        float e = 0;
        //Даны числа от 0 до 100, не до 9
        for (int i = 0;i<=9;i++){
            e = i % 2;
            if (e == 1) {
                q = q + i;
            }
            else {
                w = w + i;
            }
        }
        System.out.println("summ of pairs = " + w); //четные - even, нечетные - odd
        System.out.println("summ of pairs = " + q);
        System.out.println("summ of pairs or not pairs = " + (q+w));
    }
}
