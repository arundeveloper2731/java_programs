package palindromechecker;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Sentence : ");
        String sentence = sc.nextLine();
        String reversed = "" ;
        for(int i=sentence.length()-1;i>=0;i--){
            
            reversed += sentence.charAt(i);
        }
        if(sentence.equals(reversed)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
    }
    
}
