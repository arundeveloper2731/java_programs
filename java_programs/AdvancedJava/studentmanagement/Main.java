package studentmanagement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
          HashSet<Integer> studentIds = new HashSet<>();

        HashMap<Integer, String> studentMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Total Student Count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                     System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    if (studentIds.contains(id)) {
                        System.out.println("Student ID already exists!");
                    } else {
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        studentIds.add(id);
                        studentMap.put(id, name);

                        System.out.println("Student added successfully!");
                    }
                    break;
                case 2:
                    System.out.print("Enter Student ID to remove: ");
                    int removeId = sc.nextInt();

                    if (studentIds.contains(removeId)) {
                        studentIds.remove(removeId);
                        studentMap.remove(removeId);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student ID not found!");
                    }

                    break;
                     case 3:
                    // Search Student
                    System.out.print("Enter Student ID to search: ");
                    int searchId = sc.nextInt();

                    if (studentMap.containsKey(searchId)) {
                        System.out.println("Student Name: " + studentMap.get(searchId));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4: 
                    if (studentMap.isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        System.out.println("Student Details:");
                        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey() + 
                                               " | Name: " + entry.getValue());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Total Students: " + studentIds.size());
                    break;

                case 6:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            
                    
            }
        }while(choice!=6);
        
    }
    
}
