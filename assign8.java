import java.util.Scanner;

public class assign8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed!");
        } else if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }

        scanner.close();
    }
}
