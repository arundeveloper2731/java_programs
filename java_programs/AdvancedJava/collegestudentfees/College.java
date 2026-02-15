package collegestudentfees;

public class College 
{
    
   static final String collegeName="AK College";
   final int registrationfee ;
   
   static int totalstd;

    public College(int registrationfee) 
    {
        this.registrationfee = registrationfee;
        totalstd++;
    }
   static void displayCollegeDetails(){
       System.out.println("College Name :: "+collegeName);
       System.out.println("Total Students :: "+ totalstd);
   }
   void displayStdFee(){
       System.out.println("Regitration fees :: "+registrationfee);
   }
   
}
