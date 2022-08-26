package basics;

import java.util.Scanner;

public class SievesAlgo {
    public static void sieve(int N) {

        boolean[] primes = new boolean[N + 1];

        for (int i = 0; i < N; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= N; i++) {
            if (primes[i]) {
                for (int j = i * i; j <= N; j += i) {
                    if (j % i == 0) {
                        primes[j] = false;
                    }
                }
            }
        }

        for (int i = 2; i < N; i++) {
            if (primes[i]) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int N = scanner.nextInt();
        sieve(N);
    }
}
