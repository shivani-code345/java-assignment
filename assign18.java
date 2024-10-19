import java.util.Scanner;
public class assign18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        int temp = Math.abs(number); // Handle negative numbers

        do {
            temp /= 10;
            count++;
        } while (temp != 0);

        System.out.println("The number of digits in " + number + " is: " + count);

        scanner.close();
    }
}
