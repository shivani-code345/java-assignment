import java.util.Scanner;

public class assign50ConsecutiveDigitsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String input = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < input.length() - 1; i++) {
            String consecutiveDigits = input.substring(i, i + 2);
            int number = Integer.parseInt(consecutiveDigits);
            sum += number;
        }

        System.out.println("Sum of numbers formed by consecutive digits: " + sum);

        scanner.close();
    }
}
