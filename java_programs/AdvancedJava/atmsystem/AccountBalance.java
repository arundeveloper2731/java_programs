package atmsystem;

import java.util.Scanner;

public class AccountBalance 
{
    Scanner sc = new Scanner(System.in);
    private double balance = 1000;
    private double deposite_amt;
    private double withdraw_amt;

    public AccountBalance(double deposite_amt, double withdraw_amt) {
        this.deposite_amt = deposite_amt;
        this.withdraw_amt = withdraw_amt;
    }
    
   public  void deposite(double deposite_amt){ 
        balance = deposite_amt+balance;
        System.out.println("Amount added successfully");
	System.out.println("your current balance " + balance);
    }
    public void withdraw(double withdraw_amt) throws InsufficientBalance{
                if(withdraw_amt > balance){
            throw new InsufficientBalance
                    
                    ( "Insufficient Balance! Available Balance: " + balance);
        
                   
        }
        balance = withdraw_amt-balance;
        
    }
         public void displayBalance(){
		System.out.println("Your current balance :: "+balance);
	}   
    
}
