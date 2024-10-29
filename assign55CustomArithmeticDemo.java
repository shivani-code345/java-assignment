import java.util.*;
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class assign55CustomArithmeticDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator for division: ");
            double numerator = scanner.nextDouble();

            System.out.print("Enter the denominator for division: ");
            double denominator = scanner.nextDouble();

            if (denominator == 0) {
                throw new CustomArithmeticException("Division by zero is not allowed.");
            }
            
            double result = numerator / denominator;
            System.out.println("Result of division: " + result);

            System.out.print("Enter a number to calculate its square root: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                throw new CustomArithmeticException("Square root of negative number is not allowed.");
            }

            double sqrtResult = Math.sqrt(number);
            System.out.println("Square root: " + sqrtResult);

        } catch (CustomArithmeticException e) {
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
