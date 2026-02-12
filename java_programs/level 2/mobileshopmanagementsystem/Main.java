package mobileshopmanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        MobileStock list = new MobileStock();
        
        int choice;
        
        do
        {
            System.out.println("====Mobile Shop Menu====");
            System.out.println("1.Add Latest Launch\n 2.Add Regular Stock\n 3.Display Mobiles\n 4.Exit\n Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice ){
                case 1:
                    System.out.println("Enter the Mobile Id : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Mobile Brand Name : ");
                    String brandName= sc.nextLine();
                    System.out.println("Enter the Mobile Price : ");
                    double price = sc.nextDouble();
                    
                    list.insertAtHead(id, brandName, price);
        
                    break;
                case 2:
                     System.out.println("Enter the Mobile Id : ");
                    int id1 = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Mobile Brand Name : ");
                    String brandName1= sc.nextLine();
                    System.out.println("Enter the Mobile Price : ");
                    double price1 = sc.nextDouble();
                    
                    list.insertAtTail(id1, brandName1, price1);
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.out.println("Thank you...");
                break;
                default:
                    System.out.println("Invalid chooice...");
                        
            }
            
        }while(choice !=4);
    }
    
}
