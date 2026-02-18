package employeesalarycalculation;

public class PermenantEmployee extends Employee
{

    public PermenantEmployee(int empId, String empname, double salary) {
        super(empId, empname, salary);
    }

    

    @Override
    void calculateSalary() 
    {
        double totalSalary = salary + (salary * 0.10);
        System.out.println("Permanent Employee Salary Calculated "+totalSalary);
    }
    
    
}
