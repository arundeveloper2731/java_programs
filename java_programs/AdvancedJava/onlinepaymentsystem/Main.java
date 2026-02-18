package onlinepaymentsystem;

public class Main {

    public static void main(String[] args) 
    {
       PaymentProcess p1= new CardPayment(1300);
       PaymentProcess p2 = new UpiPayment(2000);
       
       Thread t1 = new PaymentThread(p1);
       Thread t2 = new PaymentThread(p2);
       
       t1.start();
       t2.start();
    }
    
}
