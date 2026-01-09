import java .util.Scanner;

class VowelsChar{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String vowels[] = new String[5];
		
		for (int i=0;i<vowels.length; i++){
			
			System.out.print("Enter characters of " + (i+1) + " vowel : ");
			vowels[i] = sc.nextLine();
		}
		System.out.println("****** Vowels *****");
		
		for(int i=0; i<vowels.length; i++){
			
			System.out.println("Vowel letter : " + vowels[i]);
		}
		
	}
}