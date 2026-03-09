
package employeemanagement;

import java.util.Scanner;


public class Main 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count < 100) {
                        System.out.print("Enter Employee ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        employees[count] = new Employee(id, name, dept);
                        count++;

                        System.out.println("Employee Added Successfully!");
                    } else {
                        System.out.println("Employee storage full!");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].id == searchId) {
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
