import java.util.Scanner;

class PeopleHeight{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double heightMeters[] = new double[5];
		
		for (int i=0;i<heightMeters.length;i++){
			System.out.print("Enter height of " + (i+1) + " person : ");
			 heightMeters[i] = sc.nextDouble();			
		}
		
		System.out.println("***Height of people****");
		for (int i=0; i<heightMeters.length; i++){	
			double heightCm = heightMeters[i] * 100;
			System.out.println("people height " + heightCm + " cm ");
		}

	}
}