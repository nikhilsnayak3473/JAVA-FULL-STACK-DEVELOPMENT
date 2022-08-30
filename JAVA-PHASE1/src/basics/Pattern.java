package basics;

import java.util.Scanner;

public class Pattern {
    static Scanner scanner = new Scanner(System.in);

    public static void pattern1() {
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void pattern3() {
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern4() {
        System.out.println("Enter n value");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("  ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        pattern1();
//        pattern2();
//        pattern3();
        pattern4();
    }
}
