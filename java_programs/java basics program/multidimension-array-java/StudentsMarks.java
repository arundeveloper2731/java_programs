import java.util.Scanner;

class StudentsMarks{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int mark[][] = new int[3][3];
		//user input
		for (int i=0; i<mark.length; i++){
			for(int j=0; j<mark[i].length; j++){
				
				System.out.print("Enter the " + (i+1) + ","+ (j+1) + " Student mark :: ");
				 mark[i][j] = sc.nextInt();
			}
		}
		//print output
		
		System.out.println("***Students marks****");
		
		for(int i=0 ;i<mark.length; i++){
			for(int j=0; j<mark[i].length; j++){
				System.out.print(mark[i][j] + "  ");
			}
			System.out.println();
		}
	
	
	
	
	
	}
	
}