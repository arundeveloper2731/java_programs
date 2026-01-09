import java.util.Scanner;

class PrimeNumber{
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your number : ");
		int num = sc.nextInt();
		
		if (num <= 1){
			System.out.println("Not Prime");
		}
		else if ((num ==2) || (num == 3)){
			System.out.println("Prime");
		}
		else if ((num % 2 == 0) || (num%3==0)){
			System.out.println("Not Prime");
			
		}
		else{
			System.out.println("Prime");
			
		}
		
	}
}