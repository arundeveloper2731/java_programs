
package online_food_order;

import java.util.Scanner;


public class Main {

    Scanner sc=new Scanner(System.in);
    FoodOrder order = null;
    public static void main(String[] args) 
    {
       Main ma = new Main();
       
       int choice;
       
       do
       {
           System.out.println("\n-----Online Food order System---");
           System.out.println("\n1.Place Order \n2.View Bill \n3.Exit");
           System.out.print("Enter the choice :: ");
           choice = ma.sc.nextInt();
           
           switch(choice)
           {
               case 1:
                   ma.placeOrder();
                   break;
               case 2:
                   ma.viewBill();
                   break;
               case 3:
                   System.out.println("Thank you for your order...");
                   break;
               default:
                   System.out.println("Invalid Choice");
           }
           
           
       }while(choice !=3);
              
    }
void placeOrder() {
    sc.nextLine(); // clear buffer

    System.out.print("Enter Customer Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Food Item: ");
    String item = sc.nextLine();

    System.out.print("Enter Price: ");
    double price = sc.nextDouble();

    order = new FoodOrder(name, item, price); // FIXED
    order.placeOrder();
}

        void viewBill(){
            
            if(order != null){
                order.showBill();
            }else{
                System.out.println("No order placed");
            }
        }
    
}
