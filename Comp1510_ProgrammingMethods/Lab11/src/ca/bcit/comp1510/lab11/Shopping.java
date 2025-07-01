/**
 * 
 */
package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * This class is used to test the Transaction class by creating a Transaction object and using user input to add
 * items to their shopping cart.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Shopping {
	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transaction transaction = new Transaction(2); 
        
        System.out.println("Welcome to the Shopping System!");
        System.out.println("You can add items to your cart in two ways:");
        System.out.println("1. Enter item details manually");
        System.out.println("2. Add pre-created Item objects");
        System.out.println();
        
        String choice;
        do {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1 - Add item by entering details");
            System.out.println("2 - Add pre-created item");
            System.out.println("3 - View cart");
            System.out.println("4 - Exit");
            System.out.print("Enter your choice (1-4): ");
            
            choice = scanner.nextLine();
            
            switch (choice) {
                case "1":
                    addItemByDetails(scanner, transaction);
                    break;
                case "2":
                    addPreCreatedItem(transaction);
                    break;
                case "3":
                    System.out.println("\n" + transaction);
                    System.out.println("Total items in cart: " + transaction.getCount());
                    break;
                case "4":
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("4"));
        
        // Final cart summary
        System.out.println("\nFinal Cart Summary:");
        System.out.println(transaction);
        
        scanner.close();
    }
    
    private static void addItemByDetails(Scanner scanner, Transaction transaction) {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter item price: $");
        double price = 0;
        try {
            price = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid price format. Item not added.");
            return;
        }
        
        System.out.print("Enter quantity: ");
        int quantity = 0;
        try {
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format. Item not added.");
            return;
        }
        
        if (price < 0 || quantity <= 0) {
            System.out.println("Price and quantity must be positive. Item not added.");
            return;
        }
        
        transaction.addToCart(name, price, quantity);
        System.out.println("Item added successfully!");
    }
    

    private static void addPreCreatedItem(Transaction transaction) {

        Item[] sampleItems = {
            new Item("Apple", 1.50, 3),
            new Item("Banana", 0.75), 
            new Item("Orange", 2.00, 2),
            new Item("Milk", 4.50),
            new Item("Bread", 3.25, 1)
        };
        
        System.out.println("\nAvailable pre-created items:");
        for (int i = 0; i < sampleItems.length; i++) {
            System.out.println((i + 1) + ". " + sampleItems[i]);
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an item (1-" + sampleItems.length + "): ");
        
        try {
            int itemChoice = Integer.parseInt(scanner.nextLine()) - 1;
            if (itemChoice >= 0 && itemChoice < sampleItems.length) {
                transaction.addToCart(sampleItems[itemChoice]);
                System.out.println("Item added successfully!");
            } else {
                System.out.println("Invalid selection.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input format.");
        }
    }
}