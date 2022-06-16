package Arrays;

import java.util.*;

public class FirstAndLastChars {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {"apple", "why", "by", "apple", "note"};

        //WRITE YOUR CODE BELOW:

//        for (int i = 0; i < words.length; i++) {
//            char ch = words[i].charAt(0);
//            char ch1 = words[i].charAt(words[i].length() - 1);
//
//
//            System.out.println(ch+""+ch1);
//        }

        for (int i = 0; i < words.length; i++) {
            String str = words[i].substring(0, 1);
            String str1 = words[i].substring(words[i].length() - 1);
            System.out.println(str+str1);
        }


    }
}
