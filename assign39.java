class Example {
    public void display() {
        System.out.println("Display with no parameters");
    }
    public void display(int value) {
        System.out.println("Display with one integer parameter: " + value);
    }
    public void display(String text) {
        System.out.println("Display with one string parameter: " + text);
    }
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
