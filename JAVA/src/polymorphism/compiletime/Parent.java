package polymorphism.compiletime;

public class Parent {

    static int a = 10;
    int b = 20;

    public static void display() {// method shadowing
        System.out.println("I am display of Parent");
    }
}
