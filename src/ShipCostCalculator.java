
import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shipping = 0;
        double total = 0;
        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            price = in.nextDouble();
            in.nextLine();

            if (price >= 100) {
                shipping = 0;
            } else {
                shipping = price * 0.02;
            }

            total = price + shipping;

            System.out.println("Shipping cost: $" + shipping);
            System.out.println("Total cost: $" + total);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Run the program again with a valid number!");
        }
    }
}
