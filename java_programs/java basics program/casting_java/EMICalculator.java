import java.util.Scanner;

class EMICalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal Amount :: ");
		long principal_amt =  sc.nextLong();
		
		System.out.print("Enter the interst Amount :: ");
		float rate_interst = sc.nextFloat();
		
		System.out.print("Enter the years of emi :: ");
		int years = sc.nextInt();
		
		int month = years * 12; 
		
		float month_rate = rate_interst/1200;
		
		// wrong casting
		int wrong_rate = (int)month_rate;
		double wrong_rate1 = (double)wrong_rate;
		
		
        double emiWrong = (principal_amt * wrong_rate1 * Math.pow(1 + wrong_rate1, month)) / (Math.pow(1 + wrong_rate1, month) - 1);
		System.out.println("EMI With wrong casting :: "+emiWrong);
		
		//correct casting
		double correct_rate = (double)month_rate;
        double emiCorrect = (principal_amt * correct_rate * Math.pow(1 + correct_rate, month)) / (Math.pow(1 + correct_rate, month) - 1);
		System.out.println("EMI With correct casting :: "+emiCorrect);
		 


	}
}