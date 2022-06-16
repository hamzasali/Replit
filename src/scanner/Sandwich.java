package scanner;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if(first != last){
            System.out.println(str.substring(first + 5, last));
        }else{
            System.out.println("nothing");
        }

    }
}