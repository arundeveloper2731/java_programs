package ordersystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ORDER MENU =====");
            System.out.println("1. Show Order Status");
            System.out.println("2. Check if Order is Completed");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Order Status:");
                    for (OrderStatus status : OrderStatus.values()) {
                        System.out.println(status);
                    }
                    break;

                case 2:
                    System.out.print("Enter Order Status: ");
                    String input = sc.next().toUpperCase();

                    try {
                        OrderStatus status = OrderStatus.valueOf(input);

                        if (status.Completed()) {
                            System.out.println(status + " - Order is Completed.");
                        } else {
                            System.out.println(status + " - Order is NOT Completed.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Order Status!");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

    
    }
    
    
}
