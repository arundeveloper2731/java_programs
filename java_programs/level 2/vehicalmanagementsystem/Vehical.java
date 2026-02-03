
package vehicalmanagementsystem;

public class Vehical {
    String brand;
    int year;
    Vehical(String brand,int year){
        this.brand = brand;
        this.year = year;
    }
    void displayInfo(){
        System.out.println("Vehical Brand : "+brand);
        System.out.println("Year : "+year);
    }
    
}
