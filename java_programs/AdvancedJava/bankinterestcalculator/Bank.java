package bankinterestcalculator;

public class Bank 
{
    
    static final String bankName="Ak Bank";
    static final double interestRate = 7.5;
    
    static double calculateInterest(double principal,int years){
       double interest = (principal * interestRate * years)/100;
       return interest; 
    }
   
    
}
