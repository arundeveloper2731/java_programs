package LaptopOrder;

public class Main 
{
    public static void main(String[] args)
    {
        LapOrder lap = new LapOrder.Builder("Dell",16)
                .setSsd(true)
                .setGraphicsCard(false)
                .setExtendedWarranty(true)
                .setMsOfficeInstalled(true)
                .build();
        
        System.out.println("Brand: "+lap.getBrand());
        System.out.println("RAM: "+lap.getRam());
        System.out.println("SSD : "+lap.isSsd());
        System.out.println("Graphics Card: "+lap.isGraphicsCard());
        System.out.println("Extended Warranty: "+lap.isExtendedWarranty());
        System.out.println("MS Office: "+lap.isMsOfficeInstalled());
    
    }
}