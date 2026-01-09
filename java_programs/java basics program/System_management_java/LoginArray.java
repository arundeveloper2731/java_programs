import java.util.Scanner;

class LoginArray{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		String user_name[] = new String[10];
		String password[] = new String[8];
		
		int index =0;
		
		int choice=0;
		do{
			System.out.println("Enter your choice ::  \n1. Registration \n2. login \n3.Exit");
			System.out.print("Enter the choice number :: ");
			choice = sc.nextInt();
			
		switch(choice)
		{
			case 1:
			if(index < user_name.length)
			{
				System.out.print("Enter the username :: ");
				user_name[index] = sc1.nextLine();
				
				System.out.print("enter the password :: ");
				password[index] = sc1.nextLine() ;
				
				index++;
				System.out.println("Registration successful ");
			}
			else
			{
				System.out.println("User limit reached");
			}
			break;
			case 2:
				System.out.println("Enter username: ");
                String login_User = sc1.nextLine();

                System.out.println("Enter password: ");
                String login_Pass = sc1.nextLine();

                boolean found = false;

                for (int i = 0; i < index; i++)
				{
                    if (user_name[i].equals(login_User) && password[i].equals(login_Pass)) 
					{
                       found = true;
                   
                    }
                }

                    if (found) {
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid username or password!");
                    }
			break;
			case 3:
			break;
			default:
			{
			System.out.println("enter the correct option");
			}
		}
			
			
			
		}while(choice != 3);
		
	
	}

}