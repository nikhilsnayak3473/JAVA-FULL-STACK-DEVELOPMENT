package basics;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number1 = scanner.nextInt();
        int number2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                number2 += i;
            }
        }
        if (number1 == number2) {
            System.out.println("Perfect number");
        } else {
            System.out.println("not a perfect number");
        }

    }
}
