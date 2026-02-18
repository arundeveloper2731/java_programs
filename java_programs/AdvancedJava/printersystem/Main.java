package printersystem;

public class Main {

    public static void main(String[] args) 
    {
        HpPrinting hp = new HpPrinting();
        CannonPrinter cp = new CannonPrinter();
        
        Thread t1 = new Printthread(hp);
        Thread t2 = new Printthread(cp);
        
        t1.start();
        t2.start();
        
    }
    
}
