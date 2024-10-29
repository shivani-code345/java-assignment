class Animal {
    // Method to be overridden
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class assign40MethodOverriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Create an Animal object
        myAnimal.makeSound(); // Calls the makeSound method of Animal

        Dog myDog = new Dog(); // Create a Dog object
        myDog.makeSound(); // Calls the overridden makeSound method of Dog
    }
}



