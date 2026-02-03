package vehicalmanagementsystem;

public class Car extends Vehical
{
    
    int seats;
    
    Car(String brand,int year,int seats){
        super(brand,year);
        this.seats = seats;
    }
    
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Seats : "+seats);
    }
    
}
