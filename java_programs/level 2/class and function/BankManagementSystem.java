
import java.util.Scanner;
public class BankManagementSystem {
	Scanner sc = new Scanner(System.in);
    float balance = 1000;
	float deposit_amt,withdraw_amt;
	
    public void mainMenu(){
    int choice =0;	
	do
	{
		System.out.println("\n1. Deposite \n2. Withdraw \n3. Didplay Balance\n4. EXIT ");
                System.out.print("Enter the choice :: ");
                choice = sc.nextInt();
                
                switch(choice){
                    case 1:
					deposit();
                    break;
                    case 2:
					withdraw();
                    break;
                    case 3:
					displayBalance();
                    break;
                    case 4:
                        System.out.println("Thank you");
                    break;
                    
                }
		
	}while(choice !=4);
    }
	public void deposit(){
		System.out.print("Enter your Deposite Ammount :: ");
		deposit_amt = sc.nextFloat();
		
		balance = balance + deposit_amt;
		System.out.println("Amount added successfully");
		System.out.println("your current balance " + balance);
	}
	public void withdraw(){
		System.out.print("Enter your withdraw Ammount :: ");
		withdraw_amt = sc.nextFloat();
		
		balance = balance - withdraw_amt; 
		System.out.println("Amount withdraw successfully");
		if(withdraw_amt >= 0)
		{
			System.out.println("Your current balance :: "+ balance);
		}
		else
		{
			System.out.println("Error....");
		}
		
	}
	public void displayBalance(){
		System.out.println("Your current balance :: "+balance);
	}
}
