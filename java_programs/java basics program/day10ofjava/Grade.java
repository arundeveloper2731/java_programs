import java.util.Scanner;

class Grade{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Grade : ");
		int grade = sc.next().charAt(0);
		switch (grade){
			case 'A':
			System.out.println("Super ");
			break;
			
			case 'B':
			System.out.println("Good");
			break;

			case 'C':			
			System.out.println("Average");
			break;
			
			case 'D':
			System.out.println("Pass");
			break;
			
			case 'F':
			System.out.println("Fail");
			break;
			
			default:
			System.out.println("ivalid Grade");
			
		}
		
	}
}