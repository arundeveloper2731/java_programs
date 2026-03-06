package com.mycompany.stringoperation;

import java.util.Scanner;

public class StringOperation {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        StringOperations str = new StringOperations();
        int choice;
        do{
            System.out.println("\n----String operation Menu-------");
            System.out.println("\n1.Find Length \n2.Reverse String \n3.Covert to UpperCase \n4.Exit");
            System.out.println("ENter the choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 4){
                System.out.println("Thank you...");
                break;
            }
            
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            switch(choice){

                case 1:
                    int len = str.getLength(input);
                    System.out.println("Length: " + len);
                    break;

                case 2:
                    String rev = str.reverseString(input);
                    System.out.println("Reverse: " + rev);
                    break;

                case 3:
                    String upper = str.toUpper(input);
                    System.out.println("Uppercase: " + upper);
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            
        }while(choice !=4);
    }
}
