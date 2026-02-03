
package employeemanagementsystem;



public class EmployeeMain {

    
    public static void main(String[] args) {
       
      Employee emp = new Employee("Arun",80000);
      
      Manger man = new Manger("Bob",80000.00,"IT");
      
        System.out.println("...Employee.. ");
        emp.displayInfo();
        
        System.out.println("********");
        System.out.println("...Manager...");
        man.displayInfo();
    }

    
    
}
