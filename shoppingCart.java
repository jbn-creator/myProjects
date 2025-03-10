import java.util.Scanner;

public class shoppingCart{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;

        System.out.print("Enter the name of the item: ");
        item = scanner.nextLine();

        System.out.print("Enter the price of the " + item + " : ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity of " + item + " you would like to buy: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println(" ");
        System.out.println("Your purchase summary: ");
        System.out.println(" ");
        
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is £" + total + " Thank you for shopping with us!");
        scanner.close();

    }

}