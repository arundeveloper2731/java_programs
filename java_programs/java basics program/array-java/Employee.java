import java.util.Scanner;

class Employee {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String designation[] = new String[5];
		
		for (int i=0;i<designation.length; i++){
			
			System.out.print("Enter the " + (i+1) + " Employee Designation : ");
			designation[i] = sc.nextLine();
		}
		System.out.println("****** Employee Designation *****");
		
		for(int i=0; i<designation.length; i++){
			
			System.out.println("Designation : " + designation[i]);
		}
		
	}
}