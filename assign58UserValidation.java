import java.util.*;
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}


public class assign58UserValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            System.out.print("Confirm password: ");
            String confirmPassword = scanner.nextLine();

            validateUser(username, password, confirmPassword);

            System.out.println("User validation successful!");

        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validateUser(String username, String password, String confirmPassword) throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }
    }
}
