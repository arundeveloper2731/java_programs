package factorymethoad;

public class Main {

    public static void main(String[] args) 
    {
        NotificationFactory EmailNotification  = new Emailpopup();
        EmailNotification.readyBro();
        
        NotificationFactory SMSNotification = new SMSpopup();
        SMSNotification.readyBro();
        
        NotificationFactory PushNotification = new PushPopupNotification();
        PushNotification.readyBro();
    }
    
}
