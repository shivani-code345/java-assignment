import java.util.Scanner;
public class assign12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i);
            
            System.out.print("Mathematics: ");
            int math = scanner.nextInt();
            
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            
            boolean isEligible = (math >= 60 && physics >= 50 && chemistry >= 40) &&
                                 (math + physics + chemistry >= 200 || math + physics >= 150);
            
            if (isEligible) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission.");
            }
        }
        
        scanner.close();
    }
}
