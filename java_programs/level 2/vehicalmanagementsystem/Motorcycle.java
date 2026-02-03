
package vehicalmanagementsystem;


public class Motorcycle extends Vehical
{
    String type;
    Motorcycle(String brand,int year,String type){
        super(brand,year);
        this.type = type;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Type : "+type);
    }
    
    
    
}
