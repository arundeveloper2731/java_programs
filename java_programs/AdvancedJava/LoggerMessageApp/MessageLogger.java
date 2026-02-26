/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoggerMessageApp;

/**
 *
 * @author Arun Ak
 */
public class MessageLogger {
     private static MessageLogger instance;

    private MessageLogger() {
        System.out.println("Logger Instance Created");
    }

    public static synchronized MessageLogger getInstance() {

        if (instance == null) {
            instance = new MessageLogger();
        }

        return instance;
    }

    public void logMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + " : " + msg);
    }
}
