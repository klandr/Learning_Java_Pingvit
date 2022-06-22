package hw8;

public class task_1 {
    static int myDivide(int a, int b) {

        if (b != 0) {
            int x;
            x = a / b;
            return x;
        } else {
            System.out.println("ay yai yai your mum don't afford you divide on 0  ");
            return b; // i don't understand for what this return
        }
    }

    public static void main(String[] args) {
        System.out.println(myDivide(6, 2));
        System.out.println(myDivide(7, 0));

    }
}
