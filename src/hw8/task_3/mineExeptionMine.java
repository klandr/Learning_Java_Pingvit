package hw8.task_3;

import java.util.Arrays;
import java.util.Scanner;

//Попросите пользователя ввести число размера будущего массива, но не больше размера Y (задайте сами).
//Если пользователь ввел число больше Y или отрицательное, то выбросьте собственное исключение и
//попросите пользователя ввести число заново.
public class mineExeptionMine {
    public static void main(String[] args) throws mineExeption {
        Scanner scanNumber = new Scanner(System.in);
        String numberSizeArray = null;// i need another type from int,  which can apply the number and the letter
        int valueOfMassive = 5;

        try {
            System.out.println("Enter number between 0 and " +valueOfMassive+", please");
            numberSizeArray = scanNumber.next();
            int a = Integer.valueOf(numberSizeArray);

            if ((a > valueOfMassive) || (a < 0)) {
                System.out.println("your sign = " + numberSizeArray + " Re Enter number between 0 and " +valueOfMassive+", please");
                return;
            }

            int[] myArray = new int[a];
            System.out.println(Arrays.toString(myArray));
            System.out.println("thanks");

        } catch (NumberFormatException e) {
            try {
                throw new mineExeption("Enter number", numberSizeArray);//i just print 0
            } catch (mineExeption ee) {
                System.out.println("your sign = " + ee.getCheckNumber() + " Enter number between 0 and " +valueOfMassive+", please");
            }
        }
    }
}