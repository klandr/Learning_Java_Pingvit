package hw8.task_3;

import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class mineExeptionMine {
    public static void main(String[] args) throws mineExeption {
        Scanner scanNumber = new Scanner(System.in);
        String numberSizeArray = null;// i need another type from int,  which can apply the number and the letter

        try {
            System.out.println("Enter number between 0 and 5, please");
            numberSizeArray = scanNumber.next();
            int a = Integer.valueOf(numberSizeArray);
            int[] myArray = new int[a];
            System.out.println(Arrays.toString(myArray));
            // System.out.println(scanNumber);
            System.out.println("thanks");
            System.out.println(numberSizeArray);
        } catch (NumberFormatException e)  {
            throw new mineExeption ("hjfghf", numberSizeArray);//i just print 0
        }

    }
}