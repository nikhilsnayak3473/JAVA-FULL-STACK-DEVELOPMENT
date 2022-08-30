package basics;

public class Recursion {
    static int a;

    public static void m1() {
        a++;
        if (a <= 10) {
            System.out.println("m1() method");
            m1();
        }
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        m1();
        System.out.println(fact(5));
    }
}
