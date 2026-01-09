import java .util.Scanner;

class MovieName {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		String movie[] = new String[4];
		
		for (int i=0;i<movie.length; i++){
			
			System.out.print("Enter the " + (i+1) + " Movie Name : ");
			movie[i] = sc.nextLine();
		}
		System.out.println("****** Favorite movie names *****");
		
		for(int i=0; i<movie.length; i++){
			
			System.out.println("Movie : " + movie[i]);
		}
		
	}
}