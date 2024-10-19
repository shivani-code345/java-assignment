import java.util.Scanner;
public class assign13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }

        System.out.println("The sum of natural numbers up to " + range + " is: " + sum);

        sc.close();
    }
}

    

