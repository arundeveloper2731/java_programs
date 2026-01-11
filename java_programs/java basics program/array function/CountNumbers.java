import java.util.Scanner;

class CountNumbers{
	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		CountNumbers cn = new CountNumbers();
		cn.mainMenu();
	}
	
	int count=0;
	int arr_num[] = new int[10];
	
	void mainMenu()
	{
		int choice;
		
		do
		{
			System.out.println("Enter the Choice \n1. Enter Numbers\n2. Display Numbers\n3. Count Positive Numbers \n4.Count Negative Numbers \n5.Count Zeroes \n6.Exit");
			System.out.print("Choice number :: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				enter_num(arr_num);
				break;
				case 2:
				display_num(arr_num);
				break;
				case 3:
				count_positive_num(arr_num);
				break;
				case 4:
				count_negative_num(arr_num);
				break;
				case 5:
				zero_num(arr_num);
				break;
				case 6:
				System.out.println("Exit the program");
				break;
				default:
				{
				System.out.println("Enter the correct choice.......!");
				}
			}
		}while(choice !=6);
	}
	
	
	void enter_num(int arr_num[])
	{
		for(int i=0; i<10;i++)
			{
				System.out.print("Enter the "+(i+1)+" Numbers :: ");
				arr_num[i] = sc.nextInt();
			}
			System.out.println();
	}
	void display_num(int arr_num[])
	{
		for(int i=0; i<10;i++)
			{
				System.out.print(arr_num[i]+" ");
			}
			System.out.println();
	}
	void count_positive_num(int arr_num[])
	{
		for(int i=0;i<10;i++)
		{
			if(arr_num[i] >0)
				count++;
		}System.out.print("Positive number count :: "+count);
		System.out.println();
	}
	void count_negative_num(int arr_num[])
	{
		for(int i=0;i<10;i++){
			if(arr_num[i]<0)
				count++;
		}System.out.print("Negative number is count :: "+count);
		System.out.println();
	}
	void zero_num(int arr_num[])
	{
		for(int i=0;i<10;i++){
		if(arr_num[i] == 0)
			count++;
		}System.out.print("zero count :: "+count);
		System.out.println();
	}
}