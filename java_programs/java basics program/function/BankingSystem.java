import java.util.Scanner;

class BankingSystem{
	
	float balance=0;
	float deposit_amt,withdraw_amt;
	
	Scanner sc = new Scanner(System.in);
	
	void inputBalance(){
		System.out.print("Enter your Initial Account Balance :: ");
		balance = sc.nextFloat();
	}
	void deposit(){
		System.out.print("Enter your Deposite Ammount :: ");
		deposit_amt = sc.nextFloat();
		
		balance = balance + deposit_amt;
		System.out.println("Amount added successfully");
		System.out.println("your current balance " + balance);
	}
	void withdraw(){
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
	void dispalyBalance(){
		System.out.println("Your current balance :: "+balance);
	}
	
	public static void main(String[] args)
	{
		BankingSystem bank = new BankingSystem();
		
		bank.inputBalance();
		int choice = 0;
		do
		{
			System.out.println("Enter your choice \n1. Deposite \n2. Withdraw \n3. CheckBalance \n4. exit");
			System.out.print("choice number :: ");
			choice = bank.sc.nextInt();
			
			switch(choice)
			{
				case 1:
				bank.deposit();
				break;
				case 2:
				bank.withdraw();
				break;
				case 3:
				bank.dispalyBalance();
				break;
				case 4:
				System.out.println("exit the program...");
				break;
				default:
				{
					System.out.println("enter the correct chooice....");
				}
			}
		
		
		}while(choice != 4);
	}
	
	
}