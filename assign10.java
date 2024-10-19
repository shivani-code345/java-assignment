public class assign10 {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate
        int num1 = 0, num2 = 1;
        
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);

        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
    }  
}