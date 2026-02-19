package shoppingcartinnerclass;

import java.util.Scanner;

class ShoppingCart {

    String cartOwnerName;

    // Inner Class
    class Item {
        String itemName;
        int quantity;
        double[] priceHistory;
        double latestPrice;
        double totalBill;

        // Add Item Details
        void addItem(String name, int qty) {
            itemName = name;
            quantity = qty;
        }

        // Update Price History
        void updatePriceHistory(int count, Scanner sc) {
            priceHistory = new double[count];

            System.out.println("Enter Prices:");
            for (int i = 0; i < count; i++) {
                priceHistory[i] = sc.nextDouble();
            }

            // Latest price = last element
            latestPrice = priceHistory[count - 1];
        }

        // Calculate Total Bill
        void calculateTotal() {
            totalBill = latestPrice * quantity;
        }

        // Display Details
        void displayCart() {

            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + itemName);
            System.out.println("Quantity: " + quantity);

            System.out.print("Price History: ");
            for (double price : priceHistory) {
                System.out.print(price + " ");
            }

            System.out.println("\nLatest Price: " + latestPrice);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.Item item = cart.new Item();

        int choice;

        do {
            System.out.println("\n===== SHOPPING CART MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Update Price History");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Display Cart Details");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Cart Owner Name: ");
                    cart.cartOwnerName = sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    item.addItem(name, qty);
                    break;

                case 2:
                    System.out.print("Enter Number of Price Updates: ");
                    int count = sc.nextInt();
                    item.updatePriceHistory(count, sc);
                    break;

                case 3:
                    item.calculateTotal();
                    System.out.println("Total Bill Calculated Successfully!");
                    break;

                case 4:
                    item.displayCart();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

       
    }
}
