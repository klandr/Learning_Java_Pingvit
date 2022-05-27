package hw2;

public class Task4 {
    public static void main(String[] args) {
        //int i = 1;
        int a = 10; // chyslo A
        int b = 8; // chyslo B
        int d = 0; // dodatkowy parametr summa

        for (int i = 1;  i<=b; i++) {
            d=d+a;
            //System.out.print(a + " * " + i + " = ");
            //System.out.println(d);
        }
        System.out.println(a + " * " + b + " = "+ d);
    }
}
