package polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
        System.out.println(p.a);
        System.out.println(p.b);

        p = new Child();
        p.display();
        System.out.println(p.a);
        System.out.println(p.b);

        Child c = new Child();
        c.display();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
