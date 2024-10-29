class StaticExample {
    // Static variable
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter = 0;

    // Static method
    static void incrementStaticCounter() {
        staticCounter++;
        System.out.println("Static Counter: " + staticCounter);
    }

    // Instance method
    void incrementInstanceCounter() {
        instanceCounter++;
        System.out.println("Instance Counter: " + instanceCounter);
    }

    // Static block
    static {
        System.out.println("Static block executed.");
    }
}

public class assign49StaticKeywordDemo {
    public static void main(String[] args) {
        // Accessing static variable and method without creating an instance
        System.out.println("Initial Static Counter: " + StaticExample.staticCounter);
        StaticExample.incrementStaticCounter();

        // Creating instances of StaticExample class
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        // Accessing instance variables and methods
        obj1.incrementInstanceCounter();
        obj2.incrementInstanceCounter();

        // Accessing static method through an instance (not recommended, but possible)
        obj1.incrementStaticCounter();
        obj2.incrementStaticCounter();
    }
}

