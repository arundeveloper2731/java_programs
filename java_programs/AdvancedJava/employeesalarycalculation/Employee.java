package employeesalarycalculation;

public abstract class Employee 
{
    int empId;
    String empname;
    double salary;

    public Employee(int empId, String empname, double salary) {
        this.empId = empId;
        this.empname = empname;
        this.salary = salary;
    }

    
    abstract void calculateSalary();
    
    
    
}
