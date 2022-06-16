package scanner;


import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:

            Scanner scan = new Scanner(System.in);

            System.out.println("Enter Item1 and its price:");
            String item1 = scan.nextLine();
            double price1 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter Item2 and its price:");
            String item2 = scan.nextLine();
            double price2 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter Item3 and its price:");
            String item3 = scan.nextLine();
            double price3 = scan.nextDouble();


            double totalPrice = price1 + price2 + price3;

            System.out.println("Item1: "+item1+" Price: "+price1+
                    ", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3);
            System.out.println("Total price: "+ totalPrice);

            scan.close();
        }
}

