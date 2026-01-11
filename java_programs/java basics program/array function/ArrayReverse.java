import java.util.Scanner;

class ArrayReverse
{
	public static void main(String[] args)
	{
		ArrayReverse arev = new ArrayReverse();
		arev.mainMenu();
	}
	//glopal declar
	int choice;
	
	Scanner sc=new Scanner(System.in);
	int num[] = new int[10];
	 boolean stored = false;
	
	void mainMenu()
	{
		
		do
		{
			System.out.println("Enter the choice \n1. Enter Numbers \n2. Display Numbers \n3. Display numbers in reverse order \n4. Exit ");
			System.out.print("Enter the choice number :: ");
		
		choice = sc.nextInt();
			switch(choice){
				case 1:
				enter_num(num);
				stored = true;
				break;
				case 2:
				display_num(num);
				break;
				case 3:
				display_rev_num(num);
				break;
				case 4:
				System.out.println("Exit the program.....");
				break;
				default:
				{
					System.out.println("enter correct option....");
				}
			}
		}while(choice !=4 );
	}
	
	void enter_num(int num[])
	{
		for(int i=0;i<10;i++){
			System.out.print("Enter the "+(i+1)+ " Number : ");
			num[i] = sc.nextInt();
		}
	}
	void display_num(int num[])
	{
		for(int i=0;i<10;i++){
			System.out.print(num[i]+" ");
		}
	}
	void display_rev_num(int num[])
	{
		for(int i=9;i>0;i--){
			System.out.print(num[i]+" ");
		}
	}
}