
import java.util.Scanner;
abstract class ThreeDObject {
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}
class Box extends ThreeDObject {
    double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}
class Cube extends ThreeDObject {
    double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
class Cylinder extends ThreeDObject {
    double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
class Cone extends ThreeDObject {
    double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height / 3;
    }
}
public class assign42ThreeDObjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing Box
        System.out.print("Enter length, width, and height of the box: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Testing Cube
        System.out.print("Enter side of the cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Testing Cylinder
        System.out.print("Enter radius and height of the cylinder: ");
        double radius = scanner.nextDouble();
        double cylHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, cylHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Testing Cone
        System.out.print("Enter radius and height of the cone: ");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
