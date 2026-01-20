import java.util.Scanner;

class EmployeeList {

    Scanner sc = new Scanner(System.in);
	int add(int[] emp, int size) {
		System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        emp[size] = id;
        System.out.println("Employee ID added.");
        return size + 1;
    }

    // delete employee by searching
    int delete(int[] emp, int size) {
        System.out.print("Enter employee ID to remove: ");
        int id = sc.nextInt();

        int index = -1;

        // Search the ID
        for (int i = 0; i < size; i++) {
            if (emp[i] == id) {
                index = i;
            }
        }

        // If not found
        if (index == -1) {
            System.out.println("Employee ID not found.");
            return size;
        }

        // Shift left
        for (int i = index; i < size - 1; i++) {
            emp[i] = emp[i + 1];
        }

        System.out.println("Employee ID removed.");
        return size - 1;
    }

    // Function to display employee IDs
    void display(int[] emp, int size) {
        if (size == 0) {
            System.out.println("No employee IDs to display.");
            return;
        }

        System.out.println("Employee IDs:");
        for (int i = 0; i < size; i++) {
            System.out.print(emp[i] + " ");
        }
        System.out.println();
    }

    // Main Menu
    public static void main(String[] args) {
		
		EmployeeList emp=new EmployeeList();
		
		System.out.print("Enter the employee list :: ");
		int len=emp.sc.nextInt();

        int[] employees = new int[len];
        int size = 0;
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = emp.sc.nextInt();

            switch (choice) {
                case 1:
                    size = emp.add(employees, size);
                    break;
                case 2:
                    size = emp.delete(employees, size);
                    break;
                case 3:
                    emp.display(employees, size);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}
