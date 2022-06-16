package scanner;

import java.util.Scanner;

public class Triples {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW
        scan.close();


        int triples = 0;

        for (int i = 0; i < str.length()-2; i++) {
            char each = str.charAt(i);
            if (each == str.charAt(i + 1) && each == str.charAt(i + 2)) {
                triples++;
            }


        }
        System.out.println(triples);
    }
}
