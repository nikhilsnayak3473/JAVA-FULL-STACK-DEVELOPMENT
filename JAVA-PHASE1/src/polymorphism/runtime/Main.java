package polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();


        p = new Child();
        p.display();


        Child c = new Child();
        c.display();

    }
}
