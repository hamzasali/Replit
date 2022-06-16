package scanner;

import java.util.Scanner;

public class ShoppingListLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String shoppingList = "";
        String name;
        double price;
        int quantity;
        double totalPriceItem = 0;
        double totalCost = 0;

        int num = 1;

        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("Enter the name of item " + num);
            name = input.nextLine();

            System.out.println("Enter the price of the " + name);
            price = input.nextDouble();

            System.out.println("How many " + name + " will you buy?");
            quantity = input.nextInt();

            totalPriceItem = (quantity * price);
            shoppingList += name + " x " + quantity + " - $" + totalPriceItem + "\n";


            System.out.println("Do you want to add more items to the shopping list?");
            answer = input.next();
            input.nextLine();


            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.out.println("Invalid input. yes/no");
                answer = input.next();
            }
            num++;
            totalCost += (quantity * price);

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("SHOPPING LIST:");
                System.out.print(shoppingList);
                System.out.println("Total cost: $" + totalCost);
            }


        }

        input.close();

    }
}
