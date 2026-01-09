import java.util.Scanner;
class StudentResult{
	
	int sub_1,sub_2,sub_3;
	int total_marks;
	double percentage;
	
	Scanner sc = new Scanner(System.in);
	//Subject mark
	void inputMarks(){
		System.out.print("Enter the Sub1 Mark :: ");
		sub_1 = sc.nextInt();
		System.out.print("Enter the Sub2 Mark :: ");
		sub_2 = sc.nextInt();
		System.out.print("Enter the Sub3 Mark :: ");
		sub_3 = sc.nextInt();
	}
	//Subject Total
	void calculateTotal(){
		total_marks = sub_1+sub_2+sub_3;
		System.out.println("Total Marks " + total_marks);
	}
	//subject percentage
	void calculatePercentage(){
		percentage = (total_marks)/3.0;
		System.out.println("Percentage " +percentage);
	}
	//subject result
	void dispalyResult(){
		if(sub_1 >= 40 && sub_2 >= 40 && sub_3 >= 40){
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}
	}
	//subject grade
	void displayGrade()
	{
		//if one subject fail
		if(sub_1 <40 || sub_2<40 || sub_3 < 40){
			System.out.println("your grade is F ");
			return;
		}
		// all subject pass
		if(percentage >= 75){
			System.out.println("Your grade is A");
		}
		else if ( percentage >=60){
			System.out.println("Your grade is B");
		}
		else if( percentage >=40){
			System.out.println("Your grade is C");
		}
		
		else{
			System.out.println("Enter the correct mark");
		}
		
	}
	//main menu for subject
	public static void main(String[] args){
		
		StudentResult std_res = new StudentResult();
		std_res.inputMarks();
		
		int choice;
		do{
			System.out.println("Enter the choice : \n 1. Display Total \n 2. Display Percentage \n 3. Dispaly Result \n 4. Display Grade \n 5.Exit " );
			System.out.print("Enter the choice number :: ");
			choice = std_res.sc.nextInt();
			
			switch(choice){
				case 1:
				std_res.calculateTotal();
				break;
				
				case 2:
				std_res.calculateTotal();
				std_res.calculatePercentage();
				break;
				
				case 3:
				std_res.calculateTotal();
				std_res.calculatePercentage();
				std_res.dispalyResult();
				break;
				
				case 4:
				std_res.calculateTotal();
				std_res.calculatePercentage();
				std_res.dispalyResult();
				std_res.displayGrade();
				break;
				
				case 5:
				System.out.println("Exit the program...");
				break;
				
				default:
				System.out.println("Enter the correct choice......");
			}
		}while(choice != 5);
	}
	
}