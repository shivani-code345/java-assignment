import java.io.IOException;

public class assign52ExceptionHandlingDemo {

    // Method demonstrating use of throws keyword
    public static void riskyMethod() throws IOException {
        throw new IOException("IO Exception thrown from riskyMethod");
    }

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: " + numbers[3]); // This will throw ArrayIndexOutOfBoundsException

            // Calling a method that throws an exception
            riskyMethod();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Handling specific exception
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (IOException e) {
            // Handling specific exception
            System.out.println("Caught IOException: " + e.getMessage());
        }
        catch (Exception e) {
            // Handling any other exceptions
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            // Code that always executes
            System.out.println("This is the finally block.");
        }

        // Using throw keyword to manually throw an exception
        try {
            throw new IllegalArgumentException("Manually thrown IllegalArgumentException");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block after manually thrown exception.");
        }
    }
}