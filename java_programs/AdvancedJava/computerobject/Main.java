package computerobject;

public class Main 
{
    public static void main(String[] args) 
    {
        
        Computer computer = new Computer.Builder("Intel i7", "16GB")
                                .setHdd("1TB")
                                .setGraphics("RTX 3060")
                                .build();

        System.out.println("CPU: " + computer.getCpu());
        System.out.println("RAM: " + computer.getRam());
        System.out.println("HDD: " + computer.getHdd());
        System.out.println("Graphics: " + computer.getGraphics());
        
    }
    
}
