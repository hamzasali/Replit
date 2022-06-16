package scanner;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        email = email.toUpperCase();
        scan.close();


        String firstName = email.substring(0, email.indexOf('_'));
        String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        System.out.println("First name: " + firstName.substring(0, 1) + firstName.substring(1).toLowerCase());
        System.out.println("Last name: " + lastName.substring(0, 1) + lastName.substring(1).toLowerCase());
        System.out.println("Domain: " + domain.substring(0, 1) + domain.substring(1).toLowerCase());


    }
}

