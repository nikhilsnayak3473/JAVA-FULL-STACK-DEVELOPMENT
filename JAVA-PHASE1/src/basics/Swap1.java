package basics;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
