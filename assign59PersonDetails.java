import java.util.*;
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}
public class assign59PersonDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            if (age < 0) {
                throw new NegativeAgeException("Age cannot be negative: " + age);
            }

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } catch (NegativeAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
