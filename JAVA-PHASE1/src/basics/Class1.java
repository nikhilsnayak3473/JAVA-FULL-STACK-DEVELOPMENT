package basics;

public class Class1 {
    public static void noArgumentMethod() {
        System.out.println("This is no argument method");
    }

    public static void parameterizedMethod(int a, int b) {
        System.out.println("This is parameterized method and arguments are: " + a + " " + b);
    }

    public static void main(String[] args) {
//        noArgumentMethod();
//        parameterizedMethod(5, 6);
        m1(10, 15);
        m1(10, 'p');
        m1(10, 'a', 12.3F);
    }

    public static void m1(int a, double b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void m1(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void m1(int a, int b, float f) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
    }
}
