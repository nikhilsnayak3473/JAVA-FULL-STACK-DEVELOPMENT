package basics;

public class Second {
    public static void main(String[] args) {
        First.m1();
    }

    static {
        System.out.println("1st Static initializer from Second");
    }

    static {
        System.out.println("2nd static initializer from second");
    }
}
