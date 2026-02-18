package onlinepaymentsystem;

public class CardPayment extends PaymentProcess
{

    public CardPayment(double amount) {
        super(amount);
    }

    @Override
    void paymentpro() 
    {
        System.out.println("UPI payment is "+amount+" completed");
    }
    
}
