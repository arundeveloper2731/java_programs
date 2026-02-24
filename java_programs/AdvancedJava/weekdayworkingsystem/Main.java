package weekdayworkingsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         int choice;

        do {
            System.out.println("\n===== DAY MENU =====");
            System.out.println("1. Check if Working Day");
            System.out.println("2. Check if Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Day: ");
                    String input1 = sc.next().toUpperCase();
                    try {
                        Day day1 = Day.valueOf(input1);
                        if (day1.workingDay()){
                            System.out.println(day1 + " is a Working Day.");
                        } else {
                            System.out.println(day1 + " is not a Working Day.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Day!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Day: ");
                    String input2 = sc.next().toUpperCase();
                    try {
                        Day day2 = Day.valueOf(input2);
                        if (day2.weekend()) {
                            System.out.println(day2 + " is a Weekend.");
                        } else {
                            System.out.println(day2 + " is not a Weekend.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Day!");
                    }
                    break;

                case 3:
                    System.out.println("All Days:");
                    for (Day d : Day.values()) {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        
    }
    
}
