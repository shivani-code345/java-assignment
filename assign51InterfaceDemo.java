interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}
interface Interface3 {
    void method5();
    void method6();
}
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}
class ConcreteClass {
    public void concreteMethod() {
        System.out.println("Concrete class method.");
    }
}
class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }

    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method5() {
        System.out.println("Method 5");
    }

    @Override
    public void method6() {
        System.out.println("Method 6");
    }

    @Override
    public void newMethod() {
        System.out.println("New Method");
    }
}
public class assign51InterfaceDemo {

    public static void useInterface1(Interface1 i1) {
        i1.method1();
        i1.method2();
    }

    public static void useInterface2(Interface2 i2) {
        i2.method3();
        i2.method4();
    }

    public static void useInterface3(Interface3 i3) {
        i3.method5();
        i3.method6();
    }

    public static void useCombinedInterface(CombinedInterface ci) {
        ci.method1();
        ci.method3();
        ci.method5();
        ci.newMethod();
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Pass the object to methods
        useInterface1(myClass);
        useInterface2(myClass);
        useInterface3(myClass);
        useCombinedInterface(myClass);

        // Also calling method from ConcreteClass
        myClass.concreteMethod();
    }
}