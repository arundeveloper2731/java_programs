/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethoad;

/**
 *
 * @author Arun Ak
 */
public class PushPopupNotification extends NotificationFactory
{

    @Override
    public Notification createNotification() 
    {
        return new PushNotification();
    }
    
    
}
