import java.util.Scanner;

class StudentManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        int choice;

        do {
            System.out.println("----- STUDENT MANAGEMENT -----");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student Name");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();
                    s.addStudent(name);
                    break;

                case 2:
                    s.displayStudents();
                    System.out.print("Enter student number to update: ");
                    int index = sc.nextInt() - 1;
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    s.updateStudent(index, newName);
                    break;

                case 3:
                    s.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!\n");
            }

        } while (choice != 4);
    }
}
