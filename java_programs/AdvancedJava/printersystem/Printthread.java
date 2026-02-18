package printersystem;

/**
 *
 * @author Arun Ak
 */
public class Printthread extends Thread
{
    Printer printer;
    
    public Printthread(Printer printer){
        this.printer=printer;
    }
    @Override
   public void run(){
        printer.print();
    }
    
}
