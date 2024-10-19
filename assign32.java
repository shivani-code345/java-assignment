class Example {
    int value;
    public Example(int value) {
        this.value = value;
        System.out.println("Parameterized constructor called.");
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class assign32 {
    public static void main(String[] args) {
        Example example1 = new Example(42);
        example1.display();
        Example example2 = new Example(99);
        example2.display();
    }
}

