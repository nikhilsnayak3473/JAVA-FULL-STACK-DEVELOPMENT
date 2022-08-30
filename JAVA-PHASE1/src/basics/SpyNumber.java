package basics;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int rem;
        int sum = 0;
        int prod = 1;
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            prod *= rem;
            num /= 10;
        }
        if (sum == prod) {
            System.out.println("Spy Number");
        } else {
            System.out.println("not a spy number");
        }
    }
}
