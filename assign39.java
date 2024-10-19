class Example {
    // Method with no parameters
    public void display() {
        System.out.println("Display with no parameters");
    }

    // Method with one integer parameter
    public void display(int value) {
        System.out.println("Display with one integer parameter: " + value);
    }

    // Method with one string parameter
    public void display(String text) {
        System.out.println("Display with one string parameter: " + text);
    }

    // Method with two parameters
    public void display(int value, String text) {
        System.out.println("Display with two parameters: " + value + ", " + text);
    }
}

public class assign39 {
    public static void main(String[] args) {
        Example example = new Example();
        example.display();
        example.display(42);
        example.display("Hello");
        example.display(99, "World");
    }
}
