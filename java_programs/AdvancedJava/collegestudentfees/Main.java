package collegestudentfees;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        College std1 = new College(25000);
        College std2 = new College(30000);
        College std3 = new College(30000);
        College std4 = new College(30000);
        College std5 = new College(30000);
        
        College.displayCollegeDetails();
        
        std1.displayStdFee();
        std2.displayStdFee();
    }
    
}
