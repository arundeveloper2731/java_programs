
package stonepaperscissors;

import java.util.Scanner;

public class Main extends Game{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Main obj = new Main();

        System.out.println("Rock Paper Scissors Game");
        System.out.println("1 -> Rock");
        System.out.println("2 -> Paper");
        System.out.println("3 -> Scissors");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int comChoice = obj.computerChoice();

        System.out.println("Computer Choice: " + comChoice);

        obj.checkWinner(choice, comChoice);
    }
    
}
