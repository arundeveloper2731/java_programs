
package stonepaperscissors;

import java.util.Random;
import java.util.Scanner;


public class Game 
{
    Scanner sc = new Scanner(System.in);
    int comChoice;
    
    public int computerChoice()
    {
     Random rand = new Random();
     comChoice = rand.nextInt(3)+1;
     return comChoice;
    }
    void checkWinner(int choice,int comChoice)
    {
        if (choice == comChoice) {
            System.out.println("Match Draw!");
        }
        else if (choice == 1 && comChoice == 3 ||
                 choice == 2 && comChoice == 1 ||
                 choice == 3 && comChoice == 2) {

            System.out.println("You Win!");
        }
        else {
            System.out.println("Computer Wins!");
        }

    }
}
