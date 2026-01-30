import java.util.Scanner;
class MainLibrary{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of books :: ");
        int total = sc.nextInt();

        LibraryManagement lm = new LibraryManagement(total);
        lm.librarySystem();
		
	}
}