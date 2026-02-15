package bankinterestcalculator;

import java.util.Scanner;

public class Main {
   

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the principal Amount");
        double principal = sc.nextDouble();
        
        System.out.println("Enter the Number of years");
        int years = sc.nextInt();
        
        double interest = Bank.calculateInterest(principal, years);
 
        System.out.println("Bank Name "+Bank.bankName);
        System.out.println("Principal Amount "+principal);
        System.out.println("Number of Years "+years);
        System.out.println("Interst Amount "+interest);
    
    }
    
}
