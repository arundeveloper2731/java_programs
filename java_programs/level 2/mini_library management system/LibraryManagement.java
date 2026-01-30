import java.util.Scanner;
class LibraryManagement
{
	Scanner sc=new Scanner(System.in);
	Book[] books;
	int count =0;
	LibraryManagement(int totalBooks) {
        books = new Book[totalBooks];
    }
	
	void librarySystem()
	{				
		int choice=0;
			
		do
		{
			System.out.println("Enter the choice : \n 1. Add Books \n 2. Display All Books \n 3. Borrow a Book  \n 4. Return the book \n 5.exit ");
			System.out.print("Choice number :: ");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				addBook();
				break;
				case 2:
				displayBook();
				break;
				case 3:
				borrowBook();
				break;
				case 4:
				returnBook();
				break;
				case 5:
				System.out.println("Thank You ......");
				break;
				default:
				System.out.println("Enter the correct book Id and Book Name.....");
			}
		}while(choice != 5);
	}
	
	//add book
	void addBook(){
		if(count < books.length)
				{
					System.out.print("Enter the "+(count+1)+" Book Id Number :: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the "+(count+1)+" Book Name :: ");
					String title = sc.nextLine();
					System.out.print("Enter the "+(count+1)+" Author Name :: ");
					String author = sc.nextLine();
					
					books[count] = new Book(id,title,author);
					count++;
					System.out.println("Book name enter successfull ");
				}
				else
				{
					System.out.println("Book limit reached");
				}
	}
	void displayBook() {

    if (count == 0) {
        System.out.println("No books available");
        return;
    }

    for (int i = 0; i < count; i++) {
        System.out.println("Book Id Number : " + books[i].bookId);
        System.out.println("Book Name      : " + books[i].title);
        System.out.println("Author Name    : " + books[i].author);
        System.out.println("Status         : " +
                (books[i].isAvailable ? "Available" : "Borrowed"));
        System.out.println("----------------------------");
    }
}

	void borrowBook() {
        System.out.print("Enter Book ID to borrow: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id) {
                books[i].borrowBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
	void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].bookId == id) {
                books[i].returnBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }
}