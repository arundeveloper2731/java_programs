package reverseeachword;

import java.util.Scanner;

public class ReverseEachWord {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Sentence : ");
        String sentence = sc.nextLine();
        
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder(words[i]);
            result = result + sb.reverse().toString() + " ";
        }

        System.out.println("Modified Sentence: " + result.trim());
  
        
    }
}