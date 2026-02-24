package trafficsignalsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do
        {
            System.out.print("\n1.Show signal meaning\n2.Check Stop and GO\n3.Exit\nEnter your choice :: ");
            choice = sc.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Signal meaning");
                    for (Signal s:Signal.values())
                    {
                        System.out.println(s + " - "+s.getMeaning());
                    }
                    break;
                case 2:
                     System.out.print("Enter Signal (RED/YELLOW/GREEN): ");
                    String input = sc.next().toUpperCase();

                    try {
                        Signal signal = Signal.valueOf(input);

                        if (signal.canGo()) {
                            System.out.println("Vehicle can GO.");
                        } else if (signal == Signal.RED) {
                            System.out.println("Vehicle must STOP.");
                        } else {
                            System.out.println("Vehicle should get READY.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid Signal!");
                    }
                  break;
                case 3:
                    System.out.println("Thank you");
                  break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choice != 3);
        
    }
    
}
