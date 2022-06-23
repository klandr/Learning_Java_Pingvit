package hw8.task_3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.

public class task_3 {
    public static void main(String[] args) { //without own Exception
        Scanner scanNumber = new Scanner(System.in);

        try {
            System.out.println("Enter number between 0 and 5, please");
            int numberSizeArray = scanNumber.nextInt();
            int[] myArray = new int[numberSizeArray];
            System.out.println(Arrays.toString(myArray));
            System.out.println("thanks");
            System.out.println(numberSizeArray);
        } catch (InputMismatchException e) {

            System.out.println("your sign isn't a number");
        }


    }


}
