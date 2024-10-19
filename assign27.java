import java.util.Scanner;
public class assign27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
    
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
    
        int smallest = numbers[0]; 
        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number in the array is: " + smallest);
        
        scanner.close();
    }
}

