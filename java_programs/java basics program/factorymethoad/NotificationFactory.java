/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethoad;

/**
 *
 * @author Arun Ak
 */
public abstract class NotificationFactory 
{
    public abstract Notification createNotification();
    
    public void readyBro(){
        Notification notification = createNotification();
        System.out.println("You have a Notification");
        notification.sendMessage();
    }
}
