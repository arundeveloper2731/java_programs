package wordcounter;

import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the Sentence : ");
        String sentence = sc.nextLine();
        
        int wordsCount = 0;
        int vowelsCount=0;
        
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            
            if(ch != ' '){
                wordsCount++;
            }
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                vowelsCount++;
            }
        }
         String[] words = sentence.trim().split("\\s+");
        int wordCount = words.length;

        System.out.println("Total characters (without spaces): " + wordsCount);
        System.out.println("Total words: " + wordCount);
        System.out.println("Total vowels: " + vowelsCount);
        
    }
    
}
