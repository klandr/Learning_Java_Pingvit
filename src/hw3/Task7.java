package hw3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int summEven = 0;

        int[] array = {2,4,9,3,8,1,6,2};
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                summEven = summEven + 1;
            }
        }
        System.out.println("in given massive of "+array.length+" numbers");
        System.out.println("is " + summEven + " even");

        int a = 0;
        int sumEvenEven;
        int[] evenArray = new int[summEven];

        for (int q = 0; q < array.length; q++){
            if (array[q] % 2 == 0) {
                evenArray[a] = array[q];
                a = a +1;
                }
        }
        System.out.println("new massive is " + Arrays.toString(evenArray));
    }
}
