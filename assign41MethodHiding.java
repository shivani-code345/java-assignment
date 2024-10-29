class Parent {
    // Static method in the base class
    public static void display() {
        System.out.println("Static method in Parent class");
    }
}
class Child extends Parent {
    // Static method in the derived class with the same name as in the Parent class
    public static void display() {
        System.out.println("Static method in Child class");
    }
}
public class assign41MethodHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        Child d = new Child();

        // Call the display method on different objects
        p.display(); 
        c.display(); 
        d.display(); 
    }
    
}


