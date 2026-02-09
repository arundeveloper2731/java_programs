package shoppingcart;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        ShoppingCart cart = new ShoppingCart();
        int choice;
        do
        {
            System.out.println("\n1. Add Product to Cart\n2.View Cart Items\n3. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.print("Enter the ProductId : ");
                    int productId = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Enter the Product Name : ");
                    String productName = sc.nextLine();
                    
                    System.out.print("Enter the Price : ");
                    double price = sc.nextDouble();
                    
                    cart.addItem(productId,productName,price);
                    break;
                case 2:
                    cart.cartItem();
                    
                    break;
                case  3:
                    System.out.println("Thank You for Ordering");
                    break;
                default:
                    System.out.println("Invalid choice...");
            }
            
            
        }while(choice !=3);
    }
    
}
