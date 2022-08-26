package basics;

import java.util.Scanner;

public class PrintPerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            int temp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    temp += j;
                }
            }
            if (i == temp) {
                System.out.println(i);
            }

        }
    }
}
