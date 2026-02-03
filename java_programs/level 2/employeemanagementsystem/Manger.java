
package employeemanagementsystem;


public class Manger extends Employee
{
    String department;
    
   Manger(String name,double salary,String department){
       super(name,salary);
       this.department= department;
   }
    
    @Override
    void displayInfo(){
         super.displayInfo();
        System.out.println("Department :"+ department);
    }
    
    
}
