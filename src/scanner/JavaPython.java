package scanner;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW
        scan.close();


        int countJava = 0;
        int countPython = 0;
        boolean result = false;
        while (sentence.contains("java")) {
            countJava++;
            sentence = sentence.replaceFirst("java", "");
        }
        while (sentence.contains("python")) {
            countPython++;
            sentence = sentence.replaceFirst("python", "");
        }
        if (countJava == countPython) {
            result = true;
        }
        System.out.println(countJava);
        System.out.println(countPython);
        System.out.println(result);
    }
}
