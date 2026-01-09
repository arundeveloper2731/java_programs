import java.util.Scanner;

class Multiple{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int num = sc.nextInt();
		
		if(num % 3 ==0){
			System.out.println("Multiple of 3");
		}
		else if(num % 7 == 0){
			System.out.println("multiple of 7");
		}
		else {
			System.out.println("Not a multiple of 3 or 7");
		}
		
		
	}
}