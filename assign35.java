class Example {
    int value;
    public Example() {
        value = 0; 
        System.out.println("Zero-argument constructor called.");
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class assign35 {
    public static void main(String[] args) {
        
        Example example = new Example();
        example.display();
    }
}
