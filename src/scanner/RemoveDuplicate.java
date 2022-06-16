package scanner;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
        in.close();
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        int count = 0;
        String letter = "";
        String result = "";
        for(int i =0; i< str.length();i++){
            char ch = str.charAt(i);
            if(str.contains(""+ch)){
                count++;
            }

        }
        result+=count;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!letter.contains(""+ch)){
                letter+=ch;

            }

        }
        result+=letter;
        return result;
    }
}
