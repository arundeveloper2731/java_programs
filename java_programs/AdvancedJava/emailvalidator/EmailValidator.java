package emailvalidator;

import java.util.Scanner;

public class EmailValidator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your Email Id : ");
        String emailId = sc.nextLine();
        
        int atindex = emailId.indexOf('@');
        int dotindex = emailId.lastIndexOf('.');
        
        if(atindex >0 && dotindex > atindex){
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("Invalid Email");
        }
    }
}

