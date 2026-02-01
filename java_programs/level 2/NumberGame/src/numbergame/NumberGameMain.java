
package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGameMain {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran = new Random();
        int hiddennum = ran.nextInt(100)+1;
        
        int guess;
        int attempt = 0;
        int maxattempt =10;
        
      System.out.println("You Have only "+maxattempt+" attempt");
      
      while(attempt < maxattempt){
          System.out.println("Enter the guessing number :: ");
          guess = sc.nextInt();
          attempt++;
          
          if(guess > hiddennum){
              System.out.println(guess +" To High");
          }
          else if(guess < hiddennum ){
              System.out.println(guess + " Too Low ");
          }
          else{
              System.out.println("Correct You Won ");
              System.out.println("your attempt are "+attempt);
          }
      }
    }
    
}
