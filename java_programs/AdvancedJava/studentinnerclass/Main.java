package studentinnerclass;
import java.util.Scanner;

class Institution {

    String institutionName = "ABC Institution";

    // Inner Class
    class Student {
        String studentName;
        int rollNo;
        int[] marks;
        double average;
        char grade;

        // Method to add student basic details
        void addStudent(String name, int roll) {
            studentName = name;
            rollNo = roll;
        }

        // Method to add marks dynamically
        void addMarks(int subjectCount, Scanner sc) {
            marks = new int[subjectCount];

            System.out.println("Enter Marks:");
            for (int i = 0; i < subjectCount; i++) {
                marks[i] = sc.nextInt();
            }
        }

        // Method to calculate average & grade
        void calculateGrade() {
            int total = 0;

            for (int i = 0; i < marks.length; i++) {
                total += marks[i];
            }

            average = (double) total / marks.length;

            if (average >= 90)
                grade = 'A';
            else if (average >= 75)
                grade = 'B';
            else if (average >= 50)
                grade = 'C';
            else
                grade = 'F';
        }

        // Display method
        void display() {
            System.out.println("\nInstitution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);

            System.out.print("Marks: ");
            for (int m : marks) {
                System.out.print(m + " ");
            }

            System.out.printf("\nAverage: %.2f", average);
            System.out.println("\nGrade: " + grade);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Institution inst = new Institution();
        Institution.Student student = inst.new Student();

        int choice;
        int subjectCount = 0;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    student.addStudent(name, roll);
                    break;

                case 2:
                    System.out.print("Enter Number of Subjects: ");
                    subjectCount = sc.nextInt();
                    student.addMarks(subjectCount, sc);
                    break;

                case 3:
                    student.calculateGrade();
                    System.out.println("Grade Calculated Successfully!");
                    break;

                case 4:
                    student.display();
                    break;

                case 5:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

    }
}
