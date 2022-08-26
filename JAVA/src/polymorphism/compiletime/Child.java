package polymorphism.compiletime;

public class Child extends Parent {

    int a = 20;
    int b = 100;

    public static void display() {
        System.out.println("I am display of Child");
    }//method shadowing
}
