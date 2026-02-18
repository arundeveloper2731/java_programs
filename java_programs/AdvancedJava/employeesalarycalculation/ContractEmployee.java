package employeesalarycalculation;

public class ContractEmployee extends Employee
{

    public ContractEmployee(int empId, String empname, double salary) {
        super(empId, empname, salary);
    }

    

    @Override
    void calculateSalary() 
    {
        System.out.println(" Contract Employee Salary Calculated "+salary);
    }
    
}
