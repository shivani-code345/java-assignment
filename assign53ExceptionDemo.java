public class assign53ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Generate NegativeArrayIndexException
            int[] array = new int[5];
            System.out.println(array[-1]); // Accessing array with negative index

        } catch (Exception e) {
            System.out.println("Caught NegativeArrayIndexException: " + e.getMessage());
        }

        try {
            // Generate ArithmeticException
            int result = 10 / 0; // Division by zero

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}