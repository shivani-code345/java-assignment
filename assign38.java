class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age); 
        this.studentId = studentId;
    }

    public void display() {
        super.display(); 
        System.out.println("Student ID: " + studentId);
    }
}
public class assign38 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.display();

        Student student = new Student("Bob", 20, "S123456");
        student.display();
    }
}

