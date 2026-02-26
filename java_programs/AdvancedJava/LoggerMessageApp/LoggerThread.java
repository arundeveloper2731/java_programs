/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LoggerMessageApp;

/**
 *
 * @author Arun Ak
 */
public class LoggerThread extends Thread{
    private String message;

    public LoggerThread(String message) {
        this.message = message;
    }

    public void run() {

        MessageLogger logger = MessageLogger.getInstance();

        logger.logMessage(message);
    }

    
}
