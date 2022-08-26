package basics;

public class First {
    public static void main(String[] args) {
        int a =15;
        System.out.println(a);
    }

    static {
        System.out.println("Static initializer from First");
    }

    public static void m1(){
        System.out.println("m1() from First");
    }
}
