import java.util.Scanner;

class StudentsList{
	public static void main(String[] args){
		
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		
		String stdname[] = new String[10];
						
			int choice;
			int index=0;
			int i=0;
		do{
			System.out.println("Enter your choice :: ");
			System.out.println("1. Add Student ");
			System.out.println("2. See your StudentList ");
			System.out.println("3. Exit List ");
			
			System.out.print("Enter the choice number :: ");
			choice = sc1.nextInt();
			switch(choice)
			{
				
				case 1:
				if(choice < 3){
				System.out.print("Enter the " +(i+1)+ " Student name :: ");
				stdname[index] = sc2.nextLine();
				index++;
				}
				else{
					System.out.println("STD list full ");
				}
				break;
				case 2:
				System.out.println("student list ");
				for( i=0;i<index;i++){
				System.out.println(stdname[i]);
				}
				break;
				case 3:
				System.out.println("exit the program");
			}
		}while(choice != 3);
		
		
		
		
		
	}
}