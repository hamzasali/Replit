package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static int[] mergR(int[] a, int[] b) {

        int[] length = new int[a.length + b.length];

        int z = 0;

        for (int i = 0; i < a.length; i++, z++) {
            length[z] = a[i];
        }
        for (int i = 0; i < b.length; i++, z++) {
            length[z] = b[i];
        }
        return length;


    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];
        int[] nums2 = new int[in.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));
    }
}
