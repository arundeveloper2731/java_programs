
package com.mycompany.bankacc;

import java.util.Scanner;

public class BankAcc {

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000); 

        int choice;

        do {
            System.out.println("\n--- Bank Menu ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 3:
                    System.out.println("Balance: " + account.checkBalance());
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    
    }
}
