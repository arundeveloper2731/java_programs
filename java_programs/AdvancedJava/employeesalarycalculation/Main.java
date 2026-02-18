package employeesalarycalculation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Emter EMployee Id :: ");
        int empId = sc.nextInt();
               sc.nextLine();
        System.out.print("Enter Employee Name ::");
        String empname=sc.nextLine();
        System.out.print("Enter Salary :: ");
        double salary = sc.nextDouble();
        sc.nextLine();
        PermenantEmployee e1=new PermenantEmployee(empId, empname, salary);
        ContractEmployee e2 = new ContractEmployee(empId, empname, salary);
        
        Thread t1 = new EmployeeThread(e1);
        Thread t2 = new EmployeeThread(e2);
        
        t1.start();
        t2.start();
    }
}
