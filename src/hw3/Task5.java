package hw3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int myBuffer;
        int[] array = {0,1,2,3,4}; // init array 0 1 2 3
        System.out.println(Arrays.toString(array) + " <<<<<"); //print it for visualising in past

        myBuffer = array[0];//first number to buffer
        array[0] = array[4];//first number <-- last number
        array[4] = myBuffer;//lash number <-- buffer
                            //array [2] stay array [2]
        myBuffer = array[1];// lefr number to buffer
        array[1] = array[3];// left number <-- right number
        array[3] = myBuffer;// right number <-- buffer

        System.out.println(Arrays.toString(array) + " >>>>>"); // youhhu we can see result what was what we have after all
    }
}
