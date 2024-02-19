import java.util.Scanner;

public class Area {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Rectangle");
        System.out.print("Enter your choice (1/2/3/4): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                System.out.println("Area of the triangle: " + calculateTriangleArea(base, height));
                break;
            case 2:
                System.out.print("Enter side length of the square: ");
                double side = scanner.nextDouble();
                System.out.println("Area of the square: " + calculateSquareArea(side));
                break;
            case 3:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of the circle: " + calculateCircleArea(radius));
                break;
            case 4:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.println("Area of the rectangle: " + calculateRectangleArea(length, width));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
}
