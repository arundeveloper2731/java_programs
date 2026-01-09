import java.util.Scanner;

class CitiesName{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String cities[][] = new String[4][3];
		
		for (int i=0; i<cities.length; i++){
			for(int j=0; j<cities[i].length; j++){
				System.out.print("Enter the "+(i+1)+","+(j+1)+" city name :: " );
				cities[i][j] = sc.nextLine();
			}
		}	
		
		System.out.print("****city name ****" );		
		for (int i=0; i<cities.length; i++){
			for(int j=0; j<cities[i].length; j++){
				System.out.print(cities[i][j]+"   " );
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}