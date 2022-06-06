package hw3.task_7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        int[] nums = {9, 3, 1, 4, 6};
        int buff;
        boolean repeat = true

        System.out.println(Arrays.toString(nums));

        //for
        for (int i = 0; i < (nums.length-1); i++){
            if (nums[i] > nums[i+1]){
                buff = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = buff;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
