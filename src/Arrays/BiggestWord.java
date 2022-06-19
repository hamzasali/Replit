package Arrays;

import java.util.Scanner;

public class BiggestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
//        Scanner input = new Scanner(System.in);
//        String[] words = new String[5];
//        for(int i = 0; i < 5;  i++) {
//            words[i] = input.nextLine();
//        }
        //WRITE YOUR CODE BELOW

        String[] words = {"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"};

        String bigWord = "";

        for (String each : words) {
            if (each.length() > bigWord.length()) {
                bigWord = (each);
            }
        }
        System.out.println(bigWord);
    }
}
