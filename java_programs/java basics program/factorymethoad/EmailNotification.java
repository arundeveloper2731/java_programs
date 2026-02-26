package factorymethoad;

public class EmailNotification implements Notification
{

    @Override
    public void sendMessage() 
    {
        System.out.println("Message...");
    }
    
    
}
