package scanner;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

    public static int wordCount(String words) {
        // your code
        int result = 1;
        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch == ' ') {
                result++;
            }
        }
        return result;

    }


}
