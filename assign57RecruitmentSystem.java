import java.util.*;
class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}


public class assign57RecruitmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter candidate's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter candidate's age: ");
            int age = scanner.nextInt();

            checkEligibility(name, age);
        } catch (TooOlderException e) {
            System.out.println("Caught TooOlderException: " + e.getMessage());
        } catch (TooYoungerException e) {
            System.out.println("Caught TooYoungerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlderException, TooYoungerException {
        if (age > 45) {
            throw new TooOlderException("Candidate is too old: " + age + " years.");
        } else if (age < 20) {
            throw new TooYoungerException("Candidate is too young: " + age + " years.");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }
}
