
package FindDuplicateCharacter;

import java.util.Scanner;


public class HappyNumber 
{
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :: ");
        int num = sc.nextInt();

        if(isHappy(num))
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");

    }
     static boolean isHappy(int num)
    {
        int slow = num;
        int fast = num;

        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    static int sumOfSquares(int n)
    {
        int sum = 0;

        while(n > 0)
        {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }
}
