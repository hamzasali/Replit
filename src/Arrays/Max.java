package Arrays;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW

        int max = nums[0];
        for (int each : nums) {
            if(each>max){
                max = each;
            }
        }
        System.out.println(max);
    }
}
