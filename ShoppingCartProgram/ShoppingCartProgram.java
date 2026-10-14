package ShoppingCartProgram;
import java.util.Scanner;
public class ShoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String items;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy?: ");
        items = scanner.nextLine();
        System.out.print("What is the price for each?:  ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?:  ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.print("You have bought " + quantity + " " + items);
        System.out.print("Your total is " + total );
        scanner.close();

    }
}