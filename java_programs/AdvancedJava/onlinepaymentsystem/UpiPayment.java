package onlinepaymentsystem;

public class UpiPayment extends PaymentProcess
{
    
    public UpiPayment(double amount) {
        super(amount);
    }

    @Override
    void paymentpro() 
    {
        System.out.println("Caard payment of "+amount+" completed");
    }
    
}
