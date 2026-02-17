package studentmarkssystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        Student student = new Student();

        int choice;

        do {
            System.out.println("\n--- STUDENT MARKS SYSTEM ---");
            System.out.println("1. Enter Marks");
            System.out.println("2. Display Marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter Marks (0-100): ");
                        int marks = sc.nextInt();
                        student.setMarks(marks);
                        break;

                    case 2:
                        System.out.println("Stored Marks: " + student.getMarks());
                        break;

                    case 3:
                        System.out.println("Exiting System...");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } catch (InvalidMark ex) {
                System.out.println("Exception: " + ex.getMessage());
            }

        } while (choice != 3);

    }
    
}
