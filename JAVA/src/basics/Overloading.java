package basics;

public class Overloading {
    public static void main(String[] args) {
        add(4.3, 4.4);
        add(100L, 200L);
        add(1.1f, 2.2f);
        add(1, 2);
        add(1, 2, 3);
        add(1, 2, 3, 4);
        add(1, 2, 3, 4, 5);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void add(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    public static void add(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    public static void add(float a, float b) {
        System.out.println("Add method with float");
    }


    public static void add(double a, double b) {
        System.out.println("Add method with double");
    }

    public static void add(long a, long b) {
        System.out.println("Add method with long");
    }
}
