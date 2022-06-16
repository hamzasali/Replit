package scanner;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW
        String guestList = "Guests' list: ";
        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Please enter the guest's name:");
            String name = input.nextLine();
            guestList += name;

            System.out.println("Do you want to enter another guest's name?");
            answer = input.nextLine().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid input. yes/no ");
                answer = input.nextLine().toLowerCase();
            }
            if (answer.equals("yes")) {
                guestList += ", ";
            }

        }

        System.out.println(guestList);

    }
}
