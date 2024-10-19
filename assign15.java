import java.util.Scanner;
public class assign15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for multiplication table: ");
        int number = sc.nextInt();

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        sc.close();
    }
}

    

