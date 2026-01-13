import java.util.Scanner;
class ATMSimulator{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double balance = 10000.99;
		
		System.out.print("Eneter your withdraw amount in :: ");
		float withdraw = sc.nextFloat();
		
		int process_withdraw = (int)withdraw;//wrong casting
		double process_withdraw1 = (double)withdraw;//correct casting
		
		balance -= process_withdraw;
		System.out.println("wrong casting balance " + process_withdraw);
		System.out.println("correct casting balance " + process_withdraw1);
		System.out.println("After withdraw  balance " + balance);
		
		
		
		
		
	}
}