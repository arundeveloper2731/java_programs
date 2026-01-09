import java.util.Scanner;

class LibraryManagement{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		
		System.out.print("Enter the total number of books :: ");
		int tot_no_book = sc.nextInt();
		System.out.print("Enter the total number of books Id :: ");
		int tot_no_book_id = sc.nextInt();
		
		String book_name[] = new String[tot_no_book];
		int    book_id[]   = new int[tot_no_book_id];
		
		int choice;
		int count =0;
		
		do
		{
			System.out.println("Enter the choice : \n 1. Add Books \n 2. Display All Books \n 3. Search Book Id \n 4. exit ");
			System.out.print("Choice number :: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				if(choice < book_name.length)
				{
					System.out.print("Enter the "+(count+1)+" Book Name :: ");
					book_name[count] = sc1.nextLine();
					System.out.print("Enter the "+(count+1)+" Book Id Number :: ");
					book_id[count] = sc.nextInt();
					
					count++;
					System.out.println("Book name enter successfull ");
				}
				else
				{
					System.out.println("Book limit reached");
				}
				break;
				case 2:
				for(int i=0;i<count;i++)
				{
					if(i<count)
					{
						System.out.println(" Book Id Number "+book_id[i] + "\n Book name " + book_name[i]);
						
					}
					else{
						System.out.println("Enter Id And Book name is Mismatch");
					}
				}
				break;
				case 3:
				System.out.print("Enter the search Id :: ");
				int search_id = sc.nextInt();
				
				boolean found=false;
				for(int i=0;i<count;i++)
				{
				if(book_id[i] == search_id)
				{
					System.out.print("**** Book Found ***");
					System.out.print("Book Id :: "+ book_id[i]);
					System.out.print("Book name :: "+ book_name[i]);
					found = true;
				}
				else{
					System.out.println("book id is not match");
				}
				}	
				break;
				case 4:
				break;
				default:
				System.out.println("Enter the correct book Id and Book Name.....");
			}
		}while(choice != 3);
		
		
		
		
	}
}