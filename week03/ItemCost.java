/*
 * COS 201 - Computer Programming I
 * Week 3 Practical 3: Total Cost of Items
 *
 * Student: David Otokhina
 * Matriculation Number: 25/16254
 * Programme: Computer Science
 *
 * Reads an item name, the quantity bought and the unit price,
 * then calculates and displays the total cost.
 */
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;

        System.out.println("\n--- PURCHASE SUMMARY ---");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.printf("Total cost: %.2f%n", totalCost);

        input.close();
    }
}
