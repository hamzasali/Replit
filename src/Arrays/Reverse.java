package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        String[] split = sentence.split(" ");
        String reverse = "";

        for(int i = split.length-1, k=0; i >= 0; i--, k++){

            reverse+=split[i]+" ";

        }
        System.out.println(reverse.trim());



    }
}
