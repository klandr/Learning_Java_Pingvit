package hw6.task_1;

import java.util.Arrays;

//Task 1
//Написать рекурсивную функцию, которая бы перебирала все элементы массива и выводила их на экран
public class Recursion {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 2, 4, 5, 3, 2, 9};
        System.out.println(numbers.length);
        int proba_lenght = numbers.length;
        System.out.println(proba_lenght);
        System.out.println("numbers[0] = " + numbers[0]);
        int x = 0;
        System.out.println("x default = " + x);
        counting(x);
    }

    private static int counting(int x) {
        System.out.println("helo from counting x = " + x);
        //System.out.println(numbers[0]);
        if (x == 3) {
            return x;
        }
    return counting(++x);
    }

}
