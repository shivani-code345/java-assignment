class Example {
    int value;
    String text;

    // Zero-argument constructor
    public Example() {
        value = 0;
        text = "Default";
        System.out.println("Zero-argument constructor called.");
    }

    // Single-argument constructor
    public Example(int value) {
        this.value = value;
        text = "Default";
        System.out.println("Single-argument constructor called with value: " + value);
    }

    // Two-argument constructor
    public Example(int value, String text) {
        this.value = value;
        this.text = text;
        System.out.println("Two-argument constructor called with value: " + value + " and text: " + text);
    }

    public void display() {
        System.out.println("Value: " + value + ", Text: " + text);
    }
}

public class assign37 {
    public static void main(String[] args) {
        Example example1 = new Example();
        example1.display();
        Example example2 = new Example(42);
        example2.display();
        Example example3 = new Example(99, "Hello");
        example3.display();
    }
}
