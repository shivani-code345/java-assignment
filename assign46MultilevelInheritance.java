class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammal is walking");
    }
}
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class assign46MultilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Defined in Dog
    }
}
