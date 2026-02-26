package LoggerMessageApp;

public class Main {
    public static void main(String[] args) {
         LoggerThread t1 = new LoggerThread("Enna macha love ha");
        LoggerThread t2 = new LoggerThread("Illa macha frd tha");

        t1.start();
        t2.start();
    }
    
}
