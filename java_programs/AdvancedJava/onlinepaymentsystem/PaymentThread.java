package onlinepaymentsystem;

public class PaymentThread extends Thread
{
    PaymentProcess payment;
    public PaymentThread( PaymentProcess payment) {
        this.payment = payment;
    }
public void run(){
    payment.paymentpro();
}    
    
}
