package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:

       String[] split = sentence.split(" ");

        for (String each : split) {
            System.out.println(each);
        }

    }
}
