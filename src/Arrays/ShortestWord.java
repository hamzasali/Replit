package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW
// String shortWord = "";

//         for (String each : str) {
//             if (each.length() < shortWord.length()) {
//                 shortWord = (each);
//             }
//         }
//         System.out.println(shortWord);

        String[] words = str.split(", ");
        String shortWords = "";

        for (String each : words) {
            if (each.length() < shortWords.length()) {
                shortWords = each;
            }
        }
        System.out.println(shortWords);

    }
}

