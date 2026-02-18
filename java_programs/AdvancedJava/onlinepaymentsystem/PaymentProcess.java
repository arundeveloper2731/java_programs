package onlinepaymentsystem;

public abstract class PaymentProcess 
{
    double amount;

    public PaymentProcess(double amount) {
        this.amount = amount;
    }
    
    abstract void paymentpro();
    
}
