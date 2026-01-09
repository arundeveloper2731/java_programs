import java.util.Scanner;

class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape:");
        

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: // Circle
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circleArea = 3.14 * r * r;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2: // Square
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square = " + squareArea);
                break;

            case 3: // Rectangle
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double rectangleArea = length * breadth;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            case 4: // Triangle
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
