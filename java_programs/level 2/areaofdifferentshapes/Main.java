
package areaofdifferentshapes;

import java.util.Scanner;


public class Main {

     Scanner sc=new Scanner(System.in);
   
    public static void main(String[] args) {
       
       Main ma = new Main();
       int choice;
       
       do{
           System.out.println("\n---Shape Area Calculator--- \n1.Square \n2.Circle \n3.Exit");
           System.out.print("\n Enter your choice : ");
           choice= ma.sc.nextInt();
       
           switch(choice){
               case 1:
                  ma.areaofSquare();
                   break;
               case 2:
                    ma.areaofcircle();
                   break;
               case 3:
                   System.out.println("Thank you....");
                   break;
               default:
                   System.out.println("Invalid Choice....");
           }
       
       
       }while(choice != 3);
       
       
    }
    void areaofcircle(){
            System.out.print("Enter the Radius :: ");
            double radius = sc.nextDouble();
            Circle cir  = new Circle(radius);
            System.out.println("Area of circle = "+cir.caculateArea());
    }
    void areaofSquare(){
        System.out.print("Enter the Side of Squre :: ");
        double side = sc.nextDouble();
       Square sq = new Square(side);
        System.out.println("Area of Squre is = "+sq.caculateArea());
            
    }
    
}
