import java.util.Scanner;

// Shape interface
interface Shape {
    double area();
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public double area() {
        return length * width;
    }
}

// Triangle class
class Triangle implements Shape {
    double base, height;

    public Triangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Test class
public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rectangle input
        System.out.println("Enter length and width of rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        System.out.println("Area of Rectangle: " + rectangle.area());

        // Triangle input
        System.out.println("\nEnter base and height of triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);
        System.out.println("Area of Triangle: " + triangle.area());

        scanner.close();
    }
}
