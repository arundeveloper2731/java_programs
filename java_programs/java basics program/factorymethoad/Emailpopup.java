
package factorymethoad;

public class Emailpopup extends NotificationFactory
{

    @Override
    public Notification createNotification() 
    {
        return new EmailNotification();
    }
    
    
}
