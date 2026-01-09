import java.util.Scanner;

class CharName{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		char name[][] = new char[4][5];
		
		for(int i=0; i<name.length; i++){
			for (int j=0; j< name[i].length; j++){
				System.out.print("Enter the "+i+","+j+" Character :: ");
				name[i][j]  = sc.next().charAt(0);
			}
		}
		
		for(int i=0; i<name.length; i++){
			for (int j=0; j< name[i].length; j++){
				System.out.print(name[i][j] +"  ");
			}
			System.out.println();
		}
		
	}
}