package smartloginsystem;

public class Main {

    public static void main(String[] args) 
    {
        LoginService ls = new LoginService();
        
        try{
            ls.login();
        }
        catch (AccountLockedException ex){
            System.out.println("Exception : "+ ex.getMessage());
        }
    }
    
}
