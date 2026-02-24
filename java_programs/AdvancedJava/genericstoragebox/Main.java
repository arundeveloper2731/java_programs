
package genericstoragebox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       
       Box<Object> box = new Box<>();
       int choice;
       do{
           System.out.println("\n1.Store Integer\n2.Store String\n3.Display Value\n4.Exit");
           System.out.println("Enter your choice :: ");
           choice = sc.nextInt();
           
           switch(choice){
               case 1:
                   System.out.print("Enter the Integer:");
                   int num = sc.nextInt();
                    sc.nextLine();
                   box.setValue(num);
                   break;
                   
               case 2:
                   System.out.print("Enter the String: ");
                   String str = sc.nextLine();
                   box.setValue(str);
                   break;
               
               case 3:
                   System.out.println("Stored Values : "+box.getValue());
                   break;
                    case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
           }
       }while(choice != 4);
    }
    
}
