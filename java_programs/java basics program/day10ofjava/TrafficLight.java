import java.util.Scanner;

class TrafficLight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Traffic light colour ; ");
		String light= sc.next();
		
		switch(light){
			
			case "red":
			System.out.println("Stop");
			break;
			case "yellow":
			System.out.println("wait");
			break;
			case "green":
			System.out.println("Go");
			break;
			
			default:
			System.out.println("Invalid");
		}
		
		
	}
}