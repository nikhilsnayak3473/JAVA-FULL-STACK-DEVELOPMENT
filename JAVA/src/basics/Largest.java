package basics;

public class Largest {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println("a is greater and a value is " + a);
        } else if (b > c) {
            System.out.println("b is greater and b value is " + b);
        } else {
            System.out.println("c is greater and c value is " + c);
        }
    }

}
