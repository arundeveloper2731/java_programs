import java.util.Scanner;

class EmployeeManagement{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.print("Enter the total Number of Employees :: ");
		int tot_no_emp = sc.nextInt();
		String emp[] = new String[tot_no_emp];
		
		int index = 0;
		int choice;
		do
		{
			System.out.println("Enter the choice  \n 1. Add Employee name \n 2. List of All employees \n 3. Exit ");
			System.out.print("Enter the choice number :: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				if(choice < emp.length)
				{
					System.out.print("Enter the "+(index +1)+" Employee Name :: ");
					emp[index]=sc1.nextLine();
					index++;
				}
				else
				{
					System.out.println("Employee list is full");
				}
				break;
				case 2:
				System.out.println("****Employee list******");
				for(int i=0;i<emp.length;i++){
					if(emp[i] != null ){
						System.out.println(emp[i] );
					}
				}
				break;
				case 3:
				break;
				default:
				{
					System.out.println("enter the correct option");
				}
			}
		}while(choice != 3);
	}
}