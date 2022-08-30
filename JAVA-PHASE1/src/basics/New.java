package basics;

public class New {
    static int a = 100;
    static int b = m1() + m2();

    static {
        System.out.println("Hello world");
        a = b + m2();
        b = a + m1();

    }

    static int m1() {
        System.out.println(a);
        return a + 1;
    }

    static int m2() {
        int b = 3;
        System.out.println(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        int a = New.a;
        System.out.println(New.a + a);
        int b = 3;
        System.out.println(b);
        b = m1();
        a = m2();
        System.out.println(a + b);
        System.out.println("main ends");

    }
}
