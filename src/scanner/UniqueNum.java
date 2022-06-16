package scanner;

import java.util.Scanner;
import java.util.Arrays;

public class UniqueNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array!!!");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        //nums = [2, 5, 5, 6, 3, 6, 9, 34, 3];

        Arrays.sort(nums);

        for (int elements : nums) {

            int frequency = 0;
            for (int each : nums) {
                if (each == elements) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(elements);
            }


        }


    }
      /*  Arrays.sort(inputArray);

        int i = 0;
        while (i < inputArray.length) {
            if (inputArray[i] != inputArray[i + 1]) {
                System.out.println(inputArray[i]);
            }
            i = i + 2;
        }

        System.out.println(-1);
    }*/

}

