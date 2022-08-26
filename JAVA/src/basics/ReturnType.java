package basics;

public class ReturnType {
    public static void main(String[] args) {
        int a = m1(5);
        System.out.println(a);
    }

    public static int m1(int a) {
        System.out.println("m1 method");
        System.out.println(a);
        return 10;
    }

    public static String yesSir() {
        return "YES SIR";
    }
}
