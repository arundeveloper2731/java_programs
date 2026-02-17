package smartloginsystem;

import java.util.Scanner;

public class LoginService 
{
    private final String UserName = "admin";
    private final String Password = "1234";
    private int attemptsLeft = 3;

    Scanner sc = new Scanner(System.in);

    public void login() throws AccountLockedException {

        while (attemptsLeft > 0) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(UserName) && password.equals(Password)) {
                System.out.println("Login Successful!");
                attemptsLeft = 3; // Reset after success
                return;  // Exit method after success
            } else {
                attemptsLeft--;
                System.out.println("Invalid Credentials!");
                System.out.println("Remaining Attempts: " + attemptsLeft);

                if (attemptsLeft == 0) {
                    throw new AccountLockedException(
                            "Account Locked Due To 3 Failed Attempts!");
                }
            }
        }
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }
    
}
