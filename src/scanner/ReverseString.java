package scanner;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String input){
        //WRITE YOUR CODE BELOW:

        String result = "";
        for(int i = input.length()-1; i >= 0; i--){
            char ch = input.charAt(i);
            result+=ch;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(reverse(in.next()));
    }
}
