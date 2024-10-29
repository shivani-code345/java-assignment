import java.util.*;
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}
class Bus extends Vehicle {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, String routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class assign43VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing Bus
        System.out.println("Enter details for Bus:");
        System.out.print("Registration Number: ");
        String busRegn = scanner.nextLine();
        System.out.print("Speed: ");
        int busSpeed = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Color: ");
        String busColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String busOwner = scanner.nextLine();
        System.out.print("Route Number: ");
        String routeNumber = scanner.nextLine();
        Bus bus = new Bus(busRegn, busSpeed, busColor, busOwner, routeNumber);
        bus.showData();

        // Testing Car
        System.out.println("\nEnter details for Car:");
        System.out.print("Registration Number: ");
        String carRegn = scanner.nextLine();
        System.out.print("Speed: ");
        int carSpeed = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Color: ");
        String carColor = scanner.nextLine();
        System.out.print("Owner Name: ");
        String carOwner = scanner.nextLine();
        System.out.print("Manufacturer Name: ");
        String manufacturerName = scanner.nextLine();
        Car car = new Car(carRegn, carSpeed, carColor, carOwner, manufacturerName);
        car.showData();

        scanner.close();
    }
}
