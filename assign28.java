import java.util.Scanner;

public class assign28 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sumOfOdd = 0;
        for (int num : numbers) {
            if (num % 2 != 0) { 
                sumOfOdd += num;
            }
        }
        System.out.println("The sum of all odd numbers in the array is: " + sumOfOdd);

        scanner.close();
    }
}

