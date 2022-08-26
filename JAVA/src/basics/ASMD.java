package basics;

import java.util.Scanner;

public class ASMD {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float div(int a, int b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("sum: " + add(a, b));
        System.out.println("diff: " + sub(a, b));
        System.out.println("prod: " + mul(a, b));
        System.out.println("quo: " + div(a, b));
    }
}
