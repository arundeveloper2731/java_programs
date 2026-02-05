package transport.management.system;

import java.util.Scanner;

public class Main {

    Scanner sc = new Scanner(System.in);

    Transport transport;          // ✅ global reference
    boolean booked = false;
    boolean fareCalculated = false;

    public static void main(String[] args) {

        Main ma = new Main();
        int choice;

        do {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = ma.sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    ma.bookTicket(choice);
                    break;

                case 3:
                    ma.calculateFare();
                    break;

                case 4:
                    ma.displayTicket();
                    break;

                case 5:
                    System.out.println("Thank you ...");
                    break;

                default:
                    System.out.println("Invalid choice....");
            }

        } while (choice != 5);
    }

    // 🔹 Booking
    void bookTicket(int busType) {

        System.out.print("Enter Passenger ID: ");
        int passengerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Passenger Name: ");
        String passengerName = sc.nextLine();

        String[] routeDetails = selectRoute();
        if (routeDetails == null) return;

        String fromCity = routeDetails[0];
        String toCity = routeDetails[1];
        double distance = Double.parseDouble(routeDetails[2]);

         if (busType == 1) {
            transport = new CityBus(passengerId, passengerName, fromCity, toCity, distance);
        } else {
            transport = new LuxuryBus(passengerId, passengerName, fromCity, toCity, distance);
        }

        booked = true;
        fareCalculated = false;
        System.out.println("Ticket Booked Successfully");
    }

    // 🔹 Route Selection
    String[] selectRoute() {

        System.out.println("\nSelect Route:");
        System.out.println("1. Chennai -> Bangalore");
        System.out.println("2. Chennai -> Coimbatore");
        System.out.println("3. Chennai -> Madurai");
        System.out.println("4. Chennai -> Trichy");
        System.out.println("5. Chennai -> Salem");
        System.out.print("Enter route choice: ");

        int route = sc.nextInt();

        switch (route) {
            case 1: return new String[]{"Chennai", "Bangalore", "350"};
            case 2: return new String[]{"Chennai", "Coimbatore", "500"};
            case 3: return new String[]{"Chennai", "Madurai", "460"};
            case 4: return new String[]{"Chennai", "Trichy", "330"};
            case 5: return new String[]{"Chennai", "Salem", "340"};
            default:
                System.out.println("Invalid Route");
                return null;
        }
    }

    // 🔹 Fare Calculation
    void calculateFare() {
        if (booked) {
            transport.calculateFare();   // ✅ runtime polymorphism
            fareCalculated = true;
            System.out.println("Fare Calculated Successfully");
        } else {
            System.out.println("Please book a ticket first");
        }
    }

    // 🔹 Display Ticket
    void displayTicket() {
        if (fareCalculated) {
            transport.displayTicket();
        } else {
            System.out.println("Please calculate fare first");
        }
    }
}
