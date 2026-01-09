import java.util.Scanner;

class Vowel{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Character ; ");
	char vowel = sc.next().charAt(0);
	
	switch (vowel)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	System.out.println("It is Vowel");
	break;
	default:
	System.out.println("It is Consonant");
	}
		
		
		
		
	}
}