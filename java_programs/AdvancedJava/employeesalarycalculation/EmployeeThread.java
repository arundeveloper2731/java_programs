package employeesalarycalculation;

public class EmployeeThread extends Thread
{
    Employee employee;

    public EmployeeThread(Employee employee) {
        this.employee = employee;
    }
    
    public void run(){
        employee.calculateSalary();
    }
    
}
