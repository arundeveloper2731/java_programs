package atmsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        AccountBalance acc = new AccountBalance(0, 0);
       int choice;
       do{
           System.out.print("1.Deposite\n2.Withdraw\n3.Display Balance\n4.Exit\nEnter your choice:");
           choice =sc.nextInt();
           
           try{
               switch(choice){
                   case 1:
                       System.out.print("Enter Amount : ");
                       double deposite_amt = sc.nextDouble();
                       acc.deposite(deposite_amt);
                       break;
                   case 2:
                       System.out.print("Enter withdraw amount : ");
                       double withdraw_amt = sc.nextDouble();
                       acc.withdraw(withdraw_amt);
                       break;
                   case 3:
                       acc.displayBalance();
                       break;
                   case 4:
                       System.out.println("Thank you");
                       break;
               }
           }
           catch (InsufficientBalance ex){
                    System.out.println("Exception Caught: " + ex.getMessage());

           }
           
           
       }while(choice!=4);
    }
    
}
