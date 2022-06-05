package hw3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);             //initial  scaner
        System.out.println("write first number of massive, please");// part of
        Integer firstNumber  = scanner.nextInt();                   // 1 number


        System.out.println("write second number of massive, please");//part of
        Integer secondNumber  = scanner.nextInt();                   // 2 number

        System.out.println("write second number of massive, please");//part of
        Integer thirdNumber  = scanner.nextInt();                   // 3 number

        int[] array = new int[3];

        array[0] = firstNumber;
        array[1] = secondNumber;
        array[2] = thirdNumber;

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);

    }
}
