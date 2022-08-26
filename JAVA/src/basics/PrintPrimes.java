package basics;

import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a the range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (PrimeNumber.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
