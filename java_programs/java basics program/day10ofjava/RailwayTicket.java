import java.util.Scanner;

class RailwayTicket{
	public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the compartment name : ");
		String ticket = sc.next();
		
		switch(ticket){
			case "general":
			System.out.println("Ticket price is 500 ");
			break;
			
			case "sleeper ":
			System.out.println("Ticket price is 1000");
			break;
			case "ac 3 tire ":
			System.out.println("Ticket price is 2000");
			break;
			case "ac 2 tire ":
			System.out.println("Ticket price is 3000");
			break;
			case "first class ":
			System.out.println("Ticket price is 5000");
			break;
			
			default:
			System.out.println("invalid");
			
		}
	}
}