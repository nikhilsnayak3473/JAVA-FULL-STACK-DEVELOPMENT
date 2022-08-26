package basics;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a max number");
        int max = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3;
        while (num1 < max) {
            System.out.println(num1);
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
