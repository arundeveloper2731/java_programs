import java.util.Scanner;

class AgesArray{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the length : ");
		int len = sc.nextInt();
		
		int age[] = new int[len];
		
		for(int i =0; i<age.length;i++){
			
			System.out.print("Enter age of " +(i+1)+" person : ");
			age[i]=sc.nextInt();
		}
		
		System.out.println("******************");
		for(int i=0;i<age.length;i++){
			
			System.out.println("People Age : "+age[i]);
		}
		
		
		
		
		
	}
}