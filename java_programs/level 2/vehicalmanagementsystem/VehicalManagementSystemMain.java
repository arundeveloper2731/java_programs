
package vehicalmanagementsystem;


public class VehicalManagementSystemMain {

    public static void main(String[] args) {
      
        Car ca = new Car("Toyota",2022,5);
        ca.displayInfo();
        
        Motorcycle motor = new Motorcycle("Yamaha",2020,"Sports");
        motor.displayInfo();
    }
    
}
