package polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent.display();
        System.out.println(Parent.a);
        System.out.println(p.b);

        p = new Child();
        Parent.display();
        System.out.println(Parent.a);
        System.out.println(p.b);

        Child c = new Child();
        Child.display();
        System.out.println(c.a);
        System.out.println(c.b);
    }
}
