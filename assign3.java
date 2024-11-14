import java.util.Scanner;

public class assign3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double max = findMax(num1, num2, num3);

        System.out.println("The maximum of the three numbers is: " + max);

        scanner.close();
    }

    public static double findMax(double a, double b, double c) {
        double max = a; // Assume 'a' is the largest to start

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
}
